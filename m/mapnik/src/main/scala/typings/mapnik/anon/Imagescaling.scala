package typings.mapnik.anon

import typings.mapnik.mapnikStrings.jpeg
import typings.mapnik.mapnikStrings.png
import typings.mapnik.mapnikStrings.tiff
import typings.mapnik.mapnikStrings.webp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Imagescaling extends js.Object {
  var image_format: js.UndefOr[webp | jpeg | png | tiff] = js.undefined
  var image_scaling: js.UndefOr[String] = js.undefined
}

object Imagescaling {
  @scala.inline
  def apply(image_format: webp | jpeg | png | tiff = null, image_scaling: String = null): Imagescaling = {
    val __obj = js.Dynamic.literal()
    if (image_format != null) __obj.updateDynamic("image_format")(image_format.asInstanceOf[js.Any])
    if (image_scaling != null) __obj.updateDynamic("image_scaling")(image_scaling.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imagescaling]
  }
}

