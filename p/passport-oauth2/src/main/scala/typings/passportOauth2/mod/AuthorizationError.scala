package typings.passportOauth2.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-oauth2", "AuthorizationError")
@js.native
class AuthorizationError protected () extends Error {
  def this(message: js.UndefOr[String], code: String) = this()
  def this(message: js.UndefOr[String], code: String, uri: String) = this()
  def this(message: js.UndefOr[String], code: String, uri: String, status: Double) = this()
  var code: String = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var status: Double = js.native
  var uri: js.UndefOr[String] = js.native
}

