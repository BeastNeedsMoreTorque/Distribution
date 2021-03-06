package typings.typescriptServices.mod.Services.Formatting

import typings.typescriptServices.TypeScript.Services.Formatting.ITextSnapshot
import typings.typescriptServices.TypeScript.Services.Formatting.ITextSnapshotLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services.Formatting.SnapshotPoint")
@js.native
class SnapshotPoint protected ()
  extends typings.typescriptServices.TypeScript.Services.Formatting.SnapshotPoint {
  def this(snapshot: ITextSnapshot, position: Double) = this()
  /* CompleteClass */
  override var position: Double = js.native
  /* CompleteClass */
  override var snapshot: ITextSnapshot = js.native
  /* CompleteClass */
  override def add(offset: Double): typings.typescriptServices.TypeScript.Services.Formatting.SnapshotPoint = js.native
  /* CompleteClass */
  override def getContainingLine(): ITextSnapshotLine = js.native
}

