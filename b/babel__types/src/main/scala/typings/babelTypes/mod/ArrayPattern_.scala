package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ArrayPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ArrayPattern_
  extends LVal
     with BaseNode
     with Pattern
     with PatternLike {
  var decorators: js.Array[Decorator_] | Null
  var elements: js.Array[Null | PatternLike]
  var typeAnnotation: TypeAnnotation_ | TSTypeAnnotation_ | Noop_ | Null
  @JSName("type")
  var type_ArrayPattern_ : ArrayPattern
}

object ArrayPattern_ {
  @scala.inline
  def apply(
    elements: js.Array[Null | PatternLike],
    `type`: ArrayPattern,
    decorators: js.Array[Decorator_] = null,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    typeAnnotation: TypeAnnotation_ | TSTypeAnnotation_ | Noop_ = null
  ): ArrayPattern_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], decorators = decorators.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayPattern_]
  }
}

