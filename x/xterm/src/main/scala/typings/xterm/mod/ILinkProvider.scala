package typings.xterm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A custom link provider.
  */
trait ILinkProvider extends js.Object {
  /**
    * Provides a link a buffer position
    * @param bufferLineNumber The y position of the buffer to check for links
    * within.
    * @param callback The callback to be fired when ready with the resulting
    * link(s) for the line or `undefined`.
    */
  def provideLinks(bufferLineNumber: Double, callback: js.Function1[/* links */ js.UndefOr[js.Array[ILink]], Unit]): Unit
}

object ILinkProvider {
  @scala.inline
  def apply(provideLinks: (Double, js.Function1[/* links */ js.UndefOr[js.Array[ILink]], Unit]) => Unit): ILinkProvider = {
    val __obj = js.Dynamic.literal(provideLinks = js.Any.fromFunction2(provideLinks))
    __obj.asInstanceOf[ILinkProvider]
  }
}

