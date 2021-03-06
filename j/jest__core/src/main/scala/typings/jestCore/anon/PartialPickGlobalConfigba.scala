package typings.jestCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.jestCore.jestCoreStrings.`json-summary`
import typings.jestCore.jestCoreStrings.`text-lcov`
import typings.jestCore.jestCoreStrings.`text-summary`
import typings.jestCore.jestCoreStrings.clover
import typings.jestCore.jestCoreStrings.cobertura
import typings.jestCore.jestCoreStrings.html
import typings.jestCore.jestCoreStrings.json
import typings.jestCore.jestCoreStrings.lcovonly
import typings.jestCore.jestCoreStrings.none
import typings.jestCore.jestCoreStrings.teamcity
import typings.jestCore.jestCoreStrings.text
import typings.jestCore.jestCoreStrings.watch
import typings.jestCore.jestCoreStrings.watchAll
import typings.jestTypes.configMod.Glob
import typings.jestTypes.configMod.NotifyMode
import typings.jestTypes.configMod.ReporterConfig
import typings.jestTypes.configMod.SnapshotUpdateState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<@jest/types.@jest/types.Config.GlobalConfig, 'bail' | 'changedSince' | 'collectCoverage' | 'collectCoverageFrom' | 'collectCoverageOnlyFrom' | 'coverageDirectory' | 'coverageReporters' | 'notify' | 'notifyMode' | 'onlyFailures' | 'reporters' | 'testNamePattern' | 'testPathPattern' | 'updateSnapshot' | 'verbose'> & {  mode  :'watch' | 'watchAll'}> & std.Partial<std.Pick<@jest/types.@jest/types.Config.GlobalConfig, 'noSCM' | 'passWithNoTests'>> */
trait PartialPickGlobalConfigba extends js.Object {
  var bail: js.UndefOr[Double] = js.undefined
  var changedSince: js.UndefOr[String] = js.undefined
  var collectCoverage: js.UndefOr[Boolean] = js.undefined
  var collectCoverageFrom: js.UndefOr[js.Array[Glob]] = js.undefined
  var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  var coverageDirectory: js.UndefOr[String] = js.undefined
  var coverageReporters: js.UndefOr[
    js.Array[
      clover | cobertura | html | json | `json-summary` | lcovonly | none | teamcity | text | `text-lcov` | `text-summary`
    ]
  ] = js.undefined
  var mode: js.UndefOr[watch | watchAll] = js.undefined
  var noSCM: js.UndefOr[Boolean] = js.undefined
  var notifyMode: js.UndefOr[NotifyMode] = js.undefined
  @JSName("notify")
  var notify_FPartialPickGlobalConfigba: js.UndefOr[Boolean] = js.undefined
  var onlyFailures: js.UndefOr[Boolean] = js.undefined
  var passWithNoTests: js.UndefOr[Boolean] = js.undefined
  var reporters: js.UndefOr[js.Array[String | ReporterConfig]] = js.undefined
  var testNamePattern: js.UndefOr[String] = js.undefined
  var testPathPattern: js.UndefOr[String] = js.undefined
  var updateSnapshot: js.UndefOr[SnapshotUpdateState] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object PartialPickGlobalConfigba {
  @scala.inline
  def apply(
    bail: js.UndefOr[Double] = js.undefined,
    changedSince: String = null,
    collectCoverage: js.UndefOr[Boolean] = js.undefined,
    collectCoverageFrom: js.Array[Glob] = null,
    collectCoverageOnlyFrom: StringDictionary[Boolean] = null,
    coverageDirectory: String = null,
    coverageReporters: js.Array[
      clover | cobertura | html | json | `json-summary` | lcovonly | none | teamcity | text | `text-lcov` | `text-summary`
    ] = null,
    mode: watch | watchAll = null,
    noSCM: js.UndefOr[Boolean] = js.undefined,
    notify: js.UndefOr[Boolean] = js.undefined,
    notifyMode: NotifyMode = null,
    onlyFailures: js.UndefOr[Boolean] = js.undefined,
    passWithNoTests: js.UndefOr[Boolean] = js.undefined,
    reporters: js.Array[String | ReporterConfig] = null,
    testNamePattern: String = null,
    testPathPattern: String = null,
    updateSnapshot: SnapshotUpdateState = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): PartialPickGlobalConfigba = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bail)) __obj.updateDynamic("bail")(bail.get.asInstanceOf[js.Any])
    if (changedSince != null) __obj.updateDynamic("changedSince")(changedSince.asInstanceOf[js.Any])
    if (!js.isUndefined(collectCoverage)) __obj.updateDynamic("collectCoverage")(collectCoverage.get.asInstanceOf[js.Any])
    if (collectCoverageFrom != null) __obj.updateDynamic("collectCoverageFrom")(collectCoverageFrom.asInstanceOf[js.Any])
    if (collectCoverageOnlyFrom != null) __obj.updateDynamic("collectCoverageOnlyFrom")(collectCoverageOnlyFrom.asInstanceOf[js.Any])
    if (coverageDirectory != null) __obj.updateDynamic("coverageDirectory")(coverageDirectory.asInstanceOf[js.Any])
    if (coverageReporters != null) __obj.updateDynamic("coverageReporters")(coverageReporters.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(noSCM)) __obj.updateDynamic("noSCM")(noSCM.get.asInstanceOf[js.Any])
    if (!js.isUndefined(notify)) __obj.updateDynamic("notify")(notify.get.asInstanceOf[js.Any])
    if (notifyMode != null) __obj.updateDynamic("notifyMode")(notifyMode.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyFailures)) __obj.updateDynamic("onlyFailures")(onlyFailures.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passWithNoTests)) __obj.updateDynamic("passWithNoTests")(passWithNoTests.get.asInstanceOf[js.Any])
    if (reporters != null) __obj.updateDynamic("reporters")(reporters.asInstanceOf[js.Any])
    if (testNamePattern != null) __obj.updateDynamic("testNamePattern")(testNamePattern.asInstanceOf[js.Any])
    if (testPathPattern != null) __obj.updateDynamic("testPathPattern")(testPathPattern.asInstanceOf[js.Any])
    if (updateSnapshot != null) __obj.updateDynamic("updateSnapshot")(updateSnapshot.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialPickGlobalConfigba]
  }
}

