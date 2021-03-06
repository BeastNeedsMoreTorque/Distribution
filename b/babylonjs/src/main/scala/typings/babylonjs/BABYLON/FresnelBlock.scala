package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FresnelBlock extends NodeMaterialBlock {
  /**
    * Gets the bias input component
    */
  def bias: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the fresnel output component
    */
  def fresnel: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the camera (or eye) position component
    */
  def power: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the view direction input component
    */
  def viewDirection: NodeMaterialConnectionPoint = js.native
  /**
    * Gets the world normal input component
    */
  def worldNormal: NodeMaterialConnectionPoint = js.native
}

