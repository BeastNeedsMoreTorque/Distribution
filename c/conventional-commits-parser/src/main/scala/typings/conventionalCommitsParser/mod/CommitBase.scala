package typings.conventionalCommitsParser.mod

import typings.conventionalCommitsParser.mod.Commit.Field
import typings.conventionalCommitsParser.mod.Commit.Note
import typings.conventionalCommitsParser.mod.Commit.Reference
import typings.conventionalCommitsParser.mod.Commit.Revert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitBase extends js.Object {
  /**
    * @default
    * null
    */
  var body: Field
  /**
    * @default
    * null
    */
  var footer: Field
  /**
    * @default
    * null
    */
  var header: Field
  /**
    * @default
    * []
    */
  var mentions: js.Array[String]
  /**
    * @default
    * null
    */
  var merge: Field
  /**
    * @default
    * []
    */
  var notes: js.Array[Note]
  /**
    * @default
    * []
    */
  var references: js.Array[Reference]
  /**
    * @default
    * null
    */
  var revert: Revert | Null
  var scope: js.UndefOr[Field] = js.undefined
  var subject: js.UndefOr[Field] = js.undefined
  var `type`: js.UndefOr[Field] = js.undefined
}

object CommitBase {
  @scala.inline
  def apply(
    mentions: js.Array[String],
    notes: js.Array[Note],
    references: js.Array[Reference],
    body: Field = null,
    footer: Field = null,
    header: Field = null,
    merge: Field = null,
    revert: Revert = null,
    scope: js.UndefOr[Null | Field] = js.undefined,
    subject: js.UndefOr[Null | Field] = js.undefined,
    `type`: js.UndefOr[Null | Field] = js.undefined
  ): CommitBase = {
    val __obj = js.Dynamic.literal(mentions = mentions.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], merge = merge.asInstanceOf[js.Any], revert = revert.asInstanceOf[js.Any])
    if (!js.isUndefined(scope)) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(subject)) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitBase]
  }
}

