package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFormat extends js.Object {
  /** File type of the video format. */
  var fileType: js.UndefOr[String] = js.undefined
  /** ID of the video format. */
  var id: js.UndefOr[Double] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#videoFormat". */
  var kind: js.UndefOr[String] = js.undefined
  /** The resolution of this video format. */
  var resolution: js.UndefOr[Size] = js.undefined
  /** The target bit rate of this video format. */
  var targetBitRate: js.UndefOr[Double] = js.undefined
}

object VideoFormat {
  @scala.inline
  def apply(
    fileType: String = null,
    id: js.UndefOr[Double] = js.undefined,
    kind: String = null,
    resolution: Size = null,
    targetBitRate: js.UndefOr[Double] = js.undefined
  ): VideoFormat = {
    val __obj = js.Dynamic.literal()
    if (fileType != null) __obj.updateDynamic("fileType")(fileType.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (resolution != null) __obj.updateDynamic("resolution")(resolution.asInstanceOf[js.Any])
    if (!js.isUndefined(targetBitRate)) __obj.updateDynamic("targetBitRate")(targetBitRate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoFormat]
  }
}

