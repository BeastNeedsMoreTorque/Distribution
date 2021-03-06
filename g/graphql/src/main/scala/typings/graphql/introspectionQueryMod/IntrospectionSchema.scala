package typings.graphql.introspectionQueryMod

import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionSchema extends js.Object {
  val directives: js.Array[IntrospectionDirective]
  val mutationType: Maybe[IntrospectionNamedTypeRef[IntrospectionObjectType]]
  val queryType: IntrospectionNamedTypeRef[IntrospectionObjectType]
  val subscriptionType: Maybe[IntrospectionNamedTypeRef[IntrospectionObjectType]]
  val types: js.Array[IntrospectionType]
}

object IntrospectionSchema {
  @scala.inline
  def apply(
    directives: js.Array[IntrospectionDirective],
    queryType: IntrospectionNamedTypeRef[IntrospectionObjectType],
    types: js.Array[IntrospectionType],
    mutationType: js.UndefOr[Null | Maybe[IntrospectionNamedTypeRef[IntrospectionObjectType]]] = js.undefined,
    subscriptionType: js.UndefOr[Null | Maybe[IntrospectionNamedTypeRef[IntrospectionObjectType]]] = js.undefined
  ): IntrospectionSchema = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], queryType = queryType.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    if (!js.isUndefined(mutationType)) __obj.updateDynamic("mutationType")(mutationType.asInstanceOf[js.Any])
    if (!js.isUndefined(subscriptionType)) __obj.updateDynamic("subscriptionType")(subscriptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionSchema]
  }
}

