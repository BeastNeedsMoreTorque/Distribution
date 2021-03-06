package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "PropertyBag")
@js.native
class PropertyBag () extends js.Object {
  def this(value: js.Object) = this()
  def this(value: js.Object, createPropertyCallback: js.Function1[/* value */ js.UndefOr[js.Any], Unit]) = this()
  val definitionChanged: Event[js.Array[_]] = js.native
  val isConstant: Boolean = js.native
  var propertyNames: js.Array[String] = js.native
  def addProperty(propertyName: String): Unit = js.native
  def addProperty(propertyName: String, value: js.Any): Unit = js.native
  def addProperty(
    propertyName: String,
    value: js.Any,
    createPropertyCallback: js.Function1[/* value */ js.Any, Unit]
  ): Unit = js.native
  def equals(): Boolean = js.native
  def equals(other: Property): Boolean = js.native
  def getValue(time: JulianDate): js.Object = js.native
  def getValue(time: JulianDate, result: js.Object): js.Object = js.native
  def hasProperty(propertyName: String): Boolean = js.native
  def merge(source: js.Object): Unit = js.native
  def merge(source: js.Object, createPropertyCallback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
  def removeProperty(propertyName: String): Unit = js.native
}

