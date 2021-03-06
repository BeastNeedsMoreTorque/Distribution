package typings.webpack.anon

import typings.tapable.mod.SyncHook
import typings.tapable.mod.SyncWaterfallHook
import typings.webpack.mod.compilation.Chunk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterStartup extends js.Object {
  var afterStartup: SyncWaterfallHook[String, Chunk, String]
  var hash: SyncHook[typings.node.cryptoMod.Hash, _, _]
  var hashForChunk: SyncHook[typings.node.cryptoMod.Hash, Chunk, _]
  var jsonpScript: js.UndefOr[SyncWaterfallHook[String, Chunk, String]] = js.undefined
  var localVars: SyncWaterfallHook[String, Chunk, String]
  var require: SyncWaterfallHook[String, Chunk, String]
  var requireEnsure: SyncWaterfallHook[String, Chunk, String]
  var requireExtensions: SyncWaterfallHook[String, Chunk, String]
}

object AfterStartup {
  @scala.inline
  def apply(
    afterStartup: SyncWaterfallHook[String, Chunk, String],
    hash: SyncHook[typings.node.cryptoMod.Hash, _, _],
    hashForChunk: SyncHook[typings.node.cryptoMod.Hash, Chunk, _],
    localVars: SyncWaterfallHook[String, Chunk, String],
    require: SyncWaterfallHook[String, Chunk, String],
    requireEnsure: SyncWaterfallHook[String, Chunk, String],
    requireExtensions: SyncWaterfallHook[String, Chunk, String],
    jsonpScript: SyncWaterfallHook[String, Chunk, String] = null
  ): AfterStartup = {
    val __obj = js.Dynamic.literal(afterStartup = afterStartup.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], hashForChunk = hashForChunk.asInstanceOf[js.Any], localVars = localVars.asInstanceOf[js.Any], require = require.asInstanceOf[js.Any], requireEnsure = requireEnsure.asInstanceOf[js.Any], requireExtensions = requireExtensions.asInstanceOf[js.Any])
    if (jsonpScript != null) __obj.updateDynamic("jsonpScript")(jsonpScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterStartup]
  }
}

