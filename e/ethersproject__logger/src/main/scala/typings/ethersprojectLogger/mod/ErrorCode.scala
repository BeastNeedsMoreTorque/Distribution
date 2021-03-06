package typings.ethersprojectLogger.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCode extends js.Object

@JSImport("@ethersproject/logger", "ErrorCode")
@js.native
object ErrorCode extends js.Object {
  @js.native
  sealed trait BUFFER_OVERRUN extends ErrorCode
  
  @js.native
  sealed trait CALL_EXCEPTION extends ErrorCode
  
  @js.native
  sealed trait INSUFFICIENT_FUNDS extends ErrorCode
  
  @js.native
  sealed trait INVALID_ARGUMENT extends ErrorCode
  
  @js.native
  sealed trait MISSING_ARGUMENT extends ErrorCode
  
  @js.native
  sealed trait MISSING_NEW extends ErrorCode
  
  @js.native
  sealed trait NETWORK_ERROR extends ErrorCode
  
  @js.native
  sealed trait NONCE_EXPIRED extends ErrorCode
  
  @js.native
  sealed trait NOT_IMPLEMENTED extends ErrorCode
  
  @js.native
  sealed trait NUMERIC_FAULT extends ErrorCode
  
  @js.native
  sealed trait REPLACEMENT_UNDERPRICED extends ErrorCode
  
  @js.native
  sealed trait SERVER_ERROR extends ErrorCode
  
  @js.native
  sealed trait TIMEOUT extends ErrorCode
  
  @js.native
  sealed trait UNEXPECTED_ARGUMENT extends ErrorCode
  
  @js.native
  sealed trait UNKNOWN_ERROR extends ErrorCode
  
  @js.native
  sealed trait UNPREDICTABLE_GAS_LIMIT extends ErrorCode
  
  @js.native
  sealed trait UNSUPPORTED_OPERATION extends ErrorCode
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ErrorCode with String] = js.native
  /* "BUFFER_OVERRUN" */ @js.native
  object BUFFER_OVERRUN extends TopLevel[BUFFER_OVERRUN with String]
  
  /* "CALL_EXCEPTION" */ @js.native
  object CALL_EXCEPTION extends TopLevel[CALL_EXCEPTION with String]
  
  /* "INSUFFICIENT_FUNDS" */ @js.native
  object INSUFFICIENT_FUNDS extends TopLevel[INSUFFICIENT_FUNDS with String]
  
  /* "INVALID_ARGUMENT" */ @js.native
  object INVALID_ARGUMENT extends TopLevel[INVALID_ARGUMENT with String]
  
  /* "MISSING_ARGUMENT" */ @js.native
  object MISSING_ARGUMENT extends TopLevel[MISSING_ARGUMENT with String]
  
  /* "MISSING_NEW" */ @js.native
  object MISSING_NEW extends TopLevel[MISSING_NEW with String]
  
  /* "NETWORK_ERROR" */ @js.native
  object NETWORK_ERROR extends TopLevel[NETWORK_ERROR with String]
  
  /* "NONCE_EXPIRED" */ @js.native
  object NONCE_EXPIRED extends TopLevel[NONCE_EXPIRED with String]
  
  /* "NOT_IMPLEMENTED" */ @js.native
  object NOT_IMPLEMENTED extends TopLevel[NOT_IMPLEMENTED with String]
  
  /* "NUMERIC_FAULT" */ @js.native
  object NUMERIC_FAULT extends TopLevel[NUMERIC_FAULT with String]
  
  /* "REPLACEMENT_UNDERPRICED" */ @js.native
  object REPLACEMENT_UNDERPRICED extends TopLevel[REPLACEMENT_UNDERPRICED with String]
  
  /* "SERVER_ERROR" */ @js.native
  object SERVER_ERROR extends TopLevel[SERVER_ERROR with String]
  
  /* "TIMEOUT" */ @js.native
  object TIMEOUT extends TopLevel[TIMEOUT with String]
  
  /* "UNEXPECTED_ARGUMENT" */ @js.native
  object UNEXPECTED_ARGUMENT extends TopLevel[UNEXPECTED_ARGUMENT with String]
  
  /* "UNKNOWN_ERROR" */ @js.native
  object UNKNOWN_ERROR extends TopLevel[UNKNOWN_ERROR with String]
  
  /* "UNPREDICTABLE_GAS_LIMIT" */ @js.native
  object UNPREDICTABLE_GAS_LIMIT extends TopLevel[UNPREDICTABLE_GAS_LIMIT with String]
  
  /* "UNSUPPORTED_OPERATION" */ @js.native
  object UNSUPPORTED_OPERATION extends TopLevel[UNSUPPORTED_OPERATION with String]
  
}

