package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.DataArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "Buffer")
@js.native
class Buffer protected ()
  extends typings.babylonjs.indexMod.Buffer {
  /**
    * Constructor
    * @param engine the engine
    * @param data the data to use for this buffer
    * @param updatable whether the data is updatable
    * @param stride the stride (optional)
    * @param postponeInternalCreation whether to postpone creating the internal WebGL buffer (optional)
    * @param instanced whether the buffer is instanced (optional)
    * @param useBytes set to true if the stride in in bytes (optional)
    * @param divisor sets an optional divisor for instances (1 by default)
    */
  def this(engine: js.Any, data: DataArray, updatable: Boolean) = this()
  def this(engine: js.Any, data: DataArray, updatable: Boolean, stride: Double) = this()
  def this(
    engine: js.Any,
    data: DataArray,
    updatable: Boolean,
    stride: Double,
    postponeInternalCreation: Boolean
  ) = this()
  def this(
    engine: js.Any,
    data: DataArray,
    updatable: Boolean,
    stride: Double,
    postponeInternalCreation: Boolean,
    instanced: Boolean
  ) = this()
  def this(
    engine: js.Any,
    data: DataArray,
    updatable: Boolean,
    stride: Double,
    postponeInternalCreation: Boolean,
    instanced: Boolean,
    useBytes: Boolean
  ) = this()
  def this(
    engine: js.Any,
    data: DataArray,
    updatable: Boolean,
    stride: Double,
    postponeInternalCreation: Boolean,
    instanced: Boolean,
    useBytes: Boolean,
    divisor: Double
  ) = this()
}

