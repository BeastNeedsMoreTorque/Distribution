package typings.winrtUwp.Windows.Storage.Pickers

import typings.winrtUwp.Windows.Foundation.Collections.IIterator
import typings.winrtUwp.Windows.Foundation.Collections.IKeyValuePair
import typings.winrtUwp.Windows.Foundation.Collections.IMapView
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of display names mapped to the associated file types (extensions). Each element in this collection maps a display name to a corresponding collection of file name extensions. The key is a single string, the value is a list/vector of strings representing one or more extension choices. */
trait FilePickerFileTypesOrderedMap extends js.Object {
  /** Gets the number of items in the mapped collection of display names and associated file types. */
  var size: Double
  /** Removes all display names and associated file name extensions from the collection. */
  def clear(): Unit
  /**
    * Retrieves an iterator that iterates through the display names and associated file types in the collection.
    * @return The iterator.
    */
  def first(): IIterator[IKeyValuePair[_, _]]
  /**
    * Returns an immutable view of the collection of display names and associated file types.
    * @return The view of the collection.
    */
  def getView(): IMapView[String, IVector[String]]
  /**
    * Determines whether the mapped collection of display names and associated file types contains the specified key.
    * @param key The key.
    * @return True if the key is found; otherwise, false.
    */
  def hasKey(key: String): Boolean
  /**
    * Inserts or replaces an item in the mapped collection of display names and associated file types.
    * @param key The key associated with the item to insert.
    * @param value The item to insert.
    * @return true if an item with the specified key is an existing item and was replaced; otherwise false.
    */
  def insert(key: String, value: IVector[String]): Boolean
  /**
    * Returns the item at the specified key in the mapped collection of display names and associated file types.
    * @param key The key to use to locate the item.
    * @return The item associated with the specified key.
    */
  def lookup(key: String): IVector[String]
  /**
    * Removes an item from the mapped collection of display names and associated file types.
    * @param key The key associated with the item to remove.
    */
  def remove(key: String): Unit
}

object FilePickerFileTypesOrderedMap {
  @scala.inline
  def apply(
    clear: () => Unit,
    first: () => IIterator[IKeyValuePair[_, _]],
    getView: () => IMapView[String, IVector[String]],
    hasKey: String => Boolean,
    insert: (String, IVector[String]) => Boolean,
    lookup: String => IVector[String],
    remove: String => Unit,
    size: Double
  ): FilePickerFileTypesOrderedMap = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), first = js.Any.fromFunction0(first), getView = js.Any.fromFunction0(getView), hasKey = js.Any.fromFunction1(hasKey), insert = js.Any.fromFunction2(insert), lookup = js.Any.fromFunction1(lookup), remove = js.Any.fromFunction1(remove), size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePickerFileTypesOrderedMap]
  }
}

