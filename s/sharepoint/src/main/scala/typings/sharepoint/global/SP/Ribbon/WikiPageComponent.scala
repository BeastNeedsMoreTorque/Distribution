package typings.sharepoint.global.SP.Ribbon

import typings.sharepoint.CUI.Page.PageComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Ribbon.WikiPageComponent")
@js.native
class WikiPageComponent () extends PageComponent {
  /* CompleteClass */
  override def canHandleCommand(commandId: String): Boolean = js.native
  /* CompleteClass */
  override def getFocusedCommands(): js.Array[String] = js.native
  /* CompleteClass */
  override def getGlobalCommands(): js.Array[String] = js.native
  /* CompleteClass */
  override def getId(): String = js.native
  /* CompleteClass */
  override def handleCommand(commandId: String, properties: js.Any, sequenceNumber: Double): Boolean = js.native
  /* CompleteClass */
  override def init(): Unit = js.native
  /* CompleteClass */
  override def isFocusable(): Boolean = js.native
  /* CompleteClass */
  override def receiveFocus(): Boolean = js.native
  /* CompleteClass */
  override def yieldFocus(): Boolean = js.native
}

