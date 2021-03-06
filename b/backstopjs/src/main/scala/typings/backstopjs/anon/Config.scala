package typings.backstopjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var config: js.UndefOr[typings.backstopjs.mod.Config | String] = js.undefined
  var filter: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(config: typings.backstopjs.mod.Config | String = null, filter: String = null): Config = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

