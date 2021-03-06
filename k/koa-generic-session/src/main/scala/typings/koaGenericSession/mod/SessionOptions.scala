package typings.koaGenericSession.mod

import typings.koa.mod.Context
import typings.koaGenericSession.anon.HttpOnly
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionOptions extends js.Object {
  var allowEmpty: js.UndefOr[Boolean] = js.undefined
  var beforeSave: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ Session, Unit]] = js.undefined
  var cookie: js.UndefOr[HttpOnly] = js.undefined
  var defer: js.UndefOr[Boolean] = js.undefined
  var errorHandler: js.UndefOr[js.Function3[/* error */ Error, /* type */ String, /* ctx */ Context, Unit]] = js.undefined
  var genSid: js.UndefOr[js.Function1[/* length */ Double, String]] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var reconnectTimeout: js.UndefOr[Double] = js.undefined
  var rolling: js.UndefOr[Boolean] = js.undefined
  var sessionIdStore: js.UndefOr[SessionIdStore] = js.undefined
  var store: js.UndefOr[SessionStore] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
  var valid: js.UndefOr[js.Function2[/* ctx */ Context, /* session */ Session, Boolean]] = js.undefined
}

object SessionOptions {
  @scala.inline
  def apply(
    allowEmpty: js.UndefOr[Boolean] = js.undefined,
    beforeSave: (/* ctx */ Context, /* session */ Session) => Unit = null,
    cookie: HttpOnly = null,
    defer: js.UndefOr[Boolean] = js.undefined,
    errorHandler: (/* error */ Error, /* type */ String, /* ctx */ Context) => Unit = null,
    genSid: /* length */ Double => String = null,
    key: String = null,
    prefix: String = null,
    reconnectTimeout: js.UndefOr[Double] = js.undefined,
    rolling: js.UndefOr[Boolean] = js.undefined,
    sessionIdStore: SessionIdStore = null,
    store: SessionStore = null,
    ttl: js.UndefOr[Double] = js.undefined,
    valid: (/* ctx */ Context, /* session */ Session) => Boolean = null
  ): SessionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty.get.asInstanceOf[js.Any])
    if (beforeSave != null) __obj.updateDynamic("beforeSave")(js.Any.fromFunction2(beforeSave))
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.get.asInstanceOf[js.Any])
    if (errorHandler != null) __obj.updateDynamic("errorHandler")(js.Any.fromFunction3(errorHandler))
    if (genSid != null) __obj.updateDynamic("genSid")(js.Any.fromFunction1(genSid))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnectTimeout)) __obj.updateDynamic("reconnectTimeout")(reconnectTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rolling)) __obj.updateDynamic("rolling")(rolling.get.asInstanceOf[js.Any])
    if (sessionIdStore != null) __obj.updateDynamic("sessionIdStore")(sessionIdStore.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    if (valid != null) __obj.updateDynamic("valid")(js.Any.fromFunction2(valid))
    __obj.asInstanceOf[SessionOptions]
  }
}

