package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`in-cubic`
import typings.arcgisJsApi.arcgisJsApiStrings.`in-expo`
import typings.arcgisJsApi.arcgisJsApiStrings.`in-out-coast-quadratic`
import typings.arcgisJsApi.arcgisJsApiStrings.`in-out-cubic`
import typings.arcgisJsApi.arcgisJsApiStrings.`in-out-expo`
import typings.arcgisJsApi.arcgisJsApiStrings.`out-cubic`
import typings.arcgisJsApi.arcgisJsApiStrings.`out-expo`
import typings.arcgisJsApi.arcgisJsApiStrings.linear
import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoToOptions3D extends Object {
  /**
    * Indicates if the transition to the new view should be animated. If set to false, `speedFactor`, `duration`, `maxDuration`, and `easing` properties are ignored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#GoToOptions3D)
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the exact duration (in milliseconds) of the animation. Note that by default, animation duration is calculated based on the time required to reach the target at a constant speed. Setting duration overrides the speedFactor option. Note that the resulting duration is still limited to the maxDuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#GoToOptions3D)
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * The easing function to use for the animation. This may either be a preset (named) function, or a user specified function. Supported named presets are: `linear`, `in-cubic`, `out-cubic`, `in-out-cubic`, `in-expo`, `out-expo`, `in-out-expo`, `in-out-coast-quadratic`. See [easing functions](https://easings.net/) for graphical representations of these functions.  By default, animations that are less than 1000 ms use the `out-expo` easing function; longer animations use the `in-out-coast-quadratic` easing function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#GoToOptions3D)
    */
  var easing: js.UndefOr[
    linear | `in-cubic` | `out-cubic` | `in-out-cubic` | `in-expo` | `out-expo` | `in-out-expo` | `in-out-coast-quadratic` | EasingFunction
  ] = js.undefined
  /**
    * The maximum allowed duration (in milliseconds) of the animation. The default maxDuration value takes the specified speedFactor into account.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#GoToOptions3D)
    */
  var maxDuration: js.UndefOr[Double] = js.undefined
  /**
    * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the animation. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#GoToOptions3D)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * Increases or decreases the animation speed by the specified factor. A speedFactor of 2 will make the animation twice as fast, while a speedFactor of 0.5 will make the animation half as fast. Setting the speed factor will automatically adapt the default maxDuration accordingly.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#GoToOptions3D)
    */
  var speedFactor: js.UndefOr[Double] = js.undefined
}

object GoToOptions3D {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    animate: js.UndefOr[Boolean] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    easing: linear | `in-cubic` | `out-cubic` | `in-out-cubic` | `in-expo` | `out-expo` | `in-out-expo` | `in-out-coast-quadratic` | EasingFunction = null,
    maxDuration: js.UndefOr[Double] = js.undefined,
    signal: AbortSignal = null,
    speedFactor: js.UndefOr[Double] = js.undefined
  ): GoToOptions3D = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDuration)) __obj.updateDynamic("maxDuration")(maxDuration.get.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (!js.isUndefined(speedFactor)) __obj.updateDynamic("speedFactor")(speedFactor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoToOptions3D]
  }
}

