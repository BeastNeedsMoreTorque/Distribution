package typings.nodePgMigrate.anon

import typings.nodePgMigrate.policiesTypesMod.RenamePolicyFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseRenamePolicyFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenamePolicyFn = js.native
  def reverse(tableName: typings.nodePgMigrate.generalTypesMod.Name, policyName: String, newPolicyName: String): String | js.Array[String] = js.native
}

