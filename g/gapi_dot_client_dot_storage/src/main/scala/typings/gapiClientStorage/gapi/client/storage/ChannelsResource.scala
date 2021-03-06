package typings.gapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request
import typings.gapiClientStorage.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsResource extends js.Object {
  /** Stop watching resources through this channel */
  def stop(request: PrettyPrint): Request[Unit]
}

object ChannelsResource {
  @scala.inline
  def apply(stop: PrettyPrint => Request[Unit]): ChannelsResource = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction1(stop))
    __obj.asInstanceOf[ChannelsResource]
  }
}

