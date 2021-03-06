package typings.fineUploader.s3Mod.s3

import typings.fineUploader.coreMod.ResumableFileObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3ResumableFileObject extends ResumableFileObject {
  /**
    * The associated object's S3 key
    */
  var key: js.UndefOr[String] = js.undefined
}

object S3ResumableFileObject {
  @scala.inline
  def apply(
    customResumeData: js.Any = null,
    key: String = null,
    name: String = null,
    remaining: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    uuid: js.UndefOr[Double] = js.undefined
  ): S3ResumableFileObject = {
    val __obj = js.Dynamic.literal()
    if (customResumeData != null) __obj.updateDynamic("customResumeData")(customResumeData.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(remaining)) __obj.updateDynamic("remaining")(remaining.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uuid)) __obj.updateDynamic("uuid")(uuid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ResumableFileObject]
  }
}

