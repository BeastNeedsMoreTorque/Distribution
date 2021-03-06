package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectCache extends js.Object {
  /**
    * The location where the AWS CodeBuild project stores cached resources. For type `S3` the value must be a valid S3 bucket name/prefix.
    */
  var location: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies settings that AWS CodeBuild uses to store and reuse build dependencies. Valid values:  `LOCAL_SOURCE_CACHE`, `LOCAL_DOCKER_LAYER_CACHE`, and `LOCAL_CUSTOM_CACHE`
    */
  var modes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The type of storage that will be used for the AWS CodeBuild project cache. Valid values: `NO_CACHE`, `LOCAL`, and `S3`. Defaults to `NO_CACHE`.
    */
  var `type`: js.UndefOr[Input[String]] = js.native
}

object ProjectCache {
  @scala.inline
  def apply(
    location: Input[String] = null,
    modes: Input[js.Array[Input[String]]] = null,
    `type`: Input[String] = null
  ): ProjectCache = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (modes != null) __obj.updateDynamic("modes")(modes.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectCache]
  }
}

