package typings.nodePgMigrate.anon

import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.schemasTypesMod.CreateSchemaFn
import typings.nodePgMigrate.schemasTypesMod.CreateSchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseCreateSchemaFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateSchemaFn = js.native
  def reverse(schemaName: String): String | js.Array[String] = js.native
  def reverse(schemaName: String, schemaOptions: CreateSchemaOptions with DropOptions): String | js.Array[String] = js.native
}

