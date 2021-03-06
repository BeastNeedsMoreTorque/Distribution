package typings.jupyterlabNbformat.mod

import typings.luminoCoreutils.jsonMod.PartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotebookContent extends PartialJSONObject {
  var cells: js.Array[ICell]
  var metadata: INotebookMetadata
  var nbformat: Double
  var nbformat_minor: Double
}

object INotebookContent {
  @scala.inline
  def apply(cells: js.Array[ICell], metadata: INotebookMetadata, nbformat: Double, nbformat_minor: Double): INotebookContent = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], nbformat = nbformat.asInstanceOf[js.Any], nbformat_minor = nbformat_minor.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotebookContent]
  }
}

