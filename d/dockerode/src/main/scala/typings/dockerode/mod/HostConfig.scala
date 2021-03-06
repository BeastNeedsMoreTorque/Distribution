package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostConfig extends js.Object {
  var AutoRemove: js.UndefOr[Boolean] = js.undefined
  var Binds: js.UndefOr[js.Array[String]] = js.undefined
  var BlkioDeviceReadBps: js.UndefOr[js.Any] = js.undefined
  var BlkioDeviceReadIOps: js.UndefOr[js.Any] = js.undefined
  var BlkioDeviceWriteBps: js.UndefOr[js.Any] = js.undefined
  var BlkioDeviceWriteIOps: js.UndefOr[js.Any] = js.undefined
  var BlkioWeight: js.UndefOr[Double] = js.undefined
  var BlkioWeightDevice: js.UndefOr[js.Any] = js.undefined
  var CapAdd: js.UndefOr[js.Any] = js.undefined
  var CapDrop: js.UndefOr[js.Any] = js.undefined
  var Cgroup: js.UndefOr[String] = js.undefined
  var CgroupParent: js.UndefOr[String] = js.undefined
  var ConsoleSize: js.UndefOr[js.Array[Double]] = js.undefined
  var ContainerIDFile: js.UndefOr[String] = js.undefined
  var CpuPeriod: js.UndefOr[Double] = js.undefined
  var CpuQuota: js.UndefOr[Double] = js.undefined
  var CpuShares: js.UndefOr[Double] = js.undefined
  var CpusetCpus: js.UndefOr[String] = js.undefined
  var CpusetMems: js.UndefOr[String] = js.undefined
  var DeviceCgroupRules: js.UndefOr[js.Array[String]] = js.undefined
  var DeviceRequests: js.UndefOr[js.Array[DeviceRequest]] = js.undefined
  var Devices: js.UndefOr[js.Any] = js.undefined
  var DiskQuota: js.UndefOr[Double] = js.undefined
  var Dns: js.UndefOr[js.Array[_]] = js.undefined
  var DnsOptions: js.UndefOr[js.Array[_]] = js.undefined
  var DnsSearch: js.UndefOr[js.Array[_]] = js.undefined
  var ExtraHosts: js.UndefOr[js.Any] = js.undefined
  var GroupAdd: js.UndefOr[js.Array[String]] = js.undefined
  var IpcMode: js.UndefOr[String] = js.undefined
  var Isolation: js.UndefOr[String] = js.undefined
  var KernelMemory: js.UndefOr[Double] = js.undefined
  var Links: js.UndefOr[js.Any] = js.undefined
  var LogConfig: js.UndefOr[typings.dockerode.anon.Config] = js.undefined
  var MaskedPaths: js.UndefOr[js.Array[String]] = js.undefined
  var Memory: js.UndefOr[Double] = js.undefined
  var MemoryReservation: js.UndefOr[Double] = js.undefined
  var MemorySwap: js.UndefOr[Double] = js.undefined
  var MemorySwappiness: js.UndefOr[Double] = js.undefined
  var Mounts: js.UndefOr[MountConfig] = js.undefined
  var NetworkMode: js.UndefOr[String] = js.undefined
  var OomKillDisable: js.UndefOr[Boolean] = js.undefined
  var OomScoreAdj: js.UndefOr[Double] = js.undefined
  var PidMode: js.UndefOr[String] = js.undefined
  var PidsLimit: js.UndefOr[Double] = js.undefined
  var PortBindings: js.UndefOr[js.Any] = js.undefined
  var Privileged: js.UndefOr[Boolean] = js.undefined
  var PublishAllPorts: js.UndefOr[Boolean] = js.undefined
  var ReadonlyPaths: js.UndefOr[js.Array[String]] = js.undefined
  var ReadonlyRootfs: js.UndefOr[Boolean] = js.undefined
  var RestartPolicy: js.UndefOr[typings.dockerode.mod.RestartPolicy] = js.undefined
  var Runtime: js.UndefOr[String] = js.undefined
  var SecurityOpt: js.UndefOr[js.Any] = js.undefined
  var ShmSize: js.UndefOr[Double] = js.undefined
  var StorageOpt: js.UndefOr[StringDictionary[String]] = js.undefined
  var Sysctls: js.UndefOr[StringDictionary[String]] = js.undefined
  var Tmpfs: js.UndefOr[StringDictionary[String]] = js.undefined
  var UTSMode: js.UndefOr[String] = js.undefined
  var Ulimits: js.UndefOr[js.Any] = js.undefined
  var UsernsMode: js.UndefOr[String] = js.undefined
  var VolumeDriver: js.UndefOr[String] = js.undefined
  var VolumesFrom: js.UndefOr[js.Any] = js.undefined
}

object HostConfig {
  @scala.inline
  def apply(
    AutoRemove: js.UndefOr[Boolean] = js.undefined,
    Binds: js.Array[String] = null,
    BlkioDeviceReadBps: js.Any = null,
    BlkioDeviceReadIOps: js.Any = null,
    BlkioDeviceWriteBps: js.Any = null,
    BlkioDeviceWriteIOps: js.Any = null,
    BlkioWeight: js.UndefOr[Double] = js.undefined,
    BlkioWeightDevice: js.Any = null,
    CapAdd: js.Any = null,
    CapDrop: js.Any = null,
    Cgroup: String = null,
    CgroupParent: String = null,
    ConsoleSize: js.Array[Double] = null,
    ContainerIDFile: String = null,
    CpuPeriod: js.UndefOr[Double] = js.undefined,
    CpuQuota: js.UndefOr[Double] = js.undefined,
    CpuShares: js.UndefOr[Double] = js.undefined,
    CpusetCpus: String = null,
    CpusetMems: String = null,
    DeviceCgroupRules: js.Array[String] = null,
    DeviceRequests: js.Array[DeviceRequest] = null,
    Devices: js.Any = null,
    DiskQuota: js.UndefOr[Double] = js.undefined,
    Dns: js.Array[_] = null,
    DnsOptions: js.Array[_] = null,
    DnsSearch: js.Array[_] = null,
    ExtraHosts: js.Any = null,
    GroupAdd: js.Array[String] = null,
    IpcMode: String = null,
    Isolation: String = null,
    KernelMemory: js.UndefOr[Double] = js.undefined,
    Links: js.Any = null,
    LogConfig: typings.dockerode.anon.Config = null,
    MaskedPaths: js.Array[String] = null,
    Memory: js.UndefOr[Double] = js.undefined,
    MemoryReservation: js.UndefOr[Double] = js.undefined,
    MemorySwap: js.UndefOr[Double] = js.undefined,
    MemorySwappiness: js.UndefOr[Double] = js.undefined,
    Mounts: MountConfig = null,
    NetworkMode: String = null,
    OomKillDisable: js.UndefOr[Boolean] = js.undefined,
    OomScoreAdj: js.UndefOr[Double] = js.undefined,
    PidMode: String = null,
    PidsLimit: js.UndefOr[Double] = js.undefined,
    PortBindings: js.Any = null,
    Privileged: js.UndefOr[Boolean] = js.undefined,
    PublishAllPorts: js.UndefOr[Boolean] = js.undefined,
    ReadonlyPaths: js.Array[String] = null,
    ReadonlyRootfs: js.UndefOr[Boolean] = js.undefined,
    RestartPolicy: RestartPolicy = null,
    Runtime: String = null,
    SecurityOpt: js.Any = null,
    ShmSize: js.UndefOr[Double] = js.undefined,
    StorageOpt: StringDictionary[String] = null,
    Sysctls: StringDictionary[String] = null,
    Tmpfs: StringDictionary[String] = null,
    UTSMode: String = null,
    Ulimits: js.Any = null,
    UsernsMode: String = null,
    VolumeDriver: String = null,
    VolumesFrom: js.Any = null
  ): HostConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoRemove)) __obj.updateDynamic("AutoRemove")(AutoRemove.get.asInstanceOf[js.Any])
    if (Binds != null) __obj.updateDynamic("Binds")(Binds.asInstanceOf[js.Any])
    if (BlkioDeviceReadBps != null) __obj.updateDynamic("BlkioDeviceReadBps")(BlkioDeviceReadBps.asInstanceOf[js.Any])
    if (BlkioDeviceReadIOps != null) __obj.updateDynamic("BlkioDeviceReadIOps")(BlkioDeviceReadIOps.asInstanceOf[js.Any])
    if (BlkioDeviceWriteBps != null) __obj.updateDynamic("BlkioDeviceWriteBps")(BlkioDeviceWriteBps.asInstanceOf[js.Any])
    if (BlkioDeviceWriteIOps != null) __obj.updateDynamic("BlkioDeviceWriteIOps")(BlkioDeviceWriteIOps.asInstanceOf[js.Any])
    if (!js.isUndefined(BlkioWeight)) __obj.updateDynamic("BlkioWeight")(BlkioWeight.get.asInstanceOf[js.Any])
    if (BlkioWeightDevice != null) __obj.updateDynamic("BlkioWeightDevice")(BlkioWeightDevice.asInstanceOf[js.Any])
    if (CapAdd != null) __obj.updateDynamic("CapAdd")(CapAdd.asInstanceOf[js.Any])
    if (CapDrop != null) __obj.updateDynamic("CapDrop")(CapDrop.asInstanceOf[js.Any])
    if (Cgroup != null) __obj.updateDynamic("Cgroup")(Cgroup.asInstanceOf[js.Any])
    if (CgroupParent != null) __obj.updateDynamic("CgroupParent")(CgroupParent.asInstanceOf[js.Any])
    if (ConsoleSize != null) __obj.updateDynamic("ConsoleSize")(ConsoleSize.asInstanceOf[js.Any])
    if (ContainerIDFile != null) __obj.updateDynamic("ContainerIDFile")(ContainerIDFile.asInstanceOf[js.Any])
    if (!js.isUndefined(CpuPeriod)) __obj.updateDynamic("CpuPeriod")(CpuPeriod.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CpuQuota)) __obj.updateDynamic("CpuQuota")(CpuQuota.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CpuShares)) __obj.updateDynamic("CpuShares")(CpuShares.get.asInstanceOf[js.Any])
    if (CpusetCpus != null) __obj.updateDynamic("CpusetCpus")(CpusetCpus.asInstanceOf[js.Any])
    if (CpusetMems != null) __obj.updateDynamic("CpusetMems")(CpusetMems.asInstanceOf[js.Any])
    if (DeviceCgroupRules != null) __obj.updateDynamic("DeviceCgroupRules")(DeviceCgroupRules.asInstanceOf[js.Any])
    if (DeviceRequests != null) __obj.updateDynamic("DeviceRequests")(DeviceRequests.asInstanceOf[js.Any])
    if (Devices != null) __obj.updateDynamic("Devices")(Devices.asInstanceOf[js.Any])
    if (!js.isUndefined(DiskQuota)) __obj.updateDynamic("DiskQuota")(DiskQuota.get.asInstanceOf[js.Any])
    if (Dns != null) __obj.updateDynamic("Dns")(Dns.asInstanceOf[js.Any])
    if (DnsOptions != null) __obj.updateDynamic("DnsOptions")(DnsOptions.asInstanceOf[js.Any])
    if (DnsSearch != null) __obj.updateDynamic("DnsSearch")(DnsSearch.asInstanceOf[js.Any])
    if (ExtraHosts != null) __obj.updateDynamic("ExtraHosts")(ExtraHosts.asInstanceOf[js.Any])
    if (GroupAdd != null) __obj.updateDynamic("GroupAdd")(GroupAdd.asInstanceOf[js.Any])
    if (IpcMode != null) __obj.updateDynamic("IpcMode")(IpcMode.asInstanceOf[js.Any])
    if (Isolation != null) __obj.updateDynamic("Isolation")(Isolation.asInstanceOf[js.Any])
    if (!js.isUndefined(KernelMemory)) __obj.updateDynamic("KernelMemory")(KernelMemory.get.asInstanceOf[js.Any])
    if (Links != null) __obj.updateDynamic("Links")(Links.asInstanceOf[js.Any])
    if (LogConfig != null) __obj.updateDynamic("LogConfig")(LogConfig.asInstanceOf[js.Any])
    if (MaskedPaths != null) __obj.updateDynamic("MaskedPaths")(MaskedPaths.asInstanceOf[js.Any])
    if (!js.isUndefined(Memory)) __obj.updateDynamic("Memory")(Memory.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MemoryReservation)) __obj.updateDynamic("MemoryReservation")(MemoryReservation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MemorySwap)) __obj.updateDynamic("MemorySwap")(MemorySwap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MemorySwappiness)) __obj.updateDynamic("MemorySwappiness")(MemorySwappiness.get.asInstanceOf[js.Any])
    if (Mounts != null) __obj.updateDynamic("Mounts")(Mounts.asInstanceOf[js.Any])
    if (NetworkMode != null) __obj.updateDynamic("NetworkMode")(NetworkMode.asInstanceOf[js.Any])
    if (!js.isUndefined(OomKillDisable)) __obj.updateDynamic("OomKillDisable")(OomKillDisable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(OomScoreAdj)) __obj.updateDynamic("OomScoreAdj")(OomScoreAdj.get.asInstanceOf[js.Any])
    if (PidMode != null) __obj.updateDynamic("PidMode")(PidMode.asInstanceOf[js.Any])
    if (!js.isUndefined(PidsLimit)) __obj.updateDynamic("PidsLimit")(PidsLimit.get.asInstanceOf[js.Any])
    if (PortBindings != null) __obj.updateDynamic("PortBindings")(PortBindings.asInstanceOf[js.Any])
    if (!js.isUndefined(Privileged)) __obj.updateDynamic("Privileged")(Privileged.get.asInstanceOf[js.Any])
    if (!js.isUndefined(PublishAllPorts)) __obj.updateDynamic("PublishAllPorts")(PublishAllPorts.get.asInstanceOf[js.Any])
    if (ReadonlyPaths != null) __obj.updateDynamic("ReadonlyPaths")(ReadonlyPaths.asInstanceOf[js.Any])
    if (!js.isUndefined(ReadonlyRootfs)) __obj.updateDynamic("ReadonlyRootfs")(ReadonlyRootfs.get.asInstanceOf[js.Any])
    if (RestartPolicy != null) __obj.updateDynamic("RestartPolicy")(RestartPolicy.asInstanceOf[js.Any])
    if (Runtime != null) __obj.updateDynamic("Runtime")(Runtime.asInstanceOf[js.Any])
    if (SecurityOpt != null) __obj.updateDynamic("SecurityOpt")(SecurityOpt.asInstanceOf[js.Any])
    if (!js.isUndefined(ShmSize)) __obj.updateDynamic("ShmSize")(ShmSize.get.asInstanceOf[js.Any])
    if (StorageOpt != null) __obj.updateDynamic("StorageOpt")(StorageOpt.asInstanceOf[js.Any])
    if (Sysctls != null) __obj.updateDynamic("Sysctls")(Sysctls.asInstanceOf[js.Any])
    if (Tmpfs != null) __obj.updateDynamic("Tmpfs")(Tmpfs.asInstanceOf[js.Any])
    if (UTSMode != null) __obj.updateDynamic("UTSMode")(UTSMode.asInstanceOf[js.Any])
    if (Ulimits != null) __obj.updateDynamic("Ulimits")(Ulimits.asInstanceOf[js.Any])
    if (UsernsMode != null) __obj.updateDynamic("UsernsMode")(UsernsMode.asInstanceOf[js.Any])
    if (VolumeDriver != null) __obj.updateDynamic("VolumeDriver")(VolumeDriver.asInstanceOf[js.Any])
    if (VolumesFrom != null) __obj.updateDynamic("VolumesFrom")(VolumesFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostConfig]
  }
}

