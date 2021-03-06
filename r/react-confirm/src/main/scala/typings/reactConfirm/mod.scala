package typings.reactConfirm

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-confirm", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait ReactConfirmProps extends js.Object {
    var confirmation: String | ReactElement = js.native
    var show: Boolean = js.native
    def cancel(): Unit = js.native
    def cancel(value: String): Unit = js.native
    def dismiss(): Unit = js.native
    def proceed(): Unit = js.native
    def proceed(value: String): Unit = js.native
  }
  
  def confirmable[P](component: ComponentType[ReactConfirmProps with P]): ComponentType[P] = js.native
  def createConfirmation(component: ComponentType[_]): js.Function1[/* props */ js.Any, js.Promise[String]] = js.native
  def createConfirmation(component: ComponentType[_], unmountDelay: Double): js.Function1[/* props */ js.Any, js.Promise[String]] = js.native
}

