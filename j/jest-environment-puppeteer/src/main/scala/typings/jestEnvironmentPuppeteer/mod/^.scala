package typings.jestEnvironmentPuppeteer.mod

import typings.jestFakeTimers.mod.JestFakeTimers
import typings.jestMock.mod.ModuleMocker
import typings.jestTypes.configMod.ProjectConfig
import typings.node.vmMod.Context
import typings.node.vmMod.Script
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Note: TestEnvironment is sandboxed. Each test suite will trigger setup/teardown in their own TestEnvironment. */
@JSImport("jest-environment-puppeteer", JSImport.Namespace)
@js.native
class ^ protected () extends PuppeteerEnvironment {
  def this(config: ProjectConfig) = this()
  /* CompleteClass */
  override var context: Context | Null = js.native
  /* CompleteClass */
  override var fakeTimers: JestFakeTimers[Timer] | Null = js.native
  /* CompleteClass */
  override var global: Global_ = js.native
  /* CompleteClass */
  override var moduleMocker: ModuleMocker | Null = js.native
  /* CompleteClass */
  override def runScript(script: Script): js.Any = js.native
  /**
    * Setup runs when the environment is being spun up, generally before each test suite
    * You should always call `await super.setup()` in here
    */
  /* CompleteClass */
  override def setup(): js.Promise[Unit] = js.native
  /**
    * Teardowns runs as the environment is being torn down, generally after each test suite.
    * You should always call `await super.tearDown()` in here
    */
  /* CompleteClass */
  override def teardown(): js.Promise[Unit] = js.native
}

