package typings.nodePgMigrate.anon

import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.viewsTypesMod.CreateViewFn
import typings.nodePgMigrate.viewsTypesMod.CreateViewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseCreateViewFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateViewFn = js.native
  def reverse(
    viewName: typings.nodePgMigrate.generalTypesMod.Name,
    options: CreateViewOptions with DropOptions,
    definition: String
  ): String | js.Array[String] = js.native
}

