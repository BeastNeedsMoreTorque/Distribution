package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NullOption extends js.Object

/** An enumeration that indicates what to do with null values for a given filter or mark selection call. */
@JSGlobal("tableau.NullOption")
@js.native
object NullOption extends js.Object {
  /** Include null and non-null values in the filter. */
  @js.native
  sealed trait ALL_VALUES extends NullOption
  
  /** Only include non-null values in the filter. */
  @js.native
  sealed trait NON_NULL_VALUES extends NullOption
  
  /** Only include null values in the filter. */
  @js.native
  sealed trait NULL_VALUES extends NullOption
  
}

