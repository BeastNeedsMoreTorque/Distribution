package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.structuresMod.IStructureClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "AbstractProperty")
@js.native
abstract class AbstractProperty[T, P] protected ()
  extends typings.mendixmodelsdk.propertiesMod.AbstractProperty[T, P] {
  /**
    * parent is the structure that the value of this property attaches to,
    * so e.g. for all values `item` of Part(List)Property we (should) have the invariant:
    *    item.container === this.parent.
    *
    * initialValue is default value except parts and GUID-typed primitives.
    * (by-id/name references do not have default values.)
    */
  def this(
    declaredOn: IStructureClass,
    parent: typings.mendixmodelsdk.structuresMod.Structure,
    name: String,
    initialValue: T,
    moreArgs: js.Any*
  ) = this()
}

