package typings.eslint.anon

import typings.eslint.eslintStrings.Variable
import typings.eslint.mod.Scope.DefinitionType
import typings.estree.mod.VariableDeclaration
import typings.estree.mod.VariableDeclarator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeVariableDeclarator extends DefinitionType {
  var node: VariableDeclarator
  var parent: VariableDeclaration
  var `type`: Variable
}

object NodeVariableDeclarator {
  @scala.inline
  def apply(node: VariableDeclarator, parent: VariableDeclaration, `type`: Variable): NodeVariableDeclarator = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeVariableDeclarator]
  }
}

