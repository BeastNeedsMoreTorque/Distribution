package typings.winrtUwp.global.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Media.Protection.PlayReady.IPlayReadyDomain
import typings.winrtUwp.anon.ItemsIPlayReadyDomain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides for iteration of the PlayReadyDomain class. */
@JSGlobal("Windows.Media.Protection.PlayReady.PlayReadyDomainIterator")
@js.native
abstract class PlayReadyDomainIterator ()
  extends typings.winrtUwp.Windows.Media.Protection.PlayReady.PlayReadyDomainIterator {
  /** Gets the current item in the PlayReady domain collection. */
  /* CompleteClass */
  override var current: IPlayReadyDomain = js.native
  /** Gets a value that indicates whether there is a current item or the iterator is at the end of the PlayReady domain collection. */
  /* CompleteClass */
  override var hasCurrent: Boolean = js.native
  /**
    * Retrieves all items in the PlayReady domain collection.
    */
  /* CompleteClass */
  override def getMany(): ItemsIPlayReadyDomain = js.native
  /**
    * Advances the enumerator to the next item in the collection.
    * @return true if the iterator refers to a valid item that is in the collection or false if the iterator is at the end of the collection.
    */
  /* CompleteClass */
  override def moveNext(): Boolean = js.native
}

