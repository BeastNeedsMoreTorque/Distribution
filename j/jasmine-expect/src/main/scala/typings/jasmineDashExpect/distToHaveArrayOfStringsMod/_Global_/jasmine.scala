package typings.jasmineDashExpect.distToHaveArrayOfStringsMod._Global_

import typings.jasmineDashExpect.distToHaveArrayOfStringsMod.ToHaveArrayOfStrings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jasmine")
@js.native
object jasmine extends js.Object {
  @js.native
  trait Matchers[T] extends js.Object {
    @JSName("toHaveArrayOfStrings")
    var toHaveArrayOfStrings_Original: ToHaveArrayOfStrings = js.native
    def toHaveArrayOfStrings(key: String): Boolean = js.native
    def toHaveArrayOfStrings(key: String, expectationFailOutput: js.Any): Boolean = js.native
  }
  
}

