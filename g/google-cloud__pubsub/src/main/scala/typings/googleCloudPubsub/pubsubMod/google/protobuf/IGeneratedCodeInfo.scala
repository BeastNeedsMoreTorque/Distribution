package typings.googleCloudPubsub.pubsubMod.google.protobuf

import typings.googleCloudPubsub.pubsubMod.google.protobuf.GeneratedCodeInfo.IAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a GeneratedCodeInfo. */
trait IGeneratedCodeInfo extends js.Object {
  /** GeneratedCodeInfo annotation */
  var annotation: js.UndefOr[js.Array[IAnnotation] | Null] = js.undefined
}

object IGeneratedCodeInfo {
  @scala.inline
  def apply(annotation: js.UndefOr[Null | js.Array[IAnnotation]] = js.undefined): IGeneratedCodeInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(annotation)) __obj.updateDynamic("annotation")(annotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeneratedCodeInfo]
  }
}

