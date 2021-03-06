package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.mod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRouterLink extends js.Object {
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * Contains a URL or a URL fragment that the hyperlink points to. If this property is set, an anchor tag will be rendered.
    */
  var href: js.UndefOr[String] = js.undefined
  /**
    * Specifies the relationship of the target object to the link object. The value is a space-separated list of [link types](https://developer.mozilla.org/en-US/docs/Web/HTML/Link_types).
    */
  var rel: js.UndefOr[String] = js.undefined
  /**
    * When using a router, it specifies the transition animation when navigating to another page using `href`.
    */
  var routerAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  /**
    * When using a router, it specifies the transition direction when navigating to another page using `href`.
    */
  var routerDirection: js.UndefOr[RouterDirection] = js.undefined
  /**
    * Specifies where to display the linked URL. Only applies when an `href` is provided. Special keywords: `"_blank"`, `"_self"`, `"_parent"`, `"_top"`.
    */
  var target: js.UndefOr[String] = js.undefined
}

object IonRouterLink {
  @scala.inline
  def apply(
    color: Color = null,
    href: String = null,
    rel: String = null,
    routerAnimation: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation = null,
    routerDirection: RouterDirection = null,
    target: String = null
  ): IonRouterLink = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel.asInstanceOf[js.Any])
    if (routerAnimation != null) __obj.updateDynamic("routerAnimation")(js.Any.fromFunction2(routerAnimation))
    if (routerDirection != null) __obj.updateDynamic("routerDirection")(routerDirection.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRouterLink]
  }
}

