package typings.ioredis.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverloadedHashCommand[T, U] extends js.Object {
  def apply(arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, arg6: T, cb: Callback[U]): Unit = js.native
  def apply(arg1: T, arg2: T, arg3: T, arg4: T, cb: Callback[U]): Unit = js.native
  def apply(arg1: T, arg2: T, cb: Callback[U]): Unit = js.native
  def apply(args: T*): js.Promise[U] = js.native
  def apply(data: js.Array[T]): js.Promise[U] = js.native
  def apply(data: js.Array[T], cb: Callback[U]): Unit = js.native
  def apply(data: StringDictionary[T]): js.Promise[U] = js.native
  def apply(data: StringDictionary[T], cb: Callback[U]): Unit = js.native
  def apply(data: Map[String, T]): js.Promise[U] = js.native
  def apply(data: Map[String, T], cb: Callback[U]): Unit = js.native
}

