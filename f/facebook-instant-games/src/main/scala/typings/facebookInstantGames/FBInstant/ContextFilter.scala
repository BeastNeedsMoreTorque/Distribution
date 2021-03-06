package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filter that may be applied to a Context Choose operation
  * 'NEW_CONTEXT_ONLY' - Prefer to only surface contexts the game has not been played in before.
  * 'INCLUDE_EXISTING_CHALLENGES' - Include the "Existing Challenges" section, which surfaces actively played-in contexts that the player is a part of.
  * 'NEW_PLAYERS_ONLY' - In sections containing individuals, prefer people who have not played the game.
  */
/* Rewritten from type alias, can be one of: 
  - typings.facebookInstantGames.facebookInstantGamesStrings.NEW_CONTEXT_ONLY
  - typings.facebookInstantGames.facebookInstantGamesStrings.INCLUDE_EXISTING_CHALLENGES
  - typings.facebookInstantGames.facebookInstantGamesStrings.NEW_PLAYERS_ONLY
*/
trait ContextFilter extends js.Object

object ContextFilter {
  @scala.inline
  def INCLUDE_EXISTING_CHALLENGES: typings.facebookInstantGames.facebookInstantGamesStrings.INCLUDE_EXISTING_CHALLENGES = "INCLUDE_EXISTING_CHALLENGES".asInstanceOf[typings.facebookInstantGames.facebookInstantGamesStrings.INCLUDE_EXISTING_CHALLENGES]
  @scala.inline
  def NEW_CONTEXT_ONLY: typings.facebookInstantGames.facebookInstantGamesStrings.NEW_CONTEXT_ONLY = "NEW_CONTEXT_ONLY".asInstanceOf[typings.facebookInstantGames.facebookInstantGamesStrings.NEW_CONTEXT_ONLY]
  @scala.inline
  def NEW_PLAYERS_ONLY: typings.facebookInstantGames.facebookInstantGamesStrings.NEW_PLAYERS_ONLY = "NEW_PLAYERS_ONLY".asInstanceOf[typings.facebookInstantGames.facebookInstantGamesStrings.NEW_PLAYERS_ONLY]
}

