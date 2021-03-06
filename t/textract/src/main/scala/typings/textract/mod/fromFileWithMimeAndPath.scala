package typings.textract.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("textract", "fromFileWithMimeAndPath")
@js.native
object fromFileWithMimeAndPath extends js.Object {
  def apply(
    mimeType: String,
    filePath: String,
    callback: js.Function2[/* error */ Error, /* text */ String, Unit]
  ): Unit = js.native
  def apply(
    mimeType: String,
    filePath: String,
    config: Config,
    callback: js.Function2[/* error */ Error, /* text */ String, Unit]
  ): Unit = js.native
}

