package typings.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProviderDeferral extends IDataProviderDeferral

object DataProviderDeferral {
  @scala.inline
  def apply(complete: () => Unit): DataProviderDeferral = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
    __obj.asInstanceOf[DataProviderDeferral]
  }
}

