package typings.extjs.Ext.layout

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClassList extends IBase {
  /** [Method] Adds a single class to the class list
    * @param cls Object
    */
  var add: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Adds one or more classes in an array or space delimited string to the class list
    * @param classes Object
    */
  var addMany: js.UndefOr[js.Function1[/* classes */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Removes a single class from the class list
    * @param cls Object
    */
  var remove: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Removes one or more classes in an array or space delimited string from the class list
    * @param classes Object
    */
  var removeMany: js.UndefOr[js.Function1[/* classes */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IClassList {
  @scala.inline
  def apply(
    add: /* cls */ js.UndefOr[js.Any] => Unit = null,
    addMany: /* classes */ js.UndefOr[js.Any] => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    extend: String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IClassList = null,
    mixins: js.Any = null,
    remove: /* cls */ js.UndefOr[js.Any] => Unit = null,
    removeMany: /* classes */ js.UndefOr[js.Any] => Unit = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IClassList = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1(add))
    if (addMany != null) __obj.updateDynamic("addMany")(js.Any.fromFunction1(addMany))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (removeMany != null) __obj.updateDynamic("removeMany")(js.Any.fromFunction1(removeMany))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClassList]
  }
}

