package typings.icheck

import typings.icheck.ICheck.Options
import typings.icheck.icheckStrings.check
import typings.icheck.icheckStrings.destroy
import typings.icheck.icheckStrings.determinate
import typings.icheck.icheckStrings.disable
import typings.icheck.icheckStrings.enable
import typings.icheck.icheckStrings.indeterminate
import typings.icheck.icheckStrings.toggle
import typings.icheck.icheckStrings.uncheck
import typings.icheck.icheckStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def iCheck(): this.type = js.native
  def iCheck(options: Options): this.type = js.native
  def iCheck[T /* <: /* keyof icheck.ICheck.Methods */ check | uncheck | toggle | disable | enable | indeterminate | determinate | update | destroy */](method: T): this.type = js.native
  def iCheck[T /* <: /* keyof icheck.ICheck.Methods */ check | uncheck | toggle | disable | enable | indeterminate | determinate | update | destroy */](
    method: T,
    callback: /* import warning: importer.ImportType#apply Failed type conversion: icheck.ICheck.Methods[T] */ js.Any
  ): this.type = js.native
}

