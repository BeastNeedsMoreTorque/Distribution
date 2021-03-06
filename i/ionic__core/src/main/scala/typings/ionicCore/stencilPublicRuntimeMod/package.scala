package typings.ionicCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stencilPublicRuntimeMod {
  type ComponentDecorator = js.Function1[
    /* opts */ js.UndefOr[typings.ionicCore.stencilPublicRuntimeMod.ComponentOptions], 
    typings.std.ClassDecorator
  ]
  type CustomMethodDecorator[T] = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ typings.std.TypedPropertyDescriptor[T], 
    typings.std.TypedPropertyDescriptor[T] | scala.Unit
  ]
  type ElementDecorator = js.Function0[typings.std.PropertyDecorator]
  type EventDecorator = js.Function1[
    /* opts */ js.UndefOr[typings.ionicCore.stencilPublicRuntimeMod.EventOptions], 
    typings.std.PropertyDecorator
  ]
  type FunctionalComponent[T] = js.Function3[
    /* props */ T, 
    /* children */ js.Array[typings.ionicCore.stencilPublicRuntimeMod.VNode], 
    /* utils */ typings.ionicCore.stencilPublicRuntimeMod.FunctionalUtilities, 
    typings.ionicCore.stencilPublicRuntimeMod.VNode | js.Array[typings.ionicCore.stencilPublicRuntimeMod.VNode]
  ]
  type ListenDecorator = js.Function2[
    /* eventName */ java.lang.String, 
    /* opts */ js.UndefOr[typings.ionicCore.stencilPublicRuntimeMod.ListenOptions], 
    typings.ionicCore.stencilPublicRuntimeMod.CustomMethodDecorator[js.Any]
  ]
  type MethodDecorator = js.Function1[
    /* opts */ js.UndefOr[typings.ionicCore.stencilPublicRuntimeMod.MethodOptions], 
    typings.ionicCore.stencilPublicRuntimeMod.CustomMethodDecorator[js.Any]
  ]
  type ModeStyles = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type PropDecorator = js.Function1[
    /* opts */ js.UndefOr[typings.ionicCore.stencilPublicRuntimeMod.PropOptions], 
    typings.std.PropertyDecorator
  ]
  type RafCallback = js.Function1[/* timeStamp */ scala.Double, scala.Unit]
  type ResolutionHandler = js.Function1[/* elm */ typings.std.HTMLElement, js.UndefOr[java.lang.String | scala.Null]]
  type StateDecorator = js.Function0[typings.std.PropertyDecorator]
  type WatchDecorator = js.Function1[
    /* propName */ java.lang.String, 
    typings.ionicCore.stencilPublicRuntimeMod.CustomMethodDecorator[js.Any]
  ]
}
