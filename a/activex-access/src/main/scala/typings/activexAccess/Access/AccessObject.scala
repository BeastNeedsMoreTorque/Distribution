package typings.activexAccess.Access

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessObject extends js.Object {
  @JSName("Access.AccessObject_typekey")
  var AccessDotAccessObject_typekey: AccessObject = js.native
  val Attributes: Double = js.native
  val CurrentView: AcCurrentView = js.native
  val DateCreated: VarDate = js.native
  val DateModified: VarDate = js.native
  var FullName: String = js.native
  val IsLoaded: Boolean = js.native
  val IsWeb: Boolean = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("Properties")
  val Properties_Original: AccessObjectProperties = js.native
  val Type: AcObjectType = js.native
  val _Name: String = js.native
  def GetDependencyInfo(): DependencyInfo = js.native
  def IsDependentUpon(ObjectType: AcObjectType, ObjectName: String): Boolean = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def Properties(Index: String): AccessObjectProperty = js.native
  def Properties(Index: Double): AccessObjectProperty = js.native
}

