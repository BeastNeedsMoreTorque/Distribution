package typings.activexLibreoffice.com_.sun.star.script.provider

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface represents an invokable script or UNO function. */
trait XScript extends XInterface {
  /**
    * invoke the script or function represented by the implementing object
    * @param aParams all parameters; pure, out parameters are undefined in sequence, i.e., the value has to be ignored by the callee
    * @param aOutParamIndex out indices, indicating the position of the out or inout parameters in the list of arguments to the script
    * @param aOutParam out parameters For example, if the script had the signature ; `long foo( [inout] string a, [in] string b, [out] string c )`;  the call
    * @returns the value returned from the function being invoked
    * @throws com::sun::star::reflection::InvocationTargetException if and error occurs while attempting to invoke a script the information is captured. If the
    */
  def invoke(aParams: SeqEquiv[_], aOutParamIndex: js.Array[SeqEquiv[Double]], aOutParam: js.Array[SeqEquiv[_]]): js.Any
}

object XScript {
  @scala.inline
  def apply(
    acquire: () => Unit,
    invoke: (SeqEquiv[_], js.Array[SeqEquiv[Double]], js.Array[SeqEquiv[_]]) => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XScript = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), invoke = js.Any.fromFunction3(invoke), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XScript]
  }
}

