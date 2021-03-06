package typings.moment.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("moment", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var ISO_8601: MomentBuiltinFormat = js.native
  var RFC_2822: MomentBuiltinFormat = js.native
  var defaultFormat: String = js.native
  var defaultFormatUtc: String = js.native
  var fn: Moment = js.native
  var version: String = js.native
  /**
    * @param strict Strict parsing requires that the format and input match exactly, including delimeters.
    * Strict parsing is frequently the best parsing option. For more information about choosing strict vs
    * forgiving parsing, see the [parsing guide](https://momentjs.com/guides/#/parsing/).
    */
  def apply(): Moment = js.native
  def apply(inp: MomentInput): Moment = js.native
  def apply(inp: MomentInput, format: MomentFormatSpecification): Moment = js.native
  def apply(inp: MomentInput, format: MomentFormatSpecification, language: String): Moment = js.native
  def apply(inp: MomentInput, format: MomentFormatSpecification, language: String, strict: Boolean): Moment = js.native
  def apply(inp: MomentInput, format: MomentFormatSpecification, strict: Boolean): Moment = js.native
  def apply(inp: MomentInput, strict: Boolean): Moment = js.native
}

