package typings.gulp.mod

import typings.chokidar.mod.AwaitWriteFinishOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchOptions
  extends typings.chokidar.mod.WatchOptions {
  /**
    * The delay to wait before triggering the fn.
    * Useful for waiting on many changes before doing the work on changed files, e.g. find-and-replace on many files.
    * @default 200
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Whether or not a file change should queue the fn execution if the fn is already running. Useful for a long running fn.
    * @default true
    */
  var queue: js.UndefOr[Boolean] = js.undefined
}

object WatchOptions {
  @scala.inline
  def apply(
    alwaysStat: js.UndefOr[Boolean] = js.undefined,
    atomic: Boolean | Double = null,
    awaitWriteFinish: AwaitWriteFinishOptions | Boolean = null,
    binaryInterval: js.UndefOr[Double] = js.undefined,
    cwd: String = null,
    delay: js.UndefOr[Double] = js.undefined,
    depth: js.UndefOr[Double] = js.undefined,
    disableGlobbing: js.UndefOr[Boolean] = js.undefined,
    followSymlinks: js.UndefOr[Boolean] = js.undefined,
    ignoreInitial: js.UndefOr[Boolean] = js.undefined,
    ignorePermissionErrors: js.UndefOr[Boolean] = js.undefined,
    ignored: js.Any = null,
    interval: js.UndefOr[Double] = js.undefined,
    persistent: js.UndefOr[Boolean] = js.undefined,
    queue: js.UndefOr[Boolean] = js.undefined,
    useFsEvents: js.UndefOr[Boolean] = js.undefined,
    usePolling: js.UndefOr[Boolean] = js.undefined
  ): WatchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysStat)) __obj.updateDynamic("alwaysStat")(alwaysStat.get.asInstanceOf[js.Any])
    if (atomic != null) __obj.updateDynamic("atomic")(atomic.asInstanceOf[js.Any])
    if (awaitWriteFinish != null) __obj.updateDynamic("awaitWriteFinish")(awaitWriteFinish.asInstanceOf[js.Any])
    if (!js.isUndefined(binaryInterval)) __obj.updateDynamic("binaryInterval")(binaryInterval.get.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableGlobbing)) __obj.updateDynamic("disableGlobbing")(disableGlobbing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(followSymlinks)) __obj.updateDynamic("followSymlinks")(followSymlinks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreInitial)) __obj.updateDynamic("ignoreInitial")(ignoreInitial.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignorePermissionErrors)) __obj.updateDynamic("ignorePermissionErrors")(ignorePermissionErrors.get.asInstanceOf[js.Any])
    if (ignored != null) __obj.updateDynamic("ignored")(ignored.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(queue)) __obj.updateDynamic("queue")(queue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useFsEvents)) __obj.updateDynamic("useFsEvents")(useFsEvents.get.asInstanceOf[js.Any])
    if (!js.isUndefined(usePolling)) __obj.updateDynamic("usePolling")(usePolling.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchOptions]
  }
}

