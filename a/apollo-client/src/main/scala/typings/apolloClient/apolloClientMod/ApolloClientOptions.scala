package typings.apolloClient.apolloClientMod

import typings.apolloCache.mod.ApolloCache
import typings.apolloClient.localStateMod.FragmentMatcher
import typings.apolloClient.typesMod.Resolvers
import typings.apolloLink.mod.ApolloLink
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloClientOptions[TCacheShape] extends js.Object {
  var assumeImmutableResults: js.UndefOr[Boolean] = js.undefined
  var cache: ApolloCache[TCacheShape]
  var connectToDevTools: js.UndefOr[Boolean] = js.undefined
  var defaultOptions: js.UndefOr[DefaultOptions] = js.undefined
  var fragmentMatcher: js.UndefOr[FragmentMatcher] = js.undefined
  var link: js.UndefOr[ApolloLink] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var queryDeduplication: js.UndefOr[Boolean] = js.undefined
  var resolvers: js.UndefOr[Resolvers | js.Array[Resolvers]] = js.undefined
  var ssrForceFetchDelay: js.UndefOr[Double] = js.undefined
  var ssrMode: js.UndefOr[Boolean] = js.undefined
  var typeDefs: js.UndefOr[String | (js.Array[DocumentNode | String]) | DocumentNode] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object ApolloClientOptions {
  @scala.inline
  def apply[TCacheShape](
    cache: ApolloCache[TCacheShape],
    assumeImmutableResults: js.UndefOr[Boolean] = js.undefined,
    connectToDevTools: js.UndefOr[Boolean] = js.undefined,
    defaultOptions: DefaultOptions = null,
    fragmentMatcher: (/* rootValue */ js.Any, /* typeCondition */ String, /* context */ js.Any) => Boolean = null,
    link: ApolloLink = null,
    name: String = null,
    queryDeduplication: js.UndefOr[Boolean] = js.undefined,
    resolvers: Resolvers | js.Array[Resolvers] = null,
    ssrForceFetchDelay: js.UndefOr[Double] = js.undefined,
    ssrMode: js.UndefOr[Boolean] = js.undefined,
    typeDefs: String | (js.Array[DocumentNode | String]) | DocumentNode = null,
    version: String = null
  ): ApolloClientOptions[TCacheShape] = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    if (!js.isUndefined(assumeImmutableResults)) __obj.updateDynamic("assumeImmutableResults")(assumeImmutableResults.get.asInstanceOf[js.Any])
    if (!js.isUndefined(connectToDevTools)) __obj.updateDynamic("connectToDevTools")(connectToDevTools.get.asInstanceOf[js.Any])
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions.asInstanceOf[js.Any])
    if (fragmentMatcher != null) __obj.updateDynamic("fragmentMatcher")(js.Any.fromFunction3(fragmentMatcher))
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(queryDeduplication)) __obj.updateDynamic("queryDeduplication")(queryDeduplication.get.asInstanceOf[js.Any])
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers.asInstanceOf[js.Any])
    if (!js.isUndefined(ssrForceFetchDelay)) __obj.updateDynamic("ssrForceFetchDelay")(ssrForceFetchDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ssrMode)) __obj.updateDynamic("ssrMode")(ssrMode.get.asInstanceOf[js.Any])
    if (typeDefs != null) __obj.updateDynamic("typeDefs")(typeDefs.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApolloClientOptions[TCacheShape]]
  }
}

