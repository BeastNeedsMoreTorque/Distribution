package typings.fsExtraPromiseEs6.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise-es6", "chmod")
@js.native
object chmod extends js.Object {
  def apply(path: String, mode: String): Unit = js.native
  def apply(path: String, mode: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(path: String, mode: Double): Unit = js.native
  def apply(path: String, mode: Double, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

