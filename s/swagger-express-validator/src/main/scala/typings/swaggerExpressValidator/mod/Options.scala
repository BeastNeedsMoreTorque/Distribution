package typings.swaggerExpressValidator.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowNullable: js.UndefOr[Boolean] = js.undefined
  var requestValidationFn: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* data */ js.Any, 
      /* errors */ js.Any, 
      Unit
    ]
  ] = js.undefined
  var responseValidationFn: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* data */ js.Any, 
      /* errors */ js.Any, 
      Unit
    ]
  ] = js.undefined
  var schema: String
  var validateRequest: js.UndefOr[Boolean] = js.undefined
  var validateResponse: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    schema: String,
    allowNullable: js.UndefOr[Boolean] = js.undefined,
    requestValidationFn: (/* req */ Request_[ParamsDictionary, _, _, Query], /* data */ js.Any, /* errors */ js.Any) => Unit = null,
    responseValidationFn: (/* req */ Request_[ParamsDictionary, _, _, Query], /* data */ js.Any, /* errors */ js.Any) => Unit = null,
    validateRequest: js.UndefOr[Boolean] = js.undefined,
    validateResponse: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    if (!js.isUndefined(allowNullable)) __obj.updateDynamic("allowNullable")(allowNullable.get.asInstanceOf[js.Any])
    if (requestValidationFn != null) __obj.updateDynamic("requestValidationFn")(js.Any.fromFunction3(requestValidationFn))
    if (responseValidationFn != null) __obj.updateDynamic("responseValidationFn")(js.Any.fromFunction3(responseValidationFn))
    if (!js.isUndefined(validateRequest)) __obj.updateDynamic("validateRequest")(validateRequest.get.asInstanceOf[js.Any])
    if (!js.isUndefined(validateResponse)) __obj.updateDynamic("validateResponse")(validateResponse.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

