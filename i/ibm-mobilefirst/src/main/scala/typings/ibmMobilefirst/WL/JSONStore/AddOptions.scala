package typings.ibmMobilefirst.WL.JSONStore

import typings.ibmMobilefirst.WL.IResponse
import typings.ibmMobilefirst.WL.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOptions extends Options {
  var additionalSearchFields: js.UndefOr[js.Any] = js.undefined
  var markDirty: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated
    */
  var push: js.UndefOr[Boolean] = js.undefined
}

object AddOptions {
  @scala.inline
  def apply(
    additionalSearchFields: js.Any = null,
    invocationContext: js.Any = null,
    markDirty: js.UndefOr[Boolean] = js.undefined,
    onFailure: /* response */ IResponse => Unit = null,
    onSuccess: /* response */ IResponse => Unit = null,
    push: js.UndefOr[Boolean] = js.undefined
  ): AddOptions = {
    val __obj = js.Dynamic.literal()
    if (additionalSearchFields != null) __obj.updateDynamic("additionalSearchFields")(additionalSearchFields.asInstanceOf[js.Any])
    if (invocationContext != null) __obj.updateDynamic("invocationContext")(invocationContext.asInstanceOf[js.Any])
    if (!js.isUndefined(markDirty)) __obj.updateDynamic("markDirty")(markDirty.get.asInstanceOf[js.Any])
    if (onFailure != null) __obj.updateDynamic("onFailure")(js.Any.fromFunction1(onFailure))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1(onSuccess))
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOptions]
  }
}

