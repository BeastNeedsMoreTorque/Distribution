package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.ContentRemoved event.
  */
@JSGlobal("ASPxClientRichEditContentRemovedEventArgs")
@js.native
class ASPxClientRichEditContentRemovedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientRichEditContentRemovedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditContentRemovedEventArgs object. For internal use only.
    * @param subDocumentId An identifier of a sub-document that contained the removed content.
    * @param interval An interval object that relates to the removed content.
    */
  def this(subDocumentId: Double, interval: typings.devexpressWeb.Interval) = this()
  /**
    * Gets the text buffer interval related to the removed content.
    */
  /* CompleteClass */
  override var interval: typings.devexpressWeb.Interval = js.native
  /**
    * Gets the active sub-document's identifier.
    */
  /* CompleteClass */
  override var subDocumentId: Double = js.native
}

