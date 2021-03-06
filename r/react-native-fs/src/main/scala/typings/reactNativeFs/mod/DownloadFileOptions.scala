package typings.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadFileOptions extends js.Object {
  // An object of headers to be passed to the server
  var background: js.UndefOr[Boolean] = js.undefined
  // supported on Android and iOS
  var backgroundTimeout: js.UndefOr[Double] = js.undefined
  var begin: js.UndefOr[js.Function1[/* res */ DownloadBeginCallbackResult, Unit]] = js.undefined
  // Allow the OS to control the timing and speed of the download to improve perceived performance  (iOS only)
  var cacheable: js.UndefOr[Boolean] = js.undefined
  // only supported on iOS yet
  var connectionTimeout: js.UndefOr[Double] = js.undefined
  // Continue the download in the background after the app terminates (iOS only)
  var discretionary: js.UndefOr[Boolean] = js.undefined
  var fromUrl: String
  // Local filesystem path to save the file to
  var headers: js.UndefOr[Headers] = js.undefined
  var progress: js.UndefOr[js.Function1[/* res */ DownloadProgressCallbackResult, Unit]] = js.undefined
  var progressDivider: js.UndefOr[Double] = js.undefined
  // Whether the download can be stored in the shared NSURLCache (iOS only)
  var progressInterval: js.UndefOr[Double] = js.undefined
  // only supported on Android yet
  var readTimeout: js.UndefOr[Double] = js.undefined
  var resumable: js.UndefOr[js.Function0[Unit]] = js.undefined
  // URL to download file from
  var toFile: String
}

object DownloadFileOptions {
  @scala.inline
  def apply(
    fromUrl: String,
    toFile: String,
    background: js.UndefOr[Boolean] = js.undefined,
    backgroundTimeout: js.UndefOr[Double] = js.undefined,
    begin: /* res */ DownloadBeginCallbackResult => Unit = null,
    cacheable: js.UndefOr[Boolean] = js.undefined,
    connectionTimeout: js.UndefOr[Double] = js.undefined,
    discretionary: js.UndefOr[Boolean] = js.undefined,
    headers: Headers = null,
    progress: /* res */ DownloadProgressCallbackResult => Unit = null,
    progressDivider: js.UndefOr[Double] = js.undefined,
    progressInterval: js.UndefOr[Double] = js.undefined,
    readTimeout: js.UndefOr[Double] = js.undefined,
    resumable: () => Unit = null
  ): DownloadFileOptions = {
    val __obj = js.Dynamic.literal(fromUrl = fromUrl.asInstanceOf[js.Any], toFile = toFile.asInstanceOf[js.Any])
    if (!js.isUndefined(background)) __obj.updateDynamic("background")(background.get.asInstanceOf[js.Any])
    if (!js.isUndefined(backgroundTimeout)) __obj.updateDynamic("backgroundTimeout")(backgroundTimeout.get.asInstanceOf[js.Any])
    if (begin != null) __obj.updateDynamic("begin")(js.Any.fromFunction1(begin))
    if (!js.isUndefined(cacheable)) __obj.updateDynamic("cacheable")(cacheable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionTimeout)) __obj.updateDynamic("connectionTimeout")(connectionTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(discretionary)) __obj.updateDynamic("discretionary")(discretionary.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction1(progress))
    if (!js.isUndefined(progressDivider)) __obj.updateDynamic("progressDivider")(progressDivider.get.asInstanceOf[js.Any])
    if (!js.isUndefined(progressInterval)) __obj.updateDynamic("progressInterval")(progressInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readTimeout)) __obj.updateDynamic("readTimeout")(readTimeout.get.asInstanceOf[js.Any])
    if (resumable != null) __obj.updateDynamic("resumable")(js.Any.fromFunction0(resumable))
    __obj.asInstanceOf[DownloadFileOptions]
  }
}

