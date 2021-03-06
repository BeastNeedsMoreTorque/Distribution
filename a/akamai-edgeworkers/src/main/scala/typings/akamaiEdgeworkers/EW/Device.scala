package typings.akamaiEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Notes:
  * * If device properties can not be supplied for any reason,
  *   undefined is returned for each property
  */
trait Device extends js.Object {
  /**
    * Indicates if the browser accepts third party cookies.
    */
  val acceptsThirdPartyCookie: js.UndefOr[Boolean] = js.undefined
  /**
    * Brand name of the device.
    */
  val brandName: js.UndefOr[String] = js.undefined
  /**
    * Indicates if the device supports all of the following
    * JavaScript functions: "alert confirm access form elements
    * setTimeout setInterval and document.location"
    */
  val hasAjaxSupport: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if the browser supports cookies.
    */
  val hasCookieSupport: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if the browser supports Flash.
    */
  val hasFlashSupport: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if the device is a mobile device.
    */
  val isMobile: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if the device is a tablet.
    */
  val isTablet: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if the device is a wireless device.
    */
  val isWireless: js.UndefOr[Boolean] = js.undefined
  /**
    * Marketing name of the device.
    */
  val marketingName: js.UndefOr[String] = js.undefined
  /**
    * The mobile browser name.
    */
  val mobileBrowser: js.UndefOr[String] = js.undefined
  /**
    * The mobile browser version.
    */
  val mobileBrowserVersion: js.UndefOr[String] = js.undefined
  /**
    * Model name of the device.
    */
  val modelName: js.UndefOr[String] = js.undefined
  /**
    * The device operation system.
    */
  val os: js.UndefOr[String] = js.undefined
  /**
    * The device operating system version.
    */
  val osVersion: js.UndefOr[String] = js.undefined
  /**
    * The physical screen height, in millimeters.
    */
  val physicalScreenHeight: js.UndefOr[Double] = js.undefined
  /**
    * The physical screen width, in millimeters.
    */
  val physicalScreenWidth: js.UndefOr[Double] = js.undefined
  /**
    * The screen resolution height, in pixels.
    */
  val resolutionHeight: js.UndefOr[Double] = js.undefined
  /**
    * The screen resolution width, in pixels.
    */
  val resolutionWidth: js.UndefOr[Double] = js.undefined
  /**
    * Indicates the level of support for XHTML.
    */
  val xhtmlSupportLevel: js.UndefOr[Double] = js.undefined
}

object Device {
  @scala.inline
  def apply(
    acceptsThirdPartyCookie: js.UndefOr[Boolean] = js.undefined,
    brandName: String = null,
    hasAjaxSupport: js.UndefOr[Boolean] = js.undefined,
    hasCookieSupport: js.UndefOr[Boolean] = js.undefined,
    hasFlashSupport: js.UndefOr[Boolean] = js.undefined,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    isTablet: js.UndefOr[Boolean] = js.undefined,
    isWireless: js.UndefOr[Boolean] = js.undefined,
    marketingName: String = null,
    mobileBrowser: String = null,
    mobileBrowserVersion: String = null,
    modelName: String = null,
    os: String = null,
    osVersion: String = null,
    physicalScreenHeight: js.UndefOr[Double] = js.undefined,
    physicalScreenWidth: js.UndefOr[Double] = js.undefined,
    resolutionHeight: js.UndefOr[Double] = js.undefined,
    resolutionWidth: js.UndefOr[Double] = js.undefined,
    xhtmlSupportLevel: js.UndefOr[Double] = js.undefined
  ): Device = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptsThirdPartyCookie)) __obj.updateDynamic("acceptsThirdPartyCookie")(acceptsThirdPartyCookie.get.asInstanceOf[js.Any])
    if (brandName != null) __obj.updateDynamic("brandName")(brandName.asInstanceOf[js.Any])
    if (!js.isUndefined(hasAjaxSupport)) __obj.updateDynamic("hasAjaxSupport")(hasAjaxSupport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasCookieSupport)) __obj.updateDynamic("hasCookieSupport")(hasCookieSupport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasFlashSupport)) __obj.updateDynamic("hasFlashSupport")(hasFlashSupport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isTablet)) __obj.updateDynamic("isTablet")(isTablet.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isWireless)) __obj.updateDynamic("isWireless")(isWireless.get.asInstanceOf[js.Any])
    if (marketingName != null) __obj.updateDynamic("marketingName")(marketingName.asInstanceOf[js.Any])
    if (mobileBrowser != null) __obj.updateDynamic("mobileBrowser")(mobileBrowser.asInstanceOf[js.Any])
    if (mobileBrowserVersion != null) __obj.updateDynamic("mobileBrowserVersion")(mobileBrowserVersion.asInstanceOf[js.Any])
    if (modelName != null) __obj.updateDynamic("modelName")(modelName.asInstanceOf[js.Any])
    if (os != null) __obj.updateDynamic("os")(os.asInstanceOf[js.Any])
    if (osVersion != null) __obj.updateDynamic("osVersion")(osVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(physicalScreenHeight)) __obj.updateDynamic("physicalScreenHeight")(physicalScreenHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(physicalScreenWidth)) __obj.updateDynamic("physicalScreenWidth")(physicalScreenWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resolutionHeight)) __obj.updateDynamic("resolutionHeight")(resolutionHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resolutionWidth)) __obj.updateDynamic("resolutionWidth")(resolutionWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xhtmlSupportLevel)) __obj.updateDynamic("xhtmlSupportLevel")(xhtmlSupportLevel.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}

