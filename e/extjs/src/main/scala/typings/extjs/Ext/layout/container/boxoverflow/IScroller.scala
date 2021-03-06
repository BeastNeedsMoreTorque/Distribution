package typings.extjs.Ext.layout.container.boxoverflow

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScroller extends IObservable {
  /** [Config Option] (String) */
  var afterCtCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var afterScrollerCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var animateScroll: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var beforeCtCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var beforeScrollerCls: js.UndefOr[String] = js.undefined
  /** [Method] Returns the current scroll position of the innerCt element
    * @returns Number The current scroll position
    */
  var getScrollPosition: js.UndefOr[js.Function0[Double]] = js.undefined
  /** [Config Option] (Number) */
  var scrollDuration: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var scrollIncrement: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var scrollRepeatInterval: js.UndefOr[Double] = js.undefined
  /** [Method] Scrolls to the given component
    * @param item String/Number/Ext.Component The item to scroll to. Can be a numerical index, component id or a reference to the component itself.
    * @param animate Boolean True to animate the scrolling
    */
  var scrollToItem: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* animate */ js.UndefOr[Boolean], Unit]
  ] = js.undefined
  /** [Config Option] (String) */
  var scrollerCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var wheelIncrement: js.UndefOr[Double] = js.undefined
}

object IScroller {
  @scala.inline
  def apply(
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    afterCtCls: String = null,
    afterScrollerCls: String = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    animateScroll: js.UndefOr[Boolean] = js.undefined,
    beforeCtCls: String = null,
    beforeScrollerCls: String = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clearListeners: () => Unit = null,
    clearManagedListeners: () => Unit = null,
    config: js.Any = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    extend: String = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array]) => Boolean = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getScrollPosition: () => Double = null,
    hasListener: /* eventName */ js.UndefOr[String] => Boolean = null,
    hasListeners: js.Any = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IScroller = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[String]) => _ = null,
    removeListener: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Unit = null,
    resumeEvents: () => Unit = null,
    scrollDuration: js.UndefOr[Double] = js.undefined,
    scrollIncrement: js.UndefOr[Double] = js.undefined,
    scrollRepeatInterval: js.UndefOr[Double] = js.undefined,
    scrollToItem: (/* item */ js.UndefOr[js.Any], /* animate */ js.UndefOr[Boolean]) => Unit = null,
    scrollerCls: String = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    suspendEvent: /* repeated */ js.Any => Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Unit = null,
    un: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null,
    wheelIncrement: js.UndefOr[Double] = js.undefined
  ): IScroller = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (afterCtCls != null) __obj.updateDynamic("afterCtCls")(afterCtCls.asInstanceOf[js.Any])
    if (afterScrollerCls != null) __obj.updateDynamic("afterScrollerCls")(afterScrollerCls.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(animateScroll)) __obj.updateDynamic("animateScroll")(animateScroll.get.asInstanceOf[js.Any])
    if (beforeCtCls != null) __obj.updateDynamic("beforeCtCls")(beforeCtCls.asInstanceOf[js.Any])
    if (beforeScrollerCls != null) __obj.updateDynamic("beforeScrollerCls")(beforeScrollerCls.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getScrollPosition != null) __obj.updateDynamic("getScrollPosition")(js.Any.fromFunction0(getScrollPosition))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable.get.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (!js.isUndefined(scrollDuration)) __obj.updateDynamic("scrollDuration")(scrollDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollIncrement)) __obj.updateDynamic("scrollIncrement")(scrollIncrement.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollRepeatInterval)) __obj.updateDynamic("scrollRepeatInterval")(scrollRepeatInterval.get.asInstanceOf[js.Any])
    if (scrollToItem != null) __obj.updateDynamic("scrollToItem")(js.Any.fromFunction2(scrollToItem))
    if (scrollerCls != null) __obj.updateDynamic("scrollerCls")(scrollerCls.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (!js.isUndefined(wheelIncrement)) __obj.updateDynamic("wheelIncrement")(wheelIncrement.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScroller]
  }
}

