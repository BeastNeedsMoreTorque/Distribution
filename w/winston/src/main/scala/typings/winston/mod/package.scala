package typings.winston

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type LogCallback = js.Function4[
    /* error */ js.UndefOr[js.Any], 
    /* level */ js.UndefOr[java.lang.String], 
    /* message */ js.UndefOr[java.lang.String], 
    /* meta */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}
