package typings.urqlCore.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkError extends js.Object {
  var graphQLErrors: js.UndefOr[js.Array[String | PartialGraphQLError | Error]] = js.undefined
  var networkError: js.UndefOr[Error] = js.undefined
  var response: js.UndefOr[js.Any] = js.undefined
}

object NetworkError {
  @scala.inline
  def apply(
    graphQLErrors: js.Array[String | PartialGraphQLError | Error] = null,
    networkError: Error = null,
    response: js.Any = null
  ): NetworkError = {
    val __obj = js.Dynamic.literal()
    if (graphQLErrors != null) __obj.updateDynamic("graphQLErrors")(graphQLErrors.asInstanceOf[js.Any])
    if (networkError != null) __obj.updateDynamic("networkError")(networkError.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkError]
  }
}

