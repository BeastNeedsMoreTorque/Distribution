package typings.mendixmodelsdk.allModelClassesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.6.0: introduced
  */
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.RetrievalQueryParameter")
@js.native
class RetrievalQueryParameter protected ()
  extends typings.mendixmodelsdk.pagesMod.pages.RetrievalQueryParameter {
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
@JSImport("mendixmodelsdk/dist/gen/all-model-classes", "pages.RetrievalQueryParameter")
@js.native
object RetrievalQueryParameter extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
  /**
    * Creates and returns a new RetrievalQueryParameter instance in the SDK and on the server.
    * Expects one argument: the IModel object the instance will "live on".
    * After creation, assign or add this instance to a property that accepts this kind of objects.
    */
  def create(model: IModel): typings.mendixmodelsdk.pagesMod.pages.RetrievalQueryParameter = js.native
  /**
    * Creates and returns a new RetrievalQueryParameter instance in the SDK and on the server.
    * The new RetrievalQueryParameter will be automatically stored in the 'parameters' property
    * of the parent RetrievalQuery element passed as argument.
    *
    * Warning! Can only be used on models with the following Mendix meta model versions:
    *  8.6.0 and higher
    */
  def createIn(container: typings.mendixmodelsdk.pagesMod.pages.RetrievalQuery): typings.mendixmodelsdk.pagesMod.pages.RetrievalQueryParameter = js.native
}

