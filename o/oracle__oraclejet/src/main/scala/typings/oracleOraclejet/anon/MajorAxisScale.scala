package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MajorAxisScale
  extends /* key */ StringDictionary[js.Any] {
  var majorAxisScale: String
  var minorAxisScale: String
  var viewportEnd: String
  var viewportStart: String
}

object MajorAxisScale {
  @scala.inline
  def apply(
    majorAxisScale: String,
    minorAxisScale: String,
    viewportEnd: String,
    viewportStart: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): MajorAxisScale = {
    val __obj = js.Dynamic.literal(majorAxisScale = majorAxisScale.asInstanceOf[js.Any], minorAxisScale = minorAxisScale.asInstanceOf[js.Any], viewportEnd = viewportEnd.asInstanceOf[js.Any], viewportStart = viewportStart.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[MajorAxisScale]
  }
}

