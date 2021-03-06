package typings.storybookAddonInfo.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.storybookAddonInfo.storybookAddonInfoBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var TableComponent: js.UndefOr[ComponentType[TableComponentOptionProps]] = js.undefined
  var components: js.UndefOr[StringDictionary[ComponentType[_]]] = js.undefined
  var excludedPropTypes: js.UndefOr[js.Array[String]] = js.undefined
  var header: js.UndefOr[Boolean] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated "marksyConf" option has been renamed to "components"
    */
  var marksyConf: js.UndefOr[js.Object] = js.undefined
  var maxPropArrayLength: js.UndefOr[Double] = js.undefined
  var maxPropObjectKeys: js.UndefOr[Double] = js.undefined
  var maxPropStringLength: js.UndefOr[Double] = js.undefined
  var maxPropsIntoLine: js.UndefOr[Double] = js.undefined
  var propTables: js.UndefOr[js.Array[ComponentType[_]] | `false`] = js.undefined
  var propTablesExclude: js.UndefOr[js.Array[ComponentType[_]]] = js.undefined
  var source: js.UndefOr[Boolean] = js.undefined
  var styles: js.UndefOr[js.Object] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    TableComponent: ComponentType[TableComponentOptionProps] = null,
    components: StringDictionary[ComponentType[_]] = null,
    excludedPropTypes: js.Array[String] = null,
    header: js.UndefOr[Boolean] = js.undefined,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    marksyConf: js.Object = null,
    maxPropArrayLength: js.UndefOr[Double] = js.undefined,
    maxPropObjectKeys: js.UndefOr[Double] = js.undefined,
    maxPropStringLength: js.UndefOr[Double] = js.undefined,
    maxPropsIntoLine: js.UndefOr[Double] = js.undefined,
    propTables: js.Array[ComponentType[_]] | `false` = null,
    propTablesExclude: js.Array[ComponentType[_]] = null,
    source: js.UndefOr[Boolean] = js.undefined,
    styles: js.Object = null,
    text: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (TableComponent != null) __obj.updateDynamic("TableComponent")(TableComponent.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (excludedPropTypes != null) __obj.updateDynamic("excludedPropTypes")(excludedPropTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.get.asInstanceOf[js.Any])
    if (marksyConf != null) __obj.updateDynamic("marksyConf")(marksyConf.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPropArrayLength)) __obj.updateDynamic("maxPropArrayLength")(maxPropArrayLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPropObjectKeys)) __obj.updateDynamic("maxPropObjectKeys")(maxPropObjectKeys.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPropStringLength)) __obj.updateDynamic("maxPropStringLength")(maxPropStringLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPropsIntoLine)) __obj.updateDynamic("maxPropsIntoLine")(maxPropsIntoLine.get.asInstanceOf[js.Any])
    if (propTables != null) __obj.updateDynamic("propTables")(propTables.asInstanceOf[js.Any])
    if (propTablesExclude != null) __obj.updateDynamic("propTablesExclude")(propTablesExclude.asInstanceOf[js.Any])
    if (!js.isUndefined(source)) __obj.updateDynamic("source")(source.get.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

