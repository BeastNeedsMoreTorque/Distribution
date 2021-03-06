package typings.dialogflow.mod.google.protobuf

import typings.dialogflow.mod.google.api.IResourceDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a MessageOptions. */
trait IMessageOptions extends js.Object {
  /** MessageOptions .google.api.resource */
  @JSName(".google.api.resource")
  var DotgoogleDotapiDotresource: js.UndefOr[IResourceDescriptor | Null] = js.undefined
  /** MessageOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.undefined
  /** MessageOptions mapEntry */
  var mapEntry: js.UndefOr[Boolean | Null] = js.undefined
  /** MessageOptions messageSetWireFormat */
  var messageSetWireFormat: js.UndefOr[Boolean | Null] = js.undefined
  /** MessageOptions noStandardDescriptorAccessor */
  var noStandardDescriptorAccessor: js.UndefOr[Boolean | Null] = js.undefined
  /** MessageOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
}

object IMessageOptions {
  @scala.inline
  def apply(
    DotgoogleDotapiDotresource: js.UndefOr[Null | IResourceDescriptor] = js.undefined,
    deprecated: js.UndefOr[Null | Boolean] = js.undefined,
    mapEntry: js.UndefOr[Null | Boolean] = js.undefined,
    messageSetWireFormat: js.UndefOr[Null | Boolean] = js.undefined,
    noStandardDescriptorAccessor: js.UndefOr[Null | Boolean] = js.undefined,
    uninterpretedOption: js.UndefOr[Null | js.Array[IUninterpretedOption]] = js.undefined
  ): IMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DotgoogleDotapiDotresource)) __obj.updateDynamic(".google.api.resource")(DotgoogleDotapiDotresource.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (!js.isUndefined(mapEntry)) __obj.updateDynamic("mapEntry")(mapEntry.asInstanceOf[js.Any])
    if (!js.isUndefined(messageSetWireFormat)) __obj.updateDynamic("messageSetWireFormat")(messageSetWireFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(noStandardDescriptorAccessor)) __obj.updateDynamic("noStandardDescriptorAccessor")(noStandardDescriptorAccessor.asInstanceOf[js.Any])
    if (!js.isUndefined(uninterpretedOption)) __obj.updateDynamic("uninterpretedOption")(uninterpretedOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageOptions]
  }
}

