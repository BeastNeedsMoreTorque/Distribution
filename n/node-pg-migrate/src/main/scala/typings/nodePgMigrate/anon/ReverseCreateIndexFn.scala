package typings.nodePgMigrate.anon

import typings.nodePgMigrate.indexesTypesMod.CreateIndexFn
import typings.nodePgMigrate.indexesTypesMod.CreateIndexOptions
import typings.nodePgMigrate.indexesTypesMod.DropIndexOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseCreateIndexFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateIndexFn = js.native
  def reverse(tableName: typings.nodePgMigrate.generalTypesMod.Name, columns: String): String | js.Array[String] = js.native
  def reverse(
    tableName: typings.nodePgMigrate.generalTypesMod.Name,
    columns: String,
    options: CreateIndexOptions with DropIndexOptions
  ): String | js.Array[String] = js.native
  def reverse(tableName: typings.nodePgMigrate.generalTypesMod.Name, columns: js.Array[String]): String | js.Array[String] = js.native
  def reverse(
    tableName: typings.nodePgMigrate.generalTypesMod.Name,
    columns: js.Array[String],
    options: CreateIndexOptions with DropIndexOptions
  ): String | js.Array[String] = js.native
}

