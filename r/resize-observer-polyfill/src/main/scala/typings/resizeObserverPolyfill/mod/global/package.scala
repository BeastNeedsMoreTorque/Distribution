package typings.resizeObserverPolyfill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object global {
  type ResizeObserverCallback = js.Function2[
    /* entries */ js.Array[typings.resizeObserverPolyfill.mod.global.ResizeObserverEntry], 
    /* observer */ typings.resizeObserverPolyfill.mod.global.ResizeObserver, 
    scala.Unit
  ]
}
