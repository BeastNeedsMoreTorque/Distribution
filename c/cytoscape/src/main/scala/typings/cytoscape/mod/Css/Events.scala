package typings.cytoscape.mod.Css

import typings.cytoscape.cytoscapeStrings.no
import typings.cytoscape.cytoscapeStrings.yes
import typings.cytoscape.mod.EdgeSingular
import typings.cytoscape.mod.NodeSingular
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#style/events
  */
trait Events[SingularType /* <: NodeSingular | EdgeSingular */] extends js.Object {
  /**
    * Whether events should occur on an element (e.g.tap, mouseover, etc.).
    *  * For "no", the element receives no events and events simply pass through to the core/viewport.
    */
  var events: PropertyValue[SingularType, yes | no]
  /**
    *  Whether events should occur on an element if the label receives an event.
    * You may want a style applied to the text on active so you know the text is activatable.
    */
  var `text-events`: PropertyValue[SingularType, yes | no]
}

object Events {
  @scala.inline
  def apply[/* <: typings.cytoscape.mod.NodeSingular | typings.cytoscape.mod.EdgeSingular */ SingularType](
    events: PropertyValue[SingularType, yes | no],
    `text-events`: PropertyValue[SingularType, yes | no]
  ): Events[SingularType] = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.updateDynamic("text-events")(`text-events`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events[SingularType]]
  }
}

