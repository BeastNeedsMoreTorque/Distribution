package typings.twitterText.mod

import typings.twitterText.anon.Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twitter-text", "hitHighlight")
@js.native
object hitHighlight extends js.Object {
  def apply(text: String): String = js.native
  def apply(text: String, hits: js.Array[js.Array[Double]]): String = js.native
  def apply(text: String, hits: js.Array[js.Array[Double]], options: Tag): String = js.native
}

