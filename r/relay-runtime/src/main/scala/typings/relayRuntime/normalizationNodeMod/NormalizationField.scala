package typings.relayRuntime.normalizationNodeMod

import org.scalablytyped.runtime.StringDictionary
import typings.relayRuntime.anon.FragmentName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.relayRuntime.normalizationNodeMod.NormalizationScalarField
  - typings.relayRuntime.normalizationNodeMod.NormalizationLinkedField
  - typings.relayRuntime.normalizationNodeMod.NormalizationMatchField
*/
trait NormalizationField extends NormalizationSelection

object NormalizationField {
  @scala.inline
  def NormalizationScalarField(
    kind: String,
    name: String,
    alias: js.UndefOr[Null | String] = js.undefined,
    args: js.UndefOr[Null | js.Array[NormalizationArgument]] = js.undefined,
    storageKey: js.UndefOr[Null | String] = js.undefined
  ): NormalizationField = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(alias)) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(args)) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(storageKey)) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationField]
  }
  @scala.inline
  def NormalizationLinkedField(
    args: js.Array[NormalizationArgument],
    kind: String,
    name: String,
    plural: Boolean,
    selections: js.Array[NormalizationSelection],
    alias: js.UndefOr[Null | String] = js.undefined,
    concreteType: js.UndefOr[Null | String] = js.undefined,
    storageKey: js.UndefOr[Null | String] = js.undefined
  ): NormalizationField = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (!js.isUndefined(alias)) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(concreteType)) __obj.updateDynamic("concreteType")(concreteType.asInstanceOf[js.Any])
    if (!js.isUndefined(storageKey)) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationField]
  }
  @scala.inline
  def NormalizationMatchField(
    args: js.Array[NormalizationArgument],
    kind: String,
    matchesByType: StringDictionary[FragmentName],
    name: String,
    alias: js.UndefOr[Null | String] = js.undefined,
    storageKey: js.UndefOr[Null | String] = js.undefined
  ): NormalizationField = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], matchesByType = matchesByType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(alias)) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(storageKey)) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizationField]
  }
}

