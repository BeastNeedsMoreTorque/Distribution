package typings.i18next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function2[/* error */ js.Any, /* t */ typings.i18next.mod.TFunction, scala.Unit]
  type CallbackError = js.UndefOr[typings.std.Error | scala.Null]
  type ExistsFunction[TKeys /* <: java.lang.String */, TInterpolationMap /* <: js.Object */] = js.Function2[
    /* key */ TKeys | js.Array[TKeys], 
    /* options */ js.UndefOr[typings.i18next.mod.TOptions[TInterpolationMap]], 
    scala.Boolean
  ]
  type FallbackLng = java.lang.String | js.Array[java.lang.String] | typings.i18next.mod.FallbackLngObjList
  type FallbackLngObjList = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  type FormatFunction = js.Function3[
    /* value */ js.Any, 
    /* format */ js.UndefOr[java.lang.String], 
    /* lng */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type MultiReadCallback = js.Function2[
    /* err */ typings.i18next.mod.CallbackError, 
    /* data */ typings.i18next.mod.Resource, 
    scala.Unit
  ]
  type ReadCallback = js.Function2[
    /* err */ typings.i18next.mod.CallbackError, 
    /* data */ typings.i18next.mod.ResourceKey | scala.Boolean, 
    scala.Unit
  ]
  type Resource = org.scalablytyped.runtime.StringDictionary[typings.i18next.mod.ResourceLanguage]
  type ResourceKey = java.lang.String | org.scalablytyped.runtime.StringDictionary[js.Any]
  type ResourceLanguage = org.scalablytyped.runtime.StringDictionary[typings.i18next.mod.ResourceKey]
  type StringMap = org.scalablytyped.runtime.StringDictionary[js.Any]
  type TFunctionKeys = java.lang.String | typings.std.TemplateStringsArray
  type TFunctionResult = js.UndefOr[
    java.lang.String | js.Object | (js.Array[java.lang.String | js.Object]) | scala.Null
  ]
  type TOptions[TInterpolationMap /* <: js.Object */] = typings.i18next.mod.TOptionsBase with TInterpolationMap
}
