package typings.reactFloater.mod

import typings.popperJs.mod.Data
import typings.popperJs.mod.Modifiers
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.reactFloater.anon.Offset
import typings.reactFloater.anon.PartialStyles
import typings.reactFloater.reactFloaterStrings.click
import typings.reactFloater.reactFloaterStrings.floater
import typings.reactFloater.reactFloaterStrings.hover
import typings.reactFloater.reactFloaterStrings.wrapper
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * Open the Floater automatically.
    */
  var autoOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * It will be called when the Floater change state
    */
  var callback: js.UndefOr[
    js.Function2[/* action */ Action, /* props */ PropsWithComponent | PropsWithContent, Unit]
  ] = js.undefined
  /**
    * An element to trigger the Floater.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  /**
    * Log some basic actions.
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * Animate the Floater on scroll/resize.
    */
  var disableAnimation: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable changes in the Floater position on scroll/resize.
    */
  var disableFlip: js.UndefOr[Boolean] = js.undefined
  /**
    * Don't convert hover event to click on mobile.
    */
  var disableHoverToClick: js.UndefOr[Boolean] = js.undefined
  /**
    * The event that will trigger the Floater. It can be hover | click.
    * These won't work in controlled mode.
    */
  var event: js.UndefOr[click | hover] = js.undefined
  /**
    * The amount of time (in seconds) that the floater should wait after a mouseLeave event before hiding. Only valid for event type hover.
    */
  var eventDelay: js.UndefOr[Double] = js.undefined
  /**
    * It can be anything that can be rendered.
    */
  var footer: js.UndefOr[ReactNode] = js.undefined
  /**
    * Get the popper.js instance
    */
  var getPopper: js.UndefOr[js.Function2[/* popper */ Data, /* origin */ floater | wrapper, Unit]] = js.undefined
  /**
    * Don't show the arrow. Useful for centered or modal layout.
    */
  var hideArrow: js.UndefOr[Boolean] = js.undefined
  /**
    * In case that you need to identify the portal.
    */
  var id: js.UndefOr[String | Double] = js.undefined
  /**
    * The distance between the Floater and its target in pixels.
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * Controlled mode.
    */
  var open: js.UndefOr[Boolean] = js.undefined
  /**
    * Customize popper.js modifiers.
    */
  var options: js.UndefOr[Modifiers] = js.undefined
  /**
    * The placement of the Floater. It will update the position if there's no space available.
    */
  var placement: js.UndefOr[Placement] = js.undefined
  /**
    * It will show a ⨉ button to close the Floater.
    */
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Customize the default UI.
    */
  var styles: js.UndefOr[PartialStyles] = js.undefined
  /**
    * The target used to calculate the Floater position. If it's not set, it will use the `children` as the target.
    */
  var target: js.UndefOr[String | HTMLElement | Null] = js.undefined
  /**
    * It can be anything that can be rendered.
    */
  var title: js.UndefOr[ReactNode] = js.undefined
  /**
    * Position the wrapper relative to the target.
    */
  var wrapperOptions: js.UndefOr[Offset] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    autoOpen: js.UndefOr[Boolean] = js.undefined,
    callback: (/* action */ Action, /* props */ PropsWithComponent | PropsWithContent) => Unit = null,
    children: ReactNode = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    disableAnimation: js.UndefOr[Boolean] = js.undefined,
    disableFlip: js.UndefOr[Boolean] = js.undefined,
    disableHoverToClick: js.UndefOr[Boolean] = js.undefined,
    event: click | hover = null,
    eventDelay: js.UndefOr[Double] = js.undefined,
    footer: ReactNode = null,
    getPopper: (/* popper */ Data, /* origin */ floater | wrapper) => Unit = null,
    hideArrow: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    offset: js.UndefOr[Double] = js.undefined,
    open: js.UndefOr[Boolean] = js.undefined,
    options: Modifiers = null,
    placement: Placement = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    styles: PartialStyles = null,
    target: js.UndefOr[Null | String | HTMLElement] = js.undefined,
    title: ReactNode = null,
    wrapperOptions: Offset = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen.get.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAnimation)) __obj.updateDynamic("disableAnimation")(disableAnimation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFlip)) __obj.updateDynamic("disableFlip")(disableFlip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableHoverToClick)) __obj.updateDynamic("disableHoverToClick")(disableHoverToClick.get.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (!js.isUndefined(eventDelay)) __obj.updateDynamic("eventDelay")(eventDelay.get.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (getPopper != null) __obj.updateDynamic("getPopper")(js.Any.fromFunction2(getPopper))
    if (!js.isUndefined(hideArrow)) __obj.updateDynamic("hideArrow")(hideArrow.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.get.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(target)) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (wrapperOptions != null) __obj.updateDynamic("wrapperOptions")(wrapperOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

