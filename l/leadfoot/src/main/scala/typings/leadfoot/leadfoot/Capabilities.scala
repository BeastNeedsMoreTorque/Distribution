package typings.leadfoot.leadfoot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * A list of possible capabilities for a remote WebDriver environment.
	 */
trait Capabilities extends js.Object {
  /**
  		 * Environments with this capability expose the state of the browser’s offline application cache via the WebDriver API.
  		 */
  var applicationCacheEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability are incapable of clearing or deleting cookies. This issue cannot be worked around.
  		 */
  var brokenCookies: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability do not correctly retrieve the size of a CSS transformed element. This issue is
  		 * automatically corrected.
  		 */
  var brokenCssTransformedSize: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability do not correctly delete cookies. This issue is automatically corrected for cookies
  		 * that are accessible via JavaScript.
  		 */
  var brokenDeleteCookie: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability do not follow the correct event order when double-clicking. This issue is
  		 * automatically corrected.
  		 */
  var brokenDoubleClick: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability claim elements positioned offscreen to the top/left of the page are non-hidden.
  		 * This issue is automatically corrected.
  		 */
  var brokenElementDisplayedOffscreen: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability claim fully transparent elements are non-hidden. This issue is automatically
  		 * corrected.
  		 */
  var brokenElementDisplayedOpacity: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability do not correctly retrieve the position of a CSS transformed element. This issue is
  		 * automatically corrected.
  		 */
  var brokenElementPosition: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability return invalid element handles from execute functions. This issue cannot be worked
  		 * around.
  		 */
  var brokenExecuteElementReturn: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability do not operate correctly when the `flickFinger` method is called. This issue cannot
  		 * be corrected.
  		 */
  var brokenFlickFinger: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability return HTML tag names with the incorrect case. This issue is automatically
  		 * corrected.
  		 */
  var brokenHtmlTagName: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability fail to perform long tap gestures. This issue is not currently corrected.
  		 */
  var brokenLongTap: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability have broken mouse event APIs. This issue is automatically corrected as much as
  		 * possible through JavaScript-based event emulation.
  		 */
  var brokenMouseEvents: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability do not support dragging fingers across the page. This issue is not currently
  		 * corrected.
  		 */
  var brokenMoveFinger: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability do not support browser navigation functions (back, forward, refresh). This issue
  		 * cannot be corrected.
  		 */
  var brokenNavigation: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability incorrectly return an empty string instead of `null` for attributes that do not
  		 * exist when using the `getSpecAttribute` retrieval method. This issue is automatically corrected.
  		 */
  var brokenNullGetSpecAttribute: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability fail to complete calls to refresh a page through the standard WebDriver API. This
  		 * issue is automatically corrected.
  		 */
  var brokenRefresh: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability have broken keyboard event APIs. This issue is automatically corrected as much as
  		 * possible through JavaScript-based event emulation.
  		 */
  var brokenSendKeys: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability incorrectly omit the key/value of the button being submitted. This issue is
  		 * automatically corrected.
  		 */
  var brokenSubmitElement: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability do not operate correctly when the `touchScroll` method is called. This issue is
  		 * automatically corrected.
  		 */
  var brokenTouchScroll: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability break when `setWindowPosition` is called. This issue cannot be corrected.
  		 */
  var brokenWindowPosition: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability cannot switch between windows. This issue cannot be corrected.
  		 */
  var brokenWindowSwitch: js.UndefOr[Boolean] = js.undefined
  /**
  		 * The name of the current environment.
  		 */
  var browserName: String
  /**
  		 * Environments with this capability can use CSS selectors to find elements.
  		 */
  var cssSelectorsEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability have viewports that can be resized.
  		 */
  var dynamicViewport: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability break when the `getLogTypes` method is called. The list of log types provided here
  		 * are used in lieu of the values provided by the server when calling `getLogTypes`.
  		 */
  var fixedLogTypes: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  /**
  		 * Environments with this capability have JavaScript enabled. Leadfoot does not operate in environments without
  		 * JavaScript.
  		 */
  var javascriptEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability allow the geographic location of the browser to be set and retrieved using the
  		 * WebDriver API.
  		 */
  var locationContextEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability support interaction via mouse commands.
  		 */
  var mouseEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability use platform native events instead of emulated events.
  		 */
  var nativeEvents: js.UndefOr[Boolean] = js.undefined
  /**
  		 * The name of the platform on which the current environment is running.
  		 */
  var platform: String
  /**
  		 * Environments with this capability allow files to be uploaded from a remote client.
  		 */
  var remoteFiles: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability allow the rotation of the device to be set and retrieved using the WebDriver API.
  		 */
  var rotatable: js.UndefOr[Boolean] = js.undefined
  /**
  		 * The special key that is used by default on the given platform to perform keyboard shortcuts.
  		 */
  var shortcutKey: js.UndefOr[String] = js.undefined
  /**
  		 * Environments with this capability support CSS transforms.
  		 */
  var supportsCssTransforms: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability support asynchronous JavaScript execution.
  		 */
  var supportsExecuteAsync: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability support navigation to `data:` URIs.
  		 */
  var supportsNavigationDataUris: js.UndefOr[Boolean] = js.undefined
  /** {boolean} takesScreenshot
  		 * Environments with this capability allow screenshots of the current screen to be taken.
  		 */
  var takesScreenshot: js.UndefOr[Boolean] = js.undefined
  /**
  		 * Environments with this capability support interaction via touch commands.
  		 */
  var touchEnabled: js.UndefOr[Boolean] = js.undefined
  /**
  		 * The version number of the current environment.
  		 */
  var version: String
  /**
  		 * Environments with this capability allow local storage and session storage to be set and retrieved using the
  		 * WebDriver API.
  		 */
  var webStorageEnabled: js.UndefOr[Boolean] = js.undefined
}

object Capabilities {
  @scala.inline
  def apply(
    browserName: String,
    platform: String,
    version: String,
    applicationCacheEnabled: js.UndefOr[Boolean] = js.undefined,
    brokenCookies: js.UndefOr[Boolean] = js.undefined,
    brokenCssTransformedSize: js.UndefOr[Boolean] = js.undefined,
    brokenDeleteCookie: js.UndefOr[Boolean] = js.undefined,
    brokenDoubleClick: js.UndefOr[Boolean] = js.undefined,
    brokenElementDisplayedOffscreen: js.UndefOr[Boolean] = js.undefined,
    brokenElementDisplayedOpacity: js.UndefOr[Boolean] = js.undefined,
    brokenElementPosition: js.UndefOr[Boolean] = js.undefined,
    brokenExecuteElementReturn: js.UndefOr[Boolean] = js.undefined,
    brokenFlickFinger: js.UndefOr[Boolean] = js.undefined,
    brokenHtmlTagName: js.UndefOr[Boolean] = js.undefined,
    brokenLongTap: js.UndefOr[Boolean] = js.undefined,
    brokenMouseEvents: js.UndefOr[Boolean] = js.undefined,
    brokenMoveFinger: js.UndefOr[Boolean] = js.undefined,
    brokenNavigation: js.UndefOr[Boolean] = js.undefined,
    brokenNullGetSpecAttribute: js.UndefOr[Boolean] = js.undefined,
    brokenRefresh: js.UndefOr[Boolean] = js.undefined,
    brokenSendKeys: js.UndefOr[Boolean] = js.undefined,
    brokenSubmitElement: js.UndefOr[Boolean] = js.undefined,
    brokenTouchScroll: js.UndefOr[Boolean] = js.undefined,
    brokenWindowPosition: js.UndefOr[Boolean] = js.undefined,
    brokenWindowSwitch: js.UndefOr[Boolean] = js.undefined,
    cssSelectorsEnabled: js.UndefOr[Boolean] = js.undefined,
    dynamicViewport: js.UndefOr[Boolean] = js.undefined,
    fixedLogTypes: Boolean | js.Array[String] = null,
    javascriptEnabled: js.UndefOr[Boolean] = js.undefined,
    locationContextEnabled: js.UndefOr[Boolean] = js.undefined,
    mouseEnabled: js.UndefOr[Boolean] = js.undefined,
    nativeEvents: js.UndefOr[Boolean] = js.undefined,
    remoteFiles: js.UndefOr[Boolean] = js.undefined,
    rotatable: js.UndefOr[Boolean] = js.undefined,
    shortcutKey: String = null,
    supportsCssTransforms: js.UndefOr[Boolean] = js.undefined,
    supportsExecuteAsync: js.UndefOr[Boolean] = js.undefined,
    supportsNavigationDataUris: js.UndefOr[Boolean] = js.undefined,
    takesScreenshot: js.UndefOr[Boolean] = js.undefined,
    touchEnabled: js.UndefOr[Boolean] = js.undefined,
    webStorageEnabled: js.UndefOr[Boolean] = js.undefined
  ): Capabilities = {
    val __obj = js.Dynamic.literal(browserName = browserName, platform = platform, version = version)
    if (!js.isUndefined(applicationCacheEnabled)) __obj.updateDynamic("applicationCacheEnabled")(applicationCacheEnabled)
    if (!js.isUndefined(brokenCookies)) __obj.updateDynamic("brokenCookies")(brokenCookies)
    if (!js.isUndefined(brokenCssTransformedSize)) __obj.updateDynamic("brokenCssTransformedSize")(brokenCssTransformedSize)
    if (!js.isUndefined(brokenDeleteCookie)) __obj.updateDynamic("brokenDeleteCookie")(brokenDeleteCookie)
    if (!js.isUndefined(brokenDoubleClick)) __obj.updateDynamic("brokenDoubleClick")(brokenDoubleClick)
    if (!js.isUndefined(brokenElementDisplayedOffscreen)) __obj.updateDynamic("brokenElementDisplayedOffscreen")(brokenElementDisplayedOffscreen)
    if (!js.isUndefined(brokenElementDisplayedOpacity)) __obj.updateDynamic("brokenElementDisplayedOpacity")(brokenElementDisplayedOpacity)
    if (!js.isUndefined(brokenElementPosition)) __obj.updateDynamic("brokenElementPosition")(brokenElementPosition)
    if (!js.isUndefined(brokenExecuteElementReturn)) __obj.updateDynamic("brokenExecuteElementReturn")(brokenExecuteElementReturn)
    if (!js.isUndefined(brokenFlickFinger)) __obj.updateDynamic("brokenFlickFinger")(brokenFlickFinger)
    if (!js.isUndefined(brokenHtmlTagName)) __obj.updateDynamic("brokenHtmlTagName")(brokenHtmlTagName)
    if (!js.isUndefined(brokenLongTap)) __obj.updateDynamic("brokenLongTap")(brokenLongTap)
    if (!js.isUndefined(brokenMouseEvents)) __obj.updateDynamic("brokenMouseEvents")(brokenMouseEvents)
    if (!js.isUndefined(brokenMoveFinger)) __obj.updateDynamic("brokenMoveFinger")(brokenMoveFinger)
    if (!js.isUndefined(brokenNavigation)) __obj.updateDynamic("brokenNavigation")(brokenNavigation)
    if (!js.isUndefined(brokenNullGetSpecAttribute)) __obj.updateDynamic("brokenNullGetSpecAttribute")(brokenNullGetSpecAttribute)
    if (!js.isUndefined(brokenRefresh)) __obj.updateDynamic("brokenRefresh")(brokenRefresh)
    if (!js.isUndefined(brokenSendKeys)) __obj.updateDynamic("brokenSendKeys")(brokenSendKeys)
    if (!js.isUndefined(brokenSubmitElement)) __obj.updateDynamic("brokenSubmitElement")(brokenSubmitElement)
    if (!js.isUndefined(brokenTouchScroll)) __obj.updateDynamic("brokenTouchScroll")(brokenTouchScroll)
    if (!js.isUndefined(brokenWindowPosition)) __obj.updateDynamic("brokenWindowPosition")(brokenWindowPosition)
    if (!js.isUndefined(brokenWindowSwitch)) __obj.updateDynamic("brokenWindowSwitch")(brokenWindowSwitch)
    if (!js.isUndefined(cssSelectorsEnabled)) __obj.updateDynamic("cssSelectorsEnabled")(cssSelectorsEnabled)
    if (!js.isUndefined(dynamicViewport)) __obj.updateDynamic("dynamicViewport")(dynamicViewport)
    if (fixedLogTypes != null) __obj.updateDynamic("fixedLogTypes")(fixedLogTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(javascriptEnabled)) __obj.updateDynamic("javascriptEnabled")(javascriptEnabled)
    if (!js.isUndefined(locationContextEnabled)) __obj.updateDynamic("locationContextEnabled")(locationContextEnabled)
    if (!js.isUndefined(mouseEnabled)) __obj.updateDynamic("mouseEnabled")(mouseEnabled)
    if (!js.isUndefined(nativeEvents)) __obj.updateDynamic("nativeEvents")(nativeEvents)
    if (!js.isUndefined(remoteFiles)) __obj.updateDynamic("remoteFiles")(remoteFiles)
    if (!js.isUndefined(rotatable)) __obj.updateDynamic("rotatable")(rotatable)
    if (shortcutKey != null) __obj.updateDynamic("shortcutKey")(shortcutKey)
    if (!js.isUndefined(supportsCssTransforms)) __obj.updateDynamic("supportsCssTransforms")(supportsCssTransforms)
    if (!js.isUndefined(supportsExecuteAsync)) __obj.updateDynamic("supportsExecuteAsync")(supportsExecuteAsync)
    if (!js.isUndefined(supportsNavigationDataUris)) __obj.updateDynamic("supportsNavigationDataUris")(supportsNavigationDataUris)
    if (!js.isUndefined(takesScreenshot)) __obj.updateDynamic("takesScreenshot")(takesScreenshot)
    if (!js.isUndefined(touchEnabled)) __obj.updateDynamic("touchEnabled")(touchEnabled)
    if (!js.isUndefined(webStorageEnabled)) __obj.updateDynamic("webStorageEnabled")(webStorageEnabled)
    __obj.asInstanceOf[Capabilities]
  }
}

