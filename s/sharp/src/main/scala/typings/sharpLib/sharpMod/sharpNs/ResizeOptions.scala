package typings
package sharpLib.sharpMod.sharpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ResizeOptions extends js.Object {
  /** Background colour when using a fit of contain, parsed by the color module, defaults to black without transparency. (optional, default {r:0,g:0,b:0,alpha:1}) */
  var background: js.UndefOr[Color] = js.undefined
  /** Take greater advantage of the JPEG and WebP shrink-on-load feature, which can lead to a slight moiré pattern on some images. (optional, default true) */
  var fastShrinkOnLoad: js.UndefOr[scala.Boolean] = js.undefined
  /** How the image should be resized to fit both provided dimensions, one of cover, contain, fill, inside or outside. (optional, default 'cover') */
  var fit: js.UndefOr[
    sharpLib.sharpLibStrings.contain | sharpLib.sharpLibStrings.cover | sharpLib.sharpLibStrings.fill | sharpLib.sharpLibStrings.inside | sharpLib.sharpLibStrings.outside
  ] = js.undefined
  /** Alternative means of specifying height. If both are present this take priority. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** The kernel to use for image reduction. (optional, default 'lanczos3') */
  var kernel: js.UndefOr[
    sharpLib.sharpLibStrings.nearest | sharpLib.sharpLibStrings.cubic | sharpLib.sharpLibStrings.lanczos2 | sharpLib.sharpLibStrings.lanczos3
  ] = js.undefined
  /** Position, gravity or strategy to use when fit is cover or contain. (optional, default 'centre') */
  var position: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Alternative means of specifying width. If both are present this take priority. */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** Do not enlarge if the width or height are already less than the specified dimensions, equivalent to GraphicsMagick's > geometry option. (optional, default false) */
  var withoutEnlargement: js.UndefOr[scala.Boolean] = js.undefined
}

