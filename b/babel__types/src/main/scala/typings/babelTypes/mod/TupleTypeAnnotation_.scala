package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TupleTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TupleTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  @JSName("type")
  var type_TupleTypeAnnotation_ : TupleTypeAnnotation
  var types: js.Array[FlowType]
}

object TupleTypeAnnotation_ {
  @scala.inline
  def apply(
    `type`: TupleTypeAnnotation,
    types: js.Array[FlowType],
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): TupleTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TupleTypeAnnotation_]
  }
}

