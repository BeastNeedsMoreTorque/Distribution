package typings.awsSdkClientPinpointBrowser.typesUpdateApnsSandboxChannelOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesApnssandboxchannelresponseMod.UnmarshalledAPNSSandboxChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApnsSandboxChannelOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Apple Development Push Notification Service channel definition.
    */
  var APNSSandboxChannelResponse: UnmarshalledAPNSSandboxChannelResponse
}

object UpdateApnsSandboxChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, APNSSandboxChannelResponse: UnmarshalledAPNSSandboxChannelResponse): UpdateApnsSandboxChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSSandboxChannelResponse = APNSSandboxChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsSandboxChannelOutput]
  }
}

