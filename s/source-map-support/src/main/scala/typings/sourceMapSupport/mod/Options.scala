package typings.sourceMapSupport.mod

import typings.sourceMapSupport.sourceMapSupportStrings.auto
import typings.sourceMapSupport.sourceMapSupportStrings.browser
import typings.sourceMapSupport.sourceMapSupportStrings.node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var emptyCacheBetweenOperations: js.UndefOr[Boolean] = js.undefined
  var environment: js.UndefOr[auto | browser | node] = js.undefined
  var handleUncaughtExceptions: js.UndefOr[Boolean] = js.undefined
  var hookRequire: js.UndefOr[Boolean] = js.undefined
  var overrideRetrieveFile: js.UndefOr[Boolean] = js.undefined
  var overrideRetrieveSourceMap: js.UndefOr[Boolean] = js.undefined
  var retrieveFile: js.UndefOr[js.Function1[/* path */ String, String]] = js.undefined
  var retrieveSourceMap: js.UndefOr[js.Function1[/* source */ String, UrlAndMap | Null]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    emptyCacheBetweenOperations: js.UndefOr[Boolean] = js.undefined,
    environment: auto | browser | node = null,
    handleUncaughtExceptions: js.UndefOr[Boolean] = js.undefined,
    hookRequire: js.UndefOr[Boolean] = js.undefined,
    overrideRetrieveFile: js.UndefOr[Boolean] = js.undefined,
    overrideRetrieveSourceMap: js.UndefOr[Boolean] = js.undefined,
    retrieveFile: /* path */ String => String = null,
    retrieveSourceMap: /* source */ String => UrlAndMap | Null = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(emptyCacheBetweenOperations)) __obj.updateDynamic("emptyCacheBetweenOperations")(emptyCacheBetweenOperations.get.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (!js.isUndefined(handleUncaughtExceptions)) __obj.updateDynamic("handleUncaughtExceptions")(handleUncaughtExceptions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hookRequire)) __obj.updateDynamic("hookRequire")(hookRequire.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideRetrieveFile)) __obj.updateDynamic("overrideRetrieveFile")(overrideRetrieveFile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideRetrieveSourceMap)) __obj.updateDynamic("overrideRetrieveSourceMap")(overrideRetrieveSourceMap.get.asInstanceOf[js.Any])
    if (retrieveFile != null) __obj.updateDynamic("retrieveFile")(js.Any.fromFunction1(retrieveFile))
    if (retrieveSourceMap != null) __obj.updateDynamic("retrieveSourceMap")(js.Any.fromFunction1(retrieveSourceMap))
    __obj.asInstanceOf[Options]
  }
}

