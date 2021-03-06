package typings.jsonld.mod

import typings.jsonld.jsonldSpecMod.Context
import typings.jsonld.jsonldSpecMod.Document
import typings.jsonld.jsonldSpecMod.JsonLdObj
import typings.jsonld.mod.Options.Compact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonld", "compact")
@js.native
object compact extends js.Object {
  def apply(input: Document): js.Promise[JsonLdObj] = js.native
  def apply(input: Document, ctx: Context): js.Promise[JsonLdObj] = js.native
  def apply(input: Document, ctx: Context, callback: Callback[JsonLdObj]): Unit = js.native
  def apply(input: Document, ctx: Context, options: Compact): js.Promise[JsonLdObj] = js.native
  def apply(input: Document, ctx: Context, options: Compact, callback: Callback[JsonLdObj]): Unit = js.native
}

