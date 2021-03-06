package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ClassExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ClassExpression_
  extends Class
     with BaseNode
     with Expression
     with Scopable {
  var body: ClassBody_
  var decorators: js.Array[Decorator_] | Null
  var id: Identifier_ | Null
  var implements: (js.Array[TSExpressionWithTypeArguments_ | ClassImplements_]) | Null
  var mixins: InterfaceExtends_ | Null
  var superClass: Expression | Null
  var superTypeParameters: TypeParameterInstantiation_ | TSTypeParameterInstantiation_ | Null
  var typeParameters: TypeParameterDeclaration_ | TSTypeParameterDeclaration_ | Noop_ | Null
  @JSName("type")
  var type_ClassExpression_ : ClassExpression
}

object ClassExpression_ {
  @scala.inline
  def apply(
    body: ClassBody_,
    `type`: ClassExpression,
    decorators: js.Array[Decorator_] = null,
    end: Double = null.asInstanceOf[Double],
    id: Identifier_ = null,
    implements: js.Array[TSExpressionWithTypeArguments_ | ClassImplements_] = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    mixins: InterfaceExtends_ = null,
    start: Double = null.asInstanceOf[Double],
    superClass: Expression = null,
    superTypeParameters: TypeParameterInstantiation_ | TSTypeParameterInstantiation_ = null,
    trailingComments: js.Array[Comment] = null,
    typeParameters: TypeParameterDeclaration_ | TSTypeParameterDeclaration_ | Noop_ = null
  ): ClassExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], decorators = decorators.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], implements = implements.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], mixins = mixins.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], superClass = superClass.asInstanceOf[js.Any], superTypeParameters = superTypeParameters.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any], typeParameters = typeParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassExpression_]
  }
}

