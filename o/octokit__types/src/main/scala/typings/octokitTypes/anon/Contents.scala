package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Contents extends js.Object {
  var contents: String
  var issues: String
  var metadata: String
  var single_file: String
}

object Contents {
  @scala.inline
  def apply(contents: String, issues: String, metadata: String, single_file: String): Contents = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], single_file = single_file.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contents]
  }
}

