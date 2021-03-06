package typings.gapiClientFusiontables.gapi.client.fusiontables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Polygon extends js.Object {
  /** The coordinates that define the polygon. */
  var coordinates: js.UndefOr[js.Array[js.Array[js.Array[Double]]]] = js.undefined
  /** Type: A polygon geometry. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Polygon {
  @scala.inline
  def apply(coordinates: js.Array[js.Array[js.Array[Double]]] = null, `type`: String = null): Polygon = {
    val __obj = js.Dynamic.literal()
    if (coordinates != null) __obj.updateDynamic("coordinates")(coordinates.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Polygon]
  }
}

