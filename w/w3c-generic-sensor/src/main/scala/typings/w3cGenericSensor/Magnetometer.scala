package typings.w3cGenericSensor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Magnetometer: https://www.w3.org/TR/magnetometer/
@js.native
trait Magnetometer extends Sensor {
  val x: js.UndefOr[Double] = js.native
  val y: js.UndefOr[Double] = js.native
  val z: js.UndefOr[Double] = js.native
}

