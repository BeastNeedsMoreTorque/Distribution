package typings.consola.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("consola", "WinstonReporter")
@js.native
class WinstonReporter () extends ConsolaReporter {
  def this(logger: Winston) = this()
  /* CompleteClass */
  override def log(logObj: ConsolaReporterLogObject, args: ConsolaReporterArgs): Unit = js.native
}

