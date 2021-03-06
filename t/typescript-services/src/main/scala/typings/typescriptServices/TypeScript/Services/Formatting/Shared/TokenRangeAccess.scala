package typings.typescriptServices.TypeScript.Services.Formatting.Shared

import typings.typescriptServices.TypeScript.SyntaxKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenRangeAccess extends ITokenAccess {
  var tokens: js.Any
}

object TokenRangeAccess {
  @scala.inline
  def apply(Contains: SyntaxKind => Boolean, GetTokens: () => js.Array[SyntaxKind], tokens: js.Any): TokenRangeAccess = {
    val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), GetTokens = js.Any.fromFunction0(GetTokens), tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenRangeAccess]
  }
}

