package typings.gapiClientYoutube.gapi.client.youtube

import typings.gapiClient.gapi.client.Request
import typings.gapiClientYoutube.anon.CategoryId
import typings.gapiClientYoutube.anon.Part
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsResource extends js.Object {
  /** Returns a collection of zero or more channel resources that match the request criteria. */
  def list(request: CategoryId): Request[ChannelListResponse]
  /**
    * Updates a channel's metadata. Note that this method currently only supports updates to the channel resource's brandingSettings and invideoPromotion
    * objects and their child properties.
    */
  def update(request: Part): Request[Channel]
}

object ChannelsResource {
  @scala.inline
  def apply(list: CategoryId => Request[ChannelListResponse], update: Part => Request[Channel]): ChannelsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ChannelsResource]
  }
}

