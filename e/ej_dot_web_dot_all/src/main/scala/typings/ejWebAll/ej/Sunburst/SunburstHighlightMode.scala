package typings.ejWebAll.ej.Sunburst

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstHighlightMode extends js.Object

@JSGlobal("ej.Sunburst.SunburstHighlightMode")
@js.native
object SunburstHighlightMode extends js.Object {
  //string
  @js.native
  sealed trait All extends SunburstHighlightMode
  
  //string
  @js.native
  sealed trait Child extends SunburstHighlightMode
  
  //string
  @js.native
  sealed trait Parent extends SunburstHighlightMode
  
  //string
  @js.native
  sealed trait Point extends SunburstHighlightMode
  
}

