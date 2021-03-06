package typings.awsSdkClientS3Node.typesDeleteObjectTaggingOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteObjectTaggingOutput
  extends MetadataBearer
     with _OutputTypesUnion {
  /**
    * <p>The versionId of the object the tag-set was removed from.</p>
    */
  var VersionId: js.UndefOr[String] = js.undefined
}

object DeleteObjectTaggingOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, VersionId: String = null): DeleteObjectTaggingOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectTaggingOutput]
  }
}

