package typings.lodash.fpMod

import typings.lodash.mod.Dictionary
import typings.lodash.mod.List
import typings.lodash.mod.ValueIteratee
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMapKeys extends LodashConvertible {
  def apply(iteratee: ValueIteratee[String]): LodashMapKeys2x1 = js.native
  def apply[T /* <: js.Object */](iteratee: ValueIteratee[String], `object`: T): Dictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](iteratee: ValueIteratee[Double], `object`: List[T]): Dictionary[T] = js.native
  def apply[T](iteratee: __): LodashMapKeys1x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __, `object`: T): LodashMapKeys2x2[T] = js.native
  def apply[T](iteratee: __, `object`: List[T]): LodashMapKeys1x2[T] = js.native
}

