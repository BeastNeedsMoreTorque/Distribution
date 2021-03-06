package typings.parse.mod.global.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Object {
  // From https://github.com/parse-community/Parse-SDK-JS/blob/master/src/encode.js
  /* Rewritten from type alias, can be one of: 
    - T
    - typings.parse.mod.global.Parse.Object.ToJSON[T]
    - js.Array[js.Any]
    - java.lang.String
    - typings.parse.anon.Iso
    - typings.std.ReturnType[
  / * import warning: importer.ImportType#apply Failed type conversion: T['toJSON'] * / js.Any]
    - typings.parse.mod.global.Parse.Pointer
  */
  type Encode[T] = typings.parse.mod.global.Parse.Object._Encode[T] | js.Array[js.Any] | (typings.std.ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: T['toJSON'] */ js.Any
  ]) | T | typings.parse.mod.global.Parse.Object.ToJSON[T] | java.lang.String
  type ToJSON[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: parse.parse.<global>.Parse.Object.Encode<T[K]>}
    */ typings.parse.parseStrings.ToJSON with org.scalablytyped.runtime.TopLevel[T]
}
