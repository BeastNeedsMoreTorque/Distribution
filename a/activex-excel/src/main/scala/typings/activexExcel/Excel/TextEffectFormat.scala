package typings.activexExcel.Excel

import typings.activexOffice.Office.MsoPresetTextEffect
import typings.activexOffice.Office.MsoPresetTextEffectShape
import typings.activexOffice.Office.MsoTextEffectAlignment
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextEffectFormat extends js.Object {
  var Alignment: MsoTextEffectAlignment
  val Application: js.Any
  val Creator: Double
  @JSName("Excel.TextEffectFormat_typekey")
  var ExcelDotTextEffectFormat_typekey: TextEffectFormat
  var FontBold: MsoTriState
  var FontItalic: MsoTriState
  var FontName: String
  var FontSize: Double
  var KernedPairs: MsoTriState
  var NormalizedHeight: MsoTriState
  val Parent: js.Any
  var PresetShape: MsoPresetTextEffectShape
  var PresetTextEffect: MsoPresetTextEffect
  var RotatedChars: MsoTriState
  var Text: String
  var Tracking: Double
  def ToggleVerticalText(): Unit
}

object TextEffectFormat {
  @scala.inline
  def apply(
    Alignment: MsoTextEffectAlignment,
    Application: js.Any,
    Creator: Double,
    ExcelDotTextEffectFormat_typekey: TextEffectFormat,
    FontBold: MsoTriState,
    FontItalic: MsoTriState,
    FontName: String,
    FontSize: Double,
    KernedPairs: MsoTriState,
    NormalizedHeight: MsoTriState,
    Parent: js.Any,
    PresetShape: MsoPresetTextEffectShape,
    PresetTextEffect: MsoPresetTextEffect,
    RotatedChars: MsoTriState,
    Text: String,
    ToggleVerticalText: () => Unit,
    Tracking: Double
  ): TextEffectFormat = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FontBold = FontBold.asInstanceOf[js.Any], FontItalic = FontItalic.asInstanceOf[js.Any], FontName = FontName.asInstanceOf[js.Any], FontSize = FontSize.asInstanceOf[js.Any], KernedPairs = KernedPairs.asInstanceOf[js.Any], NormalizedHeight = NormalizedHeight.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PresetShape = PresetShape.asInstanceOf[js.Any], PresetTextEffect = PresetTextEffect.asInstanceOf[js.Any], RotatedChars = RotatedChars.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], ToggleVerticalText = js.Any.fromFunction0(ToggleVerticalText), Tracking = Tracking.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.TextEffectFormat_typekey")(ExcelDotTextEffectFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextEffectFormat]
  }
}

