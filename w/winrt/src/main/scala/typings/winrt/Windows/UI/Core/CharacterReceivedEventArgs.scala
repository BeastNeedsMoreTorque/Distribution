package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharacterReceivedEventArgs extends ICharacterReceivedEventArgs

object CharacterReceivedEventArgs {
  @scala.inline
  def apply(handled: Boolean, keyCode: Double, keyStatus: CorePhysicalKeyStatus): CharacterReceivedEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], keyStatus = keyStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacterReceivedEventArgs]
  }
}

