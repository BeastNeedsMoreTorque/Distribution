package typings.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A verifier for domain verification and abuse prevention. Currently, the
  * only implementation is {@link firebase.auth.RecaptchaVerifier}.
  */
trait ApplicationVerifier extends js.Object {
  /**
    * Identifies the type of application verifier (e.g. "recaptcha").
    */
  var `type`: String
  /**
    * Executes the verification process.
    * @return A Promise for a token that can be used to
    *     assert the validity of a request.
    */
  def verify(): js.Promise[String]
}

object ApplicationVerifier {
  @scala.inline
  def apply(`type`: String, verify: () => js.Promise[String]): ApplicationVerifier = {
    val __obj = js.Dynamic.literal(verify = js.Any.fromFunction0(verify))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationVerifier]
  }
}

