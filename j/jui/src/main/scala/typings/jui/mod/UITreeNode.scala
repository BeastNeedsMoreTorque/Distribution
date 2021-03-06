package typings.jui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UITreeNode extends js.Object {
  /** List of child nodes of a specified node */
  var children: js.UndefOr[js.Array[UITreeNode]] = js.undefined
  /** Data of a specified node */
  var data: js.UndefOr[js.Array[_]] = js.undefined
  /** Depth of a specified node */
  var depth: js.UndefOr[Double] = js.undefined
  /** LI element of a specified node */
  var element: js.UndefOr[js.Any] = js.undefined
  /** Index of a specified node  */
  var index: js.UndefOr[Double] = js.undefined
  /** Unique number of a specifiede node at the current depth */
  var nodenum: js.UndefOr[Double] = js.undefined
  /** Variable that refers to the parent of the current node */
  var parent: js.UndefOr[UITreeNode] = js.undefined
  /** State value that indicates whether a child node is shown or hidden */
  var `type`: js.UndefOr[String] = js.undefined
}

object UITreeNode {
  @scala.inline
  def apply(
    children: js.Array[UITreeNode] = null,
    data: js.Array[_] = null,
    depth: js.UndefOr[Double] = js.undefined,
    element: js.Any = null,
    index: js.UndefOr[Double] = js.undefined,
    nodenum: js.UndefOr[Double] = js.undefined,
    parent: UITreeNode = null,
    `type`: String = null
  ): UITreeNode = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nodenum)) __obj.updateDynamic("nodenum")(nodenum.get.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UITreeNode]
  }
}

