package typings.mendixmodelsdk.mod.microflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.microflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "microflows.MicroflowCallParameterMapping")
@js.native
class MicroflowCallParameterMapping protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.microflows.MicroflowCallParameterMapping {
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
@JSImport("mendixmodelsdk", "microflows.MicroflowCallParameterMapping")
@js.native
object MicroflowCallParameterMapping extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MicroflowCallParameterMapping instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.microflowsMod.microflows.MicroflowCallParameterMapping = js.native
  /**
    * Creates and returns a new MicroflowCallParameterMapping instance in the SDK and on the server.
    * The new MicroflowCallParameterMapping will be automatically stored in the 'parameterMappings' property
    * of the parent MicroflowCall element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.microflowsMod.microflows.MicroflowCall): typings.mendixmodelsdk.microflowsMod.microflows.MicroflowCallParameterMapping = js.native
}

