package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pluggableMapMod {
  type PostRenderFunction = js.Function2[
    /* p0 */ typings.ol.pluggableMapMod.PluggableMap, 
    /* p1 */ typings.ol.pluggableMapMod.FrameState, 
    js.Any
  ]
}
