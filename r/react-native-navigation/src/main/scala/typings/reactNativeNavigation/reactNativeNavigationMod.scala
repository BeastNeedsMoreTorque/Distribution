package typings.reactNativeNavigation

import typings.reactNativeNavigation.commandsObserverMod.CommandsObserver
import typings.reactNativeNavigation.componentEventsObserverMod.ComponentEventsObserver
import typings.reactNativeNavigation.constantsMod.NavigationConstants
import typings.reactNativeNavigation.nativeEventsReceiverMod.NativeEventsReceiver
import typings.reactNativeNavigation.navigationMod.NavigationRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation", JSImport.Namespace)
@js.native
object reactNativeNavigationMod extends js.Object {
  @js.native
  class Constants protected ()
    extends typings.reactNativeNavigation.constantsMod.Constants
  
  @js.native
  class EventsRegistry protected ()
    extends typings.reactNativeNavigation.eventsRegistryMod.EventsRegistry {
    def this(
      nativeEventsReceiver: NativeEventsReceiver,
      commandsObserver: CommandsObserver,
      componentEventsObserver: ComponentEventsObserver
    ) = this()
  }
  
  @js.native
  class NavigationComponent[Props, State, Snapshot] ()
    extends typings.reactNativeNavigation.navigationComponentMod.NavigationComponent[Props, State, Snapshot]
  
  val Navigation: NavigationRoot = js.native
  /* static members */
  @js.native
  object Constants extends js.Object {
    def get(): js.Promise[NavigationConstants] = js.native
  }
  
  @js.native
  object OptionsModalPresentationStyle extends js.Object {
    /* "currentContext" */ val currentContext: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.currentContext with String = js.native
    /* "formSheet" */ val formSheet: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.formSheet with String = js.native
    /* "fullScreen" */ val fullScreen: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.fullScreen with String = js.native
    /* "none" */ val none: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.none with String = js.native
    /* "overCurrentContext" */ val overCurrentContext: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.overCurrentContext with String = js.native
    /* "overFullScreen" */ val overFullScreen: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.overFullScreen with String = js.native
    /* "pageSheet" */ val pageSheet: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.pageSheet with String = js.native
    /* "popover" */ val popover: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.popover with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle with String
      ] = js.native
  }
  
  @js.native
  object OptionsModalTransitionStyle extends js.Object {
    /* "coverVertical" */ val coverVertical: typings.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.coverVertical with String = js.native
    /* "crossDissolve" */ val crossDissolve: typings.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.crossDissolve with String = js.native
    /* "flipHorizontal" */ val flipHorizontal: typings.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.flipHorizontal with String = js.native
    /* "partialCurl" */ val partialCurl: typings.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.partialCurl with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle with String] = js.native
  }
  
}

