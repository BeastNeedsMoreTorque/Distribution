package typings.lodash.fpMod

import typings.lodash.mod.ConformsPredicateObject
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashConformsTo extends LodashConvertible {
  def apply[T](source: ConformsPredicateObject[T]): LodashConformsTo1x1[T] = js.native
  def apply[T](source: ConformsPredicateObject[T], `object`: T): Boolean = js.native
  def apply[T](source: __, `object`: T): LodashConformsTo1x2[T] = js.native
}

