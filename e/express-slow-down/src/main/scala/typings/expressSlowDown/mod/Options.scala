package typings.expressSlowDown.mod

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * express-slow-down options
  */
trait Options extends js.Object {
  /**
    * Max number of connections during `windowMs` before starting to delay responses.
    * Defaults to `1`. Set to `0` to disable delaying.
    */
  var delayAfter: js.UndefOr[Double] = js.undefined
  /**
    * How long to delay the response, multiplied by `(number recent hits - delayAfter)`.
    * Defaults to `1000` (1 second). Set to `0` to disable delaying.
    */
  var delayMs: js.UndefOr[Double] = js.undefined
  /**
    * Function used to generate keys. By default user IP address (`req.ip`) is used.
    * Default: `(req, res) => req.ip`
    */
  var keyGenerator: js.UndefOr[
    js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], String]
  ] = js.undefined
  /**
    * Maximum value for `delayMs` after many consecutive attempts, that is, after the n-th request,
    * the delay will be always `maxDelayMs`. Important when your application is running behind a
    * load balancer or reverse proxy that has a request timeout. Defaults to Infinity.
    */
  var maxDelayMs: js.UndefOr[Double] = js.undefined
  /**
    * Function to execute the first time the limit is reached within `windowMs`.
    * Default: `(req, res, opts) => {}`
    */
  var onLimitReached: js.UndefOr[
    js.Function3[
      /* req */ RequestWithSlowDown, 
      /* res */ Response_[_], 
      /* optionsUsed */ this.type, 
      Unit
    ]
  ] = js.undefined
  /**
    * Function used to skip requests. Returning `true` from the function will skip delaying for that request.
    * Default: `(req, res) => false`
    */
  var skip: js.UndefOr[
    js.Function2[/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_], Boolean]
  ] = js.undefined
  /**
    * When `true` failed requests (response status >= 400) won't be counted. Defaults to `false`.
    */
  var skipFailedRequests: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true` successful requests (response status < 400) won't be counted. Defaults to `false`.
    */
  var skipSuccessfulRequests: js.UndefOr[Boolean] = js.undefined
  /**
    * The storage to use when persisting request attempts. By default, the MemoryStore is used.
    */
  var store: js.UndefOr[Store] = js.undefined
  /**
    * How long to keep records of requests in memory. Defaults to `60000` (1 minute)
    */
  var windowMs: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    delayAfter: js.UndefOr[Double] = js.undefined,
    delayMs: js.UndefOr[Double] = js.undefined,
    keyGenerator: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_]) => String = null,
    maxDelayMs: js.UndefOr[Double] = js.undefined,
    onLimitReached: (/* req */ RequestWithSlowDown, /* res */ Response_[_], Options) => Unit = null,
    skip: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response_[_]) => Boolean = null,
    skipFailedRequests: js.UndefOr[Boolean] = js.undefined,
    skipSuccessfulRequests: js.UndefOr[Boolean] = js.undefined,
    store: Store = null,
    windowMs: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delayAfter)) __obj.updateDynamic("delayAfter")(delayAfter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(delayMs)) __obj.updateDynamic("delayMs")(delayMs.get.asInstanceOf[js.Any])
    if (keyGenerator != null) __obj.updateDynamic("keyGenerator")(js.Any.fromFunction2(keyGenerator))
    if (!js.isUndefined(maxDelayMs)) __obj.updateDynamic("maxDelayMs")(maxDelayMs.get.asInstanceOf[js.Any])
    if (onLimitReached != null) __obj.updateDynamic("onLimitReached")(js.Any.fromFunction3(onLimitReached))
    if (skip != null) __obj.updateDynamic("skip")(js.Any.fromFunction2(skip))
    if (!js.isUndefined(skipFailedRequests)) __obj.updateDynamic("skipFailedRequests")(skipFailedRequests.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipSuccessfulRequests)) __obj.updateDynamic("skipSuccessfulRequests")(skipSuccessfulRequests.get.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (!js.isUndefined(windowMs)) __obj.updateDynamic("windowMs")(windowMs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

