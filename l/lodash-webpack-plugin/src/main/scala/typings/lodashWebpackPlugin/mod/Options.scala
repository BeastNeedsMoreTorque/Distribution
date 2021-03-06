package typings.lodashWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var caching: js.UndefOr[Boolean] = js.undefined
  var chaining: js.UndefOr[Boolean] = js.undefined
  var cloning: js.UndefOr[Boolean] = js.undefined
  var coercions: js.UndefOr[Boolean] = js.undefined
  var collections: js.UndefOr[Boolean] = js.undefined
  var currying: js.UndefOr[Boolean] = js.undefined
  var deburring: js.UndefOr[Boolean] = js.undefined
  var exotics: js.UndefOr[Boolean] = js.undefined
  var flattening: js.UndefOr[Boolean] = js.undefined
  var guards: js.UndefOr[Boolean] = js.undefined
  var memoizing: js.UndefOr[Boolean] = js.undefined
  var metadata: js.UndefOr[Boolean] = js.undefined
  var paths: js.UndefOr[Boolean] = js.undefined
  var placeholders: js.UndefOr[Boolean] = js.undefined
  var shorthands: js.UndefOr[Boolean] = js.undefined
  var unicode: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    caching: js.UndefOr[Boolean] = js.undefined,
    chaining: js.UndefOr[Boolean] = js.undefined,
    cloning: js.UndefOr[Boolean] = js.undefined,
    coercions: js.UndefOr[Boolean] = js.undefined,
    collections: js.UndefOr[Boolean] = js.undefined,
    currying: js.UndefOr[Boolean] = js.undefined,
    deburring: js.UndefOr[Boolean] = js.undefined,
    exotics: js.UndefOr[Boolean] = js.undefined,
    flattening: js.UndefOr[Boolean] = js.undefined,
    guards: js.UndefOr[Boolean] = js.undefined,
    memoizing: js.UndefOr[Boolean] = js.undefined,
    metadata: js.UndefOr[Boolean] = js.undefined,
    paths: js.UndefOr[Boolean] = js.undefined,
    placeholders: js.UndefOr[Boolean] = js.undefined,
    shorthands: js.UndefOr[Boolean] = js.undefined,
    unicode: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caching)) __obj.updateDynamic("caching")(caching.get.asInstanceOf[js.Any])
    if (!js.isUndefined(chaining)) __obj.updateDynamic("chaining")(chaining.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cloning)) __obj.updateDynamic("cloning")(cloning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(coercions)) __obj.updateDynamic("coercions")(coercions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collections)) __obj.updateDynamic("collections")(collections.get.asInstanceOf[js.Any])
    if (!js.isUndefined(currying)) __obj.updateDynamic("currying")(currying.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deburring)) __obj.updateDynamic("deburring")(deburring.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exotics)) __obj.updateDynamic("exotics")(exotics.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flattening)) __obj.updateDynamic("flattening")(flattening.get.asInstanceOf[js.Any])
    if (!js.isUndefined(guards)) __obj.updateDynamic("guards")(guards.get.asInstanceOf[js.Any])
    if (!js.isUndefined(memoizing)) __obj.updateDynamic("memoizing")(memoizing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(metadata)) __obj.updateDynamic("metadata")(metadata.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paths)) __obj.updateDynamic("paths")(paths.get.asInstanceOf[js.Any])
    if (!js.isUndefined(placeholders)) __obj.updateDynamic("placeholders")(placeholders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shorthands)) __obj.updateDynamic("shorthands")(shorthands.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unicode)) __obj.updateDynamic("unicode")(unicode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

