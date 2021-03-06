package typings.winrt.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geoposition extends IGeoposition

object Geoposition {
  @scala.inline
  def apply(civicAddress: CivicAddress, coordinate: Geocoordinate): Geoposition = {
    val __obj = js.Dynamic.literal(civicAddress = civicAddress.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geoposition]
  }
}

