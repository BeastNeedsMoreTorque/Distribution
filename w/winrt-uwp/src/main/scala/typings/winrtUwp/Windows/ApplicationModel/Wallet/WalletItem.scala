package typings.winrtUwp.Windows.ApplicationModel.Wallet

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import typings.winrtUwp.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an item (data) that is stored in the wallet. */
trait WalletItem extends js.Object {
  /** Gets or sets the barcode that's representative of the wallet item. */
  var barcode: WalletBarcode
  /** Gets or sets the background image of the body of the wallet item (uses a stream). */
  var bodyBackgroundImage: IRandomAccessStreamReference
  /** Gets or sets the body color of the wallet item. */
  var bodyColor: Color
  /** Gets or sets the body font color of the wallet item. */
  var bodyFontColor: Color
  /** Gets or sets a string that appears next to the app name in About info. */
  var displayMessage: String
  /** Gets or sets the name or title to be displayed to the user. */
  var displayName: String
  /** Gets the collection of WalletItemCustomProperty objects associated with the wallet item. */
  var displayProperties: IMap[String, WalletItemCustomProperty]
  /** Gets or sets the expiration date of the wallet item. */
  var expirationDate: Date
  /** Gets or sets the header background image of the wallet item. */
  var headerBackgroundImage: IRandomAccessStreamReference
  /** Gets or sets the header color of the wallet item. */
  var headerColor: Color
  /** Gets or sets the header font color of the wallet item. */
  var headerFontColor: Color
  /** Gets the unique identifier of the wallet item. */
  var id: String
  /** Gets or sets whether this item is acknowledged by the app. */
  var isAcknowledged: Boolean
  /** Gets or sets whether to launch your app when the user taps on the DisplayMessage . */
  var isDisplayMessageLaunchable: Boolean
  /** Gets or sets whether your app should be launched when the user taps "see more transaction history". */
  var isMoreTransactionHistoryLaunchable: Boolean
  /** Gets or sets the issuer name of the wallet item. */
  var issuerDisplayName: String
  /** Gets the type of the wallet item. */
  var kind: WalletItemKind
  /** Gets or sets the date and time the data for this item was last updated. */
  var lastUpdated: Date
  /** Gets or sets the medium (159 x 159) logo image of the wallet item. */
  var logo159x159: IRandomAccessStreamReference
  /** Gets or sets the large (336 x 336) logo image of the wallet item. */
  var logo336x336: IRandomAccessStreamReference
  /** Gets or sets the small (99 x 99) logo image of the wallet item. */
  var logo99x99: IRandomAccessStreamReference
  /** Gets or sets the logo image of the wallet item. */
  var logoImage: IRandomAccessStreamReference
  /** Gets or sets the logo text of the wallet item. */
  var logoText: String
  /** Gets or sets the promotional image of the wallet item. */
  var promotionalImage: IRandomAccessStreamReference
  /** Gets or sets the date on which the item is valid. */
  var relevantDate: Date
  /** Gets or sets the description of the relevant date of the wallet item. */
  var relevantDateDisplayMessage: String
  /** Gets a collection of all relevant locations for the wallet item. */
  var relevantLocations: IMap[String, WalletRelevantLocation]
  /** Gets the transaction history collection of the wallet item. */
  var transactionHistory: IMap[String, WalletTransaction]
  /** Gets the collection of WalletVerb objects associated with the wallet item. */
  var verbs: IMap[String, WalletVerb]
}

object WalletItem {
  @scala.inline
  def apply(
    barcode: WalletBarcode,
    bodyBackgroundImage: IRandomAccessStreamReference,
    bodyColor: Color,
    bodyFontColor: Color,
    displayMessage: String,
    displayName: String,
    displayProperties: IMap[String, WalletItemCustomProperty],
    expirationDate: Date,
    headerBackgroundImage: IRandomAccessStreamReference,
    headerColor: Color,
    headerFontColor: Color,
    id: String,
    isAcknowledged: Boolean,
    isDisplayMessageLaunchable: Boolean,
    isMoreTransactionHistoryLaunchable: Boolean,
    issuerDisplayName: String,
    kind: WalletItemKind,
    lastUpdated: Date,
    logo159x159: IRandomAccessStreamReference,
    logo336x336: IRandomAccessStreamReference,
    logo99x99: IRandomAccessStreamReference,
    logoImage: IRandomAccessStreamReference,
    logoText: String,
    promotionalImage: IRandomAccessStreamReference,
    relevantDate: Date,
    relevantDateDisplayMessage: String,
    relevantLocations: IMap[String, WalletRelevantLocation],
    transactionHistory: IMap[String, WalletTransaction],
    verbs: IMap[String, WalletVerb]
  ): WalletItem = {
    val __obj = js.Dynamic.literal(barcode = barcode.asInstanceOf[js.Any], bodyBackgroundImage = bodyBackgroundImage.asInstanceOf[js.Any], bodyColor = bodyColor.asInstanceOf[js.Any], bodyFontColor = bodyFontColor.asInstanceOf[js.Any], displayMessage = displayMessage.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], displayProperties = displayProperties.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], headerBackgroundImage = headerBackgroundImage.asInstanceOf[js.Any], headerColor = headerColor.asInstanceOf[js.Any], headerFontColor = headerFontColor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isAcknowledged = isAcknowledged.asInstanceOf[js.Any], isDisplayMessageLaunchable = isDisplayMessageLaunchable.asInstanceOf[js.Any], isMoreTransactionHistoryLaunchable = isMoreTransactionHistoryLaunchable.asInstanceOf[js.Any], issuerDisplayName = issuerDisplayName.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], logo159x159 = logo159x159.asInstanceOf[js.Any], logo336x336 = logo336x336.asInstanceOf[js.Any], logo99x99 = logo99x99.asInstanceOf[js.Any], logoImage = logoImage.asInstanceOf[js.Any], logoText = logoText.asInstanceOf[js.Any], promotionalImage = promotionalImage.asInstanceOf[js.Any], relevantDate = relevantDate.asInstanceOf[js.Any], relevantDateDisplayMessage = relevantDateDisplayMessage.asInstanceOf[js.Any], relevantLocations = relevantLocations.asInstanceOf[js.Any], transactionHistory = transactionHistory.asInstanceOf[js.Any], verbs = verbs.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalletItem]
  }
}

