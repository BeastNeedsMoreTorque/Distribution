package typings.framebus

import typings.framebus.typesMod.FramebusSubscribeHandler
import typings.framebus.typesMod.FramebusSubscriberArg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("framebus/dist/lib/package-payload", JSImport.Namespace)
@js.native
object packagePayloadMod extends js.Object {
  def packagePayload(event: String, origin: String): String = js.native
  def packagePayload(event: String, origin: String, data: FramebusSubscriberArg): String = js.native
  def packagePayload(event: String, origin: String, data: FramebusSubscriberArg, reply: FramebusSubscribeHandler): String = js.native
}

