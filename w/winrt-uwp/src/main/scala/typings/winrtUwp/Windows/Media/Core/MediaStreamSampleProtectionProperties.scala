package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection properties that are specific to the Digital Rights Management (DRM) protection of the MediaStreamSample . */
trait MediaStreamSampleProtectionProperties extends js.Object {
  /**
    * Gets the Digital Rights Management (DRM) initialization vector from the MediaStreamSample .
    * @return The initialization vector.
    */
  def getInitializationVector(): js.Array[Double]
  /**
    * Gets the Digital Rights Management (DRM) key identifier from the MediaStreamSample .
    * @return Receives the key identifier used to decrypt the data.
    */
  def getKeyIdentifier(): js.Array[Double]
  /**
    * Gets the Digital Rights Management (DRM) sub-sample mapping from the MediaStreamSample .
    * @return Receives the sub-sample mapping.
    */
  def getSubSampleMapping(): js.Array[Double]
  /**
    * Sets the Digital Rights Management (DRM) initialization vector for the MediaStreamSample .
    * @param value The value to set the DRM initialization vector to.
    */
  def setInitializationVector(value: js.Array[Double]): Unit
  /**
    * Sets the Digital Rights Management (DRM) key identifier for the MediaStreamSample .
    * @param value The value to set the DRM key identifier to.
    */
  def setKeyIdentifier(value: js.Array[Double]): Unit
  /**
    * Sets the Digital Rights Management (DRM) sub-sample mapping for the MediaStreamSample .
    * @param value The value to set the DRM sub-sample mapping to.
    */
  def setSubSampleMapping(value: js.Array[Double]): Unit
}

object MediaStreamSampleProtectionProperties {
  @scala.inline
  def apply(
    getInitializationVector: () => js.Array[Double],
    getKeyIdentifier: () => js.Array[Double],
    getSubSampleMapping: () => js.Array[Double],
    setInitializationVector: js.Array[Double] => Unit,
    setKeyIdentifier: js.Array[Double] => Unit,
    setSubSampleMapping: js.Array[Double] => Unit
  ): MediaStreamSampleProtectionProperties = {
    val __obj = js.Dynamic.literal(getInitializationVector = js.Any.fromFunction0(getInitializationVector), getKeyIdentifier = js.Any.fromFunction0(getKeyIdentifier), getSubSampleMapping = js.Any.fromFunction0(getSubSampleMapping), setInitializationVector = js.Any.fromFunction1(setInitializationVector), setKeyIdentifier = js.Any.fromFunction1(setKeyIdentifier), setSubSampleMapping = js.Any.fromFunction1(setSubSampleMapping))
    __obj.asInstanceOf[MediaStreamSampleProtectionProperties]
  }
}

