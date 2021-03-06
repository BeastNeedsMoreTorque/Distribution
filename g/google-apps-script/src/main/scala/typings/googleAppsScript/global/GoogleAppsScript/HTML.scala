package typings.googleAppsScript.global.GoogleAppsScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GoogleAppsScript.HTML")
@js.native
object HTML extends js.Object {
  /**
    * An enum representing the sandbox modes that can be used for client-side HtmlService
    * scripts. These values can be accessed from HtmlService.SandboxMode, and set by calling
    * HtmlOutput.setSandboxMode(mode).
    *
    * The NATIVE and EMULATED modes were deprecated on October 13, 2015 and both are now sunset. Only
    * IFRAME mode is now supported.
    *
    * To protect users from being served malicious HTML or JavaScript, client-side code served from
    * HTML service executes in a security sandbox that imposes restrictions on the code. The method
    * HtmlOutput.setSandboxMode(mode) previously allowed script authors to choose
    * between different versions of the sandbox, but now has no effect. For more information, see the
    * guide to restrictions in HTML service.
    *
    * The IFRAME mode imposes many fewer restrictions than the other sandbox modes and runs
    * fastest, but does not work at all in certain older browsers, including Internet Explorer 9. The
    * sandbox mode can also be read in a client-side script by inspecting google.script.sandbox.mode. Note that this property returns the actual mode on the client, which
    * may differ from the mode requested on the server if the requested mode is not supported in the
    * user's browser.
    *
    *     <!-- Read the sandbox mode (in a client-side script). -->
    *     <script>
    *       alert(google.script.sandbox.mode);
    *     </script>
    */
  @js.native
  object SandboxMode extends js.Object {
    /* 0 */ val EMULATED: typings.googleAppsScript.GoogleAppsScript.HTML.SandboxMode.EMULATED with Double = js.native
    /* 1 */ val IFRAME: typings.googleAppsScript.GoogleAppsScript.HTML.SandboxMode.IFRAME with Double = js.native
    /* 2 */ val NATIVE: typings.googleAppsScript.GoogleAppsScript.HTML.SandboxMode.NATIVE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.HTML.SandboxMode with Double] = js.native
  }
  
  /**
    * An enum representing the X-Frame-Options modes that can be used for client-side HtmlService scripts. These values can be accessed from HtmlService.XFrameOptionsMode,
    * and set by calling HtmlOutput.setXFrameOptionsMode(mode).
    *
    * Setting XFrameOptionsMode.ALLOWALL will let any site iframe the page, so the developer
    * should implement their own protection against clickjacking.
    *
    * If a script does not set an X-Frame-Options mode, Apps Script uses DEFAULT
    * mode as the default.
    *
    *     // Serve HTML with no X-Frame-Options header (in Apps Script server-side code).
    *     var output = HtmlService.createHtmlOutput('<b>Hello, world!</b>');
    *     output.setXFrameOptionsMode(HtmlService.XFrameOptionsMode.ALLOWALL);
    */
  @js.native
  object XFrameOptionsMode extends js.Object {
    /* 0 */ val ALLOWALL: typings.googleAppsScript.GoogleAppsScript.HTML.XFrameOptionsMode.ALLOWALL with Double = js.native
    /* 1 */ val DEFAULT: typings.googleAppsScript.GoogleAppsScript.HTML.XFrameOptionsMode.DEFAULT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.HTML.XFrameOptionsMode with Double] = js.native
  }
  
}

