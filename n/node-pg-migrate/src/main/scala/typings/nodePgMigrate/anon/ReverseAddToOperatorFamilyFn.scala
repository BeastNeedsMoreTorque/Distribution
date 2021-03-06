package typings.nodePgMigrate.anon

import typings.nodePgMigrate.operatorsTypesMod.AddToOperatorFamilyFn
import typings.nodePgMigrate.operatorsTypesMod.OperatorListDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseAddToOperatorFamilyFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: AddToOperatorFamilyFn = js.native
  def reverse(
    operatorFamilyName: typings.nodePgMigrate.generalTypesMod.Name,
    indexMethod: typings.nodePgMigrate.generalTypesMod.Name,
    operatorList: js.Array[OperatorListDefinition]
  ): String | js.Array[String] = js.native
}

