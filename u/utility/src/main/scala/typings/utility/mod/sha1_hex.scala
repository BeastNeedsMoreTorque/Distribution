package typings.utility.mod

import typings.node.Buffer
import typings.utility.utilityStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "sha1")
@js.native
object sha1_hex extends js.Object {
  def apply(s: String, format: hex): String = js.native
  def apply(s: Buffer, format: hex): String = js.native
}

