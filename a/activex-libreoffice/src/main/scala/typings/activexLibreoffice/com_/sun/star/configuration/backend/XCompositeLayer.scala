package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides read access to layers that contain sublayers accessible through an additional criterion (for instance the locale they contain data for).
  * @since OOo 1.1.2
  */
trait XCompositeLayer extends XLayer {
  /**
    * Returns a list of the criteria that can be used to access the sublayers.
    * @returns a list supported sublayer identifiers
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs in the retrieval of the data.
    */
  def listSubLayerIds(): SafeArray[String]
  /**
    * Describes the content of a particular sublayer to an {@link XLayerHandler} .
    * @param aHandler Handler object that will receive calls describing the contents of the sublayer.
    * @param aSubLayerId Identifier of the sublayer to be read. Must be one the identifiers returned by {@link XCompositeLayer.listSubLayerIds()}
    * @throws com::sun::star::lang::NullPointerException if a `NULL` handler is passed.
    * @throws com::sun::star::lang::IllegalArgumentException if the identifier is invalid.
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs in the access to or processing of the data.
    * @throws com::sun::star::configuration::backend::MalformedDataException if the data read from the layer is rejected as invalid by the {@link XLayerHandler} .
    */
  def readSubLayerData(aHandler: XLayerHandler, aSubLayerId: String): Unit
}

object XCompositeLayer {
  @scala.inline
  def apply(
    acquire: () => Unit,
    listSubLayerIds: () => SafeArray[String],
    queryInterface: `type` => js.Any,
    readData: XLayerHandler => Unit,
    readSubLayerData: (XLayerHandler, String) => Unit,
    release: () => Unit
  ): XCompositeLayer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), listSubLayerIds = js.Any.fromFunction0(listSubLayerIds), queryInterface = js.Any.fromFunction1(queryInterface), readData = js.Any.fromFunction1(readData), readSubLayerData = js.Any.fromFunction2(readSubLayerData), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCompositeLayer]
  }
}

