package typings.reactLazylog

import typings.react.mod.Component
import typings.reactLazylog.anon.PartialLazyLogProps
import typings.reactLazylog.scrollFollowMod.ScrollFollowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-lazylog", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class LazyLog ()
    extends typings.reactLazylog.lazyLogMod.LazyLog
  
  @js.native
  class ScrollFollow ()
    extends Component[ScrollFollowProps, js.Object, js.Any]
  
  /* static members */
  @js.native
  object LazyLog extends js.Object {
    var defaultProps: PartialLazyLogProps = js.native
  }
  
}

