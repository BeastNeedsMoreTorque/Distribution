package typings.cleanCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdjacentSpace extends js.Object {
  /**
    * Controls extra space before `nav` element; defaults to `false`
    */
  var adjacentSpace: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls removal of IE7 selector hacks, e.g. `*+html...`; defaults to `true`
    */
  var ie7Hack: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls maximum number of selectors in a single rule (since 4.1.0); defaults to `8191`
    */
  var mergeLimit: Double
  /**
    * Controls a whitelist of mergeable pseudo classes; defaults to `[':active', ...]`
    */
  var mergeablePseudoClasses: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Controls a whitelist of mergeable pseudo elements; defaults to `['::after', ...]`
    */
  var mergeablePseudoElements: js.Array[String]
  /**
    * Controls merging of rules with multiple pseudo classes / elements (since 4.1.0); defaults to `true`
    */
  var multiplePseudoMerging: Boolean
}

object AdjacentSpace {
  @scala.inline
  def apply(
    mergeLimit: Double,
    mergeablePseudoElements: js.Array[String],
    multiplePseudoMerging: Boolean,
    adjacentSpace: js.UndefOr[Boolean] = js.undefined,
    ie7Hack: js.UndefOr[Boolean] = js.undefined,
    mergeablePseudoClasses: js.Array[String] = null
  ): AdjacentSpace = {
    val __obj = js.Dynamic.literal(mergeLimit = mergeLimit.asInstanceOf[js.Any], mergeablePseudoElements = mergeablePseudoElements.asInstanceOf[js.Any], multiplePseudoMerging = multiplePseudoMerging.asInstanceOf[js.Any])
    if (!js.isUndefined(adjacentSpace)) __obj.updateDynamic("adjacentSpace")(adjacentSpace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ie7Hack)) __obj.updateDynamic("ie7Hack")(ie7Hack.get.asInstanceOf[js.Any])
    if (mergeablePseudoClasses != null) __obj.updateDynamic("mergeablePseudoClasses")(mergeablePseudoClasses.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdjacentSpace]
  }
}

