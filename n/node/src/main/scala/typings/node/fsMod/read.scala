package typings.node.fsMod

import typings.node.NodeJS.ErrnoException
import typings.node.anon.BufferBytesRead
import typings.node.anon.BufferDataViewBytesReadNumber
import typings.node.anon.BufferFloat32ArrayBytesReadNumber
import typings.node.anon.BufferFloat64ArrayBytesReadNumber
import typings.node.anon.BufferInt16ArrayBytesReadNumber
import typings.node.anon.BufferInt32ArrayBytesReadNumber
import typings.node.anon.BufferInt8ArrayBytesReadNumber
import typings.node.anon.BufferUint32ArrayBytesReadNumber
import typings.node.anon.BytesRead
import typings.node.anon.BytesReadNumber
import typings.std.DataView
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "read")
@js.native
object read extends js.Object {
  def apply(
    fd: Double,
    buffer: DataView,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: DataView,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ DataView, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Float32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Float32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Float64Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Float64Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Float64Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int16Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int32Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Int8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Int8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint16Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint32Array, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ Uint8Array, Unit]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  def apply(
    fd: Double,
    buffer: Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ Uint8ClampedArray, 
      Unit
    ]
  ): Unit = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: DataView, offset: Double, length: Double): js.Promise[BufferDataViewBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: DataView, offset: Double, length: Double, position: Double): js.Promise[BufferDataViewBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Float32Array, offset: Double, length: Double): js.Promise[BufferFloat32ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Float32Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat32ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Float64Array, offset: Double, length: Double): js.Promise[BufferFloat64ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Float64Array, offset: Double, length: Double, position: Double): js.Promise[BufferFloat64ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Int16Array, offset: Double, length: Double): js.Promise[BufferInt16ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Int16Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt16ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Int32Array, offset: Double, length: Double): js.Promise[BufferInt32ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Int32Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt32ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Int8Array, offset: Double, length: Double): js.Promise[BufferInt8ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Int8Array, offset: Double, length: Double, position: Double): js.Promise[BufferInt8ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint16Array, offset: Double, length: Double): js.Promise[BytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint16Array, offset: Double, length: Double, position: Double): js.Promise[BytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint32Array, offset: Double, length: Double): js.Promise[BufferUint32ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint32Array, offset: Double, length: Double, position: Double): js.Promise[BufferUint32ArrayBytesReadNumber] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint8Array, offset: Double, length: Double): js.Promise[BytesRead] = js.native
  /**
    * @param fd A file descriptor.
    * @param buffer The buffer that the data will be written to.
    * @param offset The offset in the buffer at which to start writing.
    * @param length The number of bytes to read.
    * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
    */
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint8Array, offset: Double, length: Double, position: Double): js.Promise[BytesRead] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double): js.Promise[BufferBytesRead] = js.native
  @JSName("__promisify__")
  def promisify(fd: Double, buffer: Uint8ClampedArray, offset: Double, length: Double, position: Double): js.Promise[BufferBytesRead] = js.native
}

