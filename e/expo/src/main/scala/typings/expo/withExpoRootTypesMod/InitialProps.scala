package typings.expo.withExpoRootTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.expo.anon.Dictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitialProps
  extends /* key */ StringDictionary[js.Any] {
  var exp: Dictkey
  var shell: js.UndefOr[Boolean] = js.undefined
  var shellManifestUrl: js.UndefOr[String] = js.undefined
}

object InitialProps {
  @scala.inline
  def apply(
    exp: Dictkey,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    shell: js.UndefOr[Boolean] = js.undefined,
    shellManifestUrl: String = null
  ): InitialProps = {
    val __obj = js.Dynamic.literal(exp = exp.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(shell)) __obj.updateDynamic("shell")(shell.get.asInstanceOf[js.Any])
    if (shellManifestUrl != null) __obj.updateDynamic("shellManifestUrl")(shellManifestUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialProps]
  }
}

