package typings.angularCore.mod

import org.scalablytyped.runtime.TopLevel
import typings.angularCore.angularCoreStrings.any
import typings.angularCore.angularCoreStrings.platform
import typings.angularCore.angularCoreStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Injectable extends js.Object {
  /**
    * Determines which injectors will provide the injectable,
    * by either associating it with an `@NgModule` or other `InjectorType`,
    * or by specifying that this injectable should be provided in one of the following injectors:
    * - 'root' : The application-level injector in most apps.
    * - 'platform' : A special singleton platform injector shared by all
    * applications on the page.
    * - 'any' : Provides a unique instance in every module (including lazy modules) that injects the
    * token.
    *
    */
  var providedIn: js.UndefOr[Type[_] | root | platform | any | Null] = js.undefined
}

@JSImport("@angular/core", "Injectable")
@js.native
object Injectable extends TopLevel[InjectableDecorator]

