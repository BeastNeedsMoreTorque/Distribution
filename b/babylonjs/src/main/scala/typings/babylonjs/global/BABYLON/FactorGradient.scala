package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.FactorGradient")
@js.native
class FactorGradient ()
  extends typings.babylonjs.BABYLON.FactorGradient {
  /**
    * Gets or sets first associated factor
    */
  /* CompleteClass */
  override var factor1: Double = js.native
  /**
    * Gets or sets the gradient value (between 0 and 1)
    */
  /* CompleteClass */
  override var gradient: Double = js.native
  /**
    * Will get a number picked randomly between factor1 and factor2.
    * If factor2 is undefined then factor1 will be used
    * @returns the picked number
    */
  /* CompleteClass */
  override def getFactor(): Double = js.native
}

