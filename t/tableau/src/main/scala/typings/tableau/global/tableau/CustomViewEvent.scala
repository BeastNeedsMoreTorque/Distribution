package typings.tableau.global.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.CustomViewEvent")
@js.native
class CustomViewEvent ()
  extends typings.tableau.tableau.CustomViewEvent {
  /** Gets the CustomView object associated with the event. */
  /* CompleteClass */
  override def getCustomViewAsync(): js.Promise[typings.tableau.tableau.CustomView] = js.native
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  /* CompleteClass */
  override def getEventName(): typings.tableau.tableau.TableauEventName = js.native
  /** Gets the Viz object associated with the event. */
  /* CompleteClass */
  override def getViz(): typings.tableau.tableau.Viz = js.native
}

