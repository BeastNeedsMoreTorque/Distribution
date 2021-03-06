package typings.jointjs

import typings.jointjs.jointjsMod.diaNs.PaperNs.ProgressCallback
import typings.jointjs.jointjsMod.diaNs.PaperNs.ViewportCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BatchSizeProgress extends js.Object {
  var batchSize: js.UndefOr[Double] = js.undefined
  var progress: js.UndefOr[ProgressCallback] = js.undefined
  var viewport: js.UndefOr[ViewportCallback] = js.undefined
}

object Anon_BatchSizeProgress {
  @scala.inline
  def apply(
    batchSize: Int | Double = null,
    progress: ProgressCallback = null,
    viewport: ViewportCallback = null
  ): Anon_BatchSizeProgress = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (viewport != null) __obj.updateDynamic("viewport")(viewport)
    __obj.asInstanceOf[Anon_BatchSizeProgress]
  }
}

