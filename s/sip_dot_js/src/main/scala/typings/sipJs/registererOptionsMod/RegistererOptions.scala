package typings.sipJs.registererOptionsMod

import typings.sipJs.anon.FromTag
import typings.sipJs.coreMod.URI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistererOptions extends js.Object {
  /** Registration expiration time in seconds. */
  var expires: js.UndefOr[Double] = js.undefined
  /** Array of extra Contact header parameters. */
  var extraContactHeaderParams: js.UndefOr[js.Array[String]] = js.undefined
  /** Array of extra headers added to the REGISTER. */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * UUID to provide with "+sip.instance" Contact parameter.
    * @defaultValue a randomly generated uuid
    */
  var instanceId: js.UndefOr[String] = js.undefined
  /**
    * If true, constructor logs the registerer configuration.
    * @defaultValue `true`
    */
  var logConfiguration: js.UndefOr[Boolean] = js.undefined
  /** @deprecated TODO: provide alternative. */
  var params: js.UndefOr[FromTag] = js.undefined
  /**
    * Value to provide with "reg-id" Contact parameter.
    * @defaultValue 1
    */
  var regId: js.UndefOr[Double] = js.undefined
  /**
    * The URI of the registrar to send the REGISTER requests.
    * @defaultValue domain portion of the user agent's uri
    */
  var registrar: js.UndefOr[URI] = js.undefined
}

object RegistererOptions {
  @scala.inline
  def apply(
    expires: js.UndefOr[Double] = js.undefined,
    extraContactHeaderParams: js.Array[String] = null,
    extraHeaders: js.Array[String] = null,
    instanceId: String = null,
    logConfiguration: js.UndefOr[Boolean] = js.undefined,
    params: FromTag = null,
    regId: js.UndefOr[Double] = js.undefined,
    registrar: URI = null
  ): RegistererOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires.get.asInstanceOf[js.Any])
    if (extraContactHeaderParams != null) __obj.updateDynamic("extraContactHeaderParams")(extraContactHeaderParams.asInstanceOf[js.Any])
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (!js.isUndefined(logConfiguration)) __obj.updateDynamic("logConfiguration")(logConfiguration.get.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(regId)) __obj.updateDynamic("regId")(regId.get.asInstanceOf[js.Any])
    if (registrar != null) __obj.updateDynamic("registrar")(registrar.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistererOptions]
  }
}

