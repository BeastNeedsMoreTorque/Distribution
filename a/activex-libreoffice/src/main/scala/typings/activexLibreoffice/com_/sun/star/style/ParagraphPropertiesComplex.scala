package typings.activexLibreoffice.com_.sun.star.style

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains settings for the style of paragraphs with complex text layout. */
trait ParagraphPropertiesComplex extends js.Object {
  /** contains the writing direction, as represented by the {@link com.sun.star.text.WritingMode2} constants */
  var WritingMode: Double
}

object ParagraphPropertiesComplex {
  @scala.inline
  def apply(WritingMode: Double): ParagraphPropertiesComplex = {
    val __obj = js.Dynamic.literal(WritingMode = WritingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphPropertiesComplex]
  }
}

