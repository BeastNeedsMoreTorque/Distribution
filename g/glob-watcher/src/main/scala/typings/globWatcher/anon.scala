package typings.globWatcher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait Subscribe extends js.Object {
    def subscribe(): js.Any = js.native
    def subscribe(next: js.Function1[/* value */ js.Any, Unit]): js.Any = js.native
    def subscribe(next: js.Function1[/* value */ js.Any, Unit], error: js.Function1[/* error */ js.Any, Unit]): js.Any = js.native
    def subscribe(
      next: js.Function1[/* value */ js.Any, Unit],
      error: js.Function1[/* error */ js.Any, Unit],
      complete: js.Function0[Unit]
    ): js.Any = js.native
  }
  
}

