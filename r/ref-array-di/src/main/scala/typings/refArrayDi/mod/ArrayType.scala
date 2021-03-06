package typings.refArrayDi.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.node.Buffer
import typings.refArrayDi.anon.Dicti
import typings.refNapi.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayType[T]
  extends Type
     with Instantiable0[Dicti[T]]
     with Instantiable1[
      (/* data */ js.Array[Double]) | (/* data */ Buffer) | (/* length */ Double), 
      Dicti[T]
    ]
     with Instantiable2[(/* data */ js.Array[Double]) | (/* data */ Buffer), /* length */ Double, Dicti[T]] {
  var BYTES_PER_ELEMENT: Double = js.native
  var fixedLength: Double = js.native
  /** The reference to the base type. */
  var `type`: Type = js.native
  def apply(): Dicti[T] = js.native
  def apply(data: js.Array[Double]): Dicti[T] = js.native
  def apply(data: js.Array[Double], length: Double): Dicti[T] = js.native
  def apply(data: Buffer): Dicti[T] = js.native
  def apply(data: Buffer, length: Double): Dicti[T] = js.native
  def apply(length: Double): Dicti[T] = js.native
  /**
    * Accepts a Buffer instance that should be an already-populated with data
    * for the ArrayType. The "length" of the Array is determined by searching
    * through the buffer's contents until an aligned NULL pointer is encountered.
    */
  def untilZeros(buffer: Buffer): Dicti[T] = js.native
}

