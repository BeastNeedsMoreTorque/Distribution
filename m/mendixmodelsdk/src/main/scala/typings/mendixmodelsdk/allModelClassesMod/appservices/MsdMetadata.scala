package typings.mendixmodelsdk.allModelClassesMod.appservices

import typings.mendixmodelsdk.appservicesMod.StructureVersionInfo
import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "appservices.MsdMetadata")
@js.native
class MsdMetadata protected ()
  extends typings.mendixmodelsdk.appservicesMod.appservices.MsdMetadata {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "appservices.MsdMetadata")
@js.native
object MsdMetadata extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new MsdMetadata instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.appservicesMod.appservices.MsdMetadata = js.native
  /**
    * Creates and returns a new MsdMetadata instance in the SDK and on the server.
    * The new MsdMetadata will be automatically stored in the 'metadata' property
    * of the parent Msd element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.appservicesMod.appservices.Msd): typings.mendixmodelsdk.appservicesMod.appservices.MsdMetadata = js.native
}

