package typings.jestCore

import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/lib/handle_deprecation_warnings", JSImport.Namespace)
@js.native
object handleDeprecationWarningsMod extends js.Object {
  def default(pipe: WriteStream): js.Promise[Unit] = js.native
  def default(pipe: WriteStream, stdin: ReadStream): js.Promise[Unit] = js.native
}

