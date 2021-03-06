package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseConfigHost extends js.Object {
  var trace: js.UndefOr[js.Function1[/* s */ java.lang.String, Unit]] = js.native
  var useCaseSensitiveFileNames: Boolean = js.native
  /**
    * Gets a value indicating whether the specified path exists and is a file.
    * @param path The path to test.
    */
  def fileExists(path: java.lang.String): Boolean = js.native
  def readDirectory(
    rootDir: java.lang.String,
    extensions: js.Array[java.lang.String],
    excludes: js.UndefOr[js.Array[java.lang.String]],
    includes: js.Array[java.lang.String]
  ): js.Array[java.lang.String] = js.native
  def readDirectory(
    rootDir: java.lang.String,
    extensions: js.Array[java.lang.String],
    excludes: js.UndefOr[js.Array[java.lang.String]],
    includes: js.Array[java.lang.String],
    depth: Double
  ): js.Array[java.lang.String] = js.native
  def readFile(path: java.lang.String): js.UndefOr[java.lang.String] = js.native
}

