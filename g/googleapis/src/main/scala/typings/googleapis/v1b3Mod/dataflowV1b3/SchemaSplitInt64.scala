package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an int64, n, that is immune to precision loss when
  * encoded in JSON.
  */
@js.native
trait SchemaSplitInt64 extends js.Object {
  /**
    * The high order bits, including the sign: n &gt;&gt; 32.
    */
  var highBits: js.UndefOr[Double] = js.native
  /**
    * The low order bits: n &amp; 0xffffffff.
    */
  var lowBits: js.UndefOr[Double] = js.native
}

object SchemaSplitInt64 {
  @scala.inline
  def apply(highBits: js.UndefOr[Double] = js.undefined, lowBits: js.UndefOr[Double] = js.undefined): SchemaSplitInt64 = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(highBits)) __obj.updateDynamic("highBits")(highBits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lowBits)) __obj.updateDynamic("lowBits")(lowBits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSplitInt64]
  }
}

