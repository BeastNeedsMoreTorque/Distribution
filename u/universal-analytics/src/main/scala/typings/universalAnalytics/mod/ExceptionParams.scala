package typings.universalAnalytics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionParams
  extends /* key */ StringDictionary[js.Any] {
  /**
    * Exception Description
    *
    * Specifies the description of an exception.
    *
    * Max length: 150 Bytes
    *
    * Example value: `DatabaseError`
    */
  var exd: js.UndefOr[String] = js.undefined
  /**
    * Is Exception Fatal?
    *
    * Specifies whether the exception was fatal.
    */
  var exf: js.UndefOr[Boolean] = js.undefined
}

object ExceptionParams {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    exd: String = null,
    exf: js.UndefOr[Boolean] = js.undefined
  ): ExceptionParams = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (exd != null) __obj.updateDynamic("exd")(exd.asInstanceOf[js.Any])
    if (!js.isUndefined(exf)) __obj.updateDynamic("exf")(exf.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionParams]
  }
}

