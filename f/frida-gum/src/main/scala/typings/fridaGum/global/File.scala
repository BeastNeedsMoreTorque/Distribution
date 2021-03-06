package typings.fridaGum.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides basic filesystem access.
  */
@JSGlobal("File")
@js.native
class File protected ()
  extends typings.fridaGum.File {
  /**
    * Opens or creates the file at `filePath` with `mode` specifying how
    * it should be opened. For example `"wb"` to open the file for writing
    * in binary mode. This is the same format as `fopen()` from the C
    * standard library.
    *
    * @param filePath Path to file to open or create.
    * @param mode Mode to use.
    */
  def this(filePath: String, mode: String) = this()
}

