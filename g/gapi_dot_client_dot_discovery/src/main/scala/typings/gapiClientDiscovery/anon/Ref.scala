package typings.gapiClientDiscovery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ref extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  var type_value: js.UndefOr[String] = js.undefined
}

object Ref {
  @scala.inline
  def apply($ref: String = null, type_value: String = null): Ref = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref.asInstanceOf[js.Any])
    if (type_value != null) __obj.updateDynamic("type_value")(type_value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
}

