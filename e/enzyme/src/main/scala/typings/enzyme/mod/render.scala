package typings.enzyme.mod

import typings.cheerio.Cheerio
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("enzyme", "render")
@js.native
object render extends js.Object {
  def apply[P, S](node: ReactElement): Cheerio = js.native
  def apply[P, S](node: ReactElement, options: js.Any): Cheerio = js.native
}

