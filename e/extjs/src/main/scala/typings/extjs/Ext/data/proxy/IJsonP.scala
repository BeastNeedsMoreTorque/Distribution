package typings.extjs.Ext.data.proxy

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import typings.extjs.Ext.data.IBatch
import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.data.IOperation
import typings.extjs.Ext.data.IRequest
import typings.extjs.Ext.data.reader.IReader
import typings.extjs.Ext.data.writer.IWriter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonP extends IServer {
  /** [Method] Aborts the current server request if one is currently running */
  var abort: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var autoAppendParams: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var callbackKey: js.UndefOr[String] = js.undefined
  /** [Method] Encodes an array of records into a value suitable to be added to the request params as the recordParam parameter
    * @param records Ext.data.Model[] The records array
    * @returns Array An array of record data objects
    */
  var encodeRecords: js.UndefOr[js.Function1[/* records */ js.UndefOr[Array], Array]] = js.undefined
  /** [Config Option] (String) */
  var recordParam: js.UndefOr[String] = js.undefined
}

object IJsonP {
  @scala.inline
  def apply(
    abort: () => Unit = null,
    addEvents: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    afterRequest: (/* request */ js.UndefOr[IRequest], /* success */ js.UndefOr[Boolean]) => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    api: js.Any = null,
    autoAppendParams: js.UndefOr[Boolean] = js.undefined,
    batch: /* options */ js.UndefOr[js.Any] => IBatch = null,
    batchActions: js.UndefOr[Boolean] = js.undefined,
    batchOrder: String = null,
    buildRequest: /* operation */ js.UndefOr[IOperation] => IRequest = null,
    buildUrl: /* request */ js.UndefOr[IRequest] => String = null,
    cacheString: String = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    callbackKey: String = null,
    clearListeners: () => Unit = null,
    clearManagedListeners: () => Unit = null,
    config: js.Any = null,
    create: () => Unit = null,
    destroy: () => Unit = null,
    directionParam: String = null,
    doRequest: (/* operation */ js.UndefOr[IOperation], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    enableBubble: /* eventNames */ js.UndefOr[js.Any] => Unit = null,
    encodeFilters: /* filters */ js.UndefOr[Array] => String = null,
    encodeRecords: /* records */ js.UndefOr[Array] => Array = null,
    encodeSorters: /* sorters */ js.UndefOr[Array] => String = null,
    extend: String = null,
    extraParams: js.Any = null,
    filterParam: String = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => Boolean = null,
    fireEventArgs: (/* eventName */ js.UndefOr[String], /* args */ js.UndefOr[Array]) => Boolean = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getModel: () => IModel = null,
    getReader: () => IReader = null,
    getWriter: () => IWriter = null,
    groupDirectionParam: String = null,
    groupParam: String = null,
    hasListener: /* eventName */ js.UndefOr[String] => Boolean = null,
    hasListeners: js.Any = null,
    idParam: String = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IJsonP = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    isProxy: js.UndefOr[Boolean] = js.undefined,
    isSynchronous: js.UndefOr[Boolean] = js.undefined,
    limitParam: String = null,
    listeners: js.Any = null,
    mixins: js.Any = null,
    model: js.Any = null,
    mon: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    mun: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    noCache: js.UndefOr[Boolean] = js.undefined,
    on: (/* eventName */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => _ = null,
    pageParam: String = null,
    read: () => Unit = null,
    reader: js.Any = null,
    recordParam: String = null,
    relayEvents: (/* origin */ js.UndefOr[js.Any], /* events */ js.UndefOr[Array], /* prefix */ js.UndefOr[String]) => _ = null,
    removeListener: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    removeManagedListener: (/* item */ js.UndefOr[js.Any], /* ename */ js.UndefOr[js.Any], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Unit = null,
    resumeEvents: () => Unit = null,
    self: IClass = null,
    setExtraParam: (/* name */ js.UndefOr[String], /* value */ js.UndefOr[js.Any]) => Unit = null,
    setModel: (/* model */ js.UndefOr[js.Any], /* setOnStore */ js.UndefOr[Boolean]) => Unit = null,
    setReader: /* reader */ js.UndefOr[js.Any] => IReader = null,
    setWriter: /* writer */ js.UndefOr[js.Any] => IWriter = null,
    simpleGroupMode: js.UndefOr[Boolean] = js.undefined,
    simpleSortMode: js.UndefOr[Boolean] = js.undefined,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sortParam: String = null,
    startParam: String = null,
    statics: js.Any = null,
    suspendEvent: /* repeated */ js.Any => Unit = null,
    suspendEvents: /* queueSuspended */ js.UndefOr[Boolean] => Unit = null,
    timeout: js.UndefOr[Double] = js.undefined,
    un: (/* eventName */ js.UndefOr[String], /* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit = null,
    update: () => Unit = null,
    url: String = null,
    uses: Array = null,
    writer: js.Any = null
  ): IJsonP = {
    val __obj = js.Dynamic.literal()
    if (abort != null) __obj.updateDynamic("abort")(js.Any.fromFunction0(abort))
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (afterRequest != null) __obj.updateDynamic("afterRequest")(js.Any.fromFunction2(afterRequest))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (api != null) __obj.updateDynamic("api")(api.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAppendParams)) __obj.updateDynamic("autoAppendParams")(autoAppendParams.get.asInstanceOf[js.Any])
    if (batch != null) __obj.updateDynamic("batch")(js.Any.fromFunction1(batch))
    if (!js.isUndefined(batchActions)) __obj.updateDynamic("batchActions")(batchActions.get.asInstanceOf[js.Any])
    if (batchOrder != null) __obj.updateDynamic("batchOrder")(batchOrder.asInstanceOf[js.Any])
    if (buildRequest != null) __obj.updateDynamic("buildRequest")(js.Any.fromFunction1(buildRequest))
    if (buildUrl != null) __obj.updateDynamic("buildUrl")(js.Any.fromFunction1(buildUrl))
    if (cacheString != null) __obj.updateDynamic("cacheString")(cacheString.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (callbackKey != null) __obj.updateDynamic("callbackKey")(callbackKey.asInstanceOf[js.Any])
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction0(create))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (directionParam != null) __obj.updateDynamic("directionParam")(directionParam.asInstanceOf[js.Any])
    if (doRequest != null) __obj.updateDynamic("doRequest")(js.Any.fromFunction3(doRequest))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (encodeFilters != null) __obj.updateDynamic("encodeFilters")(js.Any.fromFunction1(encodeFilters))
    if (encodeRecords != null) __obj.updateDynamic("encodeRecords")(js.Any.fromFunction1(encodeRecords))
    if (encodeSorters != null) __obj.updateDynamic("encodeSorters")(js.Any.fromFunction1(encodeSorters))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (extraParams != null) __obj.updateDynamic("extraParams")(extraParams.asInstanceOf[js.Any])
    if (filterParam != null) __obj.updateDynamic("filterParam")(filterParam.asInstanceOf[js.Any])
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getModel != null) __obj.updateDynamic("getModel")(js.Any.fromFunction0(getModel))
    if (getReader != null) __obj.updateDynamic("getReader")(js.Any.fromFunction0(getReader))
    if (getWriter != null) __obj.updateDynamic("getWriter")(js.Any.fromFunction0(getWriter))
    if (groupDirectionParam != null) __obj.updateDynamic("groupDirectionParam")(groupDirectionParam.asInstanceOf[js.Any])
    if (groupParam != null) __obj.updateDynamic("groupParam")(groupParam.asInstanceOf[js.Any])
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners.asInstanceOf[js.Any])
    if (idParam != null) __obj.updateDynamic("idParam")(idParam.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isProxy)) __obj.updateDynamic("isProxy")(isProxy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSynchronous)) __obj.updateDynamic("isSynchronous")(isSynchronous.get.asInstanceOf[js.Any])
    if (limitParam != null) __obj.updateDynamic("limitParam")(limitParam.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (!js.isUndefined(noCache)) __obj.updateDynamic("noCache")(noCache.get.asInstanceOf[js.Any])
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (pageParam != null) __obj.updateDynamic("pageParam")(pageParam.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction0(read))
    if (reader != null) __obj.updateDynamic("reader")(reader.asInstanceOf[js.Any])
    if (recordParam != null) __obj.updateDynamic("recordParam")(recordParam.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setExtraParam != null) __obj.updateDynamic("setExtraParam")(js.Any.fromFunction2(setExtraParam))
    if (setModel != null) __obj.updateDynamic("setModel")(js.Any.fromFunction2(setModel))
    if (setReader != null) __obj.updateDynamic("setReader")(js.Any.fromFunction1(setReader))
    if (setWriter != null) __obj.updateDynamic("setWriter")(js.Any.fromFunction1(setWriter))
    if (!js.isUndefined(simpleGroupMode)) __obj.updateDynamic("simpleGroupMode")(simpleGroupMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(simpleSortMode)) __obj.updateDynamic("simpleSortMode")(simpleSortMode.get.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (sortParam != null) __obj.updateDynamic("sortParam")(sortParam.asInstanceOf[js.Any])
    if (startParam != null) __obj.updateDynamic("startParam")(startParam.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction0(update))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (writer != null) __obj.updateDynamic("writer")(writer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJsonP]
  }
}

