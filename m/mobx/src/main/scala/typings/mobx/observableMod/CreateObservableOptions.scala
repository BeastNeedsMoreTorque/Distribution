package typings.mobx.observableMod

import typings.mobx.comparerMod.IEqualsComparer
import typings.mobx.observabledecoratorMod.IObservableDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateObservableOptions extends js.Object {
  var deep: js.UndefOr[Boolean] = js.undefined
  var defaultDecorator: js.UndefOr[IObservableDecorator] = js.undefined
  @JSName("equals")
  var equals_FCreateObservableOptions: js.UndefOr[IEqualsComparer[_]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var proxy: js.UndefOr[Boolean] = js.undefined
}

object CreateObservableOptions {
  @scala.inline
  def apply(
    deep: js.UndefOr[Boolean] = js.undefined,
    defaultDecorator: IObservableDecorator = null,
    equals: (_, _) => Boolean = null,
    name: String = null,
    proxy: js.UndefOr[Boolean] = js.undefined
  ): CreateObservableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep.get.asInstanceOf[js.Any])
    if (defaultDecorator != null) __obj.updateDynamic("defaultDecorator")(defaultDecorator.asInstanceOf[js.Any])
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction2(equals))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(proxy)) __obj.updateDynamic("proxy")(proxy.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateObservableOptions]
  }
}

