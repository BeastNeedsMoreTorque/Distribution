package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EbsInstanceBlockDeviceSpecification extends js.Object {
  /**
    * Use to configure delete on termination of the associated device.
    */
  var deleteOnTermination: js.UndefOr[NullableBoolean] = js.native
  /**
    * Use to configure device encryption.
    */
  var encrypted: js.UndefOr[NullableBoolean] = js.native
  /**
    * Use to configure device IOPS.
    */
  var iops: js.UndefOr[EbsIopsInteger] = js.native
  /**
    * Use to configure the KMS key to use when encrypting the device.
    */
  var kmsKeyId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The snapshot that defines the device contents.
    */
  var snapshotId: js.UndefOr[NonEmptyString] = js.native
  /**
    * Use to override the device's volume size.
    */
  var volumeSize: js.UndefOr[EbsVolumeSizeInteger] = js.native
  /**
    * Use to override the device's volume type.
    */
  var volumeType: js.UndefOr[EbsVolumeType] = js.native
}

object EbsInstanceBlockDeviceSpecification {
  @scala.inline
  def apply(
    deleteOnTermination: js.UndefOr[NullableBoolean] = js.undefined,
    encrypted: js.UndefOr[NullableBoolean] = js.undefined,
    iops: js.UndefOr[EbsIopsInteger] = js.undefined,
    kmsKeyId: NonEmptyString = null,
    snapshotId: NonEmptyString = null,
    volumeSize: js.UndefOr[EbsVolumeSizeInteger] = js.undefined,
    volumeType: EbsVolumeType = null
  ): EbsInstanceBlockDeviceSpecification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.get.asInstanceOf[js.Any])
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iops)) __obj.updateDynamic("iops")(iops.get.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    if (!js.isUndefined(volumeSize)) __obj.updateDynamic("volumeSize")(volumeSize.get.asInstanceOf[js.Any])
    if (volumeType != null) __obj.updateDynamic("volumeType")(volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EbsInstanceBlockDeviceSpecification]
  }
}

