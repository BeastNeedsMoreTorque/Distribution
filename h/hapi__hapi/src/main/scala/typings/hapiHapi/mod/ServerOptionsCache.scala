package typings.hapiHapi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.hapiCatbox.hapiCatboxBooleans.`false`
import typings.hapiCatbox.mod.ClientApi
import typings.hapiCatbox.mod.ClientOptions
import typings.hapiCatbox.mod.GenerateFuncFlags
import typings.hapiCatbox.mod.Id
import typings.hapiCatbox.mod.PolicyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptionsCache
  extends PolicyOptions[js.Any]
     with /** other options passed to the catbox strategy used. Other options are only passed to catbox when engine above is a class or function and ignored if engine is a catbox engine object). */
/* s */ StringDictionary[js.Any] {
  /** catbox engine object. */
  var engine: js.UndefOr[ClientApi[_]] = js.undefined
  /**
    * an identifier used later when provisioning or configuring caching for server methods or plugins. Each cache name must be unique. A single item may omit the name option which defines
    * the default cache. If every cache includes a name, a default memory cache is provisioned as well.
    */
  var name: js.UndefOr[String] = js.undefined
  /** (optional) string used to isolate cached data. Defaults to 'hapi-cache'. */
  var partition: js.UndefOr[String] = js.undefined
  /**
    * a class or a prototype function
    */
  var provider: js.UndefOr[CacheProvider[ClientOptions]] = js.undefined
  /** if true, allows multiple cache users to share the same segment (e.g. multiple methods using the same cache storage container). Default to false. */
  var shared: js.UndefOr[Boolean] = js.undefined
}

object ServerOptionsCache {
  @scala.inline
  def apply(
    StringDictionary: /** other options passed to the catbox strategy used. Other options are only passed to catbox when engine above is a class or function and ignored if engine is a catbox engine object). */
  /* s */ StringDictionary[js.Any] = null,
    dropOnError: js.UndefOr[Boolean] = js.undefined,
    engine: ClientApi[_] = null,
    expiresAt: String = null,
    expiresIn: js.UndefOr[Double] = js.undefined,
    generateFunc: (/* id */ Id, /* flags */ GenerateFuncFlags) => js.Promise[js.Any] = null,
    generateIgnoreWriteError: js.UndefOr[Boolean] = js.undefined,
    generateOnReadError: js.UndefOr[Boolean] = js.undefined,
    generateTimeout: Double | `false` = null,
    name: String = null,
    partition: String = null,
    pendingGenerateTimeout: js.UndefOr[Double] = js.undefined,
    provider: CacheProvider[ClientOptions] = null,
    shared: js.UndefOr[Boolean] = js.undefined,
    staleIn: Double | (js.Function2[/* stored */ Double, /* ttl */ Double, Double]) = null,
    staleTimeout: js.UndefOr[Double] = js.undefined
  ): ServerOptionsCache = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(dropOnError)) __obj.updateDynamic("dropOnError")(dropOnError.get.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (expiresAt != null) __obj.updateDynamic("expiresAt")(expiresAt.asInstanceOf[js.Any])
    if (!js.isUndefined(expiresIn)) __obj.updateDynamic("expiresIn")(expiresIn.get.asInstanceOf[js.Any])
    if (generateFunc != null) __obj.updateDynamic("generateFunc")(js.Any.fromFunction2(generateFunc))
    if (!js.isUndefined(generateIgnoreWriteError)) __obj.updateDynamic("generateIgnoreWriteError")(generateIgnoreWriteError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(generateOnReadError)) __obj.updateDynamic("generateOnReadError")(generateOnReadError.get.asInstanceOf[js.Any])
    if (generateTimeout != null) __obj.updateDynamic("generateTimeout")(generateTimeout.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    if (!js.isUndefined(pendingGenerateTimeout)) __obj.updateDynamic("pendingGenerateTimeout")(pendingGenerateTimeout.get.asInstanceOf[js.Any])
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (!js.isUndefined(shared)) __obj.updateDynamic("shared")(shared.get.asInstanceOf[js.Any])
    if (staleIn != null) __obj.updateDynamic("staleIn")(staleIn.asInstanceOf[js.Any])
    if (!js.isUndefined(staleTimeout)) __obj.updateDynamic("staleTimeout")(staleTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptionsCache]
  }
}

