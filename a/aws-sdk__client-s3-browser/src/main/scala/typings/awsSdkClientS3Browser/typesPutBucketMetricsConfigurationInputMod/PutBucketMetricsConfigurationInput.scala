package typings.awsSdkClientS3Browser.typesPutBucketMetricsConfigurationInputMod

import typings.awsSdkClientS3Browser.inputTypesUnionMod._InputTypesUnion
import typings.awsSdkClientS3Browser.typesMetricsConfigurationMod.MetricsConfiguration
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketMetricsConfigurationInput extends _InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * Whether to use the bucket name as the endpoint for this request. The bucket
    * name must be a domain name with a CNAME record alias to an appropriate virtual
    * hosted-style S3 hostname, e.g. a bucket of `images.johnsmith.net` and a DNS
    * record of:
    *
    * ```
    * images.johnsmith.net CNAME 			images.johnsmith.net.s3.amazonaws.com.
    * ```
    *
    * @see https://docs.aws.amazon.com/AmazonS3/latest/dev/VirtualHosting.html#VirtualHostingCustomURLs
    */
  @JSName("$bucketEndpoint")
  var $bucketEndpoint: js.UndefOr[String] = js.undefined
  /**
    * Whether to force path style URLs for S3 objects (e.g., https://s3.amazonaws.com/<bucketName>/<key> instead of https://<bucketName>.s3.amazonaws.com/<key>
    */
  @JSName("$forcePathStyle")
  var $forcePathStyle: js.UndefOr[Boolean] = js.undefined
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.undefined
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * Whether to use the S3 Transfer Acceleration endpoint by default
    */
  @JSName("$useAccelerateEndpoint")
  var $useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables IPv6/IPv4 dualstack endpoint. When a DNS lookup is performed on an endpoint of this type, it returns an “A” record with an IPv4 address and an “AAAA” record with an IPv6 address. In most cases the network stack in the client environment will automatically prefer the AAAA record and make a connection using the IPv6 address. Note, however, that currently on Windows, the IPv4 address will be preferred.
    */
  @JSName("$useDualstackEndpoint")
  var $useDualstackEndpoint: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>The name of the bucket for which the metrics configuration is set.</p>
    */
  var Bucket: String
  /**
    * <p>The ID used to identify the metrics configuration.</p>
    */
  var Id: String
  /**
    * <p>Specifies the metrics configuration.</p>
    */
  var MetricsConfiguration: typings.awsSdkClientS3Browser.typesMetricsConfigurationMod.MetricsConfiguration
}

object PutBucketMetricsConfigurationInput {
  @scala.inline
  def apply(
    Bucket: String,
    Id: String,
    MetricsConfiguration: MetricsConfiguration,
    $abortSignal: AbortSignal = null,
    $bucketEndpoint: String = null,
    $forcePathStyle: js.UndefOr[Boolean] = js.undefined,
    $httpOptions: BrowserHttpOptions = null,
    $maxRetries: js.UndefOr[Double] = js.undefined,
    $useAccelerateEndpoint: js.UndefOr[Boolean] = js.undefined,
    $useDualstackEndpoint: js.UndefOr[Boolean] = js.undefined
  ): PutBucketMetricsConfigurationInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MetricsConfiguration = MetricsConfiguration.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($bucketEndpoint != null) __obj.updateDynamic("$bucketEndpoint")($bucketEndpoint.asInstanceOf[js.Any])
    if (!js.isUndefined($forcePathStyle)) __obj.updateDynamic("$forcePathStyle")($forcePathStyle.get.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if (!js.isUndefined($maxRetries)) __obj.updateDynamic("$maxRetries")($maxRetries.get.asInstanceOf[js.Any])
    if (!js.isUndefined($useAccelerateEndpoint)) __obj.updateDynamic("$useAccelerateEndpoint")($useAccelerateEndpoint.get.asInstanceOf[js.Any])
    if (!js.isUndefined($useDualstackEndpoint)) __obj.updateDynamic("$useDualstackEndpoint")($useDualstackEndpoint.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketMetricsConfigurationInput]
  }
}

