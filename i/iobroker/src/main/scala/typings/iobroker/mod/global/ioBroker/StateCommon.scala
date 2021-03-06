package typings.iobroker.mod.global.ioBroker

import typings.iobroker.anon.Id
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateCommon extends ObjectCommon {
  /** Configures this state as an alias for another state */
  var alias: js.UndefOr[Id] = js.undefined
  /** Custom settings for this state */
  var custom: js.UndefOr[Record[String, _]] = js.undefined
  /** the default value */
  var `def`: js.UndefOr[js.Any] = js.undefined
  /** the default status of the ack flag */
  var defAck: js.UndefOr[Boolean] = js.undefined
  /** description of this state */
  var desc: js.UndefOr[String] = js.undefined
  /** attached history information */
  var history: js.UndefOr[js.Any] = js.undefined
  /** maximum value */
  var max: js.UndefOr[Double] = js.undefined
  /** minimum value */
  var min: js.UndefOr[Double] = js.undefined
  /** if this state is readable */
  var read: Boolean
  /** role of the state (used in user interfaces to indicate which widget to choose) */
  @JSName("role")
  var role_StateCommon: String
  /**
    * Dictionary of possible values for this state in the form
    * <pre>
    * {
    *     "internal value 1": "displayed value 1",
    *     "internal value 2": "displayed value 2",
    *     ...
    * }
    * </pre>
    * In old ioBroker versions, this could also be a string of the form
    * "val1:text1;val2:text2" (now deprecated)
    */
  var states: js.UndefOr[(Record[String, String]) | String] = js.undefined
  /** Type of this state. See https://github.com/ioBroker/ioBroker/blob/master/doc/SCHEMA.md#state-commonrole for a detailed description */
  var `type`: js.UndefOr[CommonType] = js.undefined
  /** unit of the value */
  var unit: js.UndefOr[String] = js.undefined
  /** ID of a helper state indicating if the handler of this state is working */
  var workingID: js.UndefOr[String] = js.undefined
  /** if this state is writable */
  var write: Boolean
}

object StateCommon {
  @scala.inline
  def apply(
    name: String,
    read: Boolean,
    role: String,
    write: Boolean,
    alias: Id = null,
    custom: Record[String, _] = null,
    `def`: js.Any = null,
    defAck: js.UndefOr[Boolean] = js.undefined,
    desc: String = null,
    history: js.Any = null,
    icon: String = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    states: (Record[String, String]) | String = null,
    `type`: CommonType = null,
    unit: String = null,
    workingID: String = null
  ): StateCommon = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (`def` != null) __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    if (!js.isUndefined(defAck)) __obj.updateDynamic("defAck")(defAck.get.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (workingID != null) __obj.updateDynamic("workingID")(workingID.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateCommon]
  }
}

