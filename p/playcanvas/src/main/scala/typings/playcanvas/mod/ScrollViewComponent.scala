package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @constructor
  * @name pc.ScrollViewComponent
  * @extends pc.Component
  * @classdesc A ScrollViewComponent enables a group of entities to behave like a masked scrolling area, with optional horizontal and vertical scroll bars.
  * @description Create a new ScrollViewComponent.
  * @param {pc.ScrollViewComponentSystem} system The ComponentSystem that created this Component
  * @param {pc.Entity} entity The Entity that this Component is attached to.
  * @property {Boolean} horizontal Whether to enable horizontal scrolling.
  * @property {Boolean} vertical Whether to enable vertical scrolling.
  * @property {Number} scrollMode Specifies how the scroll view should behave when the user scrolls past the end of the content. Modes are defined as follows:
  * <ul>
  *     <li>{@link pc.SCROLL_MODE_CLAMP}: Content does not scroll any further than its bounds.</li>
  *     <li>{@link pc.SCROLL_MODE_BOUNCE}: Content scrolls past its bounds and then gently bounces back.</li>
  *     <li>{@link pc.SCROLL_MODE_INFINITE}: Content can scroll forever.</li>
  * </ul>
  * @property {Number} bounceAmount Controls how far the content should move before bouncing back.
  * @property {Number} friction Controls how freely the content should move if thrown, i.e. by flicking on a phone or by flinging the scroll wheel on a mouse. A value of 1 means that content will stop immediately; 0 means that content will continue moving forever (or until the bounds of the content are reached, depending on the scrollMode).
  * @property {Number} horizontalScrollbarVisibility Controls whether the horizontal scrollbar should be visible all the time, or only visible when the content exceeds the size of the viewport.
  * @property {Number} verticalScrollbarVisibility Controls whether the vertical scrollbar should be visible all the time, or only visible when the content exceeds the size of the viewport.
  * @property {pc.Entity} viewportEntity The entity to be used as the masked viewport area, within which the content will scroll. This entity must have an ElementGroup component.
  * @property {pc.Entity} contentEntity The entity which contains the scrolling content itself. This entity must have an Element component.
  * @property {pc.Entity} horizontalScrollbarEntity The entity to be used as the vertical scrollbar. This entity must have a Scrollbar component.
  * @property {pc.Entity} verticalScrollbarEntity The entity to be used as the vertical scrollbar. This entity must have a Scrollbar component.
  */
@JSImport("playcanvas", "ScrollViewComponent")
@js.native
class ScrollViewComponent protected ()
  extends typings.playcanvas.pc.ScrollViewComponent {
  def this(system: typings.playcanvas.pc.ScrollViewComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}

