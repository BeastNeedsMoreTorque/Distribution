package typings.recoil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recoil", "useSetRecoilState")
@js.native
object useSetRecoilState extends js.Object {
  def apply[T](recoilState: RecoilState[T]): SetterOrUpdater[T] = js.native
}

