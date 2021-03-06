package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * A symbol item represents an instance of a symbol which has been
  * placed in a Paper.js project.
  */
@js.native
trait SymbolItem extends Item {
  /** 
    * The symbol definition that the placed symbol refers to.
    */
  var definition: SymbolDefinition = js.native
}

