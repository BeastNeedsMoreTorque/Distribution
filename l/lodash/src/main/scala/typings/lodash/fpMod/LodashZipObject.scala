package typings.lodash.fpMod

import typings.lodash.mod.Dictionary
import typings.lodash.mod.List
import typings.lodash.mod.PropertyName
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashZipObject extends LodashConvertible {
  def apply(props: List[PropertyName]): LodashZipObject1x1 = js.native
  def apply[T](props: List[PropertyName], values: List[T]): Dictionary[T] = js.native
  def apply[T](props: __, values: List[T]): LodashZipObject1x2[T] = js.native
}

