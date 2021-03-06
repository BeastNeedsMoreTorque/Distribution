package typings.officeUiFabricReact.keytipDataTypesMod

import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeytipDataProps extends js.Object {
  /**
    * String to add to the aria-describedby generated by this KeytipData
    * It will prepend this string to the generated aria-describedby property
    */
  var ariaDescribedBy: js.UndefOr[String] = js.undefined
  /**
    * T/F if this keytip should be disabled upon creation
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * IKeytipProps to create from this KeytipData
    * If no keytipProps are defined, a keytip won't be registered
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.undefined
}

object IKeytipDataProps {
  @scala.inline
  def apply(
    ariaDescribedBy: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    keytipProps: IKeytipProps = null
  ): IKeytipDataProps = {
    val __obj = js.Dynamic.literal()
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (keytipProps != null) __obj.updateDynamic("keytipProps")(keytipProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeytipDataProps]
  }
}

