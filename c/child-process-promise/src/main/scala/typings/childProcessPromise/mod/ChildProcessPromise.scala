package typings.childProcessPromise.mod

import typings.node.childProcessMod.ChildProcess
import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildProcessPromise[T] extends Promise[T] {
  var childProcess: ChildProcess = js.native
}

