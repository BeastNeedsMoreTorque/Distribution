package typings.reactNativePermissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AndroidPermission = typings.reactNativePermissions.typesMod.Values[typings.reactNativePermissions.anon.ReadonlyACCEPTHANDOVERand]
  type IOSPermission = typings.reactNativePermissions.typesMod.Values[typings.reactNativePermissions.anon.ReadonlyBLUETOOTHPERIPHER]
  type Permission = typings.reactNativePermissions.typesMod.AndroidPermission | typings.reactNativePermissions.typesMod.IOSPermission
  type PermissionStatus = typings.reactNativePermissions.typesMod.Values[typings.reactNativePermissions.anon.ReadonlyUNAVAILABLEunavai]
  type Values[T /* <: js.Object */] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
