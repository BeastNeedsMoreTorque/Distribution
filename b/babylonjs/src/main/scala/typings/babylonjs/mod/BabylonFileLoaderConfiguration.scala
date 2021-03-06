package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "BabylonFileLoaderConfiguration")
@js.native
class BabylonFileLoaderConfiguration ()
  extends typings.babylonjs.legacyMod.BabylonFileLoaderConfiguration

/* static members */
@JSImport("babylonjs", "BabylonFileLoaderConfiguration")
@js.native
object BabylonFileLoaderConfiguration extends js.Object {
  /**
    * The loader does not allow injecting custom physix engine into the plugins.
    * Unfortunately in ES6, we need to manually inject them into the plugin.
    * So you could set this variable to your engine import to make it work.
    */
  var LoaderInjectedPhysicsEngine: js.Any = js.native
}

