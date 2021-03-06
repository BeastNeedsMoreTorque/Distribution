package typings.googleGax.operationsMod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a FileDescriptorSet. */
trait IFileDescriptorSet extends js.Object {
  /** FileDescriptorSet file */
  var file: js.UndefOr[js.Array[IFileDescriptorProto] | Null] = js.undefined
}

object IFileDescriptorSet {
  @scala.inline
  def apply(file: js.UndefOr[Null | js.Array[IFileDescriptorProto]] = js.undefined): IFileDescriptorSet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(file)) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileDescriptorSet]
  }
}

