package typings.pino.mod

import org.scalablytyped.runtime.StringDictionary
import typings.pino.anon.AsObject
import typings.pino.anon.LogMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptions extends js.Object {
  /**
    * key-value object added as child logger to each log line. If set to null the base child logger is not added
    */
  var base: js.UndefOr[StringDictionary[js.Any] | Null] = js.undefined
  /**
    * Browser only, see http://getpino.io/#/docs/browser.
    */
  var browser: js.UndefOr[AsObject] = js.undefined
  /**
    * (DEPRECATED, use `levelKey`) Changes the property `level` to any string value you pass in. Default: 'level'
    */
  var changeLevelName: js.UndefOr[String] = js.undefined
  /**
    * Use this option to define additional logging levels.
    * The keys of the object correspond the namespace of the log level, and the values should be the numerical value of the level.
    */
  var customLevels: js.UndefOr[StringDictionary[Double]] = js.undefined
  /**
    * Enables logging. Default: `true`.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * An object containing functions for formatting the shape of the log lines.
    * These functions should return a JSONifiable object and should never throw.
    * These functions allow for full customization of the resulting log lines.
    * For example, they can be used to change the level key name or to enrich the default metadata.
    */
  var formatters: js.UndefOr[typings.pino.anon.Bindings] = js.undefined
  /**
    * An object mapping to hook functions. Hook functions allow for customizing internal logger operations.
    * Hook functions must be synchronous functions.
    */
  var hooks: js.UndefOr[LogMethod] = js.undefined
  /**
    * One of the supported levels or `silent` to disable logging. Any other value defines a custom level and
    * requires supplying a level value via `levelVal`. Default: 'info'.
    */
  var level: js.UndefOr[LevelWithSilent | String] = js.undefined
  /**
    * Changes the property `level` to any string value you pass in. Default: 'level'
    */
  var levelKey: js.UndefOr[String] = js.undefined
  /**
    * When defining a custom log level via level, set to an integer value to define the new level. Default: `undefined`.
    */
  var levelVal: js.UndefOr[Double] = js.undefined
  /**
    * The string key for the 'message' in the JSON object. Default: "msg".
    */
  var messageKey: js.UndefOr[String] = js.undefined
  /**
    * If provided, the `mixin` function is called each time one of the active logging methods
    * is called. The function must synchronously return an object. The properties of the
    * returned object will be added to the logged JSON.
    */
  var mixin: js.UndefOr[MixinFn] = js.undefined
  /**
    * The name of the logger. Default: `undefined`.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The string key to place any logged object under.
    */
  var nestedKey: js.UndefOr[String] = js.undefined
  /**
    * This function will be invoked during process shutdown when `extreme` is set to `true`. If you do not specify
    * a function, Pino will invoke `process.exit(0)` when no error has occurred, and `process.exit(1)` otherwise.
    * If you do specify a function, it is up to you to terminate the process; you must perform only synchronous
    * operations at this point. See http://getpino.io/#/docs/extreme for more detail.
    */
  var onTerminated: js.UndefOr[js.Function2[/* eventName */ String, /* err */ js.Any, Unit]] = js.undefined
  /**
    * Allows to optionally define which prettifier module to use.
    */
  // TODO: use type definitions from 'pino-pretty' when available.
  var prettifier: js.UndefOr[js.Any] = js.undefined
  /**
    * Enables pino.pretty. This is intended for non-production configurations. This may be set to a configuration
    * object as outlined in http://getpino.io/#/docs/API?id=pretty. Default: `false`.
    */
  var prettyPrint: js.UndefOr[Boolean | PrettyOptions] = js.undefined
  /**
    * As an array, the redact option specifies paths that should have their values redacted from any log output.
    *
    * Each path must be a string using a syntax which corresponds to JavaScript dot and bracket notation.
    *
    * If an object is supplied, three options can be specified:
    *
    *      paths (String[]): Required. An array of paths
    *      censor (String): Optional. A value to overwrite key which are to be redacted. Default: '[Redacted]'
    *      remove (Boolean): Optional. Instead of censoring the value, remove both the key and the value. Default: false
    */
  var redact: js.UndefOr[js.Array[String] | redactOptions] = js.undefined
  /**
    * Avoid error causes by circular references in the object tree. Default: `true`.
    */
  var safe: js.UndefOr[Boolean] = js.undefined
  /**
    * an object containing functions for custom serialization of objects.
    * These functions should return an JSONifiable object and they should never throw. When logging an object,
    * each top-level property matching the exact key of a serializer will be serialized using the defined serializer.
    */
  var serializers: js.UndefOr[StringDictionary[SerializerFn]] = js.undefined
  /**
    * Enables or disables the inclusion of a timestamp in the log message. If a function is supplied, it must
    * synchronously return a JSON string representation of the time. If set to `false`, no timestamp will be included in the output.
    * See stdTimeFunctions for a set of available functions for passing in as a value for this option.
    * Caution: any sort of formatted time will significantly slow down Pino's performance.
    */
  var timestamp: js.UndefOr[TimeFn | Boolean] = js.undefined
  /**
    * Outputs the level as a string instead of integer. Default: `false`.
    */
  var useLevelLabels: js.UndefOr[Boolean] = js.undefined
  /**
    * Use this option to only use defined `customLevels` and omit Pino's levels.
    * Logger's default `level` must be changed to a value in `customLevels` in order to use `useOnlyCustomLevels`
    * Warning: this option may not be supported by downstream transports.
    */
  var useOnlyCustomLevels: js.UndefOr[Boolean] = js.undefined
}

object LoggerOptions {
  @scala.inline
  def apply(
    base: js.UndefOr[Null | StringDictionary[js.Any]] = js.undefined,
    browser: AsObject = null,
    changeLevelName: String = null,
    customLevels: StringDictionary[Double] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    formatters: typings.pino.anon.Bindings = null,
    hooks: LogMethod = null,
    level: LevelWithSilent | String = null,
    levelKey: String = null,
    levelVal: js.UndefOr[Double] = js.undefined,
    messageKey: String = null,
    mixin: () => js.Object = null,
    name: String = null,
    nestedKey: String = null,
    onTerminated: (/* eventName */ String, /* err */ js.Any) => Unit = null,
    prettifier: js.Any = null,
    prettyPrint: Boolean | PrettyOptions = null,
    redact: js.Array[String] | redactOptions = null,
    safe: js.UndefOr[Boolean] = js.undefined,
    serializers: StringDictionary[SerializerFn] = null,
    timestamp: TimeFn | Boolean = null,
    useLevelLabels: js.UndefOr[Boolean] = js.undefined,
    useOnlyCustomLevels: js.UndefOr[Boolean] = js.undefined
  ): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(base)) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (changeLevelName != null) __obj.updateDynamic("changeLevelName")(changeLevelName.asInstanceOf[js.Any])
    if (customLevels != null) __obj.updateDynamic("customLevels")(customLevels.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (formatters != null) __obj.updateDynamic("formatters")(formatters.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (levelKey != null) __obj.updateDynamic("levelKey")(levelKey.asInstanceOf[js.Any])
    if (!js.isUndefined(levelVal)) __obj.updateDynamic("levelVal")(levelVal.get.asInstanceOf[js.Any])
    if (messageKey != null) __obj.updateDynamic("messageKey")(messageKey.asInstanceOf[js.Any])
    if (mixin != null) __obj.updateDynamic("mixin")(js.Any.fromFunction0(mixin))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nestedKey != null) __obj.updateDynamic("nestedKey")(nestedKey.asInstanceOf[js.Any])
    if (onTerminated != null) __obj.updateDynamic("onTerminated")(js.Any.fromFunction2(onTerminated))
    if (prettifier != null) __obj.updateDynamic("prettifier")(prettifier.asInstanceOf[js.Any])
    if (prettyPrint != null) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (redact != null) __obj.updateDynamic("redact")(redact.asInstanceOf[js.Any])
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe.get.asInstanceOf[js.Any])
    if (serializers != null) __obj.updateDynamic("serializers")(serializers.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(useLevelLabels)) __obj.updateDynamic("useLevelLabels")(useLevelLabels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useOnlyCustomLevels)) __obj.updateDynamic("useOnlyCustomLevels")(useOnlyCustomLevels.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerOptions]
  }
}

