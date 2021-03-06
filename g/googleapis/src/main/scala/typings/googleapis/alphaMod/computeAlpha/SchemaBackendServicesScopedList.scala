package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBackendServicesScopedList extends js.Object {
  /**
    * A list of BackendServices contained in this scope.
    */
  var backendServices: js.UndefOr[js.Array[SchemaBackendService]] = js.native
  /**
    * Informational warning which replaces the list of backend services when
    * the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaBackendServicesScopedList {
  @scala.inline
  def apply(backendServices: js.Array[SchemaBackendService] = null, warning: Code = null): SchemaBackendServicesScopedList = {
    val __obj = js.Dynamic.literal()
    if (backendServices != null) __obj.updateDynamic("backendServices")(backendServices.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBackendServicesScopedList]
  }
}

