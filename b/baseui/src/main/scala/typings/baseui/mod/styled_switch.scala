package typings.baseui.mod

import typings.baseui.anon.ClassName
import typings.baseui.anon.Theme
import typings.baseui.baseuiStrings.switch
import typings.react.mod.ComponentProps
import typings.std.Exclude
import typings.std.Pick
import typings.styletronReact.mod.StyletronComponent
import typings.styletronStandard.mod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui", "styled")
@js.native
object styled_switch extends js.Object {
  def apply[P /* <: js.Object */, T](component: switch, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[switch], 
      Exclude[/* keyof react.react.ComponentProps<'switch'> */ String, ClassName]
    ]) with P
  ] = js.native
  def apply[P /* <: js.Object */, T](component: switch, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[switch], 
      Exclude[/* keyof react.react.ComponentProps<'switch'> */ String, ClassName]
    ]) with P
  ] = js.native
}

