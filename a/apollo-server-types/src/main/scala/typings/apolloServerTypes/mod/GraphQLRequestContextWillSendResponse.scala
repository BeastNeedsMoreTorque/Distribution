package typings.apolloServerTypes.mod

import typings.apolloServerCaching.keyValueCacheMod.KeyValueCache
import typings.graphql.astMod.DocumentNode
import typings.graphql.astMod.OperationDefinitionNode
import typings.graphql.mod.GraphQLError
import typings.graphql.mod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined apollo-server-types.apollo-server-types.WithRequired<apollo-server-types.apollo-server-types.GraphQLRequestContext<TContext>, 'metrics' | 'response'> */
trait GraphQLRequestContextWillSendResponse[TContext] extends js.Object {
  val cache: KeyValueCache[String]
  val context: TContext
  var debug: js.UndefOr[Boolean] = js.undefined
  val document: js.UndefOr[DocumentNode] = js.undefined
  val errors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
  var logger: Logger
  val metrics: GraphQLRequestMetrics
  val operation: js.UndefOr[OperationDefinitionNode] = js.undefined
  val operationName: js.UndefOr[String | Null] = js.undefined
  val queryHash: js.UndefOr[String] = js.undefined
  val request: GraphQLRequest
  val response: js.UndefOr[GraphQLResponse] = js.undefined
  val schema: GraphQLSchema
  val schemaHash: SchemaHash
  val source: js.UndefOr[String] = js.undefined
}

object GraphQLRequestContextWillSendResponse {
  @scala.inline
  def apply[TContext](
    cache: KeyValueCache[String],
    context: TContext,
    logger: Logger,
    metrics: GraphQLRequestMetrics,
    request: GraphQLRequest,
    schema: GraphQLSchema,
    schemaHash: SchemaHash,
    debug: js.UndefOr[Boolean] = js.undefined,
    document: DocumentNode = null,
    errors: js.Array[GraphQLError] = null,
    operation: OperationDefinitionNode = null,
    operationName: js.UndefOr[Null | String] = js.undefined,
    queryHash: String = null,
    response: GraphQLResponse = null,
    source: String = null
  ): GraphQLRequestContextWillSendResponse[TContext] = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], schemaHash = schemaHash.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (!js.isUndefined(operationName)) __obj.updateDynamic("operationName")(operationName.asInstanceOf[js.Any])
    if (queryHash != null) __obj.updateDynamic("queryHash")(queryHash.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLRequestContextWillSendResponse[TContext]]
  }
}

