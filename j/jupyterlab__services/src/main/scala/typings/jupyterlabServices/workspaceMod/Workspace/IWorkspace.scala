package typings.jupyterlabServices.workspaceMod.Workspace

import typings.jupyterlabServices.anon.Id
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface describing a workspace API response.
  */
trait IWorkspace extends js.Object {
  /**
    * The workspace data.
    */
  var data: ReadonlyPartialJSONObject
  /**
    * The metadata for a workspace.
    */
  var metadata: Id
}

object IWorkspace {
  @scala.inline
  def apply(data: ReadonlyPartialJSONObject, metadata: Id): IWorkspace = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWorkspace]
  }
}

