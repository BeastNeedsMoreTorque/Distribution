package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * A PointText item represents a piece of typography in your Paper.js
  * project which starts from a certain point and extends by the amount of
  * characters contained in it.
  */
@js.native
trait PointText extends TextItem {
  /** 
    * The PointText's anchor point
    */
  var point: Point = js.native
}

