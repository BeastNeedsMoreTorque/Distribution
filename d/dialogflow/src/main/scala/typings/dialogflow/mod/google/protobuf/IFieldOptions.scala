package typings.dialogflow.mod.google.protobuf

import typings.dialogflow.mod.google.api.FieldBehavior
import typings.dialogflow.mod.google.api.IResourceReference
import typings.dialogflow.mod.google.protobuf.FieldOptions.CType
import typings.dialogflow.mod.google.protobuf.FieldOptions.JSType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a FieldOptions. */
trait IFieldOptions extends js.Object {
  /** FieldOptions .google.api.fieldBehavior */
  @JSName(".google.api.fieldBehavior")
  var DotgoogleDotapiDotfieldBehavior: js.UndefOr[js.Array[FieldBehavior] | Null] = js.undefined
  /** FieldOptions .google.api.resourceReference */
  @JSName(".google.api.resourceReference")
  var DotgoogleDotapiDotresourceReference: js.UndefOr[IResourceReference | Null] = js.undefined
  /** FieldOptions ctype */
  var ctype: js.UndefOr[
    CType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldOptions.CType * / any */ String) | Null
  ] = js.undefined
  /** FieldOptions deprecated */
  var deprecated: js.UndefOr[Boolean | Null] = js.undefined
  /** FieldOptions jstype */
  var jstype: js.UndefOr[
    JSType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldOptions.JSType * / any */ String) | Null
  ] = js.undefined
  /** FieldOptions lazy */
  var `lazy`: js.UndefOr[Boolean | Null] = js.undefined
  /** FieldOptions packed */
  var packed: js.UndefOr[Boolean | Null] = js.undefined
  /** FieldOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.undefined
  /** FieldOptions weak */
  var weak: js.UndefOr[Boolean | Null] = js.undefined
}

object IFieldOptions {
  @scala.inline
  def apply(
    DotgoogleDotapiDotfieldBehavior: js.UndefOr[Null | js.Array[FieldBehavior]] = js.undefined,
    DotgoogleDotapiDotresourceReference: js.UndefOr[Null | IResourceReference] = js.undefined,
    ctype: js.UndefOr[
      Null | CType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldOptions.CType * / any */ String)
    ] = js.undefined,
    deprecated: js.UndefOr[Null | Boolean] = js.undefined,
    jstype: js.UndefOr[
      Null | JSType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.protobuf.FieldOptions.JSType * / any */ String)
    ] = js.undefined,
    `lazy`: js.UndefOr[Null | Boolean] = js.undefined,
    packed: js.UndefOr[Null | Boolean] = js.undefined,
    uninterpretedOption: js.UndefOr[Null | js.Array[IUninterpretedOption]] = js.undefined,
    weak: js.UndefOr[Null | Boolean] = js.undefined
  ): IFieldOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DotgoogleDotapiDotfieldBehavior)) __obj.updateDynamic(".google.api.fieldBehavior")(DotgoogleDotapiDotfieldBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(DotgoogleDotapiDotresourceReference)) __obj.updateDynamic(".google.api.resourceReference")(DotgoogleDotapiDotresourceReference.asInstanceOf[js.Any])
    if (!js.isUndefined(ctype)) __obj.updateDynamic("ctype")(ctype.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (!js.isUndefined(jstype)) __obj.updateDynamic("jstype")(jstype.asInstanceOf[js.Any])
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (!js.isUndefined(packed)) __obj.updateDynamic("packed")(packed.asInstanceOf[js.Any])
    if (!js.isUndefined(uninterpretedOption)) __obj.updateDynamic("uninterpretedOption")(uninterpretedOption.asInstanceOf[js.Any])
    if (!js.isUndefined(weak)) __obj.updateDynamic("weak")(weak.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldOptions]
  }
}

