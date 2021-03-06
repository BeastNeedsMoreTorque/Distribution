package typings.reactSwipeable.mod

import typings.reactSwipeable.reactSwipeableStrings.Down
import typings.reactSwipeable.reactSwipeableStrings.Left
import typings.reactSwipeable.reactSwipeableStrings.Right
import typings.reactSwipeable.reactSwipeableStrings.Up
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventData extends js.Object {
  var absX: Double
  var absY: Double
  var deltaX: Double
  var deltaY: Double
  var dir: Left | Right | Up | Down
  var event: MouseEvent | TouchEvent
  var first: Boolean
  var initial: Vector2
  var velocity: Double
}

object EventData {
  @scala.inline
  def apply(
    absX: Double,
    absY: Double,
    deltaX: Double,
    deltaY: Double,
    dir: Left | Right | Up | Down,
    event: MouseEvent | TouchEvent,
    first: Boolean,
    initial: Vector2,
    velocity: Double
  ): EventData = {
    val __obj = js.Dynamic.literal(absX = absX.asInstanceOf[js.Any], absY = absY.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventData]
  }
}

