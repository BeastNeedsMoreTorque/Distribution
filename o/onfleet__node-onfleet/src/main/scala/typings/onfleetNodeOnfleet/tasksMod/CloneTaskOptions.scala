package typings.onfleetNodeOnfleet.tasksMod

import typings.onfleetNodeOnfleet.anon.CompleteAfter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloneTaskOptions extends js.Object {
  var includeBarCodes: Boolean
  var includeDependencies: Boolean
  var includeMetadata: Boolean
  var overrides: js.UndefOr[CompleteAfter] = js.undefined
}

object CloneTaskOptions {
  @scala.inline
  def apply(
    includeBarCodes: Boolean,
    includeDependencies: Boolean,
    includeMetadata: Boolean,
    overrides: CompleteAfter = null
  ): CloneTaskOptions = {
    val __obj = js.Dynamic.literal(includeBarCodes = includeBarCodes.asInstanceOf[js.Any], includeDependencies = includeDependencies.asInstanceOf[js.Any], includeMetadata = includeMetadata.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneTaskOptions]
  }
}

