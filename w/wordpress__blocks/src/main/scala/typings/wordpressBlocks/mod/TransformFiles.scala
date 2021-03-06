package typings.wordpressBlocks.mod

import typings.std.FileList
import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.wordpressBlocksStrings.files
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformFiles[T /* <: Record[String, _] */] extends Transform[T] {
  var isMatch: js.UndefOr[js.Function1[/* files */ FileList, Boolean]] = js.native
  var priority: js.UndefOr[Double] = js.native
  var `type`: files = js.native
  def transform(files: FileList): BlockInstance[Partial[T]] = js.native
  def transform(files: FileList, onChange: js.Function2[/* id */ String, /* attrs */ T, Unit]): BlockInstance[Partial[T]] = js.native
}

