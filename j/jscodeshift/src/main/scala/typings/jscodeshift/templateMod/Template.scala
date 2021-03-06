package typings.jscodeshift.templateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  /** Tagged template function. Parses the string as source and returns an Expression AST node. */
  def expression(args: js.Any*): js.Any
  /** Tagged template function. Parses the string as source and returns an Statement AST node. */
  def statement(args: js.Any*): js.Any
  /** Tagged template function. Parses the string as source and returns an array of Statement AST nodes. */
  def statements(args: js.Any*): js.Any
}

object Template {
  @scala.inline
  def apply(
    expression: /* repeated */ js.Any => js.Any,
    statement: /* repeated */ js.Any => js.Any,
    statements: /* repeated */ js.Any => js.Any
  ): Template = {
    val __obj = js.Dynamic.literal(expression = js.Any.fromFunction1(expression), statement = js.Any.fromFunction1(statement), statements = js.Any.fromFunction1(statements))
    __obj.asInstanceOf[Template]
  }
}

