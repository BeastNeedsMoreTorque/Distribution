package typings.activexWord.global.Word

import typings.activexWord.Word.WdProofreadingErrorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.ProofreadingErrors")
@js.native
class ProofreadingErrors protected ()
  extends typings.activexWord.Word.ProofreadingErrors {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Type: WdProofreadingErrorType = js.native
  /* CompleteClass */
  @JSName("Word.ProofreadingErrors_typekey")
  override var WordDotProofreadingErrors_typekey: typings.activexWord.Word.ProofreadingErrors = js.native
  /* CompleteClass */
  override def Item(Index: Double): typings.activexWord.Word.Range = js.native
}

