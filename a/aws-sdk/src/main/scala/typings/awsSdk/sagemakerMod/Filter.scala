package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  /**
    * A resource property name. For example, TrainingJobName. For valid property names, see SearchRecord. You must specify a valid property for the resource.
    */
  var Name: ResourcePropertyName = js.native
  /**
    * A Boolean binary operator that is used to evaluate the filter. The operator field contains one of the following values:  Equals  The value of Name equals Value.  NotEquals  The value of Name doesn't equal Value.  Exists  The Name property exists.  NotExists  The Name property does not exist.  GreaterThan  The value of Name is greater than Value. Not supported for text properties.  GreaterThanOrEqualTo  The value of Name is greater than or equal to Value. Not supported for text properties.  LessThan  The value of Name is less than Value. Not supported for text properties.  LessThanOrEqualTo  The value of Name is less than or equal to Value. Not supported for text properties.  In  The value of Name is one of the comma delimited strings in Value. Only supported for text properties.  Contains  The value of Name contains the string Value. Only supported for text properties. A SearchExpression can include the Contains operator multiple times when the value of Name is one of the following:    Experiment.DisplayName     Experiment.ExperimentName     Experiment.Tags     Trial.DisplayName     Trial.TrialName     Trial.Tags     TrialComponent.DisplayName     TrialComponent.TrialComponentName     TrialComponent.Tags     TrialComponent.InputArtifacts     TrialComponent.OutputArtifacts    A SearchExpression can include only one Contains operator for all other values of Name. In these cases, if you include multiple Contains operators in the SearchExpression, the result is the following error message: "'CONTAINS' operator usage limit of 1 exceeded."  
    */
  var Operator: js.UndefOr[typings.awsSdk.sagemakerMod.Operator] = js.native
  /**
    * A value used with Name and Operator to determine which resources satisfy the filter's condition. For numerical properties, Value must be an integer or floating-point decimal. For timestamp properties, Value must be an ISO 8601 date-time string of the following format: YYYY-mm-dd'T'HH:MM:SS.
    */
  var Value: js.UndefOr[FilterValue] = js.native
}

object Filter {
  @scala.inline
  def apply(Name: ResourcePropertyName, Operator: Operator = null, Value: FilterValue = null): Filter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Operator != null) __obj.updateDynamic("Operator")(Operator.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

