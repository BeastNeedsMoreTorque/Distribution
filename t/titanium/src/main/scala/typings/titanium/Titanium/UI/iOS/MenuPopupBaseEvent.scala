package typings.titanium.Titanium.UI.iOS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base event for class Titanium.UI.iOS.MenuPopup
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Ti.Event * / any */ trait MenuPopupBaseEvent extends js.Object {
  /**
    * Source object that fired the event.
    */
  var source: MenuPopup
}

object MenuPopupBaseEvent {
  @scala.inline
  def apply(source: MenuPopup): MenuPopupBaseEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuPopupBaseEvent]
  }
}

