package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.MultipleBatchResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.MultipleBatchResponse>> */
trait ReadonlyWaitablePromiseMu extends js.Object {
  def `catch`[TResult](): js.Promise[MultipleBatchResponse | TResult]
  def `finally`(): js.Promise[MultipleBatchResponse]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyWaitablePromiseMu {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[MultipleBatchResponse | js.Any],
    `finally`: () => js.Promise[MultipleBatchResponse],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyWaitablePromiseMu = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyWaitablePromiseMu]
  }
}

