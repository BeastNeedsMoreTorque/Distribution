package typings.nodePgMigrate.anon

import typings.nodePgMigrate.generalTypesMod.DropOptions
import typings.nodePgMigrate.sequencesTypesMod.CreateSequenceFn
import typings.nodePgMigrate.sequencesTypesMod.SequenceOptionsCreate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseCreateSequenceFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateSequenceFn = js.native
  def reverse(sequenceName: typings.nodePgMigrate.generalTypesMod.Name): String | js.Array[String] = js.native
  def reverse(
    sequenceName: typings.nodePgMigrate.generalTypesMod.Name,
    sequenceOptions: SequenceOptionsCreate with DropOptions
  ): String | js.Array[String] = js.native
}

