package typings.microsoftAjax.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region ASP.NET Types
/**
* Provides a typing and type-reflection system for ECMAScript (JavaScript) object-oriented programming functionality.
* Type Class
* @see {@link http://msdn.microsoft.com/en-us/library/bb397568(v=vs.100).aspx}
*/
@JSGlobal("Type")
@js.native
class Type ()
  extends typings.microsoftAjax.Type

/* static members */
@JSGlobal("Type")
@js.native
object Type extends js.Object {
  /**
    * Creates a callback method, given the function to callback and the parameter to pass to it.
    * @return
    *       The callback function.
    *
    * @param method
    *           The function for which the callback method will be created.
    * @param context
    *           The parameter to pass to the function. This parameter can be null, but it cannot be omitted.
    */
  def createCallback(method: js.Function, context: js.Object): js.Function = js.native
  /**
    * Creates a delegate function that keeps the context from its creation. The context defines the object instance to which the this keyword points.
    * @param instance
    *           The object instance that will be the context for the function. This parameter can be null.
    * @param method
    *           The function from which the delegate is created.
    * @return The delegate function.
    */
  def createDelegate(instance: js.Object, method: js.Function): js.Function = js.native
  /**
    * Returns an Array object containing references to all the root namespaces of the client application. This method is static and is invoked without creating an instance of the object.
    * Use the getRootNamespaces function to return an array containing references to all the root namespaces of the client application.
    * @return An object containing references to all the root namespaces of the client application.
    */
  def getRootNamespaces(): js.Any = js.native
  /**
    * Returns a value that indicates whether the specified type is a class. This method is static and can be invoked without creating an instance of the object.
    * @param type
    *           The type to test.
    * @return true if the specified type is a class; otherwise, false.
    */
  def isClass(`type`: js.Any): Boolean = js.native
  /**
    * Indicates whether the specified type is an enumeration.
    * @param type
    *           The type to test.
    * @return true if the type is an enumeration; otherwise, false.
    */
  def isEnum(`type`: js.Any): Boolean = js.native
  /**
    * Get a value that indicates whether the specified type is an integer of flags.
    * @param
    *      The type to test.
    * @return true if the type is an integer of flags; otherwise, false.
    */
  def isFlags(`type`: js.Any): Boolean = js.native
  /**
    * Returns a value that indicates whether the specified type is an interface. This is a static member that is invoked directly without creating an instance of the class.
    * @param type
    *           The type to test.
    * @return true if the specified type is an interface; otherwise, false.
    */
  def isInterface(`type`: js.Any): Boolean = js.native
  /**
    * Returns a value that indicates whether the specified object is a namespace. This is a static member that is invoked directly without creating an instance of the class.
    * @param object
    *           The object to test.
    * @return true if the specified object is a namespace; otherwise, false.
    */
  def isNamespace(`object`: js.Any): Boolean = js.native
  /**
    * Returns an instance of the type specified by a type name. This is a static member that is invoked directly without creating an instance of its class.
    * @param typeName
    *           A string that represents a fully qualified class name. Can be null.
    * @param ns
    *           (Optional) The namespace that contains the class.
    * @return The class represented by typeName, or null if a class that matches typeName does not occur in the namespace.
    */
  def parse(typeName: String): js.Any = js.native
  def parse(typeName: String, ns: String): js.Any = js.native
  /**
    * Creates a namespace. This member is static and can be invoked without creating an instance of the class.
    * @param namespacePath
    *           A string that represents the fully qualified namespace to register.
    */
  def registerNamespace(namespacePath: String): Unit = js.native
}

