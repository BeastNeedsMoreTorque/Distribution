package typings.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-core", "transformFileSync")
@js.native
object transformFileSync extends js.Object {
  def apply(filename: String): BabelFileResult = js.native
  def apply(filename: String, opts: TransformOptions): BabelFileResult = js.native
}

