package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRichEdit.ContentInserted event.
  */
@JSGlobal("ASPxClientRichEditContentInsertedEventArgs")
@js.native
class ASPxClientRichEditContentInsertedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientRichEditContentInsertedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRichEditContentInsertedEventArgs object. For internal use only.
    * @param subDocumentId An identifier of a sub-document that contains the inserted content.
    * @param interval An interval object that relates to the inserted content.
    */
  def this(subDocumentId: Double, interval: typings.devexpressWeb.Interval) = this()
  /**
    * Gets the text buffer interval related to the inserted content.
    */
  /* CompleteClass */
  override var interval: typings.devexpressWeb.Interval = js.native
  /**
    * Gets the active sub-document's identifier.
    */
  /* CompleteClass */
  override var subDocumentId: Double = js.native
}

