package typings.latlonGeohash.mod.Geohash

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Neighbours extends js.Object {
  var e: String
  var n: String
  @JSName("ne")
  var ne_FNeighbours: String
  var nw: String
  var s: String
  var se: String
  var sw: String
  var w: String
}

object Neighbours {
  @scala.inline
  def apply(e: String, n: String, ne: String, nw: String, s: String, se: String, sw: String, w: String): Neighbours = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], ne = ne.asInstanceOf[js.Any], nw = nw.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], se = se.asInstanceOf[js.Any], sw = sw.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[Neighbours]
  }
}

