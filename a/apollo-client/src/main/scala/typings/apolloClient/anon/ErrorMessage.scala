package typings.apolloClient.anon

import typings.graphql.mod.GraphQLError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorMessage extends js.Object {
  var errorMessage: js.UndefOr[String] = js.undefined
  var extraInfo: js.UndefOr[js.Any] = js.undefined
  var graphQLErrors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
  var networkError: js.UndefOr[Error | Null] = js.undefined
}

object ErrorMessage {
  @scala.inline
  def apply(
    errorMessage: String = null,
    extraInfo: js.Any = null,
    graphQLErrors: js.Array[GraphQLError] = null,
    networkError: js.UndefOr[Null | Error] = js.undefined
  ): ErrorMessage = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (extraInfo != null) __obj.updateDynamic("extraInfo")(extraInfo.asInstanceOf[js.Any])
    if (graphQLErrors != null) __obj.updateDynamic("graphQLErrors")(graphQLErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(networkError)) __obj.updateDynamic("networkError")(networkError.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorMessage]
  }
}

