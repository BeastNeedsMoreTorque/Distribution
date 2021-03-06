package typings.cytoscape.anon

import typings.cytoscape.mod.CollectionReturnValue
import typings.cytoscape.mod.NodeCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cut extends js.Object {
  var components: CollectionReturnValue
  var cut: NodeCollection
}

object Cut {
  @scala.inline
  def apply(components: CollectionReturnValue, cut: NodeCollection): Cut = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cut]
  }
}

