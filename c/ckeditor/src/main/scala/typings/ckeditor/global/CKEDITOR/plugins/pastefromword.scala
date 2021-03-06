package typings.ckeditor.global.CKEDITOR.plugins

import typings.ckeditor.CKEDITOR.plugins.pastefromword.lists.numbering
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.pastefromword")
@js.native
object pastefromword extends js.Object {
  @js.native
  class lists ()
    extends typings.ckeditor.CKEDITOR.plugins.pastefromword.lists {
    /* CompleteClass */
    override var numbering: numbering = js.native
  }
  
  @js.native
  class styles ()
    extends typings.ckeditor.CKEDITOR.plugins.pastefromword.styles
  
  @js.native
  object lists extends js.Object {
    @js.native
    class numbering ()
      extends typings.ckeditor.CKEDITOR.plugins.pastefromword.lists.numbering {
      /* CompleteClass */
      override def getStyle(marker: String): String = js.native
      /* CompleteClass */
      override def toNumber(marker: String, markerType: String): Double = js.native
    }
    
  }
  
}

