package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetsProgressEvent extends IAssetsProgressEvent

object AssetsProgressEvent {
  @scala.inline
  def apply(remainingCount: Double, task: AbstractAssetTask, totalCount: Double): AssetsProgressEvent = {
    val __obj = js.Dynamic.literal(remainingCount = remainingCount.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetsProgressEvent]
  }
}

