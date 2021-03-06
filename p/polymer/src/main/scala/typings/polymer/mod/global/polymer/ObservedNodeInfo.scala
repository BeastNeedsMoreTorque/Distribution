package typings.polymer.mod.global.polymer

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObservedNodeInfo extends js.Object {
  var addedNodes: js.Array[Node]
  var removedNode: js.Array[Node]
  var target: Node
}

object ObservedNodeInfo {
  @scala.inline
  def apply(addedNodes: js.Array[Node], removedNode: js.Array[Node], target: Node): ObservedNodeInfo = {
    val __obj = js.Dynamic.literal(addedNodes = addedNodes.asInstanceOf[js.Any], removedNode = removedNode.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObservedNodeInfo]
  }
}

