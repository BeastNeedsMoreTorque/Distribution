package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings that specify parameters affecting how the dashboard or dashboard item is exported in Image format.
  */
trait ImageFormatOptions extends js.Object {
  /** @deprecated The ImageFormatOptions.Format property is obsolete now. Use the DashboardImageExportOptions.Format property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets an image format in which the dashboard (dashboard item) is exported.
    */
  var Format: String
  /** @deprecated The ImageFormatOptions.Resolution property is obsolete now. Use the DashboardImageExportOptions.Resolution property instead. To learn more, see the following KB article: https://www.devexpress.com/Support/Center/Question/Details/T488764 */
  /**
    * Gets or sets the resolution (in dpi) used to export a dashboard (dashboard item) in Image format.
    */
  var Resolution: Double
}

object ImageFormatOptions {
  @scala.inline
  def apply(Format: String, Resolution: Double): ImageFormatOptions = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any], Resolution = Resolution.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageFormatOptions]
  }
}

