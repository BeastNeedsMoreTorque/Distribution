package typings.wordpressBlocks.mod

import typings.wordpressBlocks.wordpressBlocksStrings.inserter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blocks", "getBlockSupport")
@js.native
object getBlockSupport_inserter extends js.Object {
  def apply(nameOrType: String, feature: inserter): js.UndefOr[js.Any] = js.native
  def apply(nameOrType: Block[_], feature: inserter): js.UndefOr[js.Any] = js.native
  def apply[T](nameOrType: String, feature: inserter, defaultSupports: T): T | Boolean | Double | String = js.native
  def apply[T](nameOrType: Block[_], feature: inserter, defaultSupports: T): T | Boolean | Double | String = js.native
}

