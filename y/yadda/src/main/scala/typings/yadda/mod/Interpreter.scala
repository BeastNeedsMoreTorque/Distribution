package typings.yadda.mod

import typings.yadda.libraryMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda", "Interpreter")
@js.native
class Interpreter protected ()
  extends typings.yadda.libMod.Interpreter {
  def this(libraries: js.Array[^]) = this()
  def this(libraries: ^) = this()
}

