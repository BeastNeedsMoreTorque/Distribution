package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.InterfaceTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait InterfaceTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowType {
  var body: ObjectTypeAnnotation_
  var `extends`: js.Array[InterfaceExtends_] | Null
  @JSName("type")
  var type_InterfaceTypeAnnotation_ : InterfaceTypeAnnotation
}

object InterfaceTypeAnnotation_ {
  @scala.inline
  def apply(
    body: ObjectTypeAnnotation_,
    `type`: InterfaceTypeAnnotation,
    end: Double = null.asInstanceOf[Double],
    `extends`: js.Array[InterfaceExtends_] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): InterfaceTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterfaceTypeAnnotation_]
  }
}

