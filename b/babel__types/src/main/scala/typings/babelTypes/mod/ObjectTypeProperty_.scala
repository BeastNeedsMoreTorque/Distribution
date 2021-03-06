package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ObjectTypeProperty
import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.init
import typings.babelTypes.babelTypesStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ObjectTypeProperty_
  extends Flow
     with BaseNode
     with UserWhitespacable {
  var key: Identifier_ | StringLiteral_
  var kind: init | get | set
  var optional: Boolean
  var proto: Boolean
  var static: Boolean
  @JSName("type")
  var type_ObjectTypeProperty_ : ObjectTypeProperty
  var value: FlowType
  var variance: Variance_ | Null
}

object ObjectTypeProperty_ {
  @scala.inline
  def apply(
    key: Identifier_ | StringLiteral_,
    kind: init | get | set,
    optional: Boolean,
    proto: Boolean,
    static: Boolean,
    `type`: ObjectTypeProperty,
    value: FlowType,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null,
    variance: Variance_ = null
  ): ObjectTypeProperty_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], variance = variance.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectTypeProperty_]
  }
}

