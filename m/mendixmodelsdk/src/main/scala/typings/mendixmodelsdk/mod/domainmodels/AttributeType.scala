package typings.mendixmodelsdk.mod.domainmodels

import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "domainmodels.AttributeType")
@js.native
abstract class AttributeType protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.domainmodels.AttributeType {
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
@JSImport("mendixmodelsdk", "domainmodels.AttributeType")
@js.native
object AttributeType extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

