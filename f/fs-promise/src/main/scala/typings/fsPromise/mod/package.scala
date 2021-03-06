package typings.fsPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type JsonReplacer = typings.fsPromise.mod.JsonReplacerArray | typings.fsPromise.mod.JsonReplacerFunction
  type JsonReplacerArray = js.Array[scala.Double | java.lang.String]
  type JsonReplacerFunction = js.Function2[/* key */ java.lang.String, /* value */ js.Any, js.Any]
}
