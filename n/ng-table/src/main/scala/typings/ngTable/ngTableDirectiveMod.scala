package typings.ngTable

import typings.angular.JQLite
import typings.angular.mod.IAttributes
import typings.angular.mod.IController
import typings.angular.mod.IDirective
import typings.angular.mod.IParseService
import typings.angular.mod.IQService
import typings.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ng-table/src/browser/ngTable.directive", JSImport.Namespace)
@js.native
object ngTableDirectiveMod extends js.Object {
  def ngTable($q: IQService, $parse: IParseService): IDirective[IScope, JQLite, IAttributes, IController] = js.native
}

