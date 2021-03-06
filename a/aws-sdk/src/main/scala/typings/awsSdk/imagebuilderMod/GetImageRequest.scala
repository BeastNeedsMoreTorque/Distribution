package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetImageRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the image that you want to retrieve. 
    */
  var imageBuildVersionArn: ImageVersionArnOrBuildVersionArn = js.native
}

object GetImageRequest {
  @scala.inline
  def apply(imageBuildVersionArn: ImageVersionArnOrBuildVersionArn): GetImageRequest = {
    val __obj = js.Dynamic.literal(imageBuildVersionArn = imageBuildVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageRequest]
  }
}

