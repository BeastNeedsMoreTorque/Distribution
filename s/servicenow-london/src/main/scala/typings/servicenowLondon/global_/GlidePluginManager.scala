package typings.servicenowLondon.global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GlidePluginManager")
@js.native
class GlidePluginManager ()
  extends typings.servicenowLondon.GlidePluginManager {
  /**
    * Determines if the specified plugin has been activated.
    *
    * @param pluginId The plugin ID
    * @returns True if the plugin has been activated.
    * @example
    *
    * var gr = new GlideRecord('sys_plugins');
    * var queryString = "active=0^ORactive=1";
    * gr.addEncodedQuery(queryString);
    * gr.query();
    * pMgr = new GlidePluginManager();
    * while (gr.next()) {
    *   var name = gr.getValue('name');
    *   var pID = gr.getValue('source');
    *   isActive = pMgr.isActive(pID);
    *   if (isActive)
    *     gs.info('The plugin ' + name + " is  active"  );
    * }
    * // The plugin Country Lookup Data is active
    * // The plugin Database Replication is active
    * // The plugin REST API Provider is active
    * // The plugin Ten Cool Things is active
    * // ...
    */
  /* CompleteClass */
  override def isActive(pluginId: String): Boolean = js.native
}

