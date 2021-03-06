package typings.nodePgMigrate.anon

import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.operatorsTypesMod.CreateOperatorClassFn
import typings.nodePgMigrate.operatorsTypesMod.CreateOperatorClassOptions
import typings.nodePgMigrate.operatorsTypesMod.OperatorListDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseCreateOperatorClassFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateOperatorClassFn = js.native
  def reverse(
    operatorClassName: typings.nodePgMigrate.generalTypesMod.Name,
    `type`: typings.nodePgMigrate.generalTypesMod.Type,
    indexMethod: typings.nodePgMigrate.generalTypesMod.Name,
    operatorList: js.Array[OperatorListDefinition],
    options: CreateOperatorClassOptions with DropOptions
  ): String | js.Array[String] = js.native
}

