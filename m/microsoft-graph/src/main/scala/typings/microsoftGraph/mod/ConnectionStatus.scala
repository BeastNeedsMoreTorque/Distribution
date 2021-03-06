package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.failed_
import typings.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.unknown_
  - typings.microsoftGraph.microsoftGraphStrings.attempted
  - typings.microsoftGraph.microsoftGraphStrings.succeeded
  - typings.microsoftGraph.microsoftGraphStrings.blocked
  - typings.microsoftGraph.microsoftGraphStrings.failed_
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait ConnectionStatus extends js.Object

object ConnectionStatus {
  @scala.inline
  def attempted: typings.microsoftGraph.microsoftGraphStrings.attempted = "attempted".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.attempted]
  @scala.inline
  def blocked: typings.microsoftGraph.microsoftGraphStrings.blocked = "blocked".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.blocked]
  @scala.inline
  def failed: failed_ = "failed".asInstanceOf[failed_]
  @scala.inline
  def succeeded: typings.microsoftGraph.microsoftGraphStrings.succeeded = "succeeded".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.succeeded]
  @scala.inline
  def unknown: unknown_ = "unknown".asInstanceOf[unknown_]
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = "unknownFutureValue".asInstanceOf[typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue]
}

