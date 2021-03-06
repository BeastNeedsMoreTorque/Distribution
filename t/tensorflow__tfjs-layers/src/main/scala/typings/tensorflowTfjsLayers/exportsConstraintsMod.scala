package typings.tensorflowTfjsLayers

import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.constraintsMod.MaxNormArgs
import typings.tensorflowTfjsLayers.constraintsMod.MinMaxNormArgs
import typings.tensorflowTfjsLayers.constraintsMod.UnitNormArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-layers/dist/exports_constraints", JSImport.Namespace)
@js.native
object exportsConstraintsMod extends js.Object {
  def maxNorm(args: MaxNormArgs): Constraint = js.native
  def minMaxNorm(config: MinMaxNormArgs): Constraint = js.native
  def nonNeg(): Constraint = js.native
  def unitNorm(args: UnitNormArgs): Constraint = js.native
}

