package typings.typesettable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/utils/methods", JSImport.Namespace)
@js.native
object methodsMod extends js.Object {
  @js.native
  class Methods () extends js.Object
  
  /* static members */
  @js.native
  object Methods extends js.Object {
    /**
      * Check if two arrays are equal by strict equality.
      */
    def arrayEq[T](a: js.Array[T], b: js.Array[T]): Boolean = js.native
    /**
      * Shim for _.defaults
      */
    def defaults(target: js.Any, objects: js.Any*): js.Any = js.native
    /**
      * @param {any} a Object to check against b for equality.
      * @param {any} b Object to check against a for equality.
      *
      * @returns {boolean} whether or not two objects share the same keys, and
      *          values associated with those keys. Values will be compared
      *          with ===.
      */
    def objEq(a: js.Any, b: js.Any): Boolean = js.native
    def strictEq(a: js.Any, b: js.Any): Boolean = js.native
  }
  
}

