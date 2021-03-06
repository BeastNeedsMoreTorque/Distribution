package typings.paystack.anon

import typings.paystack.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Update extends js.Object {
  def create(params: Accountnumber): js.Promise[Response] = js.native
  def get(id_or_slug: String): js.Promise[Response] = js.native
  def get(id_or_slug: Double): js.Promise[Response] = js.native
  def list(): js.Promise[Response] = js.native
  def list(param: js.Any): js.Promise[Response] = js.native
  def update(id_or_slug: String, params: js.Any): js.Promise[Response] = js.native
  def update(id_or_slug: Double, params: js.Any): js.Promise[Response] = js.native
}

