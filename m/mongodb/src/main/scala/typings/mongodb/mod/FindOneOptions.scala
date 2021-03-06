package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FindOneOptions extends js.Object {
  var batchSize: js.UndefOr[scala.Double] = js.undefined
  var collation: js.UndefOr[CollationDocument] = js.undefined
  var comment: js.UndefOr[String] = js.undefined
  var explain: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated Use options.projection instead
    */
  var fields: js.UndefOr[js.Object] = js.undefined
  var hint: js.UndefOr[js.Object] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var maxScan: js.UndefOr[scala.Double] = js.undefined
  var maxTimeMS: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var partial: js.UndefOr[Boolean] = js.undefined
  var projection: js.UndefOr[js.Object] = js.undefined
  var promoteBuffers: js.UndefOr[Boolean] = js.undefined
  var promoteLongs: js.UndefOr[Boolean] = js.undefined
  var promoteValues: js.UndefOr[Boolean] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  var returnKey: js.UndefOr[Boolean] = js.undefined
  var session: js.UndefOr[ClientSession] = js.undefined
  var showDiskLoc: js.UndefOr[Boolean] = js.undefined
  var skip: js.UndefOr[scala.Double] = js.undefined
  var snapshot: js.UndefOr[Boolean] = js.undefined
  var sort: js.UndefOr[js.Array[_] | js.Object] = js.undefined
  var tailable: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Boolean] = js.undefined
}

object FindOneOptions {
  @scala.inline
  def apply(
    batchSize: js.UndefOr[scala.Double] = js.undefined,
    collation: CollationDocument = null,
    comment: String = null,
    explain: js.UndefOr[Boolean] = js.undefined,
    fields: js.Object = null,
    hint: js.Object = null,
    limit: js.UndefOr[scala.Double] = js.undefined,
    max: js.UndefOr[scala.Double] = js.undefined,
    maxScan: js.UndefOr[scala.Double] = js.undefined,
    maxTimeMS: js.UndefOr[scala.Double] = js.undefined,
    min: js.UndefOr[scala.Double] = js.undefined,
    partial: js.UndefOr[Boolean] = js.undefined,
    projection: js.Object = null,
    promoteBuffers: js.UndefOr[Boolean] = js.undefined,
    promoteLongs: js.UndefOr[Boolean] = js.undefined,
    promoteValues: js.UndefOr[Boolean] = js.undefined,
    raw: js.UndefOr[Boolean] = js.undefined,
    readPreference: ReadPreferenceOrMode = null,
    returnKey: js.UndefOr[Boolean] = js.undefined,
    session: ClientSession = null,
    showDiskLoc: js.UndefOr[Boolean] = js.undefined,
    skip: js.UndefOr[scala.Double] = js.undefined,
    snapshot: js.UndefOr[Boolean] = js.undefined,
    sort: js.Array[_] | js.Object = null,
    tailable: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Boolean] = js.undefined
  ): FindOneOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batchSize)) __obj.updateDynamic("batchSize")(batchSize.get.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (!js.isUndefined(explain)) __obj.updateDynamic("explain")(explain.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxScan)) __obj.updateDynamic("maxScan")(maxScan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTimeMS)) __obj.updateDynamic("maxTimeMS")(maxTimeMS.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(partial)) __obj.updateDynamic("partial")(partial.get.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (!js.isUndefined(promoteBuffers)) __obj.updateDynamic("promoteBuffers")(promoteBuffers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(promoteLongs)) __obj.updateDynamic("promoteLongs")(promoteLongs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(promoteValues)) __obj.updateDynamic("promoteValues")(promoteValues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    if (readPreference != null) __obj.updateDynamic("readPreference")(readPreference.asInstanceOf[js.Any])
    if (!js.isUndefined(returnKey)) __obj.updateDynamic("returnKey")(returnKey.get.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (!js.isUndefined(showDiskLoc)) __obj.updateDynamic("showDiskLoc")(showDiskLoc.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snapshot)) __obj.updateDynamic("snapshot")(snapshot.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(tailable)) __obj.updateDynamic("tailable")(tailable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindOneOptions]
  }
}

