package typings.jestReporters.coverageReporterMod

import typings.istanbulLibCoverage.mod.CoverageMap
import typings.jestReporters.typesMod.Context
import typings.jestReporters.typesMod.CoverageReporterOptions
import typings.jestReporters.typesMod.ReporterOnStartOptions
import typings.jestReporters.typesMod.Test
import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTestResult.typesMod.TestResult
import typings.jestTypes.configMod.GlobalConfig
import typings.std.Error
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters/build/coverage_reporter", JSImport.Default)
@js.native
class default protected () extends CoverageReporter {
  def this(globalConfig: GlobalConfig) = this()
  def this(globalConfig: GlobalConfig, options: CoverageReporterOptions) = this()
  /* CompleteClass */
  override var _addUntestedFiles: js.Any = js.native
  /* CompleteClass */
  override var _checkThreshold: js.Any = js.native
  /* CompleteClass */
  override var _coverageMap: js.Any = js.native
  /* CompleteClass */
  override var _globalConfig: js.Any = js.native
  /* CompleteClass */
  override var _options: js.Any = js.native
  /* CompleteClass */
  override var _sourceMapStore: js.Any = js.native
  /* CompleteClass */
  /* protected */ override def _setError(error: Error): Unit = js.native
  /* CompleteClass */
  override def getCoverageMap(): CoverageMap = js.native
  /* CompleteClass */
  override def getLastError(): Error | Unit = js.native
  /* CompleteClass */
  override def log(message: String): Unit = js.native
  /* CompleteClass */
  override def onRunComplete(contexts: Set[Context], results: AggregatedResult): js.Promise[Unit] | Unit = js.native
  /* CompleteClass */
  override def onRunStart(results: AggregatedResult, options: ReporterOnStartOptions): js.Promise[Unit] | Unit = js.native
  /* CompleteClass */
  override def onTestResult(test: Test, testResult: TestResult, aggregatedResult: AggregatedResult): js.Promise[Unit] | Unit = js.native
  /* CompleteClass */
  override def onTestStart(test: Test): js.Promise[Unit] | Unit = js.native
}

