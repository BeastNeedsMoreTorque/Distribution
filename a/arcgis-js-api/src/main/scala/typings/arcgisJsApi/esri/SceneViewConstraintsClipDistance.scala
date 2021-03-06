package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.manual
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewConstraintsClipDistance extends AnonymousAccessor {
  /**
    * The far clip distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var far: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the mode of the constraint which is either `auto` or `manual`. In `auto` mode, the near and far clip distance values are automatically determined. In `manual` mode, the near and far clip distance values are user defined, constant values. Note that the mode automatically changes to `manual` whenever the `near` or `far` property is set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    *
    * @default auto
    */
  var mode: js.UndefOr[auto | manual] = js.undefined
  /**
    * The near clip distance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var near: js.UndefOr[Double] = js.undefined
}

object SceneViewConstraintsClipDistance {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    far: js.UndefOr[Double] = js.undefined,
    get: /* propertyName */ String => _ = null,
    mode: auto | manual = null,
    near: js.UndefOr[Double] = js.undefined,
    set: (js.Function2[/* propertyName */ String, /* value */ js.Any, SceneViewConstraintsClipDistance]) with (js.Function1[/* props */ HashMap[_], SceneViewConstraintsClipDistance]) = null,
    watch: (/* path */ String | js.Array[String], /* callback */ WatchCallback, /* sync */ js.UndefOr[Boolean]) => WatchHandle = null
  ): SceneViewConstraintsClipDistance = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(far)) __obj.updateDynamic("far")(far.get.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(near)) __obj.updateDynamic("near")(near.get.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(js.Any.fromFunction3(watch))
    __obj.asInstanceOf[SceneViewConstraintsClipDistance]
  }
}

