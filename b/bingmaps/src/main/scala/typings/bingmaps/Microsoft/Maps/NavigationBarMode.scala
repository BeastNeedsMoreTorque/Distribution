package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NavigationBarMode extends js.Object

@JSGlobal("Microsoft.Maps.NavigationBarMode")
@js.native
object NavigationBarMode extends js.Object {
  /**
    * A compact navigation bar that includes a smaller drop down for the map type and zoom buttons. Recommended for small
    * maps or screen such as a mobile device.
    */
  @js.native
  sealed trait compact extends NavigationBarMode
  
  /**
    * The default navigation bar that has a drop down for the map type, a locate me button, and zoom buttons. Recommended for
    * medium to large maps in desktop browsers.
    */
  @js.native
  sealed trait default extends NavigationBarMode
  
  /**
    * A minified navigation bar that has a button to toggle between road and aerial maps, zoom buttons, and a button to turn
    * traffic information on and off. Recommended for small maps or screen such as a mobile device.
    */
  @js.native
  sealed trait minified extends NavigationBarMode
  
}

