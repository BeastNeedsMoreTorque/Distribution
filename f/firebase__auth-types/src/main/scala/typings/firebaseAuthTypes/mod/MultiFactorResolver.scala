package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/auth-types", "MultiFactorResolver")
@js.native
class MultiFactorResolver protected () extends js.Object {
  var auth: FirebaseAuth = js.native
  var hints: js.Array[MultiFactorInfo] = js.native
  var session: MultiFactorSession = js.native
  def resolveSignIn(assertion: MultiFactorAssertion): js.Promise[UserCredential] = js.native
}

