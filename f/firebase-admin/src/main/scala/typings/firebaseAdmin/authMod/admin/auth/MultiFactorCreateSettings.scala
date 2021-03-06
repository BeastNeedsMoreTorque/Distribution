package typings.firebaseAdmin.authMod.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The multi-factor related user settings for create operations.
  */
trait MultiFactorCreateSettings extends js.Object {
  /**
    * The created user's list of enrolled second factors.
    */
  var enrolledFactors: js.Array[CreateMultiFactorInfoRequest]
}

object MultiFactorCreateSettings {
  @scala.inline
  def apply(enrolledFactors: js.Array[CreateMultiFactorInfoRequest]): MultiFactorCreateSettings = {
    val __obj = js.Dynamic.literal(enrolledFactors = enrolledFactors.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorCreateSettings]
  }
}

