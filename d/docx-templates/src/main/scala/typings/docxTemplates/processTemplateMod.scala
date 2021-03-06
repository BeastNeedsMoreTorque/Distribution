package typings.docxTemplates

import org.scalablytyped.runtime.StringDictionary
import typings.docxTemplates.anon.CmdName
import typings.docxTemplates.typesMod.Context
import typings.docxTemplates.typesMod.CreateReportOptions
import typings.docxTemplates.typesMod.Node
import typings.docxTemplates.typesMod.ReportData
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("docx-templates/lib/processTemplate", JSImport.Namespace)
@js.native
object processTemplateMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.docxTemplates.anon.Htmls
    - typings.docxTemplates.anon.Errors
  */
  trait ReportOutput extends js.Object
  
  def extractQuery(template: Node, options: CreateReportOptions): js.Promise[js.UndefOr[String]] = js.native
  def getCommand(command: String, shorthands: StringDictionary[String]): String = js.native
  def produceJsReport(data: js.UndefOr[ReportData], template: Node, options: CreateReportOptions): js.Promise[ReportOutput] = js.native
  def splitCommand(cmd: String): CmdName = js.native
  def walkTemplate(
    data: js.UndefOr[ReportData],
    template: Node,
    options: CreateReportOptions,
    processor: CommandProcessor
  ): js.Promise[ReportOutput] = js.native
  type CommandProcessor = js.Function3[
    /* data */ js.UndefOr[ReportData], 
    /* node */ Node, 
    /* ctx */ Context, 
    js.Promise[js.UndefOr[String | Error]]
  ]
}

