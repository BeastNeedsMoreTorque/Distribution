package typings.columnify.mod

import org.scalablytyped.runtime.StringDictionary
import typings.columnify.anon.PickOptionsminWidthmaxWid
import typings.columnify.columnifyStrings.center
import typings.columnify.columnifyStrings.centre
import typings.columnify.columnifyStrings.left
import typings.columnify.columnifyStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalOptions extends Options {
  var columnSplitter: js.UndefOr[String] = js.undefined
  var columns: js.UndefOr[js.Array[String]] = js.undefined
  var config: js.UndefOr[StringDictionary[Options]] = js.undefined
  var maxLineWidth: js.UndefOr[Double] = js.undefined
  var truncate: js.UndefOr[Boolean] = js.undefined
  var widths: js.UndefOr[StringDictionary[PickOptionsminWidthmaxWid]] = js.undefined
}

object GlobalOptions {
  @scala.inline
  def apply(
    align: left | center | centre | right = null,
    columnSplitter: String = null,
    columns: js.Array[String] = null,
    config: StringDictionary[Options] = null,
    dataTransform: /* data */ String => String = null,
    headingTransform: /* data */ String => String = null,
    maxLineWidth: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined,
    paddingChr: String = null,
    preserveNewLines: js.UndefOr[Boolean] = js.undefined,
    showHeaders: js.UndefOr[Boolean] = js.undefined,
    truncate: js.UndefOr[Boolean] = js.undefined,
    truncateMarker: String = null,
    widths: StringDictionary[PickOptionsminWidthmaxWid] = null
  ): GlobalOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (columnSplitter != null) __obj.updateDynamic("columnSplitter")(columnSplitter.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (dataTransform != null) __obj.updateDynamic("dataTransform")(js.Any.fromFunction1(dataTransform))
    if (headingTransform != null) __obj.updateDynamic("headingTransform")(js.Any.fromFunction1(headingTransform))
    if (!js.isUndefined(maxLineWidth)) __obj.updateDynamic("maxLineWidth")(maxLineWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (paddingChr != null) __obj.updateDynamic("paddingChr")(paddingChr.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveNewLines)) __obj.updateDynamic("preserveNewLines")(preserveNewLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeaders)) __obj.updateDynamic("showHeaders")(showHeaders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(truncate)) __obj.updateDynamic("truncate")(truncate.get.asInstanceOf[js.Any])
    if (truncateMarker != null) __obj.updateDynamic("truncateMarker")(truncateMarker.asInstanceOf[js.Any])
    if (widths != null) __obj.updateDynamic("widths")(widths.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalOptions]
  }
}

