package typings.ethersprojectAbi

import typings.ethersprojectAbi.abstractCoderMod.Coder
import typings.ethersprojectAbi.abstractCoderMod.Reader
import typings.ethersprojectAbi.abstractCoderMod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ethersproject/abi/lib/coders/array", JSImport.Namespace)
@js.native
object arrayMod extends js.Object {
  @js.native
  class ArrayCoder protected () extends Coder {
    def this(coder: Coder, length: Double, localName: String) = this()
    val coder: Coder = js.native
    val length: Double = js.native
    def encode(writer: Writer, value: js.Array[_]): Double = js.native
  }
  
  def pack(writer: Writer, coders: js.Array[Coder], values: js.Array[_]): Double = js.native
  def unpack(reader: Reader, coders: js.Array[Coder]): js.Array[_] = js.native
}

