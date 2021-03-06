package typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.IBrowseCarouselCardItem
import typings.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.ImageDisplayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a BrowseCarouselCard. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard")
@js.native
/**
  * Constructs a new BrowseCarouselCard.
  * @param [properties] Properties to set
  */
class BrowseCarouselCard_ () extends IBrowseCarouselCard {
  def this(properties: IBrowseCarouselCard) = this()
  /** BrowseCarouselCard imageDisplayOptions. */
  @JSName("imageDisplayOptions")
  var imageDisplayOptions_BrowseCarouselCard_ : ImageDisplayOptions | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.Intent.Message.BrowseCarouselCard.ImageDisplayOptions * / any */ String) = js.native
  /** BrowseCarouselCard items. */
  @JSName("items")
  var items_BrowseCarouselCard_ : js.Array[IBrowseCarouselCardItem] = js.native
  /**
    * Converts this BrowseCarouselCard to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

