package typings.w3cGenericSensor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Gyroscope: https://www.w3.org/TR/gyroscope/
@js.native
trait Gyroscope extends Sensor {
  val x: js.UndefOr[Double] = js.native
  val y: js.UndefOr[Double] = js.native
  val z: js.UndefOr[Double] = js.native
}

