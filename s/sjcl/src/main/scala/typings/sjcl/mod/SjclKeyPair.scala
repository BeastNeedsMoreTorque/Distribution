package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclKeyPair[P /* <: SjclECCPublicKey */, S /* <: SjclECCSecretKey */] extends js.Object {
  var pub: P
  var sec: S
}

object SjclKeyPair {
  @scala.inline
  def apply[/* <: typings.sjcl.mod.SjclECCPublicKey */ P, /* <: typings.sjcl.mod.SjclECCSecretKey */ S](pub: P, sec: S): SjclKeyPair[P, S] = {
    val __obj = js.Dynamic.literal(pub = pub.asInstanceOf[js.Any], sec = sec.asInstanceOf[js.Any])
    __obj.asInstanceOf[SjclKeyPair[P, S]]
  }
}

