package typings.awsSdk.iot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateDeviceFromPlacementRequest extends js.Object {
  /**
    * The device ID that should be removed from the placement.
    */
  var deviceTemplateName: DeviceTemplateName = js.native
  /**
    * The name of the placement that the device should be removed from.
    */
  var placementName: PlacementName = js.native
  /**
    * The name of the project that contains the placement.
    */
  var projectName: ProjectName = js.native
}

object DisassociateDeviceFromPlacementRequest {
  @scala.inline
  def apply(deviceTemplateName: DeviceTemplateName, placementName: PlacementName, projectName: ProjectName): DisassociateDeviceFromPlacementRequest = {
    val __obj = js.Dynamic.literal(deviceTemplateName = deviceTemplateName.asInstanceOf[js.Any], placementName = placementName.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateDeviceFromPlacementRequest]
  }
}

