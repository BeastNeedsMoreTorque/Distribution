package typings.serveIndex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type templateCallback = js.Function2[
    /* error */ typings.std.Error, 
    /* htmlString */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
}
