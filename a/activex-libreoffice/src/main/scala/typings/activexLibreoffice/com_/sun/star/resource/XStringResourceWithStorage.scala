package typings.activexLibreoffice.com_.sun.star.resource

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.embed.XStorage
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typings.activexLibreoffice.com_.sun.star.util.XModifyListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Extends {@link XStringResourcePersistence} by methods to handle an associated {@link com.sun.star.embed.XStorage} instance.
  * @see XStringResourcePersistence.
  */
trait XStringResourceWithStorage extends XStringResourcePersistence {
  /**
    * Associates a storage to the {@link StringResourceWithStorage} instance which is used on subsequent calls of {@link store()} .
    * @param Storage the storage to be associated to the StringResourceManager  This call has to be used carefully as it removes the storage previously connec
    * @throws com::sun::star::lang::IllegalArgumentException if a null interface is passed as Storage
    */
  def setStorage(Storage: XStorage): Unit
  /**
    * Stores all string table data to a storage and associates this storage to this instance as if {@link setStorage()} was called with this storage. The
    * modified state will be unmodified after the call.
    *
    * This method can throw all exceptions thrown by the methods of {@link com.sun.star.embed.XStorage}
    */
  def storeAsStorage(Storage: XStorage): Unit
}

object XStringResourceWithStorage {
  @scala.inline
  def apply(
    CurrentLocale: Locale,
    DefaultLocale: Locale,
    Locales: SafeArray[Locale],
    ResourceIDs: SafeArray[String],
    UniqueNumericId: Double,
    acquire: () => Unit,
    addModifyListener: XModifyListener => Unit,
    exportBinary: () => SafeArray[Double],
    getCurrentLocale: () => Locale,
    getDefaultLocale: () => Locale,
    getLocales: () => SafeArray[Locale],
    getResourceIDs: () => SafeArray[String],
    getResourceIDsForLocale: Locale => SafeArray[String],
    getUniqueNumericId: () => Double,
    hasEntryForId: String => Boolean,
    hasEntryForIdAndLocale: (String, Locale) => Boolean,
    importBinary: SeqEquiv[Double] => Unit,
    isModified: () => Boolean,
    isReadOnly: () => Boolean,
    newLocale: Locale => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeId: String => Unit,
    removeIdForLocale: (String, Locale) => Unit,
    removeLocale: Locale => Unit,
    removeModifyListener: XModifyListener => Unit,
    resolveString: String => String,
    resolveStringForLocale: (String, Locale) => String,
    setComment: String => Unit,
    setCurrentLocale: (Locale, Boolean) => Unit,
    setDefaultLocale: Locale => Unit,
    setStorage: XStorage => Unit,
    setString: (String, String) => Unit,
    setStringForLocale: (String, String, Locale) => Unit,
    store: () => Unit,
    storeAsStorage: XStorage => Unit,
    storeToStorage: (XStorage, String, String) => Unit,
    storeToURL: (String, String, String, XInteractionHandler) => Unit
  ): XStringResourceWithStorage = {
    val __obj = js.Dynamic.literal(CurrentLocale = CurrentLocale.asInstanceOf[js.Any], DefaultLocale = DefaultLocale.asInstanceOf[js.Any], Locales = Locales.asInstanceOf[js.Any], ResourceIDs = ResourceIDs.asInstanceOf[js.Any], UniqueNumericId = UniqueNumericId.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addModifyListener = js.Any.fromFunction1(addModifyListener), exportBinary = js.Any.fromFunction0(exportBinary), getCurrentLocale = js.Any.fromFunction0(getCurrentLocale), getDefaultLocale = js.Any.fromFunction0(getDefaultLocale), getLocales = js.Any.fromFunction0(getLocales), getResourceIDs = js.Any.fromFunction0(getResourceIDs), getResourceIDsForLocale = js.Any.fromFunction1(getResourceIDsForLocale), getUniqueNumericId = js.Any.fromFunction0(getUniqueNumericId), hasEntryForId = js.Any.fromFunction1(hasEntryForId), hasEntryForIdAndLocale = js.Any.fromFunction2(hasEntryForIdAndLocale), importBinary = js.Any.fromFunction1(importBinary), isModified = js.Any.fromFunction0(isModified), isReadOnly = js.Any.fromFunction0(isReadOnly), newLocale = js.Any.fromFunction1(newLocale), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeId = js.Any.fromFunction1(removeId), removeIdForLocale = js.Any.fromFunction2(removeIdForLocale), removeLocale = js.Any.fromFunction1(removeLocale), removeModifyListener = js.Any.fromFunction1(removeModifyListener), resolveString = js.Any.fromFunction1(resolveString), resolveStringForLocale = js.Any.fromFunction2(resolveStringForLocale), setComment = js.Any.fromFunction1(setComment), setCurrentLocale = js.Any.fromFunction2(setCurrentLocale), setDefaultLocale = js.Any.fromFunction1(setDefaultLocale), setStorage = js.Any.fromFunction1(setStorage), setString = js.Any.fromFunction2(setString), setStringForLocale = js.Any.fromFunction3(setStringForLocale), store = js.Any.fromFunction0(store), storeAsStorage = js.Any.fromFunction1(storeAsStorage), storeToStorage = js.Any.fromFunction3(storeToStorage), storeToURL = js.Any.fromFunction4(storeToURL))
    __obj.asInstanceOf[XStringResourceWithStorage]
  }
}

