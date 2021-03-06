package typings.googlemaps.global.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Animations that can be played on a marker. Use the
  * {@link Marker#setAnimation setAnimation} method on Marker or the
  * {@link MarkerOptions#animation animation} option to play an animation.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#Animation Maps JavaScript API}
  */
@JSGlobal("google.maps.Animation")
@js.native
object Animation extends js.Object {
  /* 1 */ val BOUNCE: typings.googlemaps.google.maps.Animation.BOUNCE with Double = js.native
  /* 2 */ val DROP: typings.googlemaps.google.maps.Animation.DROP with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.googlemaps.google.maps.Animation with Double] = js.native
}

