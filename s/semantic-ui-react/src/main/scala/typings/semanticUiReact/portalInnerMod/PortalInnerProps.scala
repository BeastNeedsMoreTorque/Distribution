package typings.semanticUiReact.portalInnerMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortalInnerProps
  extends StrictPortalInnerProps
     with /* key */ StringDictionary[js.Any]

object PortalInnerProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    children: ReactNode = null,
    innerRef: js.UndefOr[Null | Ref[_]] = js.undefined,
    mountNode: js.Any = null,
    onMount: (/* nothing */ Null, /* data */ PortalInnerProps) => Unit = null,
    onUnmount: (/* nothing */ Null, /* data */ PortalInnerProps) => Unit = null
  ): PortalInnerProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(innerRef)) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (onMount != null) __obj.updateDynamic("onMount")(js.Any.fromFunction2(onMount))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction2(onUnmount))
    __obj.asInstanceOf[PortalInnerProps]
  }
}

