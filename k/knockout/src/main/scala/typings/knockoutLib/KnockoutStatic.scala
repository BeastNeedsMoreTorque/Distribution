package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/////////////////////////////////
@js.native
trait KnockoutStatic extends js.Object {
  var bindingHandlers: KnockoutBindingHandlers = js.native
  /////////////////////////////////
  var bindingProvider: Anon_InstanceKnockoutBindingProvider = js.native
  var components: KnockoutComponents = js.native
  /**
    * Get information about the current computed property during the execution of a computed observable’s evaluator function.
    */
  var computedContext: KnockoutComputedContext = js.native
  @JSName("computed")
  var computed_Original: KnockoutComputedStatic = js.native
  var expressionRewriting: Anon_AllBindings = js.native
  var extenders: KnockoutExtenders = js.native
  //////////////////////////////////
  // jqueryTmplTemplateEngine.js
  //////////////////////////////////
  var jqueryTmplTemplateEngine: Anon_AddTemplate = js.native
  var memoization: KnockoutMemoization = js.native
  //////////////////////////////////
  // nativeTemplateEngine.js
  //////////////////////////////////
  var nativeTemplateEngine: Anon_Instance = js.native
  @JSName("observableArray")
  var observableArray_Original: KnockoutObservableArrayStatic = js.native
  @JSName("observable")
  var observable_Original: KnockoutObservableStatic = js.native
  /////////////////////////////////
  // utils.js
  /////////////////////////////////
  var onError: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.native
  /////////////////////////////////
  // options.js
  /////////////////////////////////
  var options: Anon_DeferUpdates = js.native
  /////////////////////////////////
  // selectExtensions.js
  /////////////////////////////////
  var selectExtensions: Anon_AllowUnset = js.native
  var subscribable: KnockoutSubscribableStatic = js.native
  /////////////////////////////////
  // tasks.js
  /////////////////////////////////
  var tasks: KnockoutTasks = js.native
  //////////////////////////////////
  // templateEngine.js
  //////////////////////////////////
  var templateEngine: Anon_KnockoutTemplateEngine = js.native
  //////////////////////////////////
  // templateRewriting.js
  //////////////////////////////////
  var templateRewriting: Anon_ApplyMemoizedBindingsToNextSibling = js.native
  //////////////////////////////////
  // templateSources.js
  //////////////////////////////////
  var templateSources: KnockoutTemplateSources = js.native
  var utils: KnockoutUtils = js.native
  var virtualElements: KnockoutVirtualElements = js.native
  def applyBindingAccessorsToNode(
    node: stdLib.Node,
    bindings: js.Function2[/* bindingContext */ KnockoutBindingContext, /* node */ stdLib.Node, js.Object],
    bindingContext: KnockoutBindingContext
  ): scala.Unit = js.native
  def applyBindingAccessorsToNode(
    node: stdLib.Node,
    bindings: js.Function2[/* bindingContext */ KnockoutBindingContext, /* node */ stdLib.Node, js.Object],
    viewModel: js.Any
  ): scala.Unit = js.native
  def applyBindingAccessorsToNode(node: stdLib.Node, bindings: js.Object, bindingContext: KnockoutBindingContext): scala.Unit = js.native
  def applyBindingAccessorsToNode(node: stdLib.Node, bindings: js.Object, viewModel: js.Any): scala.Unit = js.native
  def applyBindings(): scala.Unit = js.native
  def applyBindings(viewModelOrBindingContext: js.Any): scala.Unit = js.native
  def applyBindings(viewModelOrBindingContext: js.Any, rootNode: js.Any): scala.Unit = js.native
  def applyBindingsToDescendants(viewModelOrBindingContext: js.Any, rootNode: js.Any): scala.Unit = js.native
  def applyBindingsToNode(node: stdLib.Node, bindings: js.Any): js.Any = js.native
  def applyBindingsToNode(node: stdLib.Node, bindings: js.Any, viewModelOrBindingContext: js.Any): js.Any = js.native
  /**
    * Used internally by Knockout to clean up data/computeds that it created related to the element. It does not remove any event handlers added by bindings.
    * @param node Node to be cleaned.
    */
  def cleanNode(node: stdLib.Node): stdLib.Node = js.native
  /**
    * Creates computed observable.
    */
  def computed[T](): KnockoutComputed[T] = js.native
  /**
    * Creates computed observable.
    * @param evaluatorFunction Function that computes the observable value.
    * @param context Defines the value of 'this' when evaluating the computed observable.
    * @param options An object with further properties for the computed observable.
    */
  def computed[T](evaluatorFunction: js.Function0[T]): KnockoutComputed[T] = js.native
  def computed[T](evaluatorFunction: js.Function0[T], context: js.Any): KnockoutComputed[T] = js.native
  def computed[T](evaluatorFunction: js.Function0[T], context: js.Any, options: KnockoutComputedOptions[T]): KnockoutComputed[T] = js.native
  /**
    * Creates computed observable.
    * @param options An object that defines the computed observable options and behavior.
    * @param context Defines the value of 'this' when evaluating the computed observable.
    */
  def computed[T](options: KnockoutComputedDefine[T]): KnockoutComputed[T] = js.native
  def computed[T](options: KnockoutComputedDefine[T], context: js.Any): KnockoutComputed[T] = js.native
  /**
    * Returns the entire binding context that was available to the DOM element.
    * @param node Html node that contains the binding context.
    */
  def contextFor(node: stdLib.Node): js.Any = js.native
  /**
    * Returns the data that was available for binding against the element.
    * @param node Html node that contains the binding context.
    */
  def dataFor(node: stdLib.Node): js.Any = js.native
  def getBindingHandler(handler: java.lang.String): KnockoutBindingHandler[_, _, _] = js.native
  /**
    * Executes a callback function inside a computed observable, without creating a dependecy between it and the observables inside the function.
    * @param callback Function to be called.
    * @param callbackTarget Defines the value of 'this' in the callback function.
    * @param callbackArgs Arguments for the callback Function.
    */
  def ignoreDependencies[T](callback: js.Function0[T]): T = js.native
  def ignoreDependencies[T](callback: js.Function0[T], callbackTarget: js.Any): T = js.native
  def ignoreDependencies[T](callback: js.Function0[T], callbackTarget: js.Any, callbackArgs: js.Any): T = js.native
  /**
    * Determine if argument is a computed observable.
    * @param instance Object to be checked.
    */
  def isComputed(instance: js.Any): /* is knockout.KnockoutComputed<any> */ scala.Boolean = js.native
  def isComputed[T](instance: T): /* is knockout.KnockoutComputed<T> */ scala.Boolean = js.native
  /**
    * Determine if argument is a computed observable.
    * @param instance Object to be checked.
    */
  def isComputed[T](instance: KnockoutObservable[T]): /* is knockout.KnockoutComputed<T> */ scala.Boolean = js.native
  /**
    * Determine if argument is an observable. Returns true for observables, observable arrays, and all computed observables.
    * @param instance Object to be checked.
    */
  def isObservable(instance: js.Any): /* is knockout.KnockoutObservable<any> */ scala.Boolean = js.native
  def isObservable[T](instance: T): /* is knockout.KnockoutObservable<T> */ scala.Boolean = js.native
  /**
    * Determine if argument is an observable. Returns true for observables, observable arrays, and all computed observables.
    * @param instance Object to be checked.
    */
  def isObservable[T](instance: KnockoutObservable[T]): /* is knockout.KnockoutObservable<T> */ scala.Boolean = js.native
  /**
    * Evaluates if instance is a KnockoutSubscribable.
    * @param instance Instance to be evaluated.
    */
  def isSubscribable(instance: js.Any): /* is knockout.KnockoutSubscribable<any> */ scala.Boolean = js.native
  /**
    * Determine if argument is a writable observable. Returns true for observables, observable arrays, and writable computed observables.
    * @param instance Object to be checked.
    */
  def isWriteableObservable(instance: js.Any): /* is knockout.KnockoutObservable<any> */ scala.Boolean = js.native
  def isWriteableObservable[T](instance: T): /* is knockout.KnockoutObservable<T> */ scala.Boolean = js.native
  /**
    * Determine if argument is a writable observable. Returns true for observables, observable arrays, and writable computed observables.
    * @param instance Object to be checked.
    */
  def isWriteableObservable[T](instance: KnockoutObservable[T]): /* is knockout.KnockoutObservable<T> */ scala.Boolean = js.native
  def observable[T](): KnockoutObservable[T | scala.Null] = js.native
  def observable[T](value: T): KnockoutObservable[T] = js.native
  def observableArray[T](): KnockoutObservableArray[T] = js.native
  def observableArray[T](value: js.Array[T]): KnockoutObservableArray[T] = js.native
  /**
    * Creates a pure computed observable.
    * @param evaluatorFunction Function that computes the observable value.
    * @param context Defines the value of 'this' when evaluating the computed observable.
    */
  def pureComputed[T](evaluatorFunction: js.Function0[T]): KnockoutComputed[T] = js.native
  def pureComputed[T](evaluatorFunction: js.Function0[T], context: js.Any): KnockoutComputed[T] = js.native
  /**
    * Creates a pure computed observable.
    * @param options An object that defines the computed observable options and behavior.
    * @param context Defines the value of 'this' when evaluating the computed observable.
    */
  def pureComputed[T](options: KnockoutComputedDefine[T]): KnockoutComputed[T] = js.native
  def pureComputed[T](options: KnockoutComputedDefine[T], context: js.Any): KnockoutComputed[T] = js.native
  /**
    * Removes a node from the DOM.
    * @param node Node to be removed.
    */
  def removeNode(node: stdLib.Node): scala.Unit = js.native
  def renderTemplate(template: java.lang.String, viewModel: js.Any): js.Any = js.native
  def renderTemplate(template: java.lang.String, viewModel: js.Any, options: js.Any): js.Any = js.native
  def renderTemplate(template: java.lang.String, viewModel: js.Any, options: js.Any, target: js.Any): js.Any = js.native
  def renderTemplate(template: java.lang.String, viewModel: js.Any, options: js.Any, target: js.Any, renderMode: js.Any): js.Any = js.native
  def renderTemplate(
    template: js.Any,
    dataOrBindingContext: js.Any,
    options: js.Object,
    targetNodeOrNodeArray: js.Array[stdLib.Node],
    renderMode: java.lang.String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Any,
    dataOrBindingContext: js.Any,
    options: js.Object,
    targetNodeOrNodeArray: stdLib.Node,
    renderMode: java.lang.String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Any,
    dataOrBindingContext: KnockoutBindingContext,
    options: js.Object,
    targetNodeOrNodeArray: js.Array[stdLib.Node],
    renderMode: java.lang.String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Any,
    dataOrBindingContext: KnockoutBindingContext,
    options: js.Object,
    targetNodeOrNodeArray: stdLib.Node,
    renderMode: java.lang.String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Function,
    dataOrBindingContext: js.Any,
    options: js.Object,
    targetNodeOrNodeArray: js.Array[stdLib.Node],
    renderMode: java.lang.String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Function,
    dataOrBindingContext: js.Any,
    options: js.Object,
    targetNodeOrNodeArray: stdLib.Node,
    renderMode: java.lang.String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Function,
    dataOrBindingContext: KnockoutBindingContext,
    options: js.Object,
    targetNodeOrNodeArray: js.Array[stdLib.Node],
    renderMode: java.lang.String
  ): js.Any = js.native
  def renderTemplate(
    template: js.Function,
    dataOrBindingContext: KnockoutBindingContext,
    options: js.Object,
    targetNodeOrNodeArray: stdLib.Node,
    renderMode: java.lang.String
  ): js.Any = js.native
  def renderTemplate(template: js.Function, viewModel: js.Any): js.Any = js.native
  def renderTemplate(template: js.Function, viewModel: js.Any, options: js.Any): js.Any = js.native
  def renderTemplate(template: js.Function, viewModel: js.Any, options: js.Any, target: js.Any): js.Any = js.native
  def renderTemplate(template: js.Function, viewModel: js.Any, options: js.Any, target: js.Any, renderMode: js.Any): js.Any = js.native
  def renderTemplateForEach(
    template: js.Any,
    arrayOrObservableArray: js.Array[_],
    options: js.Object,
    targetNode: stdLib.Node,
    parentBindingContext: KnockoutBindingContext
  ): js.Any = js.native
  def renderTemplateForEach(
    template: js.Any,
    arrayOrObservableArray: KnockoutObservable[_],
    options: js.Object,
    targetNode: stdLib.Node,
    parentBindingContext: KnockoutBindingContext
  ): js.Any = js.native
  def renderTemplateForEach(
    template: js.Function,
    arrayOrObservableArray: js.Array[_],
    options: js.Object,
    targetNode: stdLib.Node,
    parentBindingContext: KnockoutBindingContext
  ): js.Any = js.native
  def renderTemplateForEach(
    template: js.Function,
    arrayOrObservableArray: KnockoutObservable[_],
    options: js.Object,
    targetNode: stdLib.Node,
    parentBindingContext: KnockoutBindingContext
  ): js.Any = js.native
  def setTemplateEngine(): scala.Unit = js.native
  //////////////////////////////////
  // templating.js
  //////////////////////////////////
  def setTemplateEngine(templateEngine: KnockoutNativeTemplateEngine): scala.Unit = js.native
  /**
    * Clones object substituting for each observable the current value of that observable.
    * @param viewModel Object with observables to be converted.
    */
  def toJS(viewModel: js.Any): js.Any = js.native
  /**
    * Clones object substituting each observable for it's underlying value. Uses browser JSON.stringify internally to stringify the result.
    * @param viewModel Object with observables to be converted.
    * @param replacer A Function or array of names that alters the behavior of the stringification process.
    * @param space Used to insert white space into the output JSON string for readability purposes.
    */
  def toJSON(viewModel: js.Any): java.lang.String = js.native
  def toJSON(viewModel: js.Any, replacer: js.Array[java.lang.String | scala.Double]): java.lang.String = js.native
  def toJSON(viewModel: js.Any, replacer: js.Array[java.lang.String | scala.Double], space: java.lang.String): java.lang.String = js.native
  def toJSON(viewModel: js.Any, replacer: js.Array[java.lang.String | scala.Double], space: scala.Double): java.lang.String = js.native
  def toJSON(viewModel: js.Any, replacer: js.Function): java.lang.String = js.native
  def toJSON(viewModel: js.Any, replacer: js.Function, space: java.lang.String): java.lang.String = js.native
  def toJSON(viewModel: js.Any, replacer: js.Function, space: scala.Double): java.lang.String = js.native
  def unwrap[T](instance: T): T = js.native
  def unwrap[T](instance: js.Array[T]): js.Array[T] = js.native
  /**
    * Returns the underlying value of the Knockout Observable or in case of plain js object, return the object. Use this to easily accept both observable and plain values.
    * @param instance observable to be unwraped if it's an Observable.
    */
  def unwrap[T](instance: KnockoutObservable[T]): T = js.native
  /**
    * Gets the array inside the KnockoutObservableArray.
    * @param instance observable to be unwraped.
    */
  def unwrap[T](instance: KnockoutObservableArray[T]): js.Array[T] = js.native
}

