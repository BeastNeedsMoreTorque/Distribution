package typings.awsSdk.anon

import typings.awsSdk.s3Mod.BucketName
import typings.awsSdk.s3Mod.IfMatch
import typings.awsSdk.s3Mod.IfModifiedSince
import typings.awsSdk.s3Mod.IfNoneMatch
import typings.awsSdk.s3Mod.IfUnmodifiedSince
import typings.awsSdk.s3Mod.ObjectKey
import typings.awsSdk.s3Mod.ObjectVersionId
import typings.awsSdk.s3Mod.PartNumber
import typings.awsSdk.s3Mod.Range
import typings.awsSdk.s3Mod.RequestPayer
import typings.awsSdk.s3Mod.SSECustomerAlgorithm
import typings.awsSdk.s3Mod.SSECustomerKey
import typings.awsSdk.s3Mod.SSECustomerKeyMD5
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/s3.HeadObjectRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait HeadObjectRequestwaiterWa extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The name of the bucket containing the object.
    */
  var Bucket: BucketName = js.native
  /**
    * Return the object only if its entity tag (ETag) is the same as the one specified, otherwise return a 412 (precondition failed).
    */
  var IfMatch: js.UndefOr[typings.awsSdk.s3Mod.IfMatch] = js.native
  /**
    * Return the object only if it has been modified since the specified time, otherwise return a 304 (not modified).
    */
  var IfModifiedSince: js.UndefOr[typings.awsSdk.s3Mod.IfModifiedSince] = js.native
  /**
    * Return the object only if its entity tag (ETag) is different from the one specified, otherwise return a 304 (not modified).
    */
  var IfNoneMatch: js.UndefOr[typings.awsSdk.s3Mod.IfNoneMatch] = js.native
  /**
    * Return the object only if it has not been modified since the specified time, otherwise return a 412 (precondition failed).
    */
  var IfUnmodifiedSince: js.UndefOr[typings.awsSdk.s3Mod.IfUnmodifiedSince] = js.native
  /**
    * The object key.
    */
  var Key: ObjectKey = js.native
  /**
    * Part number of the object being read. This is a positive integer between 1 and 10,000. Effectively performs a 'ranged' HEAD request for the part specified. Useful querying about the size of the part and the number of parts in this object.
    */
  var PartNumber: js.UndefOr[typings.awsSdk.s3Mod.PartNumber] = js.native
  /**
    * Downloads the specified range bytes of an object. For more information about the HTTP Range header, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35.  Amazon S3 doesn't support retrieving multiple ranges of data per GET request. 
    */
  var Range: js.UndefOr[typings.awsSdk.s3Mod.Range] = js.native
  var RequestPayer: js.UndefOr[typings.awsSdk.s3Mod.RequestPayer] = js.native
  /**
    * Specifies the algorithm to use to when encrypting the object (for example, AES256).
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerAlgorithm] = js.native
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon S3 does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side​-encryption​-customer-algorithm header.
    */
  var SSECustomerKey: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerKey] = js.native
  /**
    * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure that the encryption key was transmitted without error.
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerKeyMD5] = js.native
  /**
    * VersionId used to reference a specific version of the object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}

object HeadObjectRequestwaiterWa {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Key: ObjectKey,
    $waiter: WaiterConfiguration = null,
    IfMatch: IfMatch = null,
    IfModifiedSince: IfModifiedSince = null,
    IfNoneMatch: IfNoneMatch = null,
    IfUnmodifiedSince: IfUnmodifiedSince = null,
    PartNumber: js.UndefOr[PartNumber] = js.undefined,
    Range: Range = null,
    RequestPayer: RequestPayer = null,
    SSECustomerAlgorithm: SSECustomerAlgorithm = null,
    SSECustomerKey: SSECustomerKey = null,
    SSECustomerKeyMD5: SSECustomerKeyMD5 = null,
    VersionId: ObjectVersionId = null
  ): HeadObjectRequestwaiterWa = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch.asInstanceOf[js.Any])
    if (IfModifiedSince != null) __obj.updateDynamic("IfModifiedSince")(IfModifiedSince.asInstanceOf[js.Any])
    if (IfNoneMatch != null) __obj.updateDynamic("IfNoneMatch")(IfNoneMatch.asInstanceOf[js.Any])
    if (IfUnmodifiedSince != null) __obj.updateDynamic("IfUnmodifiedSince")(IfUnmodifiedSince.asInstanceOf[js.Any])
    if (!js.isUndefined(PartNumber)) __obj.updateDynamic("PartNumber")(PartNumber.get.asInstanceOf[js.Any])
    if (Range != null) __obj.updateDynamic("Range")(Range.asInstanceOf[js.Any])
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    if (SSECustomerAlgorithm != null) __obj.updateDynamic("SSECustomerAlgorithm")(SSECustomerAlgorithm.asInstanceOf[js.Any])
    if (SSECustomerKey != null) __obj.updateDynamic("SSECustomerKey")(SSECustomerKey.asInstanceOf[js.Any])
    if (SSECustomerKeyMD5 != null) __obj.updateDynamic("SSECustomerKeyMD5")(SSECustomerKeyMD5.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadObjectRequestwaiterWa]
  }
}

