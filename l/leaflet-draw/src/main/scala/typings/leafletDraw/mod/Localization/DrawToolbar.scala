package typings.leafletDraw.mod.Localization

import typings.leafletDraw.anon.Circle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawToolbar extends js.Object {
  var actions: Action
  var buttons: Circle
  var finish: Action
  var undo: Action
}

object DrawToolbar {
  @scala.inline
  def apply(actions: Action, buttons: Circle, finish: Action, undo: Action): DrawToolbar = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], finish = finish.asInstanceOf[js.Any], undo = undo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawToolbar]
  }
}

