package typings.typeFest

import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("type-fest/source/require-exactly-one", JSImport.Namespace)
@js.native
object requireExactlyOneMod extends js.Object {
  type Omit[T, K /* <: /* keyof any */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  type RequireExactlyOne[ObjectType, KeysType /* <: /* keyof ObjectType */ String */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ Key in KeysType ]: std.Required<std.Pick<ObjectType, Key>> & std.Partial<std.Record<std.Exclude<KeysType, Key>, never>>}[KeysType] */ js.Any) with (Omit[ObjectType, KeysType])
}

