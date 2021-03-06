package typings.firebaseMessaging

import typings.std.Headers
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/messaging/dist/testing/compare-headers", JSImport.Namespace)
@js.native
object compareHeadersMod extends js.Object {
  @js.native
  trait HeadersWithEntries extends Headers {
    @JSName("entries")
    var entries_FHeadersWithEntries: js.UndefOr[js.Function0[Iterable[js.Tuple2[String, String]]]] = js.native
  }
  
  def compareHeaders(expectedHeaders: HeadersWithEntries, actualHeaders: HeadersWithEntries): Unit = js.native
}

