package typings.jupyterlabObservables.observablestringMod

import typings.jupyterlabObservables.modeldbMod.ObservableType
import typings.jupyterlabObservables.observablestringMod.IObservableString.IChangedArgs
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/observables/lib/observablestring", "ObservableString")
@js.native
/**
  * Construct a new observable string.
  */
class ObservableString () extends IObservableString {
  def this(initialText: String) = this()
  var _changed: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _text: js.Any = js.native
  /**
    * A signal emitted when the string has changed.
    */
  /* CompleteClass */
  override val changed: ISignal[this.type, IChangedArgs] = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * The value of the string.
    */
  /* CompleteClass */
  override var text: String = js.native
  /**
    * The type of this object.
    */
  /* CompleteClass */
  override val `type`: ObservableType = js.native
  /**
    * The type of the Observable.
    */
  /* CompleteClass */
  @JSName("type")
  override var type_IObservableString_ : typings.jupyterlabObservables.jupyterlabObservablesStrings.String = js.native
  /**
    * A signal emitted when the string has changed.
    */
  @JSName("changed")
  def changed_MObservableString: ISignal[this.type, IChangedArgs] = js.native
  /**
    * Set the ObservableString to an empty string.
    */
  /* CompleteClass */
  override def clear(): Unit = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Insert a substring.
    *
    * @param index - The starting index.
    *
    * @param text - The substring to insert.
    */
  /* CompleteClass */
  override def insert(index: Double, text: String): Unit = js.native
  /**
    * Test whether the string has been disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MObservableString: Boolean = js.native
  /**
    * Remove a substring.
    *
    * @param start - The starting index.
    *
    * @param end - The ending index.
    */
  /* CompleteClass */
  override def remove(start: Double, end: Double): Unit = js.native
  /**
    * Get the value of the string.
    */
  @JSName("text")
  def text_MObservableString: String = js.native
  /**
    * Set the value of the string.
    */
  @JSName("text")
  def text_MObservableString(value: String): js.Any = js.native
  /**
    * The type of the Observable.
    */
  @JSName("type")
  def type_MObservableString: typings.jupyterlabObservables.jupyterlabObservablesStrings.String = js.native
}

