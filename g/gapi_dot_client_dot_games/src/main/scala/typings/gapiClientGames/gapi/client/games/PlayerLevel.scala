package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayerLevel extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#playerLevel. */
  var kind: js.UndefOr[String] = js.undefined
  /** The level for the user. */
  var level: js.UndefOr[Double] = js.undefined
  /** The maximum experience points for this level. */
  var maxExperiencePoints: js.UndefOr[String] = js.undefined
  /** The minimum experience points for this level. */
  var minExperiencePoints: js.UndefOr[String] = js.undefined
}

object PlayerLevel {
  @scala.inline
  def apply(
    kind: String = null,
    level: js.UndefOr[Double] = js.undefined,
    maxExperiencePoints: String = null,
    minExperiencePoints: String = null
  ): PlayerLevel = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    if (maxExperiencePoints != null) __obj.updateDynamic("maxExperiencePoints")(maxExperiencePoints.asInstanceOf[js.Any])
    if (minExperiencePoints != null) __obj.updateDynamic("minExperiencePoints")(minExperiencePoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerLevel]
  }
}

