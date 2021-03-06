package typings.playcanvas.mod

import typings.playcanvas.pc.ResourceHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource handler used for loading {@link pc.Sound} resources.
  * @param manager - The sound manager.
  */
@JSImport("playcanvas", "AudioHandler")
@js.native
class AudioHandler protected () extends ResourceHandler {
  def this(manager: typings.playcanvas.pc.SoundManager) = this()
}

