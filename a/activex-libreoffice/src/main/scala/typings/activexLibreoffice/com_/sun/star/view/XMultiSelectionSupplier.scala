package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to append and remove objects from a selection.
  *
  * The method XSelectionSupplier::setSelection() for an instance that also supports {@link XMultiSelectionSupplier} should be implemented that it also
  * takes either a selectable object or a sequence of selectable objects.
  *
  * Adding an object more than once to a selection should not toggle the selection for that object but only select it once
  */
trait XMultiSelectionSupplier extends XSelectionSupplier {
  /** returns the number of selected objects of this {@link XMultiSelectionSupplier} . */
  val SelectionCount: Double
  /**
    * adds the object or the objects represented by **Selection** to the selection of this {@link XMultiSelectionSupplier} .
    * @param Selection either an Object that is selectable or a sequence of objects that are selectable.
    * @returns `TRUE` /, if **Selection** was added to the current selection. `FALSE` , if **Selection** or parts of **Selection** could not be added to the cur
    * @throws com::sun::star::lang::IllegalArgumentException If **Selection** is not a selectable object for this {@link XMultiSelectionSupplier} . Adding an o
    */
  def addSelection(Selection: js.Any): Boolean
  /** clears the selection of this {@link XMultiSelectionSupplier} . */
  def clearSelection(): Unit
  /** @returns a new object to enumerate the selection of this {@link XMultiSelectionSupplier} in reverse order. If the order of the selected objects It returns */
  def createReverseSelectionEnumeration(): XEnumeration
  /** @returns a new object to enumerate the selection of this {@link XMultiSelectionSupplier} . It returns NULL if there are no objects in the selection. */
  def createSelectionEnumeration(): XEnumeration
  /** returns the number of selected objects of this {@link XMultiSelectionSupplier} . */
  def getSelectionCount(): Double
  /**
    * remove the object or objects represented by **Selection** from the selection of this {@link XMultiSelectionSupplier} .
    * @param Selection either an Object that is selectable or a sequence of objects that are selectable.
    * @returns `TRUE` /, if **Selection** was added to the current selection. `FALSE` , if **Selection** or parts of **Selection** could not be added to the cur
    * @throws com::sun::star::lang::IllegalArgumentException If **Selection** is not a selectable object for this {@link XMultiSelectionSupplier} . Removing an
    */
  def removeSelection(Selection: js.Any): Unit
}

object XMultiSelectionSupplier {
  @scala.inline
  def apply(
    Selection: js.Any,
    SelectionCount: Double,
    acquire: () => Unit,
    addSelection: js.Any => Boolean,
    addSelectionChangeListener: XSelectionChangeListener => Unit,
    clearSelection: () => Unit,
    createReverseSelectionEnumeration: () => XEnumeration,
    createSelectionEnumeration: () => XEnumeration,
    getSelection: () => js.Any,
    getSelectionCount: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeSelection: js.Any => Unit,
    removeSelectionChangeListener: XSelectionChangeListener => Unit,
    select: js.Any => Boolean
  ): XMultiSelectionSupplier = {
    val __obj = js.Dynamic.literal(Selection = Selection.asInstanceOf[js.Any], SelectionCount = SelectionCount.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addSelection = js.Any.fromFunction1(addSelection), addSelectionChangeListener = js.Any.fromFunction1(addSelectionChangeListener), clearSelection = js.Any.fromFunction0(clearSelection), createReverseSelectionEnumeration = js.Any.fromFunction0(createReverseSelectionEnumeration), createSelectionEnumeration = js.Any.fromFunction0(createSelectionEnumeration), getSelection = js.Any.fromFunction0(getSelection), getSelectionCount = js.Any.fromFunction0(getSelectionCount), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSelection = js.Any.fromFunction1(removeSelection), removeSelectionChangeListener = js.Any.fromFunction1(removeSelectionChangeListener), select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[XMultiSelectionSupplier]
  }
}

