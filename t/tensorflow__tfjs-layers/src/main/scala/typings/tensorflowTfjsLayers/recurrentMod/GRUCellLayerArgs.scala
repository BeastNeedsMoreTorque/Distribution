package typings.tensorflowTfjsLayers.recurrentMod

import typings.tensorflowTfjsCore.distTypesMod.DataType
import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsLayers.activationConfigMod.ActivationIdentifier
import typings.tensorflowTfjsLayers.constraintsMod.Constraint
import typings.tensorflowTfjsLayers.constraintsMod.ConstraintIdentifier
import typings.tensorflowTfjsLayers.initializersMod.Initializer
import typings.tensorflowTfjsLayers.initializersMod.InitializerIdentifier
import typings.tensorflowTfjsLayers.kerasFormatCommonMod.Shape
import typings.tensorflowTfjsLayers.regularizersMod.Regularizer
import typings.tensorflowTfjsLayers.regularizersMod.RegularizerIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GRUCellLayerArgs extends SimpleRNNCellLayerArgs {
  /**
    * Implementation mode, either 1 or 2.
    *
    * Mode 1 will structure its operations as a larger number of
    *   smaller dot products and additions.
    *
    * Mode 2 will batch them into fewer, larger operations. These modes will
    * have different performance profiles on different hardware and
    * for different applications.
    *
    * Note: For superior performance, TensorFlow.js always uses implementation
    * 2, regardless of the actual value of this configuration field.
    */
  var implementation: js.UndefOr[Double] = js.undefined
  /**
    * Activation function to use for the recurrent step.
    *
    * Defaults to hard sigmoid (`hardSigmoid`).
    *
    * If `null`, no activation is applied.
    */
  var recurrentActivation: js.UndefOr[ActivationIdentifier] = js.undefined
}

object GRUCellLayerArgs {
  @scala.inline
  def apply(
    units: Double,
    activation: ActivationIdentifier = null,
    batchInputShape: Shape = null,
    batchSize: js.UndefOr[Double] = js.undefined,
    biasConstraint: ConstraintIdentifier | Constraint = null,
    biasInitializer: InitializerIdentifier | Initializer = null,
    biasRegularizer: RegularizerIdentifier | Regularizer = null,
    dropout: js.UndefOr[Double] = js.undefined,
    dtype: DataType = null,
    implementation: js.UndefOr[Double] = js.undefined,
    inputDType: DataType = null,
    inputShape: Shape = null,
    kernelConstraint: ConstraintIdentifier | Constraint = null,
    kernelInitializer: InitializerIdentifier | Initializer = null,
    kernelRegularizer: RegularizerIdentifier | Regularizer = null,
    name: String = null,
    recurrentActivation: ActivationIdentifier = null,
    recurrentConstraint: ConstraintIdentifier | Constraint = null,
    recurrentDropout: js.UndefOr[Double] = js.undefined,
    recurrentInitializer: InitializerIdentifier | Initializer = null,
    recurrentRegularizer: RegularizerIdentifier | Regularizer = null,
    trainable: js.UndefOr[Boolean] = js.undefined,
    useBias: js.UndefOr[Boolean] = js.undefined,
    weights: js.Array[Tensor[Rank]] = null
  ): GRUCellLayerArgs = {
    val __obj = js.Dynamic.literal(units = units.asInstanceOf[js.Any])
    if (activation != null) __obj.updateDynamic("activation")(activation.asInstanceOf[js.Any])
    if (batchInputShape != null) __obj.updateDynamic("batchInputShape")(batchInputShape.asInstanceOf[js.Any])
    if (!js.isUndefined(batchSize)) __obj.updateDynamic("batchSize")(batchSize.get.asInstanceOf[js.Any])
    if (biasConstraint != null) __obj.updateDynamic("biasConstraint")(biasConstraint.asInstanceOf[js.Any])
    if (biasInitializer != null) __obj.updateDynamic("biasInitializer")(biasInitializer.asInstanceOf[js.Any])
    if (biasRegularizer != null) __obj.updateDynamic("biasRegularizer")(biasRegularizer.asInstanceOf[js.Any])
    if (!js.isUndefined(dropout)) __obj.updateDynamic("dropout")(dropout.get.asInstanceOf[js.Any])
    if (dtype != null) __obj.updateDynamic("dtype")(dtype.asInstanceOf[js.Any])
    if (!js.isUndefined(implementation)) __obj.updateDynamic("implementation")(implementation.get.asInstanceOf[js.Any])
    if (inputDType != null) __obj.updateDynamic("inputDType")(inputDType.asInstanceOf[js.Any])
    if (inputShape != null) __obj.updateDynamic("inputShape")(inputShape.asInstanceOf[js.Any])
    if (kernelConstraint != null) __obj.updateDynamic("kernelConstraint")(kernelConstraint.asInstanceOf[js.Any])
    if (kernelInitializer != null) __obj.updateDynamic("kernelInitializer")(kernelInitializer.asInstanceOf[js.Any])
    if (kernelRegularizer != null) __obj.updateDynamic("kernelRegularizer")(kernelRegularizer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (recurrentActivation != null) __obj.updateDynamic("recurrentActivation")(recurrentActivation.asInstanceOf[js.Any])
    if (recurrentConstraint != null) __obj.updateDynamic("recurrentConstraint")(recurrentConstraint.asInstanceOf[js.Any])
    if (!js.isUndefined(recurrentDropout)) __obj.updateDynamic("recurrentDropout")(recurrentDropout.get.asInstanceOf[js.Any])
    if (recurrentInitializer != null) __obj.updateDynamic("recurrentInitializer")(recurrentInitializer.asInstanceOf[js.Any])
    if (recurrentRegularizer != null) __obj.updateDynamic("recurrentRegularizer")(recurrentRegularizer.asInstanceOf[js.Any])
    if (!js.isUndefined(trainable)) __obj.updateDynamic("trainable")(trainable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useBias)) __obj.updateDynamic("useBias")(useBias.get.asInstanceOf[js.Any])
    if (weights != null) __obj.updateDynamic("weights")(weights.asInstanceOf[js.Any])
    __obj.asInstanceOf[GRUCellLayerArgs]
  }
}

