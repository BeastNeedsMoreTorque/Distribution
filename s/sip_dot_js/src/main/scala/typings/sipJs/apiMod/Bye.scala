package typings.sipJs.apiMod

import typings.sipJs.methodsByeMod.IncomingByeRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "Bye")
@js.native
class Bye protected ()
  extends typings.sipJs.byeMod.Bye {
  /** @internal */
  def this(incomingByeRequest: IncomingByeRequest) = this()
}

