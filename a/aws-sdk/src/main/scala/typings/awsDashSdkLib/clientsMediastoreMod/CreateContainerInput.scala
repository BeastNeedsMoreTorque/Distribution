package typings
package awsDashSdkLib.clientsMediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateContainerInput extends js.Object {
  /**
    * The name for the container. The name must be from 1 to 255 characters. Container names must be unique to your AWS account within a specific region. As an example, you could create a container named movies in every region, as long as you don’t have an existing container with that name.
    */
  var ContainerName: awsDashSdkLib.clientsMediastoreMod.ContainerName
  /**
    * An array of key:value pairs that you define. These values can be anything that you want. Typically, the tag key represents a category (such as "environment") and the tag value represents a specific value within that category (such as "test," "development," or "production"). You can add up to 50 tags to each container. For more information about tagging, including naming and usage conventions, see Tagging Resources in MediaStore.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateContainerInput {
  @scala.inline
  def apply(ContainerName: ContainerName, Tags: TagList = null): CreateContainerInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateContainerInput]
  }
}

