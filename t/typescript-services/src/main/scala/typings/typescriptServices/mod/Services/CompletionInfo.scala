package typings.typescriptServices.mod.Services

import typings.typescriptServices.TypeScript.Services.CompletionEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.CompletionInfo")
@js.native
class CompletionInfo ()
  extends typings.typescriptServices.TypeScript.Services.CompletionInfo {
  /* CompleteClass */
  override var entries: js.Array[CompletionEntry] = js.native
  /* CompleteClass */
  override var isMemberCompletion: Boolean = js.native
  /* CompleteClass */
  override var maybeInaccurate: Boolean = js.native
}

