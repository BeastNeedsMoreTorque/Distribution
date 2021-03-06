package typings.tableau.global.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.MarksEvent")
@js.native
class MarksEvent ()
  extends typings.tableau.tableau.MarksEvent {
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  /* CompleteClass */
  override def getEventName(): typings.tableau.tableau.TableauEventName = js.native
  /** Gets the selected marks on the Worksheet that triggered the event. */
  /* CompleteClass */
  override def getMarksAsync(): js.Promise[js.Array[typings.tableau.tableau.Mark]] = js.native
  /** Gets the Viz object associated with the event. */
  /* CompleteClass */
  override def getViz(): typings.tableau.tableau.Viz = js.native
  /** Gets the Worksheet object associated with the event. */
  /* CompleteClass */
  override def getWorksheet(): typings.tableau.tableau.Worksheet = js.native
}

