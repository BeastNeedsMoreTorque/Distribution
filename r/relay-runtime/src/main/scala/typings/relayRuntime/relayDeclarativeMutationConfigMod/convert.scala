package typings.relayRuntime.relayDeclarativeMutationConfigMod

import typings.relayRuntime.anon.OptimisticUpdater
import typings.relayRuntime.relayConcreteNodeMod.ConcreteRequest
import typings.relayRuntime.relayStoreTypesMod.SelectorStoreUpdater
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime/lib/mutations/RelayDeclarativeMutationConfig", "convert")
@js.native
object convert extends js.Object {
  def apply(configs: js.Array[DeclarativeMutationConfig], request: ConcreteRequest): OptimisticUpdater = js.native
  def apply(
    configs: js.Array[DeclarativeMutationConfig],
    request: ConcreteRequest,
    optimisticUpdater: SelectorStoreUpdater[js.Object]
  ): OptimisticUpdater = js.native
  def apply(
    configs: js.Array[DeclarativeMutationConfig],
    request: ConcreteRequest,
    optimisticUpdater: SelectorStoreUpdater[js.Object],
    updater: SelectorStoreUpdater[js.Object]
  ): OptimisticUpdater = js.native
}

