package typings.paystack.anon

import typings.paystack.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Charge extends js.Object {
  def charge(params: Authorizationcode): js.Promise[Response] = js.native
  def get(id: String): js.Promise[Response] = js.native
  def get(id: Double): js.Promise[Response] = js.native
  def initialize(params: Name): js.Promise[Response] = js.native
  def list(): js.Promise[ResponsedataArrayanymetaa] = js.native
  def totals(): js.Promise[Response] = js.native
  def verify(transReference: String): js.Promise[Response] = js.native
}

