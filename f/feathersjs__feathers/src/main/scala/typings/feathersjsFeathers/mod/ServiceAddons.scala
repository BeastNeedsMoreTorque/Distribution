package typings.feathersjsFeathers.mod

import typings.feathersjsFeathers.anon.PartialHooksObject
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceAddons[T] extends EventEmitter {
  def hooks(hooks: PartialHooksObject): this.type = js.native
}

