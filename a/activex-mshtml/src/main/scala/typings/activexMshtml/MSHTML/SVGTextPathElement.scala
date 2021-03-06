package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGTextPathElement extends js.Object {
  @JSName("MSHTML.SVGTextPathElement_typekey")
  var MSHTMLDotSVGTextPathElement_typekey: SVGTextPathElement
  val className: SVGAnimatedString
  val externalResourcesRequired: SVGAnimatedBoolean
  var focusable: SVGAnimatedEnumeration
  val href: SVGAnimatedString
  var lengthAdjust: SVGAnimatedEnumeration
  var method: SVGAnimatedEnumeration
  var ownerSVGElement: ISVGSVGElement
  val requiredExtensions: SVGStringList
  val requiredFeatures: SVGStringList
  var spacing: SVGAnimatedEnumeration
  var startOffset: SVGAnimatedLength
  val systemLanguage: SVGStringList
  var textLength: SVGAnimatedLength
  var viewportElement: ISVGElement
  var xmlbase: String
  var xmllang: String
  var xmlspace: String
  def getCharNumAtPosition(point: SVGPoint): Double
  def getComputedTextLength(): Double
  def getEndPositionOfChar(charnum: Double): SVGPoint
  def getExtentOfChar(charnum: Double): SVGRect
  def getNumberOfChars(): Double
  def getRotationOfChar(charnum: Double): Double
  def getStartPositionOfChar(charnum: Double): SVGPoint
  def getSubStringLength(charnum: Double, nchars: Double): Double
  def hasExtension(extension: String): Boolean
  def selectSubString(charnum: Double, nchars: Double): Unit
}

object SVGTextPathElement {
  @scala.inline
  def apply(
    MSHTMLDotSVGTextPathElement_typekey: SVGTextPathElement,
    className: SVGAnimatedString,
    externalResourcesRequired: SVGAnimatedBoolean,
    focusable: SVGAnimatedEnumeration,
    getCharNumAtPosition: SVGPoint => Double,
    getComputedTextLength: () => Double,
    getEndPositionOfChar: Double => SVGPoint,
    getExtentOfChar: Double => SVGRect,
    getNumberOfChars: () => Double,
    getRotationOfChar: Double => Double,
    getStartPositionOfChar: Double => SVGPoint,
    getSubStringLength: (Double, Double) => Double,
    hasExtension: String => Boolean,
    href: SVGAnimatedString,
    lengthAdjust: SVGAnimatedEnumeration,
    method: SVGAnimatedEnumeration,
    ownerSVGElement: ISVGSVGElement,
    requiredExtensions: SVGStringList,
    requiredFeatures: SVGStringList,
    selectSubString: (Double, Double) => Unit,
    spacing: SVGAnimatedEnumeration,
    startOffset: SVGAnimatedLength,
    systemLanguage: SVGStringList,
    textLength: SVGAnimatedLength,
    viewportElement: ISVGElement,
    xmlbase: String,
    xmllang: String,
    xmlspace: String
  ): SVGTextPathElement = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], externalResourcesRequired = externalResourcesRequired.asInstanceOf[js.Any], focusable = focusable.asInstanceOf[js.Any], getCharNumAtPosition = js.Any.fromFunction1(getCharNumAtPosition), getComputedTextLength = js.Any.fromFunction0(getComputedTextLength), getEndPositionOfChar = js.Any.fromFunction1(getEndPositionOfChar), getExtentOfChar = js.Any.fromFunction1(getExtentOfChar), getNumberOfChars = js.Any.fromFunction0(getNumberOfChars), getRotationOfChar = js.Any.fromFunction1(getRotationOfChar), getStartPositionOfChar = js.Any.fromFunction1(getStartPositionOfChar), getSubStringLength = js.Any.fromFunction2(getSubStringLength), hasExtension = js.Any.fromFunction1(hasExtension), href = href.asInstanceOf[js.Any], lengthAdjust = lengthAdjust.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], ownerSVGElement = ownerSVGElement.asInstanceOf[js.Any], requiredExtensions = requiredExtensions.asInstanceOf[js.Any], requiredFeatures = requiredFeatures.asInstanceOf[js.Any], selectSubString = js.Any.fromFunction2(selectSubString), spacing = spacing.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any], textLength = textLength.asInstanceOf[js.Any], viewportElement = viewportElement.asInstanceOf[js.Any], xmlbase = xmlbase.asInstanceOf[js.Any], xmllang = xmllang.asInstanceOf[js.Any], xmlspace = xmlspace.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGTextPathElement_typekey")(MSHTMLDotSVGTextPathElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTextPathElement]
  }
}

