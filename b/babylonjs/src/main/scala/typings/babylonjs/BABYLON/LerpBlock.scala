package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LerpBlock extends NodeMaterialBlock {
  /**
    * Gets the gradient operand input component
    */
  def gradient: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the left operand input component
    */
  def left: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the output component
    */
  def output: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the right operand input component
    */
  def right: NodeMaterialConnectionPoint = js.native
}

