package typings.cardValidator.mod

import typings.cardValidator.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Card extends js.Object {
  var code: Name
  var gaps: js.Array[Double]
  var isAmex: Boolean
  var lengths: js.Array[Double]
  var niceType: String
  var pattern: String
  var `type`: String
}

object Card {
  @scala.inline
  def apply(
    code: Name,
    gaps: js.Array[Double],
    isAmex: Boolean,
    lengths: js.Array[Double],
    niceType: String,
    pattern: String,
    `type`: String
  ): Card = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], gaps = gaps.asInstanceOf[js.Any], isAmex = isAmex.asInstanceOf[js.Any], lengths = lengths.asInstanceOf[js.Any], niceType = niceType.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Card]
  }
}

