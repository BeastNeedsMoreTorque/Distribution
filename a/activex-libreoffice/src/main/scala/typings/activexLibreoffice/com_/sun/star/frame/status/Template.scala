package typings.activexLibreoffice.com_.sun.star.frame.status

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains an association between a style name and a value.
  * @since OOo 2.0
  */
trait Template extends js.Object {
  /** specifies a style name. */
  var StyleName: String
  /** specifies a value that is bound to the style name. */
  var Value: Double
}

object Template {
  @scala.inline
  def apply(StyleName: String, Value: Double): Template = {
    val __obj = js.Dynamic.literal(StyleName = StyleName.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
}

