package typings.awsSdkClientLambdaNode.typesListEventSourceMappingsOutputMod

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesEventSourceMappingConfigurationMod.UnmarshalledEventSourceMappingConfiguration
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEventSourceMappingsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>An array of <code>EventSourceMappingConfiguration</code> objects.</p>
    */
  var EventSourceMappings: js.UndefOr[js.Array[UnmarshalledEventSourceMappingConfiguration]] = js.undefined
  /**
    * <p>A string, present if there are more event source mappings.</p>
    */
  var NextMarker: js.UndefOr[String] = js.undefined
}

object ListEventSourceMappingsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    EventSourceMappings: js.Array[UnmarshalledEventSourceMappingConfiguration] = null,
    NextMarker: String = null
  ): ListEventSourceMappingsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (EventSourceMappings != null) __obj.updateDynamic("EventSourceMappings")(EventSourceMappings.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEventSourceMappingsOutput]
  }
}

