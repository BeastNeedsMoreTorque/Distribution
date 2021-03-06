package typings.lucene.mod

import typings.lucene.anon.End
import typings.lucene.luceneStrings.LessthansignimplicitGreaterthansign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var boost: Null | Double
  var field: String | LessthansignimplicitGreaterthansign
  var fieldLocation: Null
  var prefix: Null | String
  var quoted: Boolean
  var regex: Boolean
  var similarity: Null
  var term: String
  var termLocation: End
}

object Node {
  @scala.inline
  def apply(
    field: String | LessthansignimplicitGreaterthansign,
    fieldLocation: Null,
    quoted: Boolean,
    regex: Boolean,
    similarity: Null,
    term: String,
    termLocation: End,
    boost: Double = null.asInstanceOf[Double],
    prefix: String = null
  ): Node = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], fieldLocation = fieldLocation.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], similarity = similarity.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], termLocation = termLocation.asInstanceOf[js.Any], boost = boost.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

