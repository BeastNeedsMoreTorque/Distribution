package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ExportSpecifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ExportSpecifier_
  extends ModuleSpecifier
     with BaseNode {
  var exported: Identifier_
  var local: Identifier_
  @JSName("type")
  var type_ExportSpecifier_ : ExportSpecifier
}

object ExportSpecifier_ {
  @scala.inline
  def apply(
    exported: Identifier_,
    local: Identifier_,
    `type`: ExportSpecifier,
    end: Double = null.asInstanceOf[Double],
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Double = null.asInstanceOf[Double],
    trailingComments: js.Array[Comment] = null
  ): ExportSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], innerComments = innerComments.asInstanceOf[js.Any], leadingComments = leadingComments.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], trailingComments = trailingComments.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSpecifier_]
  }
}

