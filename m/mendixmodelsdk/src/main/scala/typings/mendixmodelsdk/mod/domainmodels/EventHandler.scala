package typings.mendixmodelsdk.mod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.StructureVersionInfo
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * See: {@link https://docs.mendix.com/refguide7/event-handlers relevant section in reference guide}
  */
@JSImport("mendixmodelsdk", "domainmodels.EventHandler")
@js.native
class EventHandler protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.domainmodels.EventHandler {
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
@JSImport("mendixmodelsdk", "domainmodels.EventHandler")
@js.native
object EventHandler extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new EventHandler instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.domainmodelsMod.domainmodels.EventHandler = js.native
  /**
    * Creates and returns a new EventHandler instance in the SDK and on the server.
    * The new EventHandler will be automatically stored in the 'eventHandlers' property
    * of the parent Entity element passed as argument.
    */
  def createIn(container: typings.mendixmodelsdk.domainmodelsMod.domainmodels.Entity): typings.mendixmodelsdk.domainmodelsMod.domainmodels.EventHandler = js.native
}

