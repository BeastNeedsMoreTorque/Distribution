package typings.activexOutlook.global.Outlook

import typings.activexOutlook.Outlook.OlAddressListType
import typings.activexOutlook.Outlook.OlObjectClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.AddressList")
@js.native
class AddressList protected ()
  extends typings.activexOutlook.Outlook.AddressList {
  /* CompleteClass */
  override val AddressEntries: typings.activexOutlook.Outlook.AddressEntries = js.native
  /* CompleteClass */
  override val AddressListType: OlAddressListType = js.native
  /* CompleteClass */
  override val Application: typings.activexOutlook.Outlook.Application = js.native
  /* CompleteClass */
  override val Class: OlObjectClass = js.native
  /* CompleteClass */
  override val ID: String = js.native
  /* CompleteClass */
  override val Index: Double = js.native
  /* CompleteClass */
  override val IsInitialAddressList: Boolean = js.native
  /* CompleteClass */
  override val IsReadOnly: Boolean = js.native
  /* CompleteClass */
  override val Name: String = js.native
  /* CompleteClass */
  @JSName("Outlook.AddressList_typekey")
  override var OutlookDotAddressList_typekey: typings.activexOutlook.Outlook.AddressList = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor = js.native
  /* CompleteClass */
  override val ResolutionOrder: Double = js.native
  /* CompleteClass */
  override val Session: typings.activexOutlook.Outlook.NameSpace = js.native
  /* CompleteClass */
  override def GetContactsFolder(): typings.activexOutlook.Outlook.Folder = js.native
}

