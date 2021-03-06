package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for the payload to request to increment an
  * achievement.
  */
@js.native
trait SchemaGamesAchievementIncrement extends js.Object {
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#GamesAchievementIncrement.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The requestId associated with an increment to an achievement.
    */
  var requestId: js.UndefOr[String] = js.native
  /**
    * The number of steps to be incremented.
    */
  var steps: js.UndefOr[Double] = js.native
}

object SchemaGamesAchievementIncrement {
  @scala.inline
  def apply(kind: String = null, requestId: String = null, steps: js.UndefOr[Double] = js.undefined): SchemaGamesAchievementIncrement = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    if (!js.isUndefined(steps)) __obj.updateDynamic("steps")(steps.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGamesAchievementIncrement]
  }
}

