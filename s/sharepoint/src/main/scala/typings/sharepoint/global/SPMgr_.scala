package typings.sharepoint.global

import org.scalablytyped.runtime.StringDictionary
import typings.sharepoint.SPClientTemplates.FieldSchema
import typings.sharepoint.SPClientTemplates.ListSchema
import typings.sharepoint.SPClientTemplates.RenderContext
import typings.sharepoint.SPMgr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPMgr")
@js.native
class SPMgr_ () extends SPMgr {
  /* CompleteClass */
  override def NewGroup(listItem: StringDictionary[js.Any], fieldName: String): Boolean = js.native
  /* CompleteClass */
  override def RenderField(
    renderCtx: RenderContext,
    field: FieldSchema,
    listItem: StringDictionary[js.Any],
    listSchema: ListSchema
  ): String = js.native
  /* CompleteClass */
  override def RenderFieldByName(
    renderCtx: RenderContext,
    fieldName: String,
    listItem: StringDictionary[js.Any],
    listSchema: ListSchema
  ): String = js.native
  /* CompleteClass */
  override def RenderHeader(renderCtx: RenderContext, field: FieldSchema): String = js.native
}

