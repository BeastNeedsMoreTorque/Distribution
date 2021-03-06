package typings.gapiClientGames.gapi.client.games

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGames.anon.PageToken
import typings.gapiClientGames.anon.QuestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuestsResource extends js.Object {
  /** Indicates that the currently authorized user will participate in the quest. */
  def accept(request: QuestId): Request[Quest]
  /** Get a list of quests for your application and the currently authenticated player. */
  def list(request: PageToken): Request[QuestListResponse]
}

object QuestsResource {
  @scala.inline
  def apply(accept: QuestId => Request[Quest], list: PageToken => Request[QuestListResponse]): QuestsResource = {
    val __obj = js.Dynamic.literal(accept = js.Any.fromFunction1(accept), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[QuestsResource]
  }
}

