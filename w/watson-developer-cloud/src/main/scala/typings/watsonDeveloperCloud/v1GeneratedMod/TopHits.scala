package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** TopHits. */
trait TopHits extends js.Object {
  var hits: js.UndefOr[TopHitsResults] = js.undefined
  /** Number of top hits returned by the aggregation. */
  var size: js.UndefOr[Double] = js.undefined
}

object TopHits {
  @scala.inline
  def apply(hits: TopHitsResults = null, size: js.UndefOr[Double] = js.undefined): TopHits = {
    val __obj = js.Dynamic.literal()
    if (hits != null) __obj.updateDynamic("hits")(hits.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopHits]
  }
}

