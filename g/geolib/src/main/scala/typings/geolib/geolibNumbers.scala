package typings.geolib

import typings.geolib.typesMod.AltitudeKeys
import typings.geolib.typesMod.LatitudeKeys
import typings.geolib.typesMod.LongitudeKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object geolibNumbers {
  @js.native
  sealed trait `0` extends LongitudeKeys
  
  @js.native
  sealed trait `1` extends LatitudeKeys
  
  @js.native
  sealed trait `2` extends AltitudeKeys
  
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
  @scala.inline
  def `2`: `2` = 2.asInstanceOf[`2`]
}

