package typings.mocha.global

import org.scalablytyped.runtime.TopLevel
import typings.mocha.Mocha.PendingTestFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a pending test case.
  *
  * - _Only available when invoked via the mocha CLI._
  */
@JSGlobal("xit")
@js.native
object xit extends TopLevel[PendingTestFunction]

