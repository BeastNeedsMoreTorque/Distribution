package typings.fingerprintjs2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedJsFonts extends js.Object {
  var extendedJsFonts: Boolean
  var swfContainerId: String
  var swfPath: String
  var userDefinedFonts: js.Array[String]
}

object ExtendedJsFonts {
  @scala.inline
  def apply(
    extendedJsFonts: Boolean,
    swfContainerId: String,
    swfPath: String,
    userDefinedFonts: js.Array[String]
  ): ExtendedJsFonts = {
    val __obj = js.Dynamic.literal(extendedJsFonts = extendedJsFonts.asInstanceOf[js.Any], swfContainerId = swfContainerId.asInstanceOf[js.Any], swfPath = swfPath.asInstanceOf[js.Any], userDefinedFonts = userDefinedFonts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedJsFonts]
  }
}

