package typings.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleCacheConfigurator extends js.Object {
  // there is an undocumented call signature that is a shorthand for forever()/never()/using().
  // (ever: boolean): void
  // <T extends SimpleCacheKey>(callback: CacheCallback<T>): T
  /**
    * Permacache the computed config and never call the function again.
    */
  def forever(): Unit
  /**
    * Any time the using callback returns a value other than the one that was expected,
    * the overall config function will be called again and all entries in the cache will
    * be replaced with the result.
    *
    * @example
    * api.cache.invalidate(() => process.env.NODE_ENV)
    */
  def invalidate[T /* <: SimpleCacheKey */](callback: SimpleCacheCallback[T]): T
  /**
    * Do not cache this config, and re-execute the function every time.
    */
  def never(): Unit
  /**
    * Any time the using callback returns a value other than the one that was expected,
    * the overall config function will be called again and a new entry will be added to the cache.
    *
    * @example
    * api.cache.using(() => process.env.NODE_ENV)
    */
  def using[T /* <: SimpleCacheKey */](callback: SimpleCacheCallback[T]): T
}

object SimpleCacheConfigurator {
  @scala.inline
  def apply(
    forever: () => Unit,
    invalidate: SimpleCacheCallback[js.Any] => js.Any,
    never: () => Unit,
    using: SimpleCacheCallback[js.Any] => js.Any
  ): SimpleCacheConfigurator = {
    val __obj = js.Dynamic.literal(forever = js.Any.fromFunction0(forever), invalidate = js.Any.fromFunction1(invalidate), never = js.Any.fromFunction0(never), using = js.Any.fromFunction1(using))
    __obj.asInstanceOf[SimpleCacheConfigurator]
  }
}

