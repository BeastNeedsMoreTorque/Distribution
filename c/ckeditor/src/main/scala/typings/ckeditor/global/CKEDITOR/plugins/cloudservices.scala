package typings.ckeditor.global.CKEDITOR.plugins

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.plugins.cloudservices")
@js.native
object cloudservices extends js.Object {
  @js.native
  class cloudServicesLoader protected ()
    extends typings.ckeditor.CKEDITOR.plugins.cloudservices.cloudServicesLoader {
    def this(editor: typings.ckeditor.CKEDITOR.editor, fileOrData: String) = this()
    def this(editor: typings.ckeditor.CKEDITOR.editor, fileOrData: Blob) = this()
    def this(editor: typings.ckeditor.CKEDITOR.editor, fileOrData: String, fileName: String) = this()
    def this(editor: typings.ckeditor.CKEDITOR.editor, fileOrData: Blob, fileName: String) = this()
    def this(editor: typings.ckeditor.CKEDITOR.editor, fileOrData: String, fileName: String, token: String) = this()
    def this(editor: typings.ckeditor.CKEDITOR.editor, fileOrData: Blob, fileName: String, token: String) = this()
  }
  
}

