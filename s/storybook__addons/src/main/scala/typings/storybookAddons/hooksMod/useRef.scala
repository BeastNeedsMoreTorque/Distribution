package typings.storybookAddons.hooksMod

import typings.storybookAddons.anon.Current
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addons/dist/hooks", "useRef")
@js.native
object useRef extends js.Object {
  def apply[T](initialValue: T): Current[T] = js.native
}

