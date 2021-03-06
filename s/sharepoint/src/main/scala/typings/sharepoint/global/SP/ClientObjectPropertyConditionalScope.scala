package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientObjectPropertyConditionalScope")
@js.native
class ClientObjectPropertyConditionalScope protected ()
  extends typings.sharepoint.SP.ConditionalScopeBase {
  def this(
    clientObject: typings.sharepoint.SP.ClientObject,
    propertyName: String,
    comparisonOperator: String,
    valueToCompare: js.Any
  ) = this()
  def this(
    clientObject: typings.sharepoint.SP.ClientObject,
    propertyName: String,
    comparisonOperator: String,
    valueToCompare: js.Any,
    allowAllActions: Boolean
  ) = this()
  /* CompleteClass */
  override def customFromJson(initValue: js.Any): Boolean = js.native
  /* CompleteClass */
  override def fromJson(initValue: js.Any): Unit = js.native
  /* CompleteClass */
  override def get_testResult(): Boolean = js.native
  /* CompleteClass */
  override def startIfFalse(): js.Any = js.native
  /* CompleteClass */
  override def startIfTrue(): js.Any = js.native
  /* CompleteClass */
  override def startScope(): js.Any = js.native
}

