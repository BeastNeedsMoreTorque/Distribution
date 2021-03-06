package typings.ionicCore.componentsMod.LocalJSX

import typings.std.CustomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRouteRedirect extends js.Object {
  /**
    * A redirect route, redirects "from" a URL "to" another URL. This property is that "from" URL. It needs to be an exact match of the navigated URL in order to apply.  The path specified in this value is always an absolute path, even if the initial `/` slash is not specified.
    */
  var from: String
  /**
    * Internal event that fires when any value of this rule is added/removed from the DOM, or any of his public properties changes.  `ion-router` captures this event in order to update his internal registry of router rules.
    */
  var onIonRouteRedirectChanged: js.UndefOr[js.Function1[/* event */ CustomEvent[_], Unit]] = js.undefined
  /**
    * A redirect route, redirects "from" a URL "to" another URL. This property is that "to" URL. When the defined `ion-route-redirect` rule matches, the router will redirect to the path specified in this property.  The value of this property is always an absolute path inside the scope of routes defined in `ion-router` it can't be used with another router or to perform a redirection to a different domain.  Note that this is a virtual redirect, it will not cause a real browser refresh, again, it's a redirect inside the context of ion-router.  When this property is not specified or his value is `undefined` the whole redirect route is noop, even if the "from" value matches.
    */
  var to: js.UndefOr[String | Null] = js.undefined
}

object IonRouteRedirect {
  @scala.inline
  def apply(
    from: String,
    onIonRouteRedirectChanged: /* event */ CustomEvent[_] => Unit = null,
    to: js.UndefOr[Null | String] = js.undefined
  ): IonRouteRedirect = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    if (onIonRouteRedirectChanged != null) __obj.updateDynamic("onIonRouteRedirectChanged")(js.Any.fromFunction1(onIonRouteRedirectChanged))
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRouteRedirect]
  }
}

