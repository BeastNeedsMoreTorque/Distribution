package typings.javascriptTimeAgo.dsbMod

import typings.javascriptTimeAgo.javascriptTimeAgoStrings.dsb
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.few
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.one
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.other
import typings.javascriptTimeAgo.javascriptTimeAgoStrings.two
import typings.javascriptTimeAgo.localeMod.Duration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var locale: dsb
  var long: Duration
  var narrow: Duration
  var short: Duration
  def quantify(n: Double): one | two | few | other
}

object Locale {
  @scala.inline
  def apply(
    locale: dsb,
    long: Duration,
    narrow: Duration,
    quantify: Double => one | two | few | other,
    short: Duration
  ): Locale = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], quantify = js.Any.fromFunction1(quantify), short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

