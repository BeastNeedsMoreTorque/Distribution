package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ImportAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportAttribute_
  extends BaseNode
     with _Node {
  var key: Identifier_
  @JSName("type")
  var type_ImportAttribute_ : ImportAttribute
  var value: StringLiteral_
}

object ImportAttribute_ {
  @scala.inline
  def apply(
    key: Identifier_,
    `type`: ImportAttribute,
    value: StringLiteral_,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): ImportAttribute_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAttribute_]
  }
}

