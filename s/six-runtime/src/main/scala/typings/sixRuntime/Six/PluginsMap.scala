package typings.sixRuntime.Six

import typings.sixRuntime.Six.plugins.sso.ssoConf
import typings.sixRuntime.Six.plugins.sso.ssoFactory
import typings.sixRuntime.Six.plugins.static.staticConf
import typings.sixRuntime.Six.plugins.static.staticFactory
import typings.sixRuntime.Six.plugins.uac.uacConf
import typings.sixRuntime.Six.plugins.uac.uacFactory
import typings.sixRuntime.Six.plugins.upm.upmConf
import typings.sixRuntime.Six.plugins.upm.upmFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginsMap extends js.Object {
  @JSName("sso")
  var sso_Original: ssoFactory = js.native
  @JSName("static")
  var static_Original: staticFactory = js.native
  @JSName("uac")
  var uac_Original: uacFactory = js.native
  @JSName("upm")
  var upm_Original: upmFactory = js.native
  def sso(conf: ssoConf): js.Any = js.native
  def static(conf: staticConf): middleware = js.native
  def uac(conf: uacConf): js.Any = js.native
  def upm(conf: upmConf): js.Any = js.native
}

