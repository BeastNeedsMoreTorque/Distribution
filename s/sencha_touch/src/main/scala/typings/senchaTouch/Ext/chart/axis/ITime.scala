package typings.senchaTouch.Ext.chart.axis

import typings.senchaTouch.Ext.Array
import typings.senchaTouch.Ext.IClass
import typings.senchaTouch.Ext.chart.IAbstractChart
import typings.senchaTouch.Ext.mixin.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITime extends INumeric {
  /** [Config Option] (Boolean) */
  var calculateByLabelSize: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String/Boolean) */
  var dateFormat: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Date) */
  var fromDate: js.UndefOr[js.Any] = js.undefined
  /** [Method] Returns the value of calculateByLabelSize
    * @returns Boolean
    */
  var getCalculateByLabelSize: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /** [Method] Mapping data value into coordinate
    * @param value Object
    * @returns Number
    */
  @JSName("getCoordFor")
  var getCoordFor_ITime: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Double]] = js.undefined
  /** [Method] Returns the value of dateFormat
    * @returns String/Boolean
    */
  var getDateFormat: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of fromDate
    * @returns Date
    */
  var getFromDate: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Returns the value of step
    * @returns Array
    */
  var getStep: js.UndefOr[js.Function0[Array]] = js.undefined
  /** [Method] Returns the value of toDate
    * @returns Date
    */
  var getToDate: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Method] Sets the value of calculateByLabelSize
    * @param calculateByLabelSize Boolean The new value.
    */
  var setCalculateByLabelSize: js.UndefOr[js.Function1[/* calculateByLabelSize */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Sets the value of dateFormat
    * @param dateFormat String/Boolean The new value.
    */
  var setDateFormat: js.UndefOr[js.Function1[/* dateFormat */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of fromDate
    * @param fromDate Date The new value.
    */
  var setFromDate: js.UndefOr[js.Function1[/* fromDate */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Sets the value of step
    * @param step Array The new value.
    */
  var setStep: js.UndefOr[js.Function1[/* step */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] Sets the value of toDate
    * @param toDate Date The new value.
    */
  var setToDate: js.UndefOr[js.Function1[/* toDate */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Array) */
  var step: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Date) */
  var toDate: js.UndefOr[js.Any] = js.undefined
}

object ITime {
  @scala.inline
  def apply(
    addAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    addManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    background: js.Any = null,
    bubbleEvents: js.Any = null,
    calculateByLabelSize: js.UndefOr[Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    chart: IAbstractChart = null,
    clearListeners: () => Unit = null,
    config: js.Any = null,
    dateFormat: js.Any = null,
    destroy: () => Unit = null,
    enableBubble: /* events */ js.UndefOr[js.Any] => Unit = null,
    extend: String = null,
    fields: Array = null,
    fireAction: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _ = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => Boolean = null,
    fromDate: js.Any = null,
    getAggregator: () => String = null,
    getBackground: () => _ = null,
    getBubbleEvents: () => _ = null,
    getCalculateByLabelSize: () => Boolean = null,
    getChart: () => IAbstractChart = null,
    getCoordFor: /* value */ js.UndefOr[js.Any] => Double = null,
    getDateFormat: () => _ = null,
    getFields: () => Array = null,
    getFromDate: () => _ = null,
    getGrid: () => _ = null,
    getHidden: () => Boolean = null,
    getId: () => _ = null,
    getIncrement: () => Double = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getLabel: () => _ = null,
    getLabelInSpan: () => Boolean = null,
    getLayout: () => String = null,
    getListeners: () => _ = null,
    getMajorTickSteps: () => Double = null,
    getMaxZoom: () => Double = null,
    getMaximum: () => Double = null,
    getMinZoom: () => Double = null,
    getMinimum: () => Double = null,
    getMinorTickSteps: () => Double = null,
    getNeedHighPrecision: () => Boolean = null,
    getPosition: () => String = null,
    getRange: () => Array = null,
    getRenderer: () => _ = null,
    getSegmenter: () => String = null,
    getStep: () => Array = null,
    getStyle: () => _ = null,
    getTitle: () => _ = null,
    getTitleMargin: () => Double = null,
    getToDate: () => _ = null,
    getVisibleRange: () => Array = null,
    grid: js.Any = null,
    hasListener: /* eventName */ js.UndefOr[String] => Boolean = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    increment: js.UndefOr[Double] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    label: js.Any = null,
    labelInSpan: js.UndefOr[Boolean] = js.undefined,
    layout: js.Any = null,
    listeners: js.Any = null,
    majorTickSteps: js.UndefOr[Double] = js.undefined,
    maxZoom: js.UndefOr[Double] = js.undefined,
    maximum: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    minimum: js.UndefOr[Double] = js.undefined,
    minorTickSteps: js.UndefOr[Double] = js.undefined,
    mixins: js.Any = null,
    mon: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    mun: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    needHighPrecision: js.UndefOr[Boolean] = js.undefined,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    onAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    onBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    platformConfig: js.Any = null,
    position: String = null,
    processData: () => Unit = null,
    relayEvents: (/* object */ js.UndefOr[js.Any], /* events */ js.UndefOr[js.Any]) => IObservable = null,
    removeAfterListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeBeforeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    removeListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    removeManagedListener: (/* object */ js.UndefOr[js.Any], /* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    renderFrame: () => Unit = null,
    renderer: js.Any = null,
    resumeEvents: /* discardQueuedEvents */ js.UndefOr[Boolean] => Unit = null,
    segmenter: js.Any = null,
    self: IClass = null,
    setAggregator: /* aggregator */ js.UndefOr[String] => Unit = null,
    setBackground: /* background */ js.UndefOr[js.Any] => Unit = null,
    setBubbleEvents: /* bubbleEvents */ js.UndefOr[js.Any] => Unit = null,
    setCalculateByLabelSize: /* calculateByLabelSize */ js.UndefOr[Boolean] => Unit = null,
    setChart: /* chart */ js.UndefOr[IAbstractChart] => Unit = null,
    setDateFormat: /* dateFormat */ js.UndefOr[js.Any] => Unit = null,
    setFields: /* fields */ js.UndefOr[Array] => Unit = null,
    setFromDate: /* fromDate */ js.UndefOr[js.Any] => Unit = null,
    setGrid: /* grid */ js.UndefOr[js.Any] => Unit = null,
    setHidden: /* hidden */ js.UndefOr[Boolean] => Unit = null,
    setIncrement: /* increment */ js.UndefOr[Double] => Unit = null,
    setLabel: /* label */ js.UndefOr[js.Any] => Unit = null,
    setLabelInSpan: /* labelInSpan */ js.UndefOr[Boolean] => Unit = null,
    setLayout: /* layout */ js.UndefOr[String] => Unit = null,
    setListeners: /* listeners */ js.UndefOr[js.Any] => Unit = null,
    setMajorTickSteps: /* majorTickSteps */ js.UndefOr[Double] => Unit = null,
    setMaxZoom: /* maxZoom */ js.UndefOr[Double] => Unit = null,
    setMaximum: /* maximum */ js.UndefOr[Double] => Unit = null,
    setMinZoom: /* minZoom */ js.UndefOr[Double] => Unit = null,
    setMinimum: /* minimum */ js.UndefOr[Double] => Unit = null,
    setMinorTickSteps: /* minorTickSteps */ js.UndefOr[Double] => Unit = null,
    setNeedHighPrecision: /* needHighPrecision */ js.UndefOr[Boolean] => Unit = null,
    setPosition: /* position */ js.UndefOr[String] => Unit = null,
    setRenderer: /* renderer */ js.UndefOr[js.Any] => String = null,
    setSegmenter: /* segmenter */ js.UndefOr[String] => Unit = null,
    setStep: /* step */ js.UndefOr[Array] => Unit = null,
    setStyle: /* style */ js.UndefOr[js.Any] => Unit = null,
    setTitle: /* title */ js.UndefOr[js.Any] => Unit = null,
    setTitleMargin: /* titleMargin */ js.UndefOr[Double] => Unit = null,
    setToDate: /* toDate */ js.UndefOr[js.Any] => Unit = null,
    setVisibleRange: /* visibleRange */ js.UndefOr[Array] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    step: Array = null,
    style: js.Any = null,
    suspendEvents: () => Unit = null,
    title: js.Any = null,
    titleMargin: js.UndefOr[Double] = js.undefined,
    toDate: js.Any = null,
    un: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any], /* order */ js.UndefOr[String]) => Unit = null,
    unAfter: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    unBefore: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null,
    visibleRange: Array = null
  ): ITime = {
    val __obj = js.Dynamic.literal()
    if (addAfterListener != null) __obj.updateDynamic("addAfterListener")(js.Any.fromFunction4(addAfterListener))
    if (addBeforeListener != null) __obj.updateDynamic("addBeforeListener")(js.Any.fromFunction4(addBeforeListener))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction5(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (bubbleEvents != null) __obj.updateDynamic("bubbleEvents")(bubbleEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(calculateByLabelSize)) __obj.updateDynamic("calculateByLabelSize")(calculateByLabelSize.get.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (chart != null) __obj.updateDynamic("chart")(chart.asInstanceOf[js.Any])
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (fireAction != null) __obj.updateDynamic("fireAction")(js.Any.fromFunction4(fireAction))
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fromDate != null) __obj.updateDynamic("fromDate")(fromDate.asInstanceOf[js.Any])
    if (getAggregator != null) __obj.updateDynamic("getAggregator")(js.Any.fromFunction0(getAggregator))
    if (getBackground != null) __obj.updateDynamic("getBackground")(js.Any.fromFunction0(getBackground))
    if (getBubbleEvents != null) __obj.updateDynamic("getBubbleEvents")(js.Any.fromFunction0(getBubbleEvents))
    if (getCalculateByLabelSize != null) __obj.updateDynamic("getCalculateByLabelSize")(js.Any.fromFunction0(getCalculateByLabelSize))
    if (getChart != null) __obj.updateDynamic("getChart")(js.Any.fromFunction0(getChart))
    if (getCoordFor != null) __obj.updateDynamic("getCoordFor")(js.Any.fromFunction1(getCoordFor))
    if (getDateFormat != null) __obj.updateDynamic("getDateFormat")(js.Any.fromFunction0(getDateFormat))
    if (getFields != null) __obj.updateDynamic("getFields")(js.Any.fromFunction0(getFields))
    if (getFromDate != null) __obj.updateDynamic("getFromDate")(js.Any.fromFunction0(getFromDate))
    if (getGrid != null) __obj.updateDynamic("getGrid")(js.Any.fromFunction0(getGrid))
    if (getHidden != null) __obj.updateDynamic("getHidden")(js.Any.fromFunction0(getHidden))
    if (getId != null) __obj.updateDynamic("getId")(js.Any.fromFunction0(getId))
    if (getIncrement != null) __obj.updateDynamic("getIncrement")(js.Any.fromFunction0(getIncrement))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getLabel != null) __obj.updateDynamic("getLabel")(js.Any.fromFunction0(getLabel))
    if (getLabelInSpan != null) __obj.updateDynamic("getLabelInSpan")(js.Any.fromFunction0(getLabelInSpan))
    if (getLayout != null) __obj.updateDynamic("getLayout")(js.Any.fromFunction0(getLayout))
    if (getListeners != null) __obj.updateDynamic("getListeners")(js.Any.fromFunction0(getListeners))
    if (getMajorTickSteps != null) __obj.updateDynamic("getMajorTickSteps")(js.Any.fromFunction0(getMajorTickSteps))
    if (getMaxZoom != null) __obj.updateDynamic("getMaxZoom")(js.Any.fromFunction0(getMaxZoom))
    if (getMaximum != null) __obj.updateDynamic("getMaximum")(js.Any.fromFunction0(getMaximum))
    if (getMinZoom != null) __obj.updateDynamic("getMinZoom")(js.Any.fromFunction0(getMinZoom))
    if (getMinimum != null) __obj.updateDynamic("getMinimum")(js.Any.fromFunction0(getMinimum))
    if (getMinorTickSteps != null) __obj.updateDynamic("getMinorTickSteps")(js.Any.fromFunction0(getMinorTickSteps))
    if (getNeedHighPrecision != null) __obj.updateDynamic("getNeedHighPrecision")(js.Any.fromFunction0(getNeedHighPrecision))
    if (getPosition != null) __obj.updateDynamic("getPosition")(js.Any.fromFunction0(getPosition))
    if (getRange != null) __obj.updateDynamic("getRange")(js.Any.fromFunction0(getRange))
    if (getRenderer != null) __obj.updateDynamic("getRenderer")(js.Any.fromFunction0(getRenderer))
    if (getSegmenter != null) __obj.updateDynamic("getSegmenter")(js.Any.fromFunction0(getSegmenter))
    if (getStep != null) __obj.updateDynamic("getStep")(js.Any.fromFunction0(getStep))
    if (getStyle != null) __obj.updateDynamic("getStyle")(js.Any.fromFunction0(getStyle))
    if (getTitle != null) __obj.updateDynamic("getTitle")(js.Any.fromFunction0(getTitle))
    if (getTitleMargin != null) __obj.updateDynamic("getTitleMargin")(js.Any.fromFunction0(getTitleMargin))
    if (getToDate != null) __obj.updateDynamic("getToDate")(js.Any.fromFunction0(getToDate))
    if (getVisibleRange != null) __obj.updateDynamic("getVisibleRange")(js.Any.fromFunction0(getVisibleRange))
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(increment)) __obj.updateDynamic("increment")(increment.get.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(labelInSpan)) __obj.updateDynamic("labelInSpan")(labelInSpan.get.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (!js.isUndefined(majorTickSteps)) __obj.updateDynamic("majorTickSteps")(majorTickSteps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimum)) __obj.updateDynamic("minimum")(minimum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickSteps)) __obj.updateDynamic("minorTickSteps")(minorTickSteps.get.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (!js.isUndefined(needHighPrecision)) __obj.updateDynamic("needHighPrecision")(needHighPrecision.get.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction5(on))
    if (onAfter != null) __obj.updateDynamic("onAfter")(js.Any.fromFunction4(onAfter))
    if (onBefore != null) __obj.updateDynamic("onBefore")(js.Any.fromFunction4(onBefore))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (processData != null) __obj.updateDynamic("processData")(js.Any.fromFunction0(processData))
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction2(relayEvents))
    if (removeAfterListener != null) __obj.updateDynamic("removeAfterListener")(js.Any.fromFunction4(removeAfterListener))
    if (removeBeforeListener != null) __obj.updateDynamic("removeBeforeListener")(js.Any.fromFunction4(removeBeforeListener))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction5(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (renderFrame != null) __obj.updateDynamic("renderFrame")(js.Any.fromFunction0(renderFrame))
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction1(resumeEvents))
    if (segmenter != null) __obj.updateDynamic("segmenter")(segmenter.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setAggregator != null) __obj.updateDynamic("setAggregator")(js.Any.fromFunction1(setAggregator))
    if (setBackground != null) __obj.updateDynamic("setBackground")(js.Any.fromFunction1(setBackground))
    if (setBubbleEvents != null) __obj.updateDynamic("setBubbleEvents")(js.Any.fromFunction1(setBubbleEvents))
    if (setCalculateByLabelSize != null) __obj.updateDynamic("setCalculateByLabelSize")(js.Any.fromFunction1(setCalculateByLabelSize))
    if (setChart != null) __obj.updateDynamic("setChart")(js.Any.fromFunction1(setChart))
    if (setDateFormat != null) __obj.updateDynamic("setDateFormat")(js.Any.fromFunction1(setDateFormat))
    if (setFields != null) __obj.updateDynamic("setFields")(js.Any.fromFunction1(setFields))
    if (setFromDate != null) __obj.updateDynamic("setFromDate")(js.Any.fromFunction1(setFromDate))
    if (setGrid != null) __obj.updateDynamic("setGrid")(js.Any.fromFunction1(setGrid))
    if (setHidden != null) __obj.updateDynamic("setHidden")(js.Any.fromFunction1(setHidden))
    if (setIncrement != null) __obj.updateDynamic("setIncrement")(js.Any.fromFunction1(setIncrement))
    if (setLabel != null) __obj.updateDynamic("setLabel")(js.Any.fromFunction1(setLabel))
    if (setLabelInSpan != null) __obj.updateDynamic("setLabelInSpan")(js.Any.fromFunction1(setLabelInSpan))
    if (setLayout != null) __obj.updateDynamic("setLayout")(js.Any.fromFunction1(setLayout))
    if (setListeners != null) __obj.updateDynamic("setListeners")(js.Any.fromFunction1(setListeners))
    if (setMajorTickSteps != null) __obj.updateDynamic("setMajorTickSteps")(js.Any.fromFunction1(setMajorTickSteps))
    if (setMaxZoom != null) __obj.updateDynamic("setMaxZoom")(js.Any.fromFunction1(setMaxZoom))
    if (setMaximum != null) __obj.updateDynamic("setMaximum")(js.Any.fromFunction1(setMaximum))
    if (setMinZoom != null) __obj.updateDynamic("setMinZoom")(js.Any.fromFunction1(setMinZoom))
    if (setMinimum != null) __obj.updateDynamic("setMinimum")(js.Any.fromFunction1(setMinimum))
    if (setMinorTickSteps != null) __obj.updateDynamic("setMinorTickSteps")(js.Any.fromFunction1(setMinorTickSteps))
    if (setNeedHighPrecision != null) __obj.updateDynamic("setNeedHighPrecision")(js.Any.fromFunction1(setNeedHighPrecision))
    if (setPosition != null) __obj.updateDynamic("setPosition")(js.Any.fromFunction1(setPosition))
    if (setRenderer != null) __obj.updateDynamic("setRenderer")(js.Any.fromFunction1(setRenderer))
    if (setSegmenter != null) __obj.updateDynamic("setSegmenter")(js.Any.fromFunction1(setSegmenter))
    if (setStep != null) __obj.updateDynamic("setStep")(js.Any.fromFunction1(setStep))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction1(setStyle))
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (setTitleMargin != null) __obj.updateDynamic("setTitleMargin")(js.Any.fromFunction1(setTitleMargin))
    if (setToDate != null) __obj.updateDynamic("setToDate")(js.Any.fromFunction1(setToDate))
    if (setVisibleRange != null) __obj.updateDynamic("setVisibleRange")(js.Any.fromFunction1(setVisibleRange))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction0(suspendEvents))
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(titleMargin)) __obj.updateDynamic("titleMargin")(titleMargin.get.asInstanceOf[js.Any])
    if (toDate != null) __obj.updateDynamic("toDate")(toDate.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction5(un))
    if (unAfter != null) __obj.updateDynamic("unAfter")(js.Any.fromFunction4(unAfter))
    if (unBefore != null) __obj.updateDynamic("unBefore")(js.Any.fromFunction4(unBefore))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (visibleRange != null) __obj.updateDynamic("visibleRange")(visibleRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITime]
  }
}

