package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BotAliasMetadata extends js.Object {
  /**
    * The name of the bot to which the alias points.
    */
  var botName: js.UndefOr[BotName] = js.native
  /**
    * The version of the Amazon Lex bot to which the alias points.
    */
  var botVersion: js.UndefOr[Version] = js.native
  /**
    * Checksum of the bot alias.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * Settings that determine how Amazon Lex uses conversation logs for the alias.
    */
  var conversationLogs: js.UndefOr[ConversationLogsResponse] = js.native
  /**
    * The date that the bot alias was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  /**
    * A description of the bot alias.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The date that the bot alias was updated. When you create a resource, the creation date and last updated date are the same.
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the bot alias.
    */
  var name: js.UndefOr[AliasName] = js.native
}

object BotAliasMetadata {
  @scala.inline
  def apply(
    botName: BotName = null,
    botVersion: Version = null,
    checksum: String = null,
    conversationLogs: ConversationLogsResponse = null,
    createdDate: Timestamp = null,
    description: Description = null,
    lastUpdatedDate: Timestamp = null,
    name: AliasName = null
  ): BotAliasMetadata = {
    val __obj = js.Dynamic.literal()
    if (botName != null) __obj.updateDynamic("botName")(botName.asInstanceOf[js.Any])
    if (botVersion != null) __obj.updateDynamic("botVersion")(botVersion.asInstanceOf[js.Any])
    if (checksum != null) __obj.updateDynamic("checksum")(checksum.asInstanceOf[js.Any])
    if (conversationLogs != null) __obj.updateDynamic("conversationLogs")(conversationLogs.asInstanceOf[js.Any])
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotAliasMetadata]
  }
}

