package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ReadonlyPromisevoid
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "waitTask")
@js.native
object waitTask extends js.Object {
  def apply(base: SearchIndex): js.Function2[
    /* taskID */ Double, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromisevoid
  ] = js.native
}

