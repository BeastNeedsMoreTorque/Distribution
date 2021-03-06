package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinueStatement
  extends BaseNode
     with Statement {
  var label: js.UndefOr[Identifier | Null] = js.undefined
  @JSName("type")
  var type_ContinueStatement: typings.estree.estreeStrings.ContinueStatement
}

object ContinueStatement {
  @scala.inline
  def apply(
    `type`: typings.estree.estreeStrings.ContinueStatement,
    label: js.UndefOr[Null | Identifier] = js.undefined,
    leadingComments: js.Array[Comment] = null,
    loc: js.UndefOr[Null | SourceLocation] = js.undefined,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ContinueStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(label)) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinueStatement]
  }
}

