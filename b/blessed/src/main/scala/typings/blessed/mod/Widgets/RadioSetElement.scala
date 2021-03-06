package typings.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An element wrapping RadioButtons. RadioButtons within this element will be mutually exclusive
  * with each other.
  */
@JSImport("blessed", "Widgets.RadioSetElement")
@js.native
abstract class RadioSetElement protected () extends BoxElement {
  def this(opts: RadioSetOptions) = this()
}

