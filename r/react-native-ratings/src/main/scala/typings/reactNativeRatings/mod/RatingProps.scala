package typings.reactNativeRatings.mod

import typings.propTypes.mod.Validator
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.reactNativeRatings.reactNativeRatingsStrings.bell
import typings.reactNativeRatings.reactNativeRatingsStrings.custom
import typings.reactNativeRatings.reactNativeRatingsStrings.heart
import typings.reactNativeRatings.reactNativeRatingsStrings.rocket
import typings.reactNativeRatings.reactNativeRatingsStrings.star
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RatingProps extends js.Object {
  /**
    * The number of decimal places for the rating value; must be between 0 and 20
    */
  var fractions: js.UndefOr[Double] = js.undefined
  /**
    * The size of each rating image
    *
    * Default is 50
    */
  var imageSize: js.UndefOr[Double] = js.undefined
  /**
    * The minimum value the user can select
    *
    * Default is 0
    */
  var minValue: js.UndefOr[Double] = js.undefined
  /**
    * Callback method when the user finishes rating. Gives you the final rating value as a whole number
    */
  var onFinishRating: js.UndefOr[js.Function1[/* rating */ Double, Unit]] = js.undefined
  /**
    * Callback method when the user starts rating.
    */
  var onStartRating: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Pass in a custom background-fill-color for the rating icon; use this along with type='custom' prop above
    *
    * Default is 'white'
    */
  var ratingBackgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Pass in a custom fill-color for the rating icon; use this along with type='custom' prop above
    *
    * Default is '#f1c40f'
    */
  var ratingColor: js.UndefOr[String] = js.undefined
  /**
    * Number of rating images to display
    *
    * Default is 5
    */
  var ratingCount: js.UndefOr[Double] = js.undefined
  /**
    * Pass in a custom image source; use this along with type='custom' prop above
    */
  var ratingImage: js.UndefOr[ImageURISource] = js.undefined
  /**
    * Color used for the text labels
    */
  var ratingTextColor: js.UndefOr[String] = js.undefined
  /**
    * Whether the rating can be modiefied by the user
    *
    * Default is false
    */
  var readonly: js.UndefOr[Boolean] = js.undefined
  /**
    * Displays the Built-in Rating UI to show the rating value in real-time
    *
    * Default is false
    */
  var showRating: js.UndefOr[Boolean] = js.undefined
  /**
    * The initial rating to render
    *
    * Default is ratingCount/2
    */
  var startingValue: js.UndefOr[Double] = js.undefined
  /**
    * Exposes style prop to add additonal styling to the container view
    */
  var style: js.UndefOr[Validator[js.UndefOr[StyleProp[ViewStyle]]]] = js.undefined
  /**
    * Color used for the background
    */
  var tintColor: js.UndefOr[String] = js.undefined
  /**
    * Graphic used for represent a rating
    *
    * Default is 'star'
    */
  var `type`: js.UndefOr[star | rocket | bell | heart | custom] = js.undefined
}

object RatingProps {
  @scala.inline
  def apply(
    fractions: js.UndefOr[Double] = js.undefined,
    imageSize: js.UndefOr[Double] = js.undefined,
    minValue: js.UndefOr[Double] = js.undefined,
    onFinishRating: /* rating */ Double => Unit = null,
    onStartRating: () => Unit = null,
    ratingBackgroundColor: String = null,
    ratingColor: String = null,
    ratingCount: js.UndefOr[Double] = js.undefined,
    ratingImage: ImageURISource = null,
    ratingTextColor: String = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    showRating: js.UndefOr[Boolean] = js.undefined,
    startingValue: js.UndefOr[Double] = js.undefined,
    style: Validator[js.UndefOr[StyleProp[ViewStyle]]] = null,
    tintColor: String = null,
    `type`: star | rocket | bell | heart | custom = null
  ): RatingProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fractions)) __obj.updateDynamic("fractions")(fractions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(imageSize)) __obj.updateDynamic("imageSize")(imageSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minValue)) __obj.updateDynamic("minValue")(minValue.get.asInstanceOf[js.Any])
    if (onFinishRating != null) __obj.updateDynamic("onFinishRating")(js.Any.fromFunction1(onFinishRating))
    if (onStartRating != null) __obj.updateDynamic("onStartRating")(js.Any.fromFunction0(onStartRating))
    if (ratingBackgroundColor != null) __obj.updateDynamic("ratingBackgroundColor")(ratingBackgroundColor.asInstanceOf[js.Any])
    if (ratingColor != null) __obj.updateDynamic("ratingColor")(ratingColor.asInstanceOf[js.Any])
    if (!js.isUndefined(ratingCount)) __obj.updateDynamic("ratingCount")(ratingCount.get.asInstanceOf[js.Any])
    if (ratingImage != null) __obj.updateDynamic("ratingImage")(ratingImage.asInstanceOf[js.Any])
    if (ratingTextColor != null) __obj.updateDynamic("ratingTextColor")(ratingTextColor.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRating)) __obj.updateDynamic("showRating")(showRating.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startingValue)) __obj.updateDynamic("startingValue")(startingValue.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatingProps]
  }
}

