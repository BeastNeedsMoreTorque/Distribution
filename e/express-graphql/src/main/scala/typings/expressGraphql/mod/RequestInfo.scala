package typings.expressGraphql.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All information about a GraphQL request.
  */
trait RequestInfo extends js.Object {
  /**
    * A value to pass as the context to the graphql() function.
    */
  var context: js.UndefOr[js.Any] = js.undefined
  /**
    * The parsed GraphQL document.
    */
  var document: js.UndefOr[DocumentNode | Null] = js.undefined
  /**
    * The (optional) operation name requested.
    */
  var operationName: js.UndefOr[String | Null] = js.undefined
  /**
    * The result of executing the operation.
    */
  var result: js.Any
  /**
    * The variable values used at runtime.
    */
  var variables: js.UndefOr[StringDictionary[js.Any] | Null] = js.undefined
}

object RequestInfo {
  @scala.inline
  def apply(
    result: js.Any,
    context: js.Any = null,
    document: js.UndefOr[Null | DocumentNode] = js.undefined,
    operationName: js.UndefOr[Null | String] = js.undefined,
    variables: js.UndefOr[Null | StringDictionary[js.Any]] = js.undefined
  ): RequestInfo = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(document)) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (!js.isUndefined(operationName)) __obj.updateDynamic("operationName")(operationName.asInstanceOf[js.Any])
    if (!js.isUndefined(variables)) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInfo]
  }
}

