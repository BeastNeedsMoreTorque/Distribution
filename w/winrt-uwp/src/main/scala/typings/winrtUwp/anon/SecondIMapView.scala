package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecondIMapView extends js.Object {
  /** One half of the original map. */ var first: IMapView[String, String]
  /** The second half of the original map. */ var second: IMapView[String, String]
}

object SecondIMapView {
  @scala.inline
  def apply(first: IMapView[String, String], second: IMapView[String, String]): SecondIMapView = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecondIMapView]
  }
}

