package typings.mendixmodelsdk.mod.settings

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.settingsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "settings.LanguageSettings")
@js.native
class LanguageSettings protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.settings.LanguageSettings {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
}

/* static members */
@JSImport("mendixmodelsdk", "settings.LanguageSettings")
@js.native
object LanguageSettings extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new LanguageSettings instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.settingsMod.settings.LanguageSettings = js.native
  /**
    * Creates and returns a new LanguageSettings instance in the SDK and on the server.
    * The new LanguageSettings will be automatically stored in the 'settingsParts' property
    * of the parent ProjectSettings element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.settingsMod.settings.ProjectSettings): typings.mendixmodelsdk.settingsMod.settings.LanguageSettings = js.native
}

