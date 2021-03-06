package typings.postcssValueParser.mod

import typings.postcssValueParser.postcssValueParserStrings.`unicode-range`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnicodeRangeNode
  extends BaseNode
     with Node {
  var `type`: `unicode-range`
}

object UnicodeRangeNode {
  @scala.inline
  def apply(sourceIndex: Double, `type`: `unicode-range`, value: String): UnicodeRangeNode = {
    val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnicodeRangeNode]
  }
}

