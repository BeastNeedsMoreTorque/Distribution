package typings.expectations

import typings.expectations.Expectations.IAssertions
import typings.expectations.Expectations.IExpectations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  var expect: IExpectations = js.native
  @js.native
  object Expectations extends js.Object {
    @js.native
    class Expect protected ()
      extends typings.expectations.Expectations.Expect {
      def this(value: js.Any) = this()
      def this(value: js.Any, assertions: IAssertions) = this()
      def this(value: js.Any, assertions: IAssertions, expr: js.Any) = this()
      def this(
        value: js.Any,
        assertions: IAssertions,
        expr: js.Any,
        parent: typings.expectations.Expectations.Expect
      ) = this()
    }
    
  }
  
}

