package typings.pEvent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AddRemoveListener[EventName /* <: java.lang.String | js.Symbol */, Arguments /* <: js.Array[_] */] = js.Function2[
    /* event */ EventName, 
    /* listener */ js.Function1[/* arguments */ Arguments, scala.Unit], 
    scala.Unit
  ]
  type FilterFunction[ElementType /* <: js.Array[_] */] = js.Function1[/* arguments */ ElementType, scala.Boolean]
  type TimeoutError = typings.pEvent.mod.TimeoutErrorClass
}
