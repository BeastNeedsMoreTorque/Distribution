package typings.mendixmodelsdk.mod.workflows

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.workflowsMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NOTE: This class is experimental and is subject to change in newer Model SDK versions.
  *
  * In version 8.11.0: introduced
  */
@JSImport("mendixmodelsdk", "workflows.XPathBasedUserSource")
@js.native
class XPathBasedUserSource protected ()
  extends typings.mendixmodelsdk.allModelClassesMod.workflows.XPathBasedUserSource {
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
@JSImport("mendixmodelsdk", "workflows.XPathBasedUserSource")
@js.native
object XPathBasedUserSource extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new XPathBasedUserSource instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.workflowsMod.workflows.XPathBasedUserSource = js.native
  /**
    * Creates and returns a new XPathBasedUserSource instance in the SDK and on the server.
    * The new XPathBasedUserSource will be automatically stored in the 'userSource' property
    * of the parent UserTask element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.11.0 and higher
    */
  def createIn(container: typings.mendixmodelsdk.workflowsMod.workflows.UserTask): typings.mendixmodelsdk.workflowsMod.workflows.XPathBasedUserSource = js.native
}

