package typings.mocha.mod.reporters

import typings.mocha.Mocha.Runner
import typings.mocha.Mocha.Stats
import typings.mocha.Mocha.Test
import typings.mocha.Mocha.reporters.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialize a new `Doc` reporter.
  *
  * @see https://mochajs.org/api/Mocha.reporters.Doc.html
  */
@JSImport("mocha", "reporters.Doc")
@js.native
class Doc_ () extends Base {
  /**
    * Test failures
    */
  /* CompleteClass */
  override var failures: js.Array[Test] = js.native
  /**
    * The configured runner
    */
  /* CompleteClass */
  override var runner: Runner = js.native
  /**
    * Test run statistics
    */
  /* CompleteClass */
  override var stats: Stats = js.native
  /**
    * Output common epilogue used by many of the bundled reporters.
    *
    * @see https://mochajs.org/api/Mocha.reporters.Base.html#.Base#epilogue
    */
  /* CompleteClass */
  override def epilogue(): Unit = js.native
}

