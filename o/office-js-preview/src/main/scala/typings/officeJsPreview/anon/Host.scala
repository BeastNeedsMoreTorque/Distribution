package typings.officeJsPreview.anon

import typings.officeJsPreview.Office.HostType
import typings.officeJsPreview.Office.PlatformType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Host extends js.Object {
  var host: HostType
  var platform: PlatformType
}

object Host {
  @scala.inline
  def apply(host: HostType, platform: PlatformType): Host = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
}

