package typings.jimpPng.anon

import typings.jimpCore.etcMod.EncoderFn
import typings.jimpCore.etcMod.Image
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagepngEncoderFn extends js.Object {
  @JSName("image/png")
  var imageSlashpng_Original: EncoderFn[Image] = js.native
  @JSName("image/png")
  def imageSlashpng(image: Image): Buffer = js.native
}

