package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.breadthfirst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#layouts/breadthfirst
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cytoscape.mod.LayoutOptions because Already inherited */ trait BreadthFirstLayoutOptions extends ShapedLayoutOptions {
  // put depths in concentric circles if true, put depths top down if false
  var circle: Boolean
  // whether the tree is directed downwards (or edges can point in any direction if false)
  var directed: Boolean
  // how many times to try to position the nodes in a maximal way (i.e. no backtracking)
  var maximalAdjustments: Double
  @JSName("name")
  var name_BreadthFirstLayoutOptions: breadthfirst
  // the roots of the trees
  var roots: js.UndefOr[String] = js.undefined
}

object BreadthFirstLayoutOptions {
  @scala.inline
  def apply(
    circle: Boolean,
    directed: Boolean,
    fit: Boolean,
    maximalAdjustments: Double,
    name: breadthfirst,
    nodeDimensionsIncludeLabels: Boolean,
    animate: js.UndefOr[Boolean] = js.undefined,
    animationDuration: js.UndefOr[Double] = js.undefined,
    animationEasing: js.UndefOr[Boolean] = js.undefined,
    avoidOverlap: js.UndefOr[Boolean] = js.undefined,
    boundingBox: BoundingBox12 | BoundingBoxWH = null,
    padding: js.UndefOr[Double] = js.undefined,
    ready: /* e */ LayoutEventObject => Unit = null,
    roots: String = null,
    sort: (/* a */ SortableNode, /* b */ SortableNode) => Double = null,
    spacingFactor: js.UndefOr[Double] = js.undefined,
    stop: /* e */ LayoutEventObject => Unit = null
  ): BreadthFirstLayoutOptions = {
    val __obj = js.Dynamic.literal(circle = circle.asInstanceOf[js.Any], directed = directed.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], maximalAdjustments = maximalAdjustments.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationDuration)) __obj.updateDynamic("animationDuration")(animationDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(animationEasing)) __obj.updateDynamic("animationEasing")(animationEasing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidOverlap)) __obj.updateDynamic("avoidOverlap")(avoidOverlap.get.asInstanceOf[js.Any])
    if (boundingBox != null) __obj.updateDynamic("boundingBox")(boundingBox.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction1(ready))
    if (roots != null) __obj.updateDynamic("roots")(roots.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction2(sort))
    if (!js.isUndefined(spacingFactor)) __obj.updateDynamic("spacingFactor")(spacingFactor.get.asInstanceOf[js.Any])
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1(stop))
    __obj.asInstanceOf[BreadthFirstLayoutOptions]
  }
}

