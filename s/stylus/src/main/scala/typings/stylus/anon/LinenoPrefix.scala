package typings.stylus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinenoPrefix extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var lineno: Double
  var prefix: String
  var `val`: String
}

object LinenoPrefix {
  @scala.inline
  def apply(__type: String, column: Double, filename: String, lineno: Double, prefix: String, `val`: String): LinenoPrefix = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinenoPrefix]
  }
}

