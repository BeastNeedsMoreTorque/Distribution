package typings.antd.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Href extends js.Object {
  var href: String
  var title: ReactNode
}

object Href {
  @scala.inline
  def apply(href: String, title: ReactNode = null): Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
}

