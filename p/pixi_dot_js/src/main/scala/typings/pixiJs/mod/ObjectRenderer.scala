package typings.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base for a common object renderer that can be used as a
  * system renderer plugin.
  *
  * @class
  * @extends PIXI.System
  * @memberof PIXI
  */
@JSImport("pixi.js", "ObjectRenderer")
@js.native
class ObjectRenderer protected ()
  extends typings.pixiJs.PIXI.ObjectRenderer {
  def this(renderer: typings.pixiJs.PIXI.Renderer) = this()
  /**
    * The renderer this manager works for.
    *
    * @member {PIXI.Renderer} PIXI.System#renderer
    */
  /* CompleteClass */
  override var renderer: typings.pixiJs.PIXI.Renderer = js.native
  /**
    * Generic destroy methods to be overridden by the subclass
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Stub method that should be used to empty the current
    * batch by rendering objects now.
    */
  /* CompleteClass */
  override def flush(): Unit = js.native
  /**
    * Keeps the object to render. It doesn't have to be
    * rendered immediately.
    *
    * @param {PIXI.DisplayObject} object - The object to render.
    */
  /* CompleteClass */
  override def render(`object`: typings.pixiJs.PIXI.DisplayObject): Unit = js.native
  /**
    * Stub method that initializes any state required before
    * rendering starts. It is different from the `prerender`
    * signal, which occurs every frame, in that it is called
    * whenever an object requests _this_ renderer specifically.
    */
  /* CompleteClass */
  override def start(): Unit = js.native
  /**
    * Stops the renderer. It should free up any state and
    * become dormant.
    */
  /* CompleteClass */
  override def stop(): Unit = js.native
}

