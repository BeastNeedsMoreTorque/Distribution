package typings.typedoc.anon

import typings.typedoc.optionsDeclarationMod.ParameterScope
import typings.typedoc.optionsDeclarationMod.ParameterType.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<typedoc.typedoc/dist/lib/utils/options/declaration.NumberDeclarationOption> */
trait ReadonlyNumberDeclaration extends js.Object {
  val defaultValue: js.UndefOr[Double] = js.undefined
  val help: String
  val name: String
  val scope: js.UndefOr[ParameterScope] = js.undefined
  val short: js.UndefOr[String] = js.undefined
  val `type`: Number
}

object ReadonlyNumberDeclaration {
  @scala.inline
  def apply(
    help: String,
    name: String,
    `type`: Number,
    defaultValue: js.UndefOr[Double] = js.undefined,
    scope: ParameterScope = null,
    short: String = null
  ): ReadonlyNumberDeclaration = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.get.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyNumberDeclaration]
  }
}

