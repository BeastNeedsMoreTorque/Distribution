package typings.reactNavigationStack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type NavigationStackScreenComponent[Params, ScreenProps] = (typings.react.mod.ComponentType[
    typings.reactNavigationStack.typesMod.NavigationStackScreenProps[Params, ScreenProps]
  ]) with (typings.reactNavigationStack.anon.NavigationOptions[Params, ScreenProps])
}
