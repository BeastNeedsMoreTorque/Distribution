package typings.chrome.chrome.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagesContentSetting extends ContentSetting {
  def set(details: ImagesSetDetails): Unit = js.native
  def set(details: ImagesSetDetails, callback: js.Function0[Unit]): Unit = js.native
}

