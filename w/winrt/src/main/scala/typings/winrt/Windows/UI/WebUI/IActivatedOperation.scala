package typings.winrt.Windows.UI.WebUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActivatedOperation extends js.Object {
  def getDeferral(): ActivatedDeferral
}

object IActivatedOperation {
  @scala.inline
  def apply(getDeferral: () => ActivatedDeferral): IActivatedOperation = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[IActivatedOperation]
  }
}

