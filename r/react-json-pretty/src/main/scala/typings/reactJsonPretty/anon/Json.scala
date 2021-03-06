package typings.reactJsonPretty.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Json extends js.Object {
  var data: String
  var json: String
  var silent: Boolean
  var space: Double
  var themeClassName: String
}

object Json {
  @scala.inline
  def apply(data: String, json: String, silent: Boolean, space: Double, themeClassName: String): Json = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any], themeClassName = themeClassName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Json]
  }
}

