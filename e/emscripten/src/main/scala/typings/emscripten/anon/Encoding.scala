package typings.emscripten.anon

import typings.emscripten.emscriptenStrings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encoding extends js.Object {
  var encoding: binary
  var flags: js.UndefOr[String] = js.undefined
}

object Encoding {
  @scala.inline
  def apply(encoding: binary, flags: String = null): Encoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encoding]
  }
}

