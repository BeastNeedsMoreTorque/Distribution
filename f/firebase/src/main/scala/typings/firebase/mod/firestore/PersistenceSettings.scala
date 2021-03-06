package typings.firebase.mod.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistenceSettings extends js.Object {
  /**
    * Whether to force enable persistence for the client. This cannot be used
    * with `synchronizeTabs:true` and is primarily intended for use with Web
    * Workers. Setting this to `true` will enable persistence, but cause other
    * tabs using persistence to fail.
    *
    * This setting may be removed in a future release. If you find yourself
    * using it for a specific use case or run into any issues, please tell us
    * about it in
    * https://github.com/firebase/firebase-js-sdk/issues/983.
    */
  var experimentalForceOwningTab: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to synchronize the in-memory state of multiple tabs. Setting this
    * to `true` in all open tabs enables shared access to local persistence,
    * shared execution of queries and latency-compensated local document updates
    * across all connected instances.
    *
    * @deprecated This setting is deprecated. To enable synchronization between
    * multiple tabs, please use `synchronizeTabs: true` instead.
    */
  var experimentalTabSynchronization: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to synchronize the in-memory state of multiple tabs. Setting this
    * to `true` in all open tabs enables shared access to local persistence,
    * shared execution of queries and latency-compensated local document updates
    * across all connected instances.
    *
    * To enable this mode, `synchronizeTabs:true` needs to be set globally in all
    * active tabs. If omitted or set to 'false', `enablePersistence()` will fail
    * in all but the first tab.
    */
  var synchronizeTabs: js.UndefOr[Boolean] = js.undefined
}

object PersistenceSettings {
  @scala.inline
  def apply(
    experimentalForceOwningTab: js.UndefOr[Boolean] = js.undefined,
    experimentalTabSynchronization: js.UndefOr[Boolean] = js.undefined,
    synchronizeTabs: js.UndefOr[Boolean] = js.undefined
  ): PersistenceSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(experimentalForceOwningTab)) __obj.updateDynamic("experimentalForceOwningTab")(experimentalForceOwningTab.get.asInstanceOf[js.Any])
    if (!js.isUndefined(experimentalTabSynchronization)) __obj.updateDynamic("experimentalTabSynchronization")(experimentalTabSynchronization.get.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronizeTabs)) __obj.updateDynamic("synchronizeTabs")(synchronizeTabs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistenceSettings]
  }
}

