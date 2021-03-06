package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.I2c.I2cBusSpeed
import typings.winrtUwp.Windows.Devices.I2c.I2cSharingMode
import typings.winrtUwp.Windows.Devices.I2c.I2cTransferResult
import typings.winrtUwp.Windows.Devices.I2c.Provider.II2cProvider
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains types that you can use to communicate with peripheral devices connected through a inter-integrated circuit (I²C) bus from an application. */
@JSGlobal("Windows.Devices.I2c")
@js.native
object I2c extends js.Object {
  /** Represents the connection settings you want to use for an inter-integrated circuit (I²C) device. */
  @js.native
  class I2cConnectionSettings protected ()
    extends typings.winrtUwp.Windows.Devices.I2c.I2cConnectionSettings {
    /**
      * Creates and initializes a new instance of the I2cConnectionSettings class for inter-integrated circuit (I²C) device with specified bus address, using the default settings of the standard mode for the bus speed and exclusive sharing mode.
      * @param slaveAddress The bus address of the inter-integrated circuit (I²C) device to which the settings of the I2cConnectionSettings should apply. Only 7-bit addressing is supported, so the range of values that are valid is from 8 to 119.
      */
    def this(slaveAddress: Double) = this()
    /** Gets or sets the bus speed to use for connecting to an inter-integrated circuit (I²C) device. The bus speed is the frequency at which to clock the I²C bus when accessing the device. */
    /* CompleteClass */
    override var busSpeed: I2cBusSpeed = js.native
    /** Gets or sets the sharing mode to use to connect to the inter-integrated circuit (I²C) bus address. This mode determines whether other connections to the I²C bus address can be opened while you are connect to the I²C bus address. */
    /* CompleteClass */
    override var sharingMode: I2cSharingMode = js.native
    /** Gets or sets the bus address of the inter-integrated circuit (I²C) device. */
    /* CompleteClass */
    override var slaveAddress: Double = js.native
  }
  
  /** Represents the I²C controller for the system. */
  @js.native
  abstract class I2cController ()
    extends typings.winrtUwp.Windows.Devices.I2c.I2cController {
    /**
      * Gets the I²C device with the specified settings.
      * @param settings The desired connection settings.
      * @return The I²C device.
      */
    /* CompleteClass */
    override def getDevice(settings: typings.winrtUwp.Windows.Devices.I2c.I2cConnectionSettings): typings.winrtUwp.Windows.Devices.I2c.I2cDevice = js.native
  }
  
  /** Represents a communications channel to a device on an inter-integrated circuit (I²C) bus. */
  @js.native
  abstract class I2cDevice ()
    extends typings.winrtUwp.Windows.Devices.I2c.I2cDevice {
    /** Gets the connection settings used for communication with the inter-integrated circuit (I²C) device. */
    /* CompleteClass */
    override var connectionSettings: typings.winrtUwp.Windows.Devices.I2c.I2cConnectionSettings = js.native
    /** Gets the plug and play device identifier of the inter-integrated circuit (I²C) bus controller for the device. */
    /* CompleteClass */
    override var deviceId: String = js.native
    /** Closes the connection to the inter-integrated circuit (I²C) device. */
    /* CompleteClass */
    override def close(): Unit = js.native
    /**
      * Reads data from the inter-integrated circuit (I²C) bus on which the device is connected into the specified buffer.
      * @param buffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
      */
    /* CompleteClass */
    override def read(buffer: js.Array[Double]): Unit = js.native
    /**
      * Reads data from the inter-integrated circuit (I²C) bus on which the device is connected into the specified buffer, and returns information about the success of the operation that you can use for error handling.
      * @param buffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
      * @return A structure that contains information about the success of the read operation and the actual number of bytes that the operation read into the buffer.
      */
    /* CompleteClass */
    override def readPartial(buffer: js.Array[Double]): I2cTransferResult = js.native
    /**
      * Writes data to the inter-integrated circuit (I²C) bus on which the device is connected, based on the bus address specified in the I2cConnectionSetting s object that you used to create the I2cDevice object.
      * @param buffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
      */
    /* CompleteClass */
    override def write(buffer: js.Array[Double]): Unit = js.native
    /**
      * Writes data to the inter-integrated circuit (I²C) bus on which the device is connected, and returns information about the success of the operation that you can use for error handling.
      * @param buffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
      * @return A structure that contains information about the success of the write operation and the actual number of bytes that the operation wrote into the buffer.
      */
    /* CompleteClass */
    override def writePartial(buffer: js.Array[Double]): I2cTransferResult = js.native
    /**
      * Performs an atomic operation to write data to and then read data from the inter-integrated circuit (I²C) bus on which the device is connected, and sends a restart condition between the write and read operations.
      * @param writeBuffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
      * @param readBuffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
      */
    /* CompleteClass */
    override def writeRead(writeBuffer: js.Array[Double], readBuffer: js.Array[Double]): Unit = js.native
    /**
      * Performs an atomic operation to write data to and then read data from the inter-integrated circuit (I²C) bus on which the device is connected, and returns information about the success of the operation that you can use for error handling.
      * @param writeBuffer A buffer that contains the data that you want to write to the I²C device. This data should not include the bus address.
      * @param readBuffer The buffer to which you want to read the data from the I²C bus. The length of the buffer determines how much data to request from the device.
      * @return A structure that contains information about whether both the read and write parts of the operation succeeded and the sum of the actual number of bytes that the operation wrote and the actual number of bytes that the operation read.
      */
    /* CompleteClass */
    override def writeReadPartial(writeBuffer: js.Array[Double], readBuffer: js.Array[Double]): I2cTransferResult = js.native
  }
  
  /** Describes the bus speeds that are available for connecting to an inter-integrated circuit (I²C) device. The bus speed is the frequency at which to clock the I²C bus when accessing the device. */
  @js.native
  object I2cBusSpeed extends js.Object {
    /* 1 */ val fastMode: typings.winrtUwp.Windows.Devices.I2c.I2cBusSpeed.fastMode with Double = js.native
    /* 0 */ val standardMode: typings.winrtUwp.Windows.Devices.I2c.I2cBusSpeed.standardMode with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.I2c.I2cBusSpeed with Double] = js.native
  }
  
  /* static members */
  @js.native
  object I2cController extends js.Object {
    /**
      * Gets all the I²C controllers that are on the system.
      * @param provider The I²C provider for the controllers on the system.
      * @return When the method completes successfully, it returns a list of values that represent the available I²C controllers on the system.
      */
    def getControllersAsync(provider: II2cProvider): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    /**
      * Gets the default I²C controller on the system.
      * @return The default I²C controller on the system, or null if the system has no I²C controller.
      */
    def getDefaultAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.I2c.I2cController] = js.native
  }
  
  /* static members */
  @js.native
  object I2cDevice extends js.Object {
    /**
      * Retrieves an I2cDevice object asynchronously for the inter-integrated circuit (I²C) bus controller that has the specified plug and play device identifier, using the specified connection settings.
      * @param deviceId The plug and play device identifier of the I²C bus controller for which you want to create an I2cDevice object.
      * @param settings The connection settings to use for communication with the I²C bus controller that deviceId specifies.
      * @return An asynchronous operation that returns the I2cDevice object.
      */
    def fromIdAsync(deviceId: String, settings: typings.winrtUwp.Windows.Devices.I2c.I2cConnectionSettings): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.I2c.I2cDevice] = js.native
    /**
      * Retrieves an Advanced Query Syntax (AQS) string for all of the inter-integrated circuit (I²C) bus controllers on the system. You can use this string with the DeviceInformation.FindAllAsync method to get DeviceInformation objects for those bus controllers.
      * @return An AQS string for all of the I²C bus controllers on the system, which you can use with the DeviceInformation.FindAllAsync method to get DeviceInformation objects for those bus controllers.
      */
    def getDeviceSelector(): String = js.native
    /**
      * Retrieves an Advanced Query Syntax (AQS) string for the inter-integrated circuit (I²C) bus that has the specified friendly name. You can use this string with the DeviceInformation.FindAllAsync method to get a DeviceInformation object for that bus.
      * @param friendlyName A friendly name for the particular I²C bus on a particular hardware platform for which you want to get the AQS string.
      * @return An AQS string for the I²C bus that friendlyName specifies, which you can use with the DeviceInformation.FindAllAsync method to get a DeviceInformation object for that bus.
      */
    def getDeviceSelector(friendlyName: String): String = js.native
  }
  
  /** Describes the modes in which you can connect to an inter-integrated circuit (I²C) bus address. These modes determine whether other connections to the I²C bus address can be opened while you are connected to the I²C bus address. */
  @js.native
  object I2cSharingMode extends js.Object {
    /* 0 */ val exclusive: typings.winrtUwp.Windows.Devices.I2c.I2cSharingMode.exclusive with Double = js.native
    /* 1 */ val shared: typings.winrtUwp.Windows.Devices.I2c.I2cSharingMode.shared with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.I2c.I2cSharingMode with Double] = js.native
  }
  
  /** Describes whether the data transfers that the ReadPartial , WritePartial , or WriteReadPartial method performed succeeded, or provides the reason that the transfers did not succeed. */
  @js.native
  object I2cTransferStatus extends js.Object {
    /* 0 */ val fullTransfer: typings.winrtUwp.Windows.Devices.I2c.I2cTransferStatus.fullTransfer with Double = js.native
    /* 1 */ val partialTransfer: typings.winrtUwp.Windows.Devices.I2c.I2cTransferStatus.partialTransfer with Double = js.native
    /* 2 */ val slaveAddressNotAcknowledged: typings.winrtUwp.Windows.Devices.I2c.I2cTransferStatus.slaveAddressNotAcknowledged with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.I2c.I2cTransferStatus with Double] = js.native
  }
  
  /** This API exposes a Provider interface and associated classes for the user to implement for a specific controller. The I2C API needs a I²C Provider implementation to talk to the I²C controller. */
  @js.native
  object Provider extends js.Object {
    @js.native
    abstract class ProviderI2cConnectionSettings ()
      extends typings.winrtUwp.Windows.Devices.I2c.Provider.ProviderI2cConnectionSettings {
      /* CompleteClass */
      override var busSpeed: js.Any = js.native
       /* unmapped type */ /* CompleteClass */
      override var sharingMode: js.Any = js.native
       /* unmapped type */ /* CompleteClass */
      override var slaveAddress: js.Any = js.native
    }
    
    @js.native
    object ProviderI2cBusSpeed extends js.Object {
      var fastMode: js.Any = js.native
      var standardMode: js.Any = js.native
    }
    
    @js.native
    object ProviderI2cSharingMode extends js.Object {
      var exclusive: js.Any = js.native
      var shared: js.Any = js.native
    }
    
    @js.native
    object ProviderI2cTransferStatus extends js.Object {
      var fullTransfer: js.Any = js.native
      var partialTransfer: js.Any = js.native
      var slaveAddressNotAcknowledged: js.Any = js.native
    }
    
  }
  
}

