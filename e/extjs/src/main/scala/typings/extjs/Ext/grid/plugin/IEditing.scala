package typings.extjs.Ext.grid.plugin

import typings.extjs.Ext.Array
import typings.extjs.Ext.IAbstractPlugin
import typings.extjs.Ext.IClass
import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.extjs.Ext.IClass because Already inherited
- typings.extjs.Ext.IBase because Already inherited
- typings.extjs.Ext.util.IObservable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined listeners, hasListeners, isObservable, addEvents, addListener, addManagedListener, clearListeners, clearManagedListeners, enableBubble, fireEvent, fireEventArgs, hasListener, mon, mun, on, relayEvents, removeListener, removeManagedListener, resumeEvent, resumeEvents, suspendEvent, suspendEvents, un */ trait IEditing extends IAbstractPlugin {
  /** [Method] Adds the specified events to the list of events which this Observable may fire
    * @param eventNames Object/String... Either an object with event names as properties with a value of true. For example: this.addEvents({  storeloaded: true,  storecleared: true });  Or any number of event names as separate parameters. For example: this.addEvents('storeloaded', 'storecleared');
    */
  var addEvents: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Appends an event handler to this object
    * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  var addListener: js.UndefOr[
    js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Adds listeners to any Observable object or Ext Element which are automatically removed when this Component is destr
    * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    * @param options Object If the ename parameter was an event name, this is the addListener options.
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  var addManagedListener: js.UndefOr[
    js.Function5[
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Cancels any active edit that is in progress  */
  var cancelEdit: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Removes all listeners for this object including the managed listeners */
  var clearListeners: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Removes all managed listeners for this object  */
  var clearManagedListeners: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Number) */
  var clicksToEdit: js.UndefOr[Double] = js.undefined
  /** [Method] Completes the edit if there is an active edit in progress  */
  var completeEdit: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (Boolean) */
  var editing: js.UndefOr[Boolean] = js.undefined
  /** [Method] Enables events fired by this Observable to bubble up an owner hierarchy by calling this getBubbleTarget  if present
    * @param eventNames String/String[] The event name to bubble, or an Array of event names.
    */
  var enableBubble: js.UndefOr[js.Function1[js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Fires the specified event with the passed parameters minus the event name plus the options object passed to addList
    * @param eventName String The name of the event to fire.
    * @param args Object... Variable number of parameters are passed to handlers.
    * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
    */
  var fireEvent: js.UndefOr[js.Function2[/* eventName */ String, /* repeated */ js.Any, Boolean]] = js.undefined
  /** [Method] Fires the specified event with the passed parameter list
    * @param eventName String The name of the event to fire.
    * @param args Object[] An array of parameters which are passed to handlers.
    * @returns Boolean returns false if any of the handlers return false otherwise it returns true.
    */
  var fireEventArgs: js.UndefOr[js.Function2[js.UndefOr[String], js.UndefOr[Array], Boolean]] = js.undefined
  /** [Method] Checks to see if this object has any listeners for a specified event or whether the event bubbles
    * @param eventName String The name of the event to check for
    * @returns Boolean true if the event is being listened for or bubbles, else false
    */
  var hasListener: js.UndefOr[js.Function1[js.UndefOr[String], Boolean]] = js.undefined
  /** [Property] (Object) */
  var hasListeners: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var isObservable: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var listeners: js.UndefOr[js.Any] = js.undefined
  /** [Method] Shorthand for addManagedListener
    * @param item Ext.util.Observable/Ext.Element The item to which to add a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    * @param options Object If the ename parameter was an event name, this is the addListener options.
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.mon({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  var mon: js.UndefOr[
    js.Function5[
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      _
    ]
  ] = js.undefined
  /** [Method] Shorthand for removeManagedListener
    * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    */
  var mun: js.UndefOr[
    js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Shorthand for addListener
    * @param eventName String/Object The name of the event to listen for. May also be an object who's property names are event names.
    * @param fn Function The method the event invokes, or if scope is specified, the name* of the method within the specified scope. Will be called with arguments given to Ext.util.Observable.fireEvent plus the options parameter described below.
    * @param scope Object The scope (this reference) in which the handler function is executed. If omitted, defaults to the object which fired the event.
    * @param options Object An object containing handler configuration.  Note: Unlike in ExtJS 3.x, the options object will also be passed as the last argument to every event handler.  This object may contain any of the following properties:
    * @returns Object Only when the destroyable option is specified.  A Destroyable object. An object which implements the destroy method which removes all listeners added in this call. For example:  this.btnListeners = = myButton.on({  destroyable: true  mouseover:  function() { console.log('mouseover'); },  mouseout: function() { console.log('mouseout'); },  click:  function() { console.log('click'); } }); And when those listeners need to be removed:  Ext.destroy(this.btnListeners); or  this.btnListeners.destroy();
    */
  var on: js.UndefOr[
    js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], _]
  ] = js.undefined
  /** [Method] Relays selected events from the specified Observable as if the events were fired by this
    * @param origin Object The Observable whose events this object is to relay.
    * @param events String[] Array of event names to relay.
    * @param prefix String A common prefix to prepend to the event names. For example: this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Now the grid will forward 'load' and 'clear' events of store as 'storeload' and 'storeclear'.
    * @returns Object A Destroyable object. An object which implements the destroy method which, when destroyed, removes all relayers. For example: this.storeRelayers = this.relayEvents(this.getStore(), ['load', 'clear'], 'store');  Can be undone by calling Ext.destroy(this.storeRelayers);  or this.store.relayers.destroy();
    */
  var relayEvents: js.UndefOr[js.Function3[js.UndefOr[js.Any], js.UndefOr[Array], js.UndefOr[String], _]] = js.undefined
  /** [Method] Removes an event handler
    * @param eventName String The type of event the handler was associated with.
    * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
    */
  var removeListener: js.UndefOr[js.Function3[js.UndefOr[String], js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Removes listeners that were added by the mon method
    * @param item Ext.util.Observable/Ext.Element The item from which to remove a listener/listeners.
    * @param ename Object/String The event name, or an object containing event name properties.
    * @param fn Function If the ename parameter was an event name, this is the handler function.
    * @param scope Object If the ename parameter was an event name, this is the scope (this reference) in which the handler function is executed.
    */
  var removeManagedListener: js.UndefOr[
    js.Function4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Resumes firing of the named event s
    * @param eventName String... Multiple event names to resume.
    */
  var resumeEvent: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  /** [Method] Resumes firing events see suspendEvents */
  var resumeEvents: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Starts editing the specified record using the specified Column definition to define which field is being edited
    * @param record Ext.data.Model/Number The Store data record which backs the row to be edited, or index of the record in Store.
    * @param columnHeader Ext.grid.column.Column/Number The Column object defining the column to be edited, or index of the column.
    */
  var startEdit: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[js.Any], /* columnHeader */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Suspends firing of the named event s
    * @param eventName String... Multiple event names to suspend.
    */
  var suspendEvent: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  /** [Method] Suspends the firing of all events
    * @param queueSuspended Boolean Pass as true to queue up suspended events to be fired after the resumeEvents call instead of discarding all suspended events.
    */
  var suspendEvents: js.UndefOr[js.Function1[js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (String) */
  var triggerEvent: js.UndefOr[String] = js.undefined
  /** [Method] Shorthand for removeListener
    * @param eventName String The type of event the handler was associated with.
    * @param fn Function The handler to remove. This must be a reference to the function passed into the Ext.util.Observable.addListener call.
    * @param scope Object The scope originally specified for the handler. It must be the same as the scope argument specified in the original call to Ext.util.Observable.addListener or the listener will not be removed.
    */
  var un: js.UndefOr[js.Function3[js.UndefOr[String], js.UndefOr[js.Any], js.UndefOr[js.Any], Unit]] = js.undefined
}

object IEditing {
  @scala.inline
  def apply(
    addEvents: js.UndefOr[js.Any] => Unit = null,
    addListener: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => _ = null,
    addManagedListener: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => _ = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    cancelEdit: () => Unit = null,
    clearListeners: () => Unit = null,
    clearManagedListeners: () => Unit = null,
    clicksToEdit: js.UndefOr[Double] = js.undefined,
    clonePlugin: /* overrideCfg */ js.UndefOr[js.Any] => Unit = null,
    completeEdit: () => Unit = null,
    config: js.Any = null,
    destroy: () => Unit = null,
    disable: () => Unit = null,
    editing: js.UndefOr[Boolean] = js.undefined,
    enable: () => Unit = null,
    enableBubble: js.UndefOr[js.Any] => Unit = null,
    extend: String = null,
    fireEvent: (/* eventName */ String, /* repeated */ js.Any) => Boolean = null,
    fireEventArgs: (js.UndefOr[String], js.UndefOr[Array]) => Boolean = null,
    getCmp: () => IComponent = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    hasListener: js.UndefOr[String] => Boolean = null,
    hasListeners: js.Any = null,
    inheritableStatics: js.Any = null,
    init: /* client */ js.UndefOr[IComponent] => Unit = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IEditing = null,
    isObservable: js.UndefOr[Boolean] = js.undefined,
    isPlugin: js.UndefOr[Boolean] = js.undefined,
    listeners: js.Any = null,
    mixins: js.Any = null,
    mon: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => _ = null,
    mun: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit = null,
    on: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => _ = null,
    pluginId: String = null,
    relayEvents: (js.UndefOr[js.Any], js.UndefOr[Array], js.UndefOr[String]) => _ = null,
    removeListener: (js.UndefOr[String], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit = null,
    removeManagedListener: (js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit = null,
    requires: Array = null,
    resumeEvent: /* repeated */ js.Any => Unit = null,
    resumeEvents: () => Unit = null,
    self: IClass = null,
    setCmp: /* cmp */ js.UndefOr[IComponent] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    startEdit: (/* record */ js.UndefOr[js.Any], /* columnHeader */ js.UndefOr[js.Any]) => Unit = null,
    statics: js.Any = null,
    suspendEvent: /* repeated */ js.Any => Unit = null,
    suspendEvents: js.UndefOr[Boolean] => Unit = null,
    triggerEvent: String = null,
    un: (js.UndefOr[String], js.UndefOr[js.Any], js.UndefOr[js.Any]) => Unit = null,
    uses: Array = null
  ): IEditing = {
    val __obj = js.Dynamic.literal()
    if (addEvents != null) __obj.updateDynamic("addEvents")(js.Any.fromFunction1(addEvents))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (addManagedListener != null) __obj.updateDynamic("addManagedListener")(js.Any.fromFunction5(addManagedListener))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (cancelEdit != null) __obj.updateDynamic("cancelEdit")(js.Any.fromFunction0(cancelEdit))
    if (clearListeners != null) __obj.updateDynamic("clearListeners")(js.Any.fromFunction0(clearListeners))
    if (clearManagedListeners != null) __obj.updateDynamic("clearManagedListeners")(js.Any.fromFunction0(clearManagedListeners))
    if (!js.isUndefined(clicksToEdit)) __obj.updateDynamic("clicksToEdit")(clicksToEdit.get.asInstanceOf[js.Any])
    if (clonePlugin != null) __obj.updateDynamic("clonePlugin")(js.Any.fromFunction1(clonePlugin))
    if (completeEdit != null) __obj.updateDynamic("completeEdit")(js.Any.fromFunction0(completeEdit))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (disable != null) __obj.updateDynamic("disable")(js.Any.fromFunction0(disable))
    if (!js.isUndefined(editing)) __obj.updateDynamic("editing")(editing.get.asInstanceOf[js.Any])
    if (enable != null) __obj.updateDynamic("enable")(js.Any.fromFunction0(enable))
    if (enableBubble != null) __obj.updateDynamic("enableBubble")(js.Any.fromFunction1(enableBubble))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fireEvent != null) __obj.updateDynamic("fireEvent")(js.Any.fromFunction2(fireEvent))
    if (fireEventArgs != null) __obj.updateDynamic("fireEventArgs")(js.Any.fromFunction2(fireEventArgs))
    if (getCmp != null) __obj.updateDynamic("getCmp")(js.Any.fromFunction0(getCmp))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (hasListener != null) __obj.updateDynamic("hasListener")(js.Any.fromFunction1(hasListener))
    if (hasListeners != null) __obj.updateDynamic("hasListeners")(hasListeners.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (!js.isUndefined(isObservable)) __obj.updateDynamic("isObservable")(isObservable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isPlugin)) __obj.updateDynamic("isPlugin")(isPlugin.get.asInstanceOf[js.Any])
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (mon != null) __obj.updateDynamic("mon")(js.Any.fromFunction5(mon))
    if (mun != null) __obj.updateDynamic("mun")(js.Any.fromFunction4(mun))
    if (on != null) __obj.updateDynamic("on")(js.Any.fromFunction4(on))
    if (pluginId != null) __obj.updateDynamic("pluginId")(pluginId.asInstanceOf[js.Any])
    if (relayEvents != null) __obj.updateDynamic("relayEvents")(js.Any.fromFunction3(relayEvents))
    if (removeListener != null) __obj.updateDynamic("removeListener")(js.Any.fromFunction3(removeListener))
    if (removeManagedListener != null) __obj.updateDynamic("removeManagedListener")(js.Any.fromFunction4(removeManagedListener))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (resumeEvent != null) __obj.updateDynamic("resumeEvent")(js.Any.fromFunction1(resumeEvent))
    if (resumeEvents != null) __obj.updateDynamic("resumeEvents")(js.Any.fromFunction0(resumeEvents))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setCmp != null) __obj.updateDynamic("setCmp")(js.Any.fromFunction1(setCmp))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (startEdit != null) __obj.updateDynamic("startEdit")(js.Any.fromFunction2(startEdit))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (suspendEvent != null) __obj.updateDynamic("suspendEvent")(js.Any.fromFunction1(suspendEvent))
    if (suspendEvents != null) __obj.updateDynamic("suspendEvents")(js.Any.fromFunction1(suspendEvents))
    if (triggerEvent != null) __obj.updateDynamic("triggerEvent")(triggerEvent.asInstanceOf[js.Any])
    if (un != null) __obj.updateDynamic("un")(js.Any.fromFunction3(un))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditing]
  }
}

