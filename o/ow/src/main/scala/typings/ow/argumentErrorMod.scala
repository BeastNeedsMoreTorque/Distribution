package typings.ow

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ow/dist/source/argument-error", JSImport.Namespace)
@js.native
object argumentErrorMod extends js.Object {
  @js.native
  class ArgumentError protected () extends Error {
    def this(message: String, context: js.Function) = this()
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
}

