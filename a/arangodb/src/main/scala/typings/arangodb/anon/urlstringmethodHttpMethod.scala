package typings.arangodb.anon

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.ArangoDB.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  url  :string,   method ? :arangodb.ArangoDB.HttpMethod} & arangodb.@arangodb/request.RequestOptions */
trait urlstringmethodHttpMethod extends js.Object {
  var auth: js.UndefOr[Password | Bearer] = js.undefined
  var body: js.UndefOr[js.Any] = js.undefined
  var encoding: js.UndefOr[String | Null] = js.undefined
  var followRedirect: js.UndefOr[Boolean] = js.undefined
  var form: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
  var json: js.UndefOr[Boolean] = js.undefined
  var maxRedirects: js.UndefOr[Double] = js.undefined
  var method: js.UndefOr[HttpMethod] = js.undefined
  var qs: js.UndefOr[js.Object] = js.undefined
  var returnBodyOnError: js.UndefOr[Boolean] = js.undefined
  var sslProtocol: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var url: String
  var useQuerystring: js.UndefOr[Boolean] = js.undefined
}

object urlstringmethodHttpMethod {
  @scala.inline
  def apply(
    url: String,
    auth: Password | Bearer = null,
    body: js.Any = null,
    encoding: js.UndefOr[Null | String] = js.undefined,
    followRedirect: js.UndefOr[Boolean] = js.undefined,
    form: js.Any = null,
    headers: StringDictionary[js.UndefOr[String]] = null,
    json: js.UndefOr[Boolean] = js.undefined,
    maxRedirects: js.UndefOr[Double] = js.undefined,
    method: HttpMethod = null,
    qs: js.Object = null,
    returnBodyOnError: js.UndefOr[Boolean] = js.undefined,
    sslProtocol: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    useQuerystring: js.UndefOr[Boolean] = js.undefined
  ): urlstringmethodHttpMethod = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(encoding)) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirect)) __obj.updateDynamic("followRedirect")(followRedirect.get.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRedirects)) __obj.updateDynamic("maxRedirects")(maxRedirects.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (qs != null) __obj.updateDynamic("qs")(qs.asInstanceOf[js.Any])
    if (!js.isUndefined(returnBodyOnError)) __obj.updateDynamic("returnBodyOnError")(returnBodyOnError.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sslProtocol)) __obj.updateDynamic("sslProtocol")(sslProtocol.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useQuerystring)) __obj.updateDynamic("useQuerystring")(useQuerystring.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[urlstringmethodHttpMethod]
  }
}

