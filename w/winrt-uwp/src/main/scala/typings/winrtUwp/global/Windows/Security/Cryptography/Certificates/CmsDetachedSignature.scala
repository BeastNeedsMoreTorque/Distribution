package typings.winrtUwp.global.Windows.Security.Cryptography.Certificates

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a detached signature for a signed CMS message. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CmsDetachedSignature")
@js.native
class CmsDetachedSignature protected ()
  extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.CmsDetachedSignature {
  /**
    * Creates a new instance of the CmsDetachedSignature class for the specified signed CMS message.
    * @param inputBlob A signed CMS message blob.
    */
  def this(inputBlob: IBuffer) = this()
  /** Gets the list of certificates that are used for chain building for the signer certificate. */
  /* CompleteClass */
  override var certificates: IVectorView[typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate] = js.native
  /** Gets the list of signers that are used for creating or verifying the signature. */
  /* CompleteClass */
  override var signers: IVectorView[typings.winrtUwp.Windows.Security.Cryptography.Certificates.CmsSignerInfo] = js.native
  /**
    * Verifies a signed CMS message against the original streaming input.
    * @param data The original input stream for the signed CMS message.
    * @return An asynchronous operation to retrieve the result of the signature validation operation.
    */
  /* CompleteClass */
  override def verifySignatureAsync(data: IInputStream): IPromiseWithIAsyncOperation[
    typings.winrtUwp.Windows.Security.Cryptography.Certificates.SignatureValidationResult
  ] = js.native
}

/* static members */
@JSGlobal("Windows.Security.Cryptography.Certificates.CmsDetachedSignature")
@js.native
object CmsDetachedSignature extends js.Object {
  /**
    * Signs the specified input data using the specified signer information and creates a detached signed CMS message.
    * @param data The input data to be signed.
    * @param signers The signer information used to compute the signature.
    * @param certificates The list of certificates to build the chain for the signer certificates.
    * @return An asynchronous operation to retrieve the detached signed CMS message.
    */
  def generateSignatureAsync(
    data: IInputStream,
    signers: IIterable[typings.winrtUwp.Windows.Security.Cryptography.Certificates.CmsSignerInfo],
    certificates: IIterable[typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate]
  ): IPromiseWithIAsyncOperation[IBuffer] = js.native
}

