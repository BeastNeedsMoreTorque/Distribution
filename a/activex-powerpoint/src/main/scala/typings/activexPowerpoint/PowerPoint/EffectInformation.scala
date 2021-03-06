package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EffectInformation extends js.Object {
  val AfterEffect: MsoAnimAfterEffect
  val AnimateBackground: MsoTriState
  val AnimateTextInReverse: MsoTriState
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val BuildByLevelEffect: MsoAnimateByLevel
  val Dim: ColorFormat
  val Parent: js.Any
  val PlaySettings: typings.activexPowerpoint.PowerPoint.PlaySettings
  @JSName("PowerPoint.EffectInformation_typekey")
  var PowerPointDotEffectInformation_typekey: EffectInformation
  val SoundEffect: typings.activexPowerpoint.PowerPoint.SoundEffect
  val TextUnitEffect: MsoAnimTextUnitEffect
}

object EffectInformation {
  @scala.inline
  def apply(
    AfterEffect: MsoAnimAfterEffect,
    AnimateBackground: MsoTriState,
    AnimateTextInReverse: MsoTriState,
    Application: Application,
    BuildByLevelEffect: MsoAnimateByLevel,
    Dim: ColorFormat,
    Parent: js.Any,
    PlaySettings: PlaySettings,
    PowerPointDotEffectInformation_typekey: EffectInformation,
    SoundEffect: SoundEffect,
    TextUnitEffect: MsoAnimTextUnitEffect
  ): EffectInformation = {
    val __obj = js.Dynamic.literal(AfterEffect = AfterEffect.asInstanceOf[js.Any], AnimateBackground = AnimateBackground.asInstanceOf[js.Any], AnimateTextInReverse = AnimateTextInReverse.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], BuildByLevelEffect = BuildByLevelEffect.asInstanceOf[js.Any], Dim = Dim.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PlaySettings = PlaySettings.asInstanceOf[js.Any], SoundEffect = SoundEffect.asInstanceOf[js.Any], TextUnitEffect = TextUnitEffect.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.EffectInformation_typekey")(PowerPointDotEffectInformation_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectInformation]
  }
}

