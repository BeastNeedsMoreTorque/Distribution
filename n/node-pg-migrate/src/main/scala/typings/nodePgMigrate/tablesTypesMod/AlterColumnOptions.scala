package typings.nodePgMigrate.tablesTypesMod

import typings.nodePgMigrate.generalTypesMod.Value
import typings.nodePgMigrate.nodePgMigrateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlterColumnOptions extends js.Object {
  var allowNull: js.UndefOr[Boolean] = js.undefined
  var collation: js.UndefOr[String] = js.undefined
  var comment: js.UndefOr[String | Null] = js.undefined
  var default: js.UndefOr[Value] = js.undefined
  /**
    * @deprecated use sequenceGenerated
    */
  var generated: js.UndefOr[Null | `false` | SequenceGeneratedOptions] = js.undefined
  var notNull: js.UndefOr[Boolean] = js.undefined
  var sequenceGenerated: js.UndefOr[Null | `false` | SequenceGeneratedOptions] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var using: js.UndefOr[String] = js.undefined
}

object AlterColumnOptions {
  @scala.inline
  def apply(
    allowNull: js.UndefOr[Boolean] = js.undefined,
    collation: String = null,
    comment: js.UndefOr[Null | String] = js.undefined,
    default: js.UndefOr[Null | Value] = js.undefined,
    generated: js.UndefOr[Null | `false` | SequenceGeneratedOptions] = js.undefined,
    notNull: js.UndefOr[Boolean] = js.undefined,
    sequenceGenerated: js.UndefOr[Null | `false` | SequenceGeneratedOptions] = js.undefined,
    `type`: String = null,
    using: String = null
  ): AlterColumnOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNull)) __obj.updateDynamic("allowNull")(allowNull.get.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (!js.isUndefined(comment)) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(generated)) __obj.updateDynamic("generated")(generated.asInstanceOf[js.Any])
    if (!js.isUndefined(notNull)) __obj.updateDynamic("notNull")(notNull.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sequenceGenerated)) __obj.updateDynamic("sequenceGenerated")(sequenceGenerated.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (using != null) __obj.updateDynamic("using")(using.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlterColumnOptions]
  }
}

