package typings.octokitPluginRestEndpointMethods.anon

import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typings.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typings.octokitTypes.requestParametersMod.RequestParameters
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Get308 extends js.Object {
  /**
    * **Note:** Accessing this endpoint does not count against your REST API rate limit.
    *
    * **Understanding your rate limit status**
    *
    * The Search API has a [custom rate limit](https://developer.github.com/v3/search/#rate-limit), separate from the rate limit governing the rest of the REST API. The GraphQL API also has a [custom rate limit](https://developer.github.com/v4/guides/resource-limitations/#rate-limit) that is separate from and calculated differently than rate limits in the REST API.
    *
    * For these reasons, the Rate Limit API response categorizes your rate limit. Under `resources`, you'll see four objects:
    *
    * *   The `core` object provides your rate limit status for all non-search-related resources in the REST API.
    * *   The `search` object provides your rate limit status for the [Search API](https://developer.github.com/v3/search/).
    * *   The `graphql` object provides your rate limit status for the [GraphQL API](https://developer.github.com/v4/).
    * *   The `integration_manifest` object provides your rate limit status for the [GitHub App Manifest code conversion](https://developer.github.com/apps/building-github-apps/creating-github-apps-from-a-manifest/#3-you-exchange-the-temporary-code-to-retrieve-the-app-configuration) endpoint.
    *
    * For more information on the headers and values in the rate limit response, see "[Rate limiting](https://developer.github.com/v3/#rate-limiting)."
    *
    * The `rate` object (shown at the bottom of the response above) is deprecated.
    *
    * If you're writing new API client code or updating existing code, you should use the `core` object instead of the `rate` object. The `core` object contains the same information that is present in the `rate` object.
    */
  @JSName("get")
  var get_Original: `308` = js.native
  /**
    * **Note:** Accessing this endpoint does not count against your REST API rate limit.
    *
    * **Understanding your rate limit status**
    *
    * The Search API has a [custom rate limit](https://developer.github.com/v3/search/#rate-limit), separate from the rate limit governing the rest of the REST API. The GraphQL API also has a [custom rate limit](https://developer.github.com/v4/guides/resource-limitations/#rate-limit) that is separate from and calculated differently than rate limits in the REST API.
    *
    * For these reasons, the Rate Limit API response categorizes your rate limit. Under `resources`, you'll see four objects:
    *
    * *   The `core` object provides your rate limit status for all non-search-related resources in the REST API.
    * *   The `search` object provides your rate limit status for the [Search API](https://developer.github.com/v3/search/).
    * *   The `graphql` object provides your rate limit status for the [GraphQL API](https://developer.github.com/v4/).
    * *   The `integration_manifest` object provides your rate limit status for the [GitHub App Manifest code conversion](https://developer.github.com/apps/building-github-apps/creating-github-apps-from-a-manifest/#3-you-exchange-the-temporary-code-to-retrieve-the-app-configuration) endpoint.
    *
    * For more information on the headers and values in the rate limit response, see "[Rate limiting](https://developer.github.com/v3/#rate-limiting)."
    *
    * The `rate` object (shown at the bottom of the response above) is deprecated.
    *
    * If you're writing new API client code or updating existing code, you should use the `core` object instead of the `rate` object. The `core` object contains the same information that is present in the `rate` object.
    */
  def get(): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /rate_limit']['response'] */ js.Any
  ] = js.native
  def get(
    params: RequestParameters with (Omit[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /rate_limit']['parameters'] */ js.Any, 
      baseUrl | headers | mediaType
    ])
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/types.@octokit/types/dist-types/generated/Endpoints.Endpoints['GET /rate_limit']['response'] */ js.Any
  ] = js.native
}

