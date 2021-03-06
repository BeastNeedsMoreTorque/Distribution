package typings.docxTemplates

import typings.docxTemplates.docxTemplatesStrings.JS
import typings.docxTemplates.docxTemplatesStrings.XML
import typings.docxTemplates.typesMod.CommandSummary
import typings.docxTemplates.typesMod.Node
import typings.docxTemplates.typesMod.NonTextNode
import typings.docxTemplates.typesMod.UserOptions
import typings.jszip.mod.JSZip
import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("docx-templates/lib/main", JSImport.Namespace)
@js.native
object mainMod extends js.Object {
  /**
    * Create Report from docx template
    *
    * example:
    * ```js
    * const report = await createReport({
    *   template,
    *   data: query => graphqlServer.execute(query),
    *   additionalJsContext: {
    *     // all of these will be available to JS snippets in your template commands
    *     foo: 'bar',
    *     qrCode: async url => {
    *       // do stuff
    *     },
    *   },
    *   cmdDelimiter: '+++',
    *   literalXmlDelimiter: '||',
    *   processLineBreaks: true,
    *   noSandbox: false,
    * });
    * ```
    *
    * @param options Options for Report
    */
  def default(options: UserOptions): js.Promise[Uint8Array] = js.native
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  @JSName("default")
  def default_JS(options: UserOptions, _probe: JS): js.Promise[Node] = js.native
  /**
    * For development and testing purposes. Don't use _probe if you don't know what you are doing
    */
  @JSName("default")
  def default_XML(options: UserOptions, _probe: XML): js.Promise[String] = js.native
  def getMainDoc(contentTypes: NonTextNode): String = js.native
  def listCommands(template: Buffer): js.Promise[js.Array[CommandSummary]] = js.native
  def listCommands(template: Buffer, delimiter: String): js.Promise[js.Array[CommandSummary]] = js.native
  def listCommands(template: Buffer, delimiter: js.Tuple2[String, String]): js.Promise[js.Array[CommandSummary]] = js.native
  def readContentTypes(zip: JSZip): js.Promise[NonTextNode] = js.native
}

