package typings.relayRuntime.anon

import typings.relayRuntime.normalizationNodeMod.NormalizationLinkedField
import typings.relayRuntime.relayRuntimeStrings.linked
import typings.relayRuntime.relayRuntimeTypesMod.DataID
import typings.relayRuntime.relayRuntimeTypesMod.Variables
import typings.relayRuntime.relayStoreTypesMod.MissingFieldHandler
import typings.relayRuntime.relayStoreTypesMod.ReadOnlyRecordSourceProxy
import typings.relayRuntime.relayStoreTypesMod.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Kind extends MissingFieldHandler {
  var kind: linked = js.native
  def handle(
    field: NormalizationLinkedField,
    record: js.UndefOr[Null | Record],
    args: Variables,
    store: ReadOnlyRecordSourceProxy
  ): js.UndefOr[DataID | Null] = js.native
}

