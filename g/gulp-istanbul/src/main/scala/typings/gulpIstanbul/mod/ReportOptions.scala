package typings.gulpIstanbul.mod

import typings.gulpIstanbul.anon.Dir
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportOptions extends js.Object {
  var coverageVariable: js.UndefOr[String] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var reportOpts: js.UndefOr[Dir] = js.undefined
  var reporters: js.UndefOr[js.Array[String]] = js.undefined
}

object ReportOptions {
  @scala.inline
  def apply(
    coverageVariable: String = null,
    dir: String = null,
    reportOpts: Dir = null,
    reporters: js.Array[String] = null
  ): ReportOptions = {
    val __obj = js.Dynamic.literal()
    if (coverageVariable != null) __obj.updateDynamic("coverageVariable")(coverageVariable.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (reportOpts != null) __obj.updateDynamic("reportOpts")(reportOpts.asInstanceOf[js.Any])
    if (reporters != null) __obj.updateDynamic("reporters")(reporters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportOptions]
  }
}

