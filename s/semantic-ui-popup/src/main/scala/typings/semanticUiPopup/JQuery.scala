package typings.semanticUiPopup

import typings.semanticUiPopup.SemanticUI.Popup
import typings.semanticUiPopup.SemanticUI.Popup.ClassNameSettings
import typings.semanticUiPopup.SemanticUI.Popup.DelaySettings
import typings.semanticUiPopup.SemanticUI.Popup.ErrorSettings
import typings.semanticUiPopup.SemanticUI.Popup.MetadataSettings
import typings.semanticUiPopup.SemanticUI.Popup.SelectorSettings
import typings.semanticUiPopup.SemanticUI.PopupSettings
import typings.semanticUiPopup.semanticUiPopupBooleans.`false`
import typings.semanticUiPopup.semanticUiPopupStrings.`bind clickaway`
import typings.semanticUiPopup.semanticUiPopupStrings.`bind close on scroll`
import typings.semanticUiPopup.semanticUiPopupStrings.`bind touch close`
import typings.semanticUiPopup.semanticUiPopupStrings.`change content`
import typings.semanticUiPopup.semanticUiPopupStrings.`get popup`
import typings.semanticUiPopup.semanticUiPopupStrings.`hide all`
import typings.semanticUiPopup.semanticUiPopupStrings.`inline`
import typings.semanticUiPopup.semanticUiPopupStrings.`is hidden`
import typings.semanticUiPopup.semanticUiPopupStrings.`is visible`
import typings.semanticUiPopup.semanticUiPopupStrings.`remove popup`
import typings.semanticUiPopup.semanticUiPopupStrings.`set position`
import typings.semanticUiPopup.semanticUiPopupStrings.addTouchEvents
import typings.semanticUiPopup.semanticUiPopupStrings.adjacent
import typings.semanticUiPopup.semanticUiPopupStrings.auto
import typings.semanticUiPopup.semanticUiPopupStrings.boundary
import typings.semanticUiPopup.semanticUiPopupStrings.className
import typings.semanticUiPopup.semanticUiPopupStrings.click
import typings.semanticUiPopup.semanticUiPopupStrings.closable
import typings.semanticUiPopup.semanticUiPopupStrings.content
import typings.semanticUiPopup.semanticUiPopupStrings.context
import typings.semanticUiPopup.semanticUiPopupStrings.debug
import typings.semanticUiPopup.semanticUiPopupStrings.delay
import typings.semanticUiPopup.semanticUiPopupStrings.destroy
import typings.semanticUiPopup.semanticUiPopupStrings.distanceAway
import typings.semanticUiPopup.semanticUiPopupStrings.duration
import typings.semanticUiPopup.semanticUiPopupStrings.error
import typings.semanticUiPopup.semanticUiPopupStrings.exclusive
import typings.semanticUiPopup.semanticUiPopupStrings.exists
import typings.semanticUiPopup.semanticUiPopupStrings.focus
import typings.semanticUiPopup.semanticUiPopupStrings.hide
import typings.semanticUiPopup.semanticUiPopupStrings.hideOnScroll
import typings.semanticUiPopup.semanticUiPopupStrings.hover
import typings.semanticUiPopup.semanticUiPopupStrings.hoverable
import typings.semanticUiPopup.semanticUiPopupStrings.html
import typings.semanticUiPopup.semanticUiPopupStrings.jitter
import typings.semanticUiPopup.semanticUiPopupStrings.lastResort
import typings.semanticUiPopup.semanticUiPopupStrings.manual
import typings.semanticUiPopup.semanticUiPopupStrings.maxSearchDepth
import typings.semanticUiPopup.semanticUiPopupStrings.metadata
import typings.semanticUiPopup.semanticUiPopupStrings.movePopup
import typings.semanticUiPopup.semanticUiPopupStrings.name
import typings.semanticUiPopup.semanticUiPopupStrings.namespace
import typings.semanticUiPopup.semanticUiPopupStrings.observeChanges
import typings.semanticUiPopup.semanticUiPopupStrings.offset
import typings.semanticUiPopup.semanticUiPopupStrings.on
import typings.semanticUiPopup.semanticUiPopupStrings.onCreate
import typings.semanticUiPopup.semanticUiPopupStrings.onHidden
import typings.semanticUiPopup.semanticUiPopupStrings.onHide
import typings.semanticUiPopup.semanticUiPopupStrings.onRemove
import typings.semanticUiPopup.semanticUiPopupStrings.onShow
import typings.semanticUiPopup.semanticUiPopupStrings.onUnplaceable
import typings.semanticUiPopup.semanticUiPopupStrings.onVisible
import typings.semanticUiPopup.semanticUiPopupStrings.opposite
import typings.semanticUiPopup.semanticUiPopupStrings.performance
import typings.semanticUiPopup.semanticUiPopupStrings.position
import typings.semanticUiPopup.semanticUiPopupStrings.prefer
import typings.semanticUiPopup.semanticUiPopupStrings.preserve
import typings.semanticUiPopup.semanticUiPopupStrings.reposition
import typings.semanticUiPopup.semanticUiPopupStrings.scrollContext
import typings.semanticUiPopup.semanticUiPopupStrings.selector
import typings.semanticUiPopup.semanticUiPopupStrings.setFluidWidth
import typings.semanticUiPopup.semanticUiPopupStrings.setting
import typings.semanticUiPopup.semanticUiPopupStrings.show
import typings.semanticUiPopup.semanticUiPopupStrings.silent
import typings.semanticUiPopup.semanticUiPopupStrings.target
import typings.semanticUiPopup.semanticUiPopupStrings.title
import typings.semanticUiPopup.semanticUiPopupStrings.toggle
import typings.semanticUiPopup.semanticUiPopupStrings.transition
import typings.semanticUiPopup.semanticUiPopupStrings.variation
import typings.semanticUiPopup.semanticUiPopupStrings.verbose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("popup")
  var popup_Original: Popup = js.native
  def popup(): JQuery = js.native
  def popup(behavior: setting, name: `inline`): Boolean = js.native
  def popup(behavior: setting, name: `inline`, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: addTouchEvents): Boolean = js.native
  def popup(behavior: setting, name: addTouchEvents, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: boundary): String | JQuery = js.native
  def popup(behavior: setting, name: boundary, value: String): JQuery = js.native
  def popup(behavior: setting, name: boundary, value: JQuery): JQuery = js.native
  def popup(behavior: setting, name: className): ClassNameSettings = js.native
  def popup(behavior: setting, name: className, value: ClassNameSettings): JQuery = js.native
  def popup(behavior: setting, name: closable): Boolean = js.native
  def popup(behavior: setting, name: closable, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: content): String = js.native
  def popup(behavior: setting, name: content, value: String): JQuery = js.native
  def popup(behavior: setting, name: context): String | JQuery = js.native
  def popup(behavior: setting, name: context, value: String): JQuery = js.native
  def popup(behavior: setting, name: context, value: JQuery): JQuery = js.native
  def popup(behavior: setting, name: debug): Boolean = js.native
  def popup(behavior: setting, name: debug, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: delay): DelaySettings = js.native
  def popup(behavior: setting, name: delay, value: DelaySettings): JQuery = js.native
  def popup(behavior: setting, name: distanceAway): Double = js.native
  def popup(behavior: setting, name: distanceAway, value: Double): JQuery = js.native
  def popup(behavior: setting, name: duration): Double = js.native
  def popup(behavior: setting, name: duration, value: Double): JQuery = js.native
  def popup(behavior: setting, name: error): ErrorSettings = js.native
  def popup(behavior: setting, name: error, value: ErrorSettings): JQuery = js.native
  def popup(behavior: setting, name: exclusive): Boolean = js.native
  def popup(behavior: setting, name: exclusive, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: hideOnScroll): auto | `false` = js.native
  def popup(behavior: setting, name: hideOnScroll, value: `false`): JQuery = js.native
  def popup(behavior: setting, name: hideOnScroll, value: auto): JQuery = js.native
  def popup(behavior: setting, name: hoverable): Boolean = js.native
  def popup(behavior: setting, name: hoverable, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: html): String | JQuery = js.native
  def popup(behavior: setting, name: html, value: String): JQuery = js.native
  def popup(behavior: setting, name: html, value: JQuery): JQuery = js.native
  def popup(behavior: setting, name: jitter): Double = js.native
  def popup(behavior: setting, name: jitter, value: Double): JQuery = js.native
  def popup(behavior: setting, name: lastResort): Boolean | String = js.native
  def popup(behavior: setting, name: lastResort, value: String): JQuery = js.native
  def popup(behavior: setting, name: lastResort, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: maxSearchDepth): Double = js.native
  def popup(behavior: setting, name: maxSearchDepth, value: Double): JQuery = js.native
  def popup(behavior: setting, name: metadata): MetadataSettings = js.native
  def popup(behavior: setting, name: metadata, value: MetadataSettings): JQuery = js.native
  def popup(behavior: setting, name: movePopup): Boolean = js.native
  def popup(behavior: setting, name: movePopup, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: name): String = js.native
  def popup(behavior: setting, name: namespace): String = js.native
  def popup(behavior: setting, name: namespace, value: String): JQuery = js.native
  def popup(behavior: setting, name: name, value: String): JQuery = js.native
  def popup(behavior: setting, name: observeChanges): Boolean = js.native
  def popup(behavior: setting, name: observeChanges, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: offset): Double = js.native
  def popup(behavior: setting, name: offset, value: Double): JQuery = js.native
  def popup(behavior: setting, name: on): focus | click | hover | manual = js.native
  def popup(behavior: setting, name: onCreate): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
  def popup(
    behavior: setting,
    name: onCreate,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery = js.native
  def popup(behavior: setting, name: onHidden): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
  def popup(
    behavior: setting,
    name: onHidden,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery = js.native
  def popup(behavior: setting, name: onHide): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit] = js.native
  def popup(
    behavior: setting,
    name: onHide,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]
  ): JQuery = js.native
  def popup(behavior: setting, name: onRemove): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
  def popup(
    behavior: setting,
    name: onRemove,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery = js.native
  def popup(behavior: setting, name: onShow): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit] = js.native
  def popup(
    behavior: setting,
    name: onShow,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, `false` | Unit]
  ): JQuery = js.native
  def popup(behavior: setting, name: onUnplaceable): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
  def popup(
    behavior: setting,
    name: onUnplaceable,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery = js.native
  def popup(behavior: setting, name: onVisible): js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit] = js.native
  def popup(
    behavior: setting,
    name: onVisible,
    value: js.ThisFunction1[/* this */ JQuery, /* $module */ JQuery, Unit]
  ): JQuery = js.native
  def popup(behavior: setting, name: on, value: click): JQuery = js.native
  def popup(behavior: setting, name: on, value: focus): JQuery = js.native
  def popup(behavior: setting, name: on, value: hover): JQuery = js.native
  def popup(behavior: setting, name: on, value: manual): JQuery = js.native
  def popup(behavior: setting, name: performance): Boolean = js.native
  def popup(behavior: setting, name: performance, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: typings.semanticUiPopup.semanticUiPopupStrings.popup): `false` | String | JQuery = js.native
  def popup(behavior: setting, name: typings.semanticUiPopup.semanticUiPopupStrings.popup, value: String): JQuery = js.native
  def popup(behavior: setting, name: typings.semanticUiPopup.semanticUiPopupStrings.popup, value: JQuery): JQuery = js.native
  def popup(behavior: setting, name: typings.semanticUiPopup.semanticUiPopupStrings.popup, value: `false`): JQuery = js.native
  def popup(behavior: setting, name: position): String = js.native
  def popup(behavior: setting, name: position, value: String): JQuery = js.native
  def popup(behavior: setting, name: prefer): adjacent | opposite = js.native
  def popup(behavior: setting, name: prefer, value: adjacent): JQuery = js.native
  def popup(behavior: setting, name: prefer, value: opposite): JQuery = js.native
  def popup(behavior: setting, name: preserve): Boolean = js.native
  def popup(behavior: setting, name: preserve, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: scrollContext): String | JQuery = js.native
  def popup(behavior: setting, name: scrollContext, value: String): JQuery = js.native
  def popup(behavior: setting, name: scrollContext, value: JQuery): JQuery = js.native
  def popup(behavior: setting, name: selector): SelectorSettings = js.native
  def popup(behavior: setting, name: selector, value: SelectorSettings): JQuery = js.native
  def popup(behavior: setting, name: setFluidWidth): Boolean = js.native
  def popup(behavior: setting, name: setFluidWidth, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: silent): Boolean = js.native
  def popup(behavior: setting, name: silent, value: Boolean): JQuery = js.native
  def popup(behavior: setting, name: target): `false` | String | JQuery = js.native
  def popup(behavior: setting, name: target, value: String): JQuery = js.native
  def popup(behavior: setting, name: target, value: JQuery): JQuery = js.native
  def popup(behavior: setting, name: target, value: `false`): JQuery = js.native
  def popup(behavior: setting, name: title): String = js.native
  def popup(behavior: setting, name: title, value: String): JQuery = js.native
  def popup(behavior: setting, name: transition): String = js.native
  def popup(behavior: setting, name: transition, value: String): JQuery = js.native
  def popup(behavior: setting, name: variation): String = js.native
  def popup(behavior: setting, name: variation, value: String): JQuery = js.native
  def popup(behavior: setting, name: verbose): Boolean = js.native
  def popup(behavior: setting, name: verbose, value: Boolean): JQuery = js.native
  def popup(settings: PopupSettings): JQuery = js.native
  /**
    * @since 2.2.11
    */
  @JSName("popup")
  def popup_bindclickaway(behavior: `bind clickaway`): JQuery = js.native
  /**
    * @since 2.2.11
    */
  @JSName("popup")
  def popup_bindcloseonscroll(behavior: `bind close on scroll`): JQuery = js.native
  /**
    * @since 2.2.11
    */
  @JSName("popup")
  def popup_bindtouchclose(behavior: `bind touch close`): JQuery = js.native
  /**
    * Changes current popup content
    */
  @JSName("popup")
  def popup_changecontent(behavior: `change content`, html: String): JQuery = js.native
  /**
    * Removes popup from the page and removes all events
    */
  @JSName("popup")
  def popup_destroy(behavior: destroy): JQuery = js.native
  /**
    * Returns whether popup is created and inserted into the page
    */
  @JSName("popup")
  def popup_exists(behavior: exists): Boolean = js.native
  /**
    * Returns current popup dom element
    */
  @JSName("popup")
  def popup_getpopup(behavior: `get popup`): JQuery = js.native
  /**
    * Hides popup
    */
  @JSName("popup")
  def popup_hide(behavior: hide): JQuery = js.native
  /**
    * Hides all visible pop ups on the page
    */
  @JSName("popup")
  def popup_hideall(behavior: `hide all`): JQuery = js.native
  /**
    * Returns whether popup is hidden
    */
  @JSName("popup")
  def popup_ishidden(behavior: `is hidden`): Boolean = js.native
  /**
    * Returns whether popup is visible
    */
  @JSName("popup")
  def popup_isvisible(behavior: `is visible`): Boolean = js.native
  /**
    * Removes popup from the page
    */
  @JSName("popup")
  def popup_removepopup(behavior: `remove popup`): JQuery = js.native
  /**
    * Adjusts popup when content size changes (only necessary for centered popups)
    */
  @JSName("popup")
  def popup_reposition(behavior: reposition): JQuery = js.native
  /**
    * Repositions a popup
    */
  @JSName("popup")
  def popup_setposition(behavior: `set position`, position: String): JQuery = js.native
  @JSName("popup")
  def popup_setting(behavior: setting, value: PopupSettings): JQuery = js.native
  /**
    * Shows popup
    */
  @JSName("popup")
  def popup_show(behavior: show): JQuery = js.native
  /**
    * Toggles visibility of popup
    */
  @JSName("popup")
  def popup_toggle(behavior: toggle): JQuery = js.native
}

