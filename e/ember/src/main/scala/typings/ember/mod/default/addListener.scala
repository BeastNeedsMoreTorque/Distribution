package typings.ember.mod.default

import typings.emberObject.typesMod.ObserverMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ember", "addListener")
@js.native
object addListener extends js.Object {
  def apply[Context](obj: Context, key: /* keyof Context */ java.lang.String, method: ObserverMethod[Context, Context]): Unit = js.native
  def apply[Context, Target](
    obj: Context,
    key: /* keyof Context */ java.lang.String,
    target: Target,
    method: ObserverMethod[Target, Context]
  ): Unit = js.native
  def apply[Context, Target](
    obj: Context,
    key: /* keyof Context */ java.lang.String,
    target: Target,
    method: ObserverMethod[Target, Context],
    once: Boolean
  ): Unit = js.native
}

