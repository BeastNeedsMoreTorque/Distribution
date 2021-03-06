package typings.compressionWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZlibOptions
  extends BaseOptions
     with Options[js.Any] {
  /**
    * The compression algorithm/function
    * @default 'gzip'
    */
  var algorithm: js.UndefOr[ZlibAlgorithm] = js.undefined
  /**
    * Compression options for algorithm
    * @default { level: 9 }
    */
  var compressionOptions: js.UndefOr[typings.node.zlibMod.ZlibOptions] = js.undefined
}

object ZlibOptions {
  @scala.inline
  def apply(
    algorithm: ZlibAlgorithm = null,
    cache: Boolean | String = null,
    compressionOptions: typings.node.zlibMod.ZlibOptions = null,
    deleteOriginalAssets: js.UndefOr[Boolean] = js.undefined,
    exclude: Rules = null,
    filename: String | FilenameFunction = null,
    include: Rules = null,
    minRatio: js.UndefOr[Double] = js.undefined,
    test: Rules = null,
    threshold: js.UndefOr[Double] = js.undefined
  ): ZlibOptions = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (compressionOptions != null) __obj.updateDynamic("compressionOptions")(compressionOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteOriginalAssets)) __obj.updateDynamic("deleteOriginalAssets")(deleteOriginalAssets.get.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(minRatio)) __obj.updateDynamic("minRatio")(minRatio.get.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZlibOptions]
  }
}

