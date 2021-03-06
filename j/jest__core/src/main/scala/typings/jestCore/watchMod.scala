package typings.jestCore

import typings.jestCore.typesMod.Filter
import typings.jestHasteMap.mod.^
import typings.jestRuntime.mod.Context
import typings.jestTypes.configMod.GlobalConfig
import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/watch", JSImport.Namespace)
@js.native
object watchMod extends js.Object {
  def default(
    initialGlobalConfig: GlobalConfig,
    contexts: js.Array[Context],
    outputStream: WriteStream,
    hasteMapInstances: js.Array[^]
  ): js.Promise[Unit] = js.native
  def default(
    initialGlobalConfig: GlobalConfig,
    contexts: js.Array[Context],
    outputStream: WriteStream,
    hasteMapInstances: js.Array[^],
    stdin: ReadStream
  ): js.Promise[Unit] = js.native
  def default(
    initialGlobalConfig: GlobalConfig,
    contexts: js.Array[Context],
    outputStream: WriteStream,
    hasteMapInstances: js.Array[^],
    stdin: ReadStream,
    hooks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHook */ js.Any
  ): js.Promise[Unit] = js.native
  def default(
    initialGlobalConfig: GlobalConfig,
    contexts: js.Array[Context],
    outputStream: WriteStream,
    hasteMapInstances: js.Array[^],
    stdin: ReadStream,
    hooks: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestHook */ js.Any,
    filter: Filter
  ): js.Promise[Unit] = js.native
}

