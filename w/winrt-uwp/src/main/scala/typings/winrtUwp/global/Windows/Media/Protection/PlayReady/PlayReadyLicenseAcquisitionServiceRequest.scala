package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.IAsyncAction
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Media.Protection.PlayReady.IPlayReadyServiceRequest
import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the service methods for obtaining PlayReady licenses. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyLicenseAcquisitionServiceRequest")
@js.native
/** Initializes a new instance of the PlayReadyLicenseAcquisitionServiceRequest class. */
class PlayReadyLicenseAcquisitionServiceRequest ()
  extends typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyLicenseAcquisitionServiceRequest {
  /** Gets or sets the custom data of the request challenge. */
  /* CompleteClass */
  override var challengeCustomData: String = js.native
  /** Gets or sets the current content header property. */
  /* CompleteClass */
  override var contentHeader: typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyContentHeader = js.native
  /** Gets or sets the current domain service identifier property that overrides a service identifier in the content header. */
  /* CompleteClass */
  override var domainServiceId: String = js.native
  /** Gets the vendor content protection system identifier. */
  /* CompleteClass */
  override var protectionSystem: String = js.native
  /** Gets the custom data that was returned in the response from the service. */
  /* CompleteClass */
  override var responseCustomData: String = js.native
  /** Gets the GUID for the type of operation that the PlayReady license acquisition service request performs. */
  /* CompleteClass */
  override var `type`: String = js.native
  /** Gets or sets the URI used to perform a service request action. */
  /* CompleteClass */
  override var uri: Uri = js.native
  /**
    * Begins an asynchronous service request operation.
    * @return The asynchronous service action.
    */
  /* CompleteClass */
  override def beginServiceRequest(): IAsyncAction = js.native
  /**
    * Begins the process of manually enabling.
    * @return The SOAP message to be used in a manual license acquisition challenge request.
    */
  /* CompleteClass */
  override def generateManualEnablingChallenge(): typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadySoapMessage = js.native
  /**
    * Returns a new service request interface.
    * @return The new service request interface.
    */
  /* CompleteClass */
  override def nextServiceRequest(): IPlayReadyServiceRequest = js.native
  /**
    * Process the raw binary result of a manual enabling challenge.
    * @param responseBytes The response result to be processed.
    * @return If the methods succeeds, it returns S_OK. If it fails, it returns an error code.
    */
  /* CompleteClass */
  override def processManualEnablingResponse(responseBytes: js.Array[Double]): WinRTError = js.native
}

