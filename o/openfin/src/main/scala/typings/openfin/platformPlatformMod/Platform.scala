package typings.openfin.platformPlatformMod

import typings.openfin.baseMod.EmitterBase
import typings.openfin.clientMod.ChannelClient
import typings.openfin.identityMod.Identity
import typings.openfin.interappbusChannelMod.Channel
import typings.openfin.platformMod.PlatformEvents
import typings.openfin.viewViewMod.View
import typings.openfin.viewViewMod.ViewCreationOptions
import typings.openfin.windowOptionMod.WindowOption
import typings.openfin.windowWindowMod.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/platform/platform", "Platform")
@js.native
class Platform protected () extends EmitterBase[PlatformEvents] {
  def this(identity: Identity, channel: Channel) = this()
  var Layout: typings.openfin.layoutMod.default = js.native
  var _channel: js.Any = js.native
  @JSName("onWindowContextUpdate")
  var onWindowContextUpdate_Original: js.Function1[
    /* listener */ js.Function2[/* newContext */ js.Any, /* oldContext */ js.UndefOr[js.Any], _], 
    js.Promise[Boolean]
  ] = js.native
  def applySnapshot(requestedSnapshot: String): js.Promise[Platform] = js.native
  def applySnapshot(requestedSnapshot: String, options: ApplySnapshotOptions): js.Promise[Platform] = js.native
  /**
    * Adds a snapshot to a running Platform.
    *
    * Can optionally close existing windows and overwrite current platform state with that of a snapshot.
    *
    * The function accepts either a snapshot taken using {@link Platform#getSnapshot getSnapshot},
    * or a url or filepath to a snapshot JSON object.
    * @param { Snapshot | string } requestedSnapshot Snapshot to apply, or a url or filepath.
    * @param { ApplySnapshotOptions } [options] Optional parameters to specify whether existing windows should be closed.
    * @return { Promise<Platform> }
    * @tutorial Platform.applySnapshot
    */
  def applySnapshot(requestedSnapshot: Snapshot): js.Promise[Platform] = js.native
  def applySnapshot(requestedSnapshot: Snapshot, options: ApplySnapshotOptions): js.Promise[Platform] = js.native
  /**
    * Closes a specified view in a target window.
    * @param { Identity } viewIdentity View identity
    * @return { Promise<void> }
    * @tutorial Platform.closeView
    */
  def closeView(viewIdentity: Identity): js.Promise[Unit] = js.native
  /**
    * Creates a new view and attaches it to a specified target window.
    * @param { View~options } viewOptions View creation options
    * @param { Identity } [target] The window to which the new view is to be attached. If no target, create a view in a new window.
    * @return { Promise<View> }
    * @tutorial Platform.createView
    */
  def createView(viewOptions: ViewCreationOptions): js.Promise[View] = js.native
  def createView(viewOptions: ViewCreationOptions, target: Identity): js.Promise[View] = js.native
  /**
    * Creates a new Window.
    * @param { Window~options } options Window creation options
    * @return { Promise<_Window> }
    * @tutorial Platform.createWindow
    */
  def createWindow(options: WindowOption): js.Promise[Window with Identity] = js.native
  def getClient(): js.Promise[ChannelClient] = js.native
  def getClient(identity: Identity): js.Promise[ChannelClient] = js.native
  /**
    * Get the context of your current window or view environment that was previously set using {@link Platform#setContext setContext}.
    * The context will be saved in any platform snapshots.  Returns a promise that resolves to the context.
    * @return {Promise<any>}
    * @tutorial Platform.getContext
    * @experimental
    */
  def getContext(): js.Promise[_] = js.native
  /**
    * Returns a snapshot of the platform in its current state.
    *
    * Can be used to restore an application to a previous state.
    * @return { Promise<Snapshot> }
    * @tutorial Platform.getSnapshot
    */
  def getSnapshot(): js.Promise[Snapshot] = js.native
  /**
    * Retrieves a manifest by url and launches a legacy application manifest or snapshot into the platform.  Returns a promise that
    * resolves to the wrapped Platform.
    * @param {string} [manifestUrl] - The URL of the manifest of the app to launch into the platform.  If this app manifest
    * contains a snapshot, that will be launched into the platform.  If not, the application described in startup_app options
    * will be launched into the platform. The applicable startup_app options will become {@link View~options View Options}.
    * @return {Promise<Platform>}
    * @tutorial Platform.launchLegacyManifest
    * @experimental
    */
  def launchLegacyManifest(): js.Promise[Platform] = js.native
  def launchLegacyManifest(manifestUrl: String): js.Promise[Platform] = js.native
  def onWindowContextUpdate(listener: js.Function2[/* newContext */ js.Any, /* oldContext */ js.UndefOr[js.Any], _]): js.Promise[Boolean] = js.native
  /**
    * Set a listener to be executed when the when a View's target Window experiences a context update. Can only be set from a view that
    * has wrapped it's current platform. The listener receives the new context as its first argument and the previously context as the
    * second argument.  If the listener returns a truthy value, the View's context will be updated with the new context as if
    * {@link Platform#setContext setContext} was called.  This can only be set once per javascript environment (once per View), and any
    * subsequent calls to onWindowContextUpdated will error out.  If the listener is successfully set, returns a promise that resolves to
    * true.
    * @return {Promise.<boolean>}
    * @tutorial Platform.onWindowContextUpdated
    * @experimental
    */
  def onWindowContextUpdated(listener: js.Function2[/* newContext */ js.Any, /* oldContext */ js.UndefOr[js.Any], _]): js.Promise[Boolean] = js.native
  /**
    * Closes current platform, all its windows, and their views.
    * @return { Promise<void> }
    * @tutorial Platform.quit
    */
  def quit(): js.Promise[Unit] = js.native
  /**
    * Reparents a specified view in a new target window.
    * @param { Identity } viewIdentity View identity
    * @param { Identity } target new owner window identity
    * @return { Promise<View> }
    * @tutorial Platform.reparentView
    */
  def reparentView(viewIdentity: Identity, target: Identity): js.Promise[View] = js.native
  /**
    * Set the context of your current window or view environment.  The context will be saved in any platform snapshots.
    * @param {any} context - A field where serializable context data can be stored to be saved in platform snapshots.
    * @return {Promise<void>}
    * @tutorial Platform.setContext
    * @experimental
    */
  def setContext(): js.Promise[Unit] = js.native
  def setContext(context: js.Any): js.Promise[Unit] = js.native
}

