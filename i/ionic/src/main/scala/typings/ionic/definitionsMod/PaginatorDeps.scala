package typings.ionic.definitionsMod

import typings.ionic.anon.Req
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginatorDeps[T /* <: Response[js.Array[js.Object]] */, S] extends js.Object {
  val client: IClient
  val max: js.UndefOr[Double] = js.undefined
  val state: js.UndefOr[Partial[S]] = js.undefined
  def guard(res: APIResponseSuccess): /* is T */ Boolean
  def reqgen(): js.Promise[Req]
}

object PaginatorDeps {
  @scala.inline
  def apply[/* <: typings.ionic.definitionsMod.Response[js.Array[js.Object]] */ T, S](
    client: IClient,
    guard: APIResponseSuccess => /* is T */ Boolean,
    reqgen: () => js.Promise[Req],
    max: js.UndefOr[Double] = js.undefined,
    state: Partial[S] = null
  ): PaginatorDeps[T, S] = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], guard = js.Any.fromFunction1(guard), reqgen = js.Any.fromFunction0(reqgen))
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginatorDeps[T, S]]
  }
}

