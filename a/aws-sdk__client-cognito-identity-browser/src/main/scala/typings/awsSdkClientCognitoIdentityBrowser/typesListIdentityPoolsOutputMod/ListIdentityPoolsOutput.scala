package typings.awsSdkClientCognitoIdentityBrowser.typesListIdentityPoolsOutputMod

import typings.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientCognitoIdentityBrowser.typesIdentityPoolShortDescriptionMod.UnmarshalledIdentityPoolShortDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIdentityPoolsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The identity pools returned by the ListIdentityPools action.</p>
    */
  var IdentityPools: js.UndefOr[js.Array[UnmarshalledIdentityPoolShortDescription]] = js.undefined
  /**
    * <p>A pagination token.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListIdentityPoolsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    IdentityPools: js.Array[UnmarshalledIdentityPoolShortDescription] = null,
    NextToken: String = null
  ): ListIdentityPoolsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (IdentityPools != null) __obj.updateDynamic("IdentityPools")(IdentityPools.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIdentityPoolsOutput]
  }
}

