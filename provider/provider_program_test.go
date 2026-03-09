//go:build !go && !nodejs && !python && !dotnet
// +build !go,!nodejs,!python,!dotnet

package newrelic

import (
	"fmt"
	"os"
	"path/filepath"
	"strings"
	"testing"
	"time"

	"github.com/stretchr/testify/require"

	"github.com/pulumi/providertest"
	"github.com/pulumi/providertest/optproviderupgrade"
	"github.com/pulumi/providertest/pulumitest"
	"github.com/pulumi/providertest/pulumitest/assertpreview"
	"github.com/pulumi/providertest/pulumitest/optnewstack"
	"github.com/pulumi/providertest/pulumitest/opttest"
)

const (
	providerName           = "newrelic"
	defaultBaselineVersion = "5.22.1"
)

var programs = []string{
	"test-programs/index_alertpolicy",
	"test-programs/index_alertchannel",
}

func TestUpgradeCoverage(t *testing.T) {
	providertest.ReportUpgradeCoverage(t)
}

func testProviderUpgrade(t *testing.T, dir string) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without credentials")
	}
	cwd, err := os.Getwd()
	require.NoError(t, err)
	test := pulumitest.NewPulumiTest(t, dir,
		opttest.DownloadProviderVersion(providerName, defaultBaselineVersion),
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
	)
	result := providertest.PreviewProviderUpgrade(t, test, providerName, defaultBaselineVersion,
		optproviderupgrade.DisableAttach())
	assertpreview.HasNoReplacements(t, result)
}

func testProgram(t *testing.T, dir string) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without credentials")
	}
	cwd, err := os.Getwd()
	require.NoError(t, err)
	test := pulumitest.NewPulumiTest(t, dir,
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
		opttest.SkipInstall(),
	)
	test.Up(t)
}

func TestPrograms(t *testing.T) {
	for _, p := range programs {
		t.Run(p, func(t *testing.T) {
			testProgram(t, p)
		})
	}
}

func TestProgramsUpgrade(t *testing.T) {
	t.Skipf("skip upgrade tests for now as we have not recorded them.")
	for _, p := range programs {
		t.Run(p, func(t *testing.T) {
			testProviderUpgrade(t, p)
		})
	}
}

func TestNrqlAlertConditionImport(t *testing.T) {
	if testing.Short() {
		t.Skipf("Skipping in testing.Short() mode, assuming this is a CI run without credentials")
	}

	cwd, err := os.Getwd()
	require.NoError(t, err)

	suffix := fmt.Sprintf("nrql-import-%d", time.Now().UnixNano())
	suffix = strings.ToLower(strings.ReplaceAll(suffix, "_", "-"))

	create := pulumitest.NewPulumiTest(t, "test-programs/nrql_alert_condition_import_create",
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
		opttest.SkipInstall(),
	)
	create.SetConfig(t, "suffix", suffix)
	up := create.Up(t)

	conditionID, ok := up.Outputs["conditionId"].Value.(string)
	require.True(t, ok, "expected conditionId output to be a string")
	require.NotEmpty(t, conditionID)

	importer := pulumitest.NewPulumiTest(t, "test-programs/yaml_empty",
		opttest.LocalProviderPath(providerName, filepath.Join(cwd, "..", "bin")),
		opttest.NewStackOptions(optnewstack.DisableAutoDestroy()),
		opttest.SkipInstall(),
	)
	res := importer.Import(t, "newrelic:index/nrqlAlertCondition:NrqlAlertCondition", "importedCondition", conditionID+":static", "")

	require.Contains(t, res.Stdout, "type: newrelic:NrqlAlertCondition")
}
