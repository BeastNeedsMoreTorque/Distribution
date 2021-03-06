package typings.koaBunyanLogger.mod

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-bunyan-logger", "timeContext")
@js.native
object timeContext extends js.Object {
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(opts: TimeContextOptions): Middleware[DefaultState, DefaultContext] = js.native
}

