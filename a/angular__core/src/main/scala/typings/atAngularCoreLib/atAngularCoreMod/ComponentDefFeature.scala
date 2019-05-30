package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentDefFeature extends js.Object {
  /**
    * Marks a feature as something that {@link InheritDefinitionFeature} will execute
    * during inheritance.
    *
    * NOTE: DO NOT SET IN ROOT OF MODULE! Doing so will result in tree-shakers/bundlers
    * identifying the change as a side effect, and the feature will be included in
    * every bundle.
    */
  var ngInherit: js.UndefOr[atAngularCoreLib.atAngularCoreLibNumbers.`true`] = js.native
  def apply[T](componentDef: ɵComponentDef[T]): scala.Unit = js.native
}

