package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclCipherDecryptParams extends SjclCipherParams {
  var iv: js.UndefOr[BitArray_] = js.undefined
  var salt: js.UndefOr[BitArray_] = js.undefined
}

object SjclCipherDecryptParams {
  @scala.inline
  def apply(
    adata: String = null,
    cipher: String = null,
    iter: js.UndefOr[Double] = js.undefined,
    iv: BitArray_ = null,
    ks: js.UndefOr[Double] = js.undefined,
    mode: String = null,
    salt: BitArray_ = null,
    ts: js.UndefOr[Double] = js.undefined,
    v: js.UndefOr[Double] = js.undefined
  ): SjclCipherDecryptParams = {
    val __obj = js.Dynamic.literal()
    if (adata != null) __obj.updateDynamic("adata")(adata.asInstanceOf[js.Any])
    if (cipher != null) __obj.updateDynamic("cipher")(cipher.asInstanceOf[js.Any])
    if (!js.isUndefined(iter)) __obj.updateDynamic("iter")(iter.get.asInstanceOf[js.Any])
    if (iv != null) __obj.updateDynamic("iv")(iv.asInstanceOf[js.Any])
    if (!js.isUndefined(ks)) __obj.updateDynamic("ks")(ks.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (salt != null) __obj.updateDynamic("salt")(salt.asInstanceOf[js.Any])
    if (!js.isUndefined(ts)) __obj.updateDynamic("ts")(ts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(v)) __obj.updateDynamic("v")(v.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclCipherDecryptParams]
  }
}

