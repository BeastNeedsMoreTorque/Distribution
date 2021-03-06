package typings.extjs.Ext.data.flash

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBinaryXhr extends IBase {
  /** [Method] Abort this connection  */
  var abort: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] As in XMLHttpRequest  */
  var getAllResponseHeaders: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] As in XMLHttpRequest
    * @param header Object
    */
  var getResponseHeader: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] As in XMLHttpRequest  */
  var onreadystatechange: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] As in XMLHttpRequest
    * @param method Object
    * @param url Object
    * @param async Object
    * @param user Object
    * @param password Object
    */
  var open: js.UndefOr[
    js.Function5[
      /* method */ js.UndefOr[js.Any], 
      /* url */ js.UndefOr[js.Any], 
      /* async */ js.UndefOr[js.Any], 
      /* user */ js.UndefOr[js.Any], 
      /* password */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] As in XMLHttpRequest
    * @param mimeType Object
    */
  var overrideMimeType: js.UndefOr[js.Function1[/* mimeType */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Property] (number) */
  var readyState: js.UndefOr[Double] = js.undefined
  /** [Property] (Array) */
  var responseBytes: js.UndefOr[Array] = js.undefined
  /** [Method] Initiate the request
    * @param body Array an array of byte values to send.
    */
  var send: js.UndefOr[js.Function1[/* body */ js.UndefOr[Array], Unit]] = js.undefined
  /** [Method] As in XMLHttpRequest
    * @param header Object
    * @param value Object
    */
  var setRequestHeader: js.UndefOr[
    js.Function2[/* header */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Property] (number) */
  var status: js.UndefOr[Double] = js.undefined
  /** [Property] (String) */
  var statusText: js.UndefOr[String] = js.undefined
}

object IBinaryXhr {
  @scala.inline
  def apply(
    abort: () => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    extend: String = null,
    getAllResponseHeaders: () => Unit = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getResponseHeader: /* header */ js.UndefOr[js.Any] => Unit = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IBinaryXhr = null,
    mixins: js.Any = null,
    onreadystatechange: () => Unit = null,
    open: (/* method */ js.UndefOr[js.Any], /* url */ js.UndefOr[js.Any], /* async */ js.UndefOr[js.Any], /* user */ js.UndefOr[js.Any], /* password */ js.UndefOr[js.Any]) => Unit = null,
    overrideMimeType: /* mimeType */ js.UndefOr[js.Any] => Unit = null,
    readyState: js.UndefOr[Double] = js.undefined,
    requires: Array = null,
    responseBytes: Array = null,
    self: IClass = null,
    send: /* body */ js.UndefOr[Array] => Unit = null,
    setRequestHeader: (/* header */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any]) => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    status: js.UndefOr[Double] = js.undefined,
    statusText: String = null,
    uses: Array = null
  ): IBinaryXhr = {
    val __obj = js.Dynamic.literal()
    if (abort != null) __obj.updateDynamic("abort")(js.Any.fromFunction0(abort))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getAllResponseHeaders != null) __obj.updateDynamic("getAllResponseHeaders")(js.Any.fromFunction0(getAllResponseHeaders))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getResponseHeader != null) __obj.updateDynamic("getResponseHeader")(js.Any.fromFunction1(getResponseHeader))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (onreadystatechange != null) __obj.updateDynamic("onreadystatechange")(js.Any.fromFunction0(onreadystatechange))
    if (open != null) __obj.updateDynamic("open")(js.Any.fromFunction5(open))
    if (overrideMimeType != null) __obj.updateDynamic("overrideMimeType")(js.Any.fromFunction1(overrideMimeType))
    if (!js.isUndefined(readyState)) __obj.updateDynamic("readyState")(readyState.get.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (responseBytes != null) __obj.updateDynamic("responseBytes")(responseBytes.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (send != null) __obj.updateDynamic("send")(js.Any.fromFunction1(send))
    if (setRequestHeader != null) __obj.updateDynamic("setRequestHeader")(js.Any.fromFunction2(setRequestHeader))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBinaryXhr]
  }
}

