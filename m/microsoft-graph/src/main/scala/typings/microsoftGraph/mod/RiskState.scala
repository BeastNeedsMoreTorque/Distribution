package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.confirmedSafe
  - typings.microsoftGraph.microsoftGraphStrings.remediated
  - typings.microsoftGraph.microsoftGraphStrings.dismissed
  - typings.microsoftGraph.microsoftGraphStrings.atRisk
  - typings.microsoftGraph.microsoftGraphStrings.confirmedCompromised
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait RiskState extends js.Object

object RiskState {
  @scala.inline
  def atRisk: typings.microsoftGraph.microsoftGraphStrings.atRisk = "atRisk".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.atRisk]
  @scala.inline
  def confirmedCompromised: typings.microsoftGraph.microsoftGraphStrings.confirmedCompromised = "confirmedCompromised".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.confirmedCompromised]
  @scala.inline
  def confirmedSafe: typings.microsoftGraph.microsoftGraphStrings.confirmedSafe = "confirmedSafe".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.confirmedSafe]
  @scala.inline
  def dismissed: typings.microsoftGraph.microsoftGraphStrings.dismissed = "dismissed".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.dismissed]
  @scala.inline
  def none: none_ = "none".asInstanceOf[none_]
  @scala.inline
  def remediated: typings.microsoftGraph.microsoftGraphStrings.remediated = "remediated".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.remediated]
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = "unknownFutureValue".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue]
}

