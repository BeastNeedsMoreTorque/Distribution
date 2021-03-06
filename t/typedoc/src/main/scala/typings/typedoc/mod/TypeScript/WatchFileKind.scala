package typings.typedoc.mod.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.WatchFileKind")
@js.native
object WatchFileKind extends js.Object {
  /* 2 */ val DynamicPriorityPolling: typings.typescript.mod.WatchFileKind.DynamicPriorityPolling with Double = js.native
  /* 0 */ val FixedPollingInterval: typings.typescript.mod.WatchFileKind.FixedPollingInterval with Double = js.native
  /* 1 */ val PriorityPollingInterval: typings.typescript.mod.WatchFileKind.PriorityPollingInterval with Double = js.native
  /* 3 */ val UseFsEvents: typings.typescript.mod.WatchFileKind.UseFsEvents with Double = js.native
  /* 4 */ val UseFsEventsOnParentDirectory: typings.typescript.mod.WatchFileKind.UseFsEventsOnParentDirectory with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.typescript.mod.WatchFileKind with Double] = js.native
}

