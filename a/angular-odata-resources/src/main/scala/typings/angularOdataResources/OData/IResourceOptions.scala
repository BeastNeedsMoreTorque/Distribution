package typings.angularOdataResources.OData

import typings.angularOdataResources.anon.Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Currently supported options for the $resource factory options argument.
  */
trait IResourceOptions extends js.Object {
  var isodatav4: js.UndefOr[Boolean] = js.undefined
  var odata: js.UndefOr[Method] = js.undefined
  /**
    * If true then the trailing slashes from any calculated URL will be stripped (defaults to true)
    */
  var stripTrailingSlashes: js.UndefOr[Boolean] = js.undefined
}

object IResourceOptions {
  @scala.inline
  def apply(
    isodatav4: js.UndefOr[Boolean] = js.undefined,
    odata: Method = null,
    stripTrailingSlashes: js.UndefOr[Boolean] = js.undefined
  ): IResourceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isodatav4)) __obj.updateDynamic("isodatav4")(isodatav4.get.asInstanceOf[js.Any])
    if (odata != null) __obj.updateDynamic("odata")(odata.asInstanceOf[js.Any])
    if (!js.isUndefined(stripTrailingSlashes)) __obj.updateDynamic("stripTrailingSlashes")(stripTrailingSlashes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResourceOptions]
  }
}

