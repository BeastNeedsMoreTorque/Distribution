package typings.videoJs.mod.default

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.videoJs.mod.videojs.Component.ReadyCallback
import typings.videoJs.mod.videojs.TrackButtonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "CaptionsButton")
@js.native
object CaptionsButton
  extends /**
  * Creates an instance of this class.
  *
  * @param player
  *        The `Player` that this class should be attached to.
  *
  * @param [options]
  *        The key/value store of player options.
  *
  * @param [ready]
  *        The function to call when this function is ready.
  */
Instantiable1[
      /* player */ typings.videoJs.mod.videojs.Player, 
      typings.videoJs.mod.videojs.CaptionsButton
    ]
     with Instantiable2[
      /* player */ typings.videoJs.mod.videojs.Player, 
      /* options */ TrackButtonOptions, 
      typings.videoJs.mod.videojs.CaptionsButton
    ]
     with Instantiable3[
      /* player */ typings.videoJs.mod.videojs.Player, 
      /* options */ TrackButtonOptions, 
      /* ready */ ReadyCallback, 
      typings.videoJs.mod.videojs.CaptionsButton
    ]

