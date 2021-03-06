package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceSettingsPaging
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Whether when a new page of data is requested we should append the new data to the existing data
    *
    */
  var appendPage: js.UndefOr[Boolean] = js.undefined
  /**
    * Paging is not enabled by default
    *
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Current page index
    *
    */
  var pageIndex: js.UndefOr[Double] = js.undefined
  /**
    * Denotes the name of the encoded URL parameter that will state what is the currently requested page index
    *
    */
  var pageIndexUrlKey: js.UndefOr[String] = js.undefined
  /**
    * Number of records on each page
    *
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  /**
    * Denotes the name of the encoded URL parameter that will state what is the currently requested page size
    *
    */
  var pageSizeUrlKey: js.UndefOr[String] = js.undefined
  /**
    * Type for the paging operation
    *
    *
    * Valid values:
    * "local" Data is paged client-side.
    * "remote" A remote request is done and URL params encoded
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object DataSourceSettingsPaging {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    appendPage: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    pageIndex: js.UndefOr[Double] = js.undefined,
    pageIndexUrlKey: String = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    pageSizeUrlKey: String = null,
    `type`: String = null
  ): DataSourceSettingsPaging = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(appendPage)) __obj.updateDynamic("appendPage")(appendPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageIndex)) __obj.updateDynamic("pageIndex")(pageIndex.get.asInstanceOf[js.Any])
    if (pageIndexUrlKey != null) __obj.updateDynamic("pageIndexUrlKey")(pageIndexUrlKey.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pageSizeUrlKey != null) __obj.updateDynamic("pageSizeUrlKey")(pageSizeUrlKey.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceSettingsPaging]
  }
}

