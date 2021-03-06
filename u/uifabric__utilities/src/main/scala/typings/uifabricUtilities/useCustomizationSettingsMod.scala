package typings.uifabricUtilities

import typings.uifabricUtilities.customizationsMod.ICustomizations
import typings.uifabricUtilities.customizationsMod.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/utilities/lib/customizations/useCustomizationSettings", JSImport.Namespace)
@js.native
object useCustomizationSettingsMod extends js.Object {
  def useCustomizationSettings(properties: js.Array[String]): ISettings = js.native
  def useCustomizationSettings(properties: js.Array[String], scopeName: String): ISettings = js.native
  def useCustomizationSettings(properties: js.Array[String], scopeName: String, localSettings: ICustomizations): ISettings = js.native
}

