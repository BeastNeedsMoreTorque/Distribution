package typings.pixiJs.PIXI

import typings.std.CanvasGradient
import typings.std.CanvasPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextStyle Object contains information to decorate a Text objects.
  *
  * An instance can be shared between multiple Text objects; then changing the style will update all text objects using it.
  *
  * A tool can be used to generate a text style [here](https://pixijs.io/pixi-text-style).
  *
  * @class
  * @memberof PIXI
  */
trait TextStyle extends js.Object {
  /**
    * Alignment for multiline text ('left', 'center' or 'right'), does not affect single line text
    *
    * @member {string}
    */
  var align: String
  /**
    * Indicates if lines can be wrapped within words, it needs wordWrap to be set to true
    *
    * @member {boolean}
    */
  var breakWords: Boolean
  /**
    * Set a drop shadow for the text
    *
    * @member {boolean}
    */
  var dropShadow: Boolean
  /**
    * Set alpha for the drop shadow
    *
    * @member {number}
    */
  var dropShadowAlpha: Double
  /**
    * Set a angle of the drop shadow
    *
    * @member {number}
    */
  var dropShadowAngle: Double
  /**
    * Set a shadow blur radius
    *
    * @member {number}
    */
  var dropShadowBlur: Double
  /**
    * A fill style to be used on the dropshadow e.g 'red', '#00FF00'
    *
    * @member {string|number}
    */
  var dropShadowColor: String | Double
  /**
    * Set a distance of the drop shadow
    *
    * @member {number}
    */
  var dropShadowDistance: Double
  /**
    * A canvas fillstyle that will be used on the text e.g 'red', '#00FF00'.
    * Can be an array to create a gradient eg ['#000000','#FFFFFF']
    * {@link https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fillStyle|MDN}
    *
    * @member {string|string[]|number|number[]|CanvasGradient|CanvasPattern}
    */
  var fill: String | (js.Array[Double | String]) | Double | CanvasGradient | CanvasPattern
  /**
    * If fill is an array of colours to create a gradient, this array can set the stop points
    * (numbers between 0 and 1) for the color, overriding the default behaviour of evenly spacing them.
    *
    * @member {number[]}
    */
  var fillGradientStops: js.Array[Double]
  /**
    * If fill is an array of colours to create a gradient, this can change the type/direction of the gradient.
    * See {@link PIXI.TEXT_GRADIENT}
    *
    * @member {number}
    */
  var fillGradientType: Double
  /**
    * The font family
    *
    * @member {string|string[]}
    */
  var fontFamily: String | js.Array[String]
  /**
    * The font size
    * (as a number it converts to px, but as a string, equivalents are '26px','20pt','160%' or '1.6em')
    *
    * @member {number|string}
    */
  var fontSize: Double | String
  /**
    * The font style
    * ('normal', 'italic' or 'oblique')
    *
    * @member {string}
    */
  var fontStyle: String
  /**
    * The font variant
    * ('normal' or 'small-caps')
    *
    * @member {string}
    */
  var fontVariant: String
  /**
    * The font weight
    * ('normal', 'bold', 'bolder', 'lighter' and '100', '200', '300', '400', '500', '600', '700', 800' or '900')
    *
    * @member {string}
    */
  var fontWeight: String
  /**
    * The space between lines
    *
    * @member {number}
    */
  var leading: Double
  /**
    * The amount of spacing between letters, default is 0
    *
    * @member {number}
    */
  var letterSpacing: Double
  /**
    * The line height, a number that represents the vertical space that a letter uses
    *
    * @member {number}
    */
  var lineHeight: Double
  /**
    * The lineJoin property sets the type of corner created, it can resolve spiked text issues.
    * Default is 'miter' (creates a sharp corner).
    *
    * @member {string}
    */
  var lineJoin: String
  /**
    * The miter limit to use when using the 'miter' lineJoin mode
    * This can reduce or increase the spikiness of rendered text.
    *
    * @member {number}
    */
  var miterLimit: Double
  /**
    * Occasionally some fonts are cropped. Adding some padding will prevent this from happening
    * by adding padding to all sides of the text.
    *
    * @member {number}
    */
  var padding: Double
  /**
    * A canvas fillstyle that will be used on the text stroke
    * e.g 'blue', '#FCFF00'
    *
    * @member {string|number}
    */
  var stroke: String | Double
  /**
    * A number that represents the thickness of the stroke.
    * Default is 0 (no stroke)
    *
    * @member {number}
    */
  var strokeThickness: Double
  /**
    * The baseline of the text that is rendered.
    *
    * @member {string}
    */
  var textBaseline: String
  /**
    * Trim transparent borders
    *
    * @member {boolean}
    */
  var trim: Boolean
  /**
    * How newlines and spaces should be handled.
    * Default is 'pre' (preserve, preserve).
    *
    *  value       | New lines     |   Spaces
    *  ---         | ---           |   ---
    * 'normal'     | Collapse      |   Collapse
    * 'pre'        | Preserve      |   Preserve
    * 'pre-line'   | Preserve      |   Collapse
    *
    * @member {string}
    */
  var whiteSpace: String
  /**
    * Indicates if word wrap should be used
    *
    * @member {boolean}
    */
  var wordWrap: Boolean
  /**
    * The width at which text will wrap, it needs wordWrap to be set to true
    *
    * @member {number}
    */
  var wordWrapWidth: Double
  /**
    * Resets all properties to the defaults specified in TextStyle.prototype._default
    */
  def reset(): Unit
  /**
    * Generates a font style string to use for `TextMetrics.measureFont()`.
    *
    * @return {string} Font style string, for passing to `TextMetrics.measureFont()`
    */
  def toFontString(): String
}

object TextStyle {
  @scala.inline
  def apply(
    align: String,
    breakWords: Boolean,
    dropShadow: Boolean,
    dropShadowAlpha: Double,
    dropShadowAngle: Double,
    dropShadowBlur: Double,
    dropShadowColor: String | Double,
    dropShadowDistance: Double,
    fill: String | (js.Array[Double | String]) | Double | CanvasGradient | CanvasPattern,
    fillGradientStops: js.Array[Double],
    fillGradientType: Double,
    fontFamily: String | js.Array[String],
    fontSize: Double | String,
    fontStyle: String,
    fontVariant: String,
    fontWeight: String,
    leading: Double,
    letterSpacing: Double,
    lineHeight: Double,
    lineJoin: String,
    miterLimit: Double,
    padding: Double,
    reset: () => Unit,
    stroke: String | Double,
    strokeThickness: Double,
    textBaseline: String,
    toFontString: () => String,
    trim: Boolean,
    whiteSpace: String,
    wordWrap: Boolean,
    wordWrapWidth: Double
  ): TextStyle = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], breakWords = breakWords.asInstanceOf[js.Any], dropShadow = dropShadow.asInstanceOf[js.Any], dropShadowAlpha = dropShadowAlpha.asInstanceOf[js.Any], dropShadowAngle = dropShadowAngle.asInstanceOf[js.Any], dropShadowBlur = dropShadowBlur.asInstanceOf[js.Any], dropShadowColor = dropShadowColor.asInstanceOf[js.Any], dropShadowDistance = dropShadowDistance.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], fillGradientStops = fillGradientStops.asInstanceOf[js.Any], fillGradientType = fillGradientType.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontVariant = fontVariant.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], leading = leading.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), stroke = stroke.asInstanceOf[js.Any], strokeThickness = strokeThickness.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any], toFontString = js.Any.fromFunction0(toFontString), trim = trim.asInstanceOf[js.Any], whiteSpace = whiteSpace.asInstanceOf[js.Any], wordWrap = wordWrap.asInstanceOf[js.Any], wordWrapWidth = wordWrapWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyle]
  }
}

