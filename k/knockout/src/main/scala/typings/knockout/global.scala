package typings.knockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  var ko: KnockoutStatic = js.native
  //
  // refactored types into a namespace to reduce global pollution
  // and used Union Types to simplify overloads (requires TypeScript 1.4)
  //
  @js.native
  object KnockoutComponentTypes extends js.Object
  
}

