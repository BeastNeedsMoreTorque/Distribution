package typings.jsdevtoolsReaddirEnhanced

import typings.jsdevtoolsReaddirEnhanced.anon.Optionsstatsfalse
import typings.jsdevtoolsReaddirEnhanced.anon.Optionsstatstrue
import typings.jsdevtoolsReaddirEnhanced.typesPublicMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jsdevtools/readdir-enhanced/lib/sync", JSImport.Namespace)
@js.native
object syncMod extends js.Object {
  def readdirSync(dir: String): js.Array[String] = js.native
  def readdirSync(dir: String, options: Optionsstatsfalse): js.Array[String] = js.native
  def readdirSync(dir: String, options: Optionsstatstrue): js.Array[Stats] = js.native
}

