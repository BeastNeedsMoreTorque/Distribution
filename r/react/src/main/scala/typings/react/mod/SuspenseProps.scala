package typings.react.mod

import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuspenseProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  /** A fallback react tree to show when a Suspense child (like React.lazy) suspends */
  var fallback: NonNullable[ReactNode] | Null
}

object SuspenseProps {
  @scala.inline
  def apply(children: ReactNode = null, fallback: NonNullable[ReactNode] = null): SuspenseProps = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuspenseProps]
  }
}

