package typings.authmosphere

import typings.authmosphere.anon.Expiresin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authmosphere/lib/src/types/Token", JSImport.Namespace)
@js.native
object tokenMod extends js.Object {
  type Token[CustomTokenPart] = CustomTokenPart with Expiresin
}

