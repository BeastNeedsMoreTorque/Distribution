package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Generation extends js.Object {
  var generation: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var objectPreconditions: js.UndefOr[IfGenerationMatch] = js.native
}

object Generation {
  @scala.inline
  def apply(generation: String = null, name: String = null, objectPreconditions: IfGenerationMatch = null): Generation = {
    val __obj = js.Dynamic.literal()
    if (generation != null) __obj.updateDynamic("generation")(generation.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (objectPreconditions != null) __obj.updateDynamic("objectPreconditions")(objectPreconditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Generation]
  }
}

