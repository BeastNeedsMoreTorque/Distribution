package typings.ionicCore.componentsMod.Components

import typings.ionicCore.sanitizationMod.IonicSafeString
import typings.ionicCore.spinnerConfigsMod.SpinnerTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRefresherContent extends js.Object {
  /**
    * A static icon or a spinner to display when you begin to pull down. A spinner name can be provided to gradually show tick marks when pulling down on iOS devices.
    */
  var pullingIcon: js.UndefOr[SpinnerTypes | String | Null] = js.undefined
  /**
    * The text you want to display when you begin to pull down. `pullingText` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var pullingText: js.UndefOr[String | IonicSafeString] = js.undefined
  /**
    * An animated SVG spinner that shows when refreshing begins
    */
  var refreshingSpinner: js.UndefOr[SpinnerTypes | Null] = js.undefined
  /**
    * The text you want to display when performing a refresh. `refreshingText` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var refreshingText: js.UndefOr[String | IonicSafeString] = js.undefined
}

object IonRefresherContent {
  @scala.inline
  def apply(
    pullingIcon: js.UndefOr[Null | SpinnerTypes | String] = js.undefined,
    pullingText: String | IonicSafeString = null,
    refreshingSpinner: js.UndefOr[Null | SpinnerTypes] = js.undefined,
    refreshingText: String | IonicSafeString = null
  ): IonRefresherContent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pullingIcon)) __obj.updateDynamic("pullingIcon")(pullingIcon.asInstanceOf[js.Any])
    if (pullingText != null) __obj.updateDynamic("pullingText")(pullingText.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshingSpinner)) __obj.updateDynamic("refreshingSpinner")(refreshingSpinner.asInstanceOf[js.Any])
    if (refreshingText != null) __obj.updateDynamic("refreshingText")(refreshingText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRefresherContent]
  }
}

