package typings.paper.paperCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("paper/dist/paper-core", "Tween")
@js.native
class Tween protected ()
  extends typings.paper.paper.Tween {
  /** 
    * Creates a new tween.
    * 
    * @param object - the object to tween the properties on
    * @param from - the state at the start of the tweening
    * @param to - the state at the end of the tweening
    * @param duration - the duration of the tweening
    * @param easing - the type of the easing
    *     function or the easing function
    * @param start - whether to start tweening automatically
    */
  def this(`object`: js.Object, from: js.Object, to: js.Object, duration: Double) = this()
  def this(`object`: js.Object, from: js.Object, to: js.Object, duration: Double, easing: String) = this()
  def this(`object`: js.Object, from: js.Object, to: js.Object, duration: Double, easing: js.Function) = this()
  def this(
    `object`: js.Object,
    from: js.Object,
    to: js.Object,
    duration: Double,
    easing: String,
    start: Boolean
  ) = this()
  def this(
    `object`: js.Object,
    from: js.Object,
    to: js.Object,
    duration: Double,
    easing: js.Function,
    start: Boolean
  ) = this()
  /** 
    * The function to be called when the tween is updated. It receives an
    * object as its sole argument, containing the current progress of the
    * tweening and the factor calculated by the easing function.
    */
  /* CompleteClass */
  override var onUpdate: js.Function | Null = js.native
  /** 
    * Start tweening.
    */
  /* CompleteClass */
  override def start(): typings.paper.paper.Tween = js.native
  /** 
    * Stop tweening.
    */
  /* CompleteClass */
  override def stop(): typings.paper.paper.Tween = js.native
  /** 
    * Set a function that will be executed when the tween completes.
    * 
    * @param function - the function to execute when the tween
    *     completes
    */
  /* CompleteClass */
  override def `then`(callback: js.Function): typings.paper.paper.Tween = js.native
}

