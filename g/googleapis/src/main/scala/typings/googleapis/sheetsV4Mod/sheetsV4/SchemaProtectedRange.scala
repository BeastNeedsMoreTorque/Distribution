package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A protected range.
  */
@js.native
trait SchemaProtectedRange extends js.Object {
  /**
    * The description of this protected range.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The users and groups with edit access to the protected range. This field
    * is only visible to users with edit access to the protected range and the
    * document. Editors are not supported with warning_only protection.
    */
  var editors: js.UndefOr[SchemaEditors] = js.native
  /**
    * The named range this protected range is backed by, if any.  When writing,
    * only one of range or named_range_id may be set.
    */
  var namedRangeId: js.UndefOr[String] = js.native
  /**
    * The ID of the protected range. This field is read-only.
    */
  var protectedRangeId: js.UndefOr[Double] = js.native
  /**
    * The range that is being protected. The range may be fully unbounded, in
    * which case this is considered a protected sheet.  When writing, only one
    * of range or named_range_id may be set.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  /**
    * True if the user who requested this protected range can edit the
    * protected area. This field is read-only.
    */
  var requestingUserCanEdit: js.UndefOr[Boolean] = js.native
  /**
    * The list of unprotected ranges within a protected sheet. Unprotected
    * ranges are only supported on protected sheets.
    */
  var unprotectedRanges: js.UndefOr[js.Array[SchemaGridRange]] = js.native
  /**
    * True if this protected range will show a warning when editing.
    * Warning-based protection means that every user can edit data in the
    * protected range, except editing will prompt a warning asking the user to
    * confirm the edit.  When writing: if this field is true, then editors is
    * ignored. Additionally, if this field is changed from true to false and
    * the `editors` field is not set (nor included in the field mask), then the
    * editors will be set to all the editors in the document.
    */
  var warningOnly: js.UndefOr[Boolean] = js.native
}

object SchemaProtectedRange {
  @scala.inline
  def apply(
    description: String = null,
    editors: SchemaEditors = null,
    namedRangeId: String = null,
    protectedRangeId: js.UndefOr[Double] = js.undefined,
    range: SchemaGridRange = null,
    requestingUserCanEdit: js.UndefOr[Boolean] = js.undefined,
    unprotectedRanges: js.Array[SchemaGridRange] = null,
    warningOnly: js.UndefOr[Boolean] = js.undefined
  ): SchemaProtectedRange = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (editors != null) __obj.updateDynamic("editors")(editors.asInstanceOf[js.Any])
    if (namedRangeId != null) __obj.updateDynamic("namedRangeId")(namedRangeId.asInstanceOf[js.Any])
    if (!js.isUndefined(protectedRangeId)) __obj.updateDynamic("protectedRangeId")(protectedRangeId.get.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(requestingUserCanEdit)) __obj.updateDynamic("requestingUserCanEdit")(requestingUserCanEdit.get.asInstanceOf[js.Any])
    if (unprotectedRanges != null) __obj.updateDynamic("unprotectedRanges")(unprotectedRanges.asInstanceOf[js.Any])
    if (!js.isUndefined(warningOnly)) __obj.updateDynamic("warningOnly")(warningOnly.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProtectedRange]
  }
}

