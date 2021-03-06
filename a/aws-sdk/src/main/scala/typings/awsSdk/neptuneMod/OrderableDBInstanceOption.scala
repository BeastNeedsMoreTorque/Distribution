package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderableDBInstanceOption extends js.Object {
  /**
    * A list of Availability Zones for a DB instance.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.native
  /**
    * The DB instance class for a DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.native
  /**
    * The engine type of a DB instance.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * The engine version of a DB instance.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The license model for a DB instance.
    */
  var LicenseModel: js.UndefOr[String] = js.native
  /**
    * Maximum total provisioned IOPS for a DB instance.
    */
  var MaxIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.native
  /**
    * Maximum provisioned IOPS per GiB for a DB instance.
    */
  var MaxIopsPerGib: js.UndefOr[DoubleOptional] = js.native
  /**
    * Maximum storage size for a DB instance.
    */
  var MaxStorageSize: js.UndefOr[IntegerOptional] = js.native
  /**
    * Minimum total provisioned IOPS for a DB instance.
    */
  var MinIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.native
  /**
    * Minimum provisioned IOPS per GiB for a DB instance.
    */
  var MinIopsPerGib: js.UndefOr[DoubleOptional] = js.native
  /**
    * Minimum storage size for a DB instance.
    */
  var MinStorageSize: js.UndefOr[IntegerOptional] = js.native
  /**
    * Indicates whether a DB instance is Multi-AZ capable.
    */
  var MultiAZCapable: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether a DB instance can have a Read Replica.
    */
  var ReadReplicaCapable: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the storage type for a DB instance.
    */
  var StorageType: js.UndefOr[String] = js.native
  /**
    * Indicates whether a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
    */
  var SupportsEnhancedMonitoring: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether a DB instance supports IAM database authentication.
    */
  var SupportsIAMDatabaseAuthentication: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether a DB instance supports provisioned IOPS.
    */
  var SupportsIops: js.UndefOr[Boolean] = js.native
  /**
    *  (Not supported by Neptune) 
    */
  var SupportsPerformanceInsights: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether a DB instance supports encrypted storage.
    */
  var SupportsStorageEncryption: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether a DB instance is in a VPC.
    */
  var Vpc: js.UndefOr[Boolean] = js.native
}

object OrderableDBInstanceOption {
  @scala.inline
  def apply(
    AvailabilityZones: AvailabilityZoneList = null,
    DBInstanceClass: String = null,
    Engine: String = null,
    EngineVersion: String = null,
    LicenseModel: String = null,
    MaxIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.undefined,
    MaxIopsPerGib: js.UndefOr[DoubleOptional] = js.undefined,
    MaxStorageSize: js.UndefOr[IntegerOptional] = js.undefined,
    MinIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.undefined,
    MinIopsPerGib: js.UndefOr[DoubleOptional] = js.undefined,
    MinStorageSize: js.UndefOr[IntegerOptional] = js.undefined,
    MultiAZCapable: js.UndefOr[Boolean] = js.undefined,
    ReadReplicaCapable: js.UndefOr[Boolean] = js.undefined,
    StorageType: String = null,
    SupportsEnhancedMonitoring: js.UndefOr[Boolean] = js.undefined,
    SupportsIAMDatabaseAuthentication: js.UndefOr[Boolean] = js.undefined,
    SupportsIops: js.UndefOr[Boolean] = js.undefined,
    SupportsPerformanceInsights: js.UndefOr[Boolean] = js.undefined,
    SupportsStorageEncryption: js.UndefOr[Boolean] = js.undefined,
    Vpc: js.UndefOr[Boolean] = js.undefined
  ): OrderableDBInstanceOption = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (DBInstanceClass != null) __obj.updateDynamic("DBInstanceClass")(DBInstanceClass.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (LicenseModel != null) __obj.updateDynamic("LicenseModel")(LicenseModel.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxIopsPerDbInstance)) __obj.updateDynamic("MaxIopsPerDbInstance")(MaxIopsPerDbInstance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxIopsPerGib)) __obj.updateDynamic("MaxIopsPerGib")(MaxIopsPerGib.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxStorageSize)) __obj.updateDynamic("MaxStorageSize")(MaxStorageSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinIopsPerDbInstance)) __obj.updateDynamic("MinIopsPerDbInstance")(MinIopsPerDbInstance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinIopsPerGib)) __obj.updateDynamic("MinIopsPerGib")(MinIopsPerGib.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinStorageSize)) __obj.updateDynamic("MinStorageSize")(MinStorageSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MultiAZCapable)) __obj.updateDynamic("MultiAZCapable")(MultiAZCapable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ReadReplicaCapable)) __obj.updateDynamic("ReadReplicaCapable")(ReadReplicaCapable.get.asInstanceOf[js.Any])
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType.asInstanceOf[js.Any])
    if (!js.isUndefined(SupportsEnhancedMonitoring)) __obj.updateDynamic("SupportsEnhancedMonitoring")(SupportsEnhancedMonitoring.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SupportsIAMDatabaseAuthentication)) __obj.updateDynamic("SupportsIAMDatabaseAuthentication")(SupportsIAMDatabaseAuthentication.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SupportsIops)) __obj.updateDynamic("SupportsIops")(SupportsIops.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SupportsPerformanceInsights)) __obj.updateDynamic("SupportsPerformanceInsights")(SupportsPerformanceInsights.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SupportsStorageEncryption)) __obj.updateDynamic("SupportsStorageEncryption")(SupportsStorageEncryption.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Vpc)) __obj.updateDynamic("Vpc")(Vpc.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderableDBInstanceOption]
  }
}

