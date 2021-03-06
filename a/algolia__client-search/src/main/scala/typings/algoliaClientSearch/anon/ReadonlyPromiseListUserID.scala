package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.ListUserIDsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.ListUserIDsResponse>> */
trait ReadonlyPromiseListUserID extends js.Object {
  def `catch`[TResult](): js.Promise[ListUserIDsResponse | TResult]
  def `finally`(): js.Promise[ListUserIDsResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseListUserID {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[ListUserIDsResponse | js.Any],
    `finally`: () => js.Promise[ListUserIDsResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseListUserID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseListUserID]
  }
}

