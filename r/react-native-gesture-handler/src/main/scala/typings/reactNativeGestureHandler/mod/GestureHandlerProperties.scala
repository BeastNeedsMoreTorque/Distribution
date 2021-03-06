package typings.reactNativeGestureHandler.mod

import typings.react.mod.Ref
import typings.reactNativeGestureHandler.anon.Bottom
import typings.reactNativeGestureHandler.anon.BottomHeight
import typings.reactNativeGestureHandler.anon.Height
import typings.reactNativeGestureHandler.anon.Left
import typings.reactNativeGestureHandler.anon.Right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GestureHandlerProperties extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var hitSlop: js.UndefOr[Double | Bottom | Left | Right | Height | BottomHeight] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined
  var simultaneousHandlers: js.UndefOr[Ref[_] | js.Array[Ref[_]]] = js.undefined
  var waitFor: js.UndefOr[Ref[_] | js.Array[Ref[_]]] = js.undefined
}

object GestureHandlerProperties {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    hitSlop: Double | Bottom | Left | Right | Height | BottomHeight = null,
    id: String = null,
    shouldCancelWhenOutside: js.UndefOr[Boolean] = js.undefined,
    simultaneousHandlers: js.UndefOr[Null | Ref[_] | js.Array[Ref[_]]] = js.undefined,
    waitFor: js.UndefOr[Null | Ref[_] | js.Array[Ref[_]]] = js.undefined
  ): GestureHandlerProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCancelWhenOutside)) __obj.updateDynamic("shouldCancelWhenOutside")(shouldCancelWhenOutside.get.asInstanceOf[js.Any])
    if (!js.isUndefined(simultaneousHandlers)) __obj.updateDynamic("simultaneousHandlers")(simultaneousHandlers.asInstanceOf[js.Any])
    if (!js.isUndefined(waitFor)) __obj.updateDynamic("waitFor")(waitFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GestureHandlerProperties]
  }
}

