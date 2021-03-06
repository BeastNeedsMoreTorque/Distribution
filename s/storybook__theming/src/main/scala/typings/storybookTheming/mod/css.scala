package typings.storybookTheming.mod

import typings.emotionSerialize.mod.Interpolation
import typings.emotionUtils.mod.SerializedStyles
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/theming", "css")
@js.native
object css extends js.Object {
  def apply(args: Interpolation[js.UndefOr[scala.Nothing]]*): SerializedStyles = js.native
  def apply(template: TemplateStringsArray, args: Interpolation[js.UndefOr[scala.Nothing]]*): SerializedStyles = js.native
}

