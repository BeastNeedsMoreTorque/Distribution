package typings.mendixmodelsdk.pagesMod.pages

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.domainmodelsMod.domainmodels.AttributeRef
import typings.mendixmodelsdk.internalMod.AbstractElement
import typings.mendixmodelsdk.internalMod.AbstractModel
import typings.mendixmodelsdk.internalMod.ModelUnit
import typings.mendixmodelsdk.pagesMod.StructureVersionInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MemberWidget")
@js.native
abstract class MemberWidget protected () extends InputWidget {
  def this(
    model: AbstractModel,
    structureTypeName: String,
    id: String,
    isPartial: Boolean,
    unit: ModelUnit,
    container: AbstractElement
  ) = this()
  @JSName("model")
  var model_FMemberWidget: IModel = js.native
  /**
    * The value of this property is conceptually of type paths.LegacyAttributePath.
    *
    * In version 7.11.0: deleted
    */
  def attributePath: String = js.native
  def attributePath(newValue: String): js.Any = js.native
  def attributeRef(): js.Any = js.native
  def attributeRef(newValue: AttributeRef): js.Any = js.native
  /**
    * In version 7.11.0: introduced
    */
  @JSName("attributeRef")
  def attributeRef_Union: AttributeRef | Null = js.native
  /**
    * In version 6.9.0: introduced
    */
  def readOnlyStyle: ReadOnlyStyle = js.native
  def readOnlyStyle(newValue: ReadOnlyStyle): js.Any = js.native
}

/* static members */
@JSImport("mendixmodelsdk/dist/gen/pages", "pages.MemberWidget")
@js.native
object MemberWidget extends js.Object {
  var structureTypeName: String = js.native
  var versionInfo: StructureVersionInfo = js.native
}

