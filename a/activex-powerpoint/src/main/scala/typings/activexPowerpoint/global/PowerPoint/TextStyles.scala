package typings.activexPowerpoint.global.PowerPoint

import typings.activexPowerpoint.PowerPoint.PpTextStyleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.TextStyles")
@js.native
class TextStyles protected ()
  extends typings.activexPowerpoint.PowerPoint.TextStyles {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.TextStyles_typekey")
  override var PowerPointDotTextStyles_typekey: typings.activexPowerpoint.PowerPoint.TextStyles = js.native
  /* CompleteClass */
  override def Item(Type: PpTextStyleType): typings.activexPowerpoint.PowerPoint.TextStyle = js.native
}

