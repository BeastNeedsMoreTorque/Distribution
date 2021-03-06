package typings.hapiWreck.mod.Client

import typings.hapiWreck.hapiWreckBooleans.`false`
import typings.hapiWreck.hapiWreckStrings.force
import typings.hapiWreck.hapiWreckStrings.strict
import typings.hapiWreck.mod.Client.request.Payload
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequest
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typings.hapiWreck.mod.Client.request.Options
     with typings.hapiWreck.mod.Client.read.Options {
  /**
    * An object containing the node agents used for pooling connections for `http` and `https`.
    */
  val agents: js.UndefOr[Agents] = js.undefined
  /**
    * Enables events.
    * 
    * @default false
    */
  val events: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines how to handle gzipped payloads.
    *
    * @default false
    */
  /* InferMemberOverrides */
  override val gunzip: js.UndefOr[Boolean | force] = js.undefined
  /**
    * The number of milliseconds to wait while reading data before aborting handling of the response.
    * 
    * @default 0
    */
  /* InferMemberOverrides */
  override val timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    agent: Agent | typings.node.httpsMod.Agent | `false` = null,
    agents: Agents = null,
    baseUrl: String = null,
    beforeRedirect: (/* redirectMethod */ String, /* statusCode */ Double, /* location */ String, /* resHeaders */ Record[String, String], /* redirectOptions */ typings.hapiWreck.mod.Client.request.Options, /* next */ js.Function0[Unit]) => Unit = null,
    ciphers: String = null,
    events: js.UndefOr[Boolean] = js.undefined,
    gunzip: Boolean | force = null,
    headers: Record[String, String] = null,
    json: Boolean | strict | force = null,
    maxBytes: js.UndefOr[Double] = js.undefined,
    payload: Payload = null,
    redirect303: js.UndefOr[Boolean] = js.undefined,
    redirectMethod: String = null,
    redirected: (/* statusCode */ Double, /* location */ String, /* req */ ClientRequest) => Unit = null,
    redirects: Double | `false` = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    secureProtocol: String = null,
    socketPath: String = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (agents != null) __obj.updateDynamic("agents")(agents.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (beforeRedirect != null) __obj.updateDynamic("beforeRedirect")(js.Any.fromFunction6(beforeRedirect))
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (!js.isUndefined(events)) __obj.updateDynamic("events")(events.get.asInstanceOf[js.Any])
    if (gunzip != null) __obj.updateDynamic("gunzip")(gunzip.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBytes)) __obj.updateDynamic("maxBytes")(maxBytes.get.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(redirect303)) __obj.updateDynamic("redirect303")(redirect303.get.asInstanceOf[js.Any])
    if (redirectMethod != null) __obj.updateDynamic("redirectMethod")(redirectMethod.asInstanceOf[js.Any])
    if (redirected != null) __obj.updateDynamic("redirected")(js.Any.fromFunction3(redirected))
    if (redirects != null) __obj.updateDynamic("redirects")(redirects.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.get.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

