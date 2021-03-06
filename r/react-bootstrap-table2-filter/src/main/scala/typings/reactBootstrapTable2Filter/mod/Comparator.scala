package typings.reactBootstrapTable2Filter.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Comparator extends js.Object

@JSImport("react-bootstrap-table2-filter", "Comparator")
@js.native
object Comparator extends js.Object {
  @js.native
  sealed trait EQ extends Comparator
  
  @js.native
  sealed trait GE extends Comparator
  
  @js.native
  sealed trait GT extends Comparator
  
  @js.native
  sealed trait LE extends Comparator
  
  @js.native
  sealed trait LIKE extends Comparator
  
  @js.native
  sealed trait LT extends Comparator
  
  @js.native
  sealed trait NE extends Comparator
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Comparator with String] = js.native
  /* "=" */ @js.native
  object EQ extends TopLevel[EQ with String]
  
  /* ">=" */ @js.native
  object GE extends TopLevel[GE with String]
  
  /* ">" */ @js.native
  object GT extends TopLevel[GT with String]
  
  /* "<=" */ @js.native
  object LE extends TopLevel[LE with String]
  
  /* "LIKE" */ @js.native
  object LIKE extends TopLevel[LIKE with String]
  
  /* "<" */ @js.native
  object LT extends TopLevel[LT with String]
  
  /* "!=" */ @js.native
  object NE extends TopLevel[NE with String]
  
}

