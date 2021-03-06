package typings.jupyterlabConsole.panelMod.ConsolePanel

import typings.jupyterlabCells.headerfooterMod.ICellFooter
import typings.jupyterlabCells.headerfooterMod.ICellHeader
import typings.jupyterlabCells.inputareaMod.IInputPrompt
import typings.jupyterlabCells.mod.CodeCell
import typings.jupyterlabCells.mod.RawCell
import typings.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typings.jupyterlabConsole.widgetMod.CodeConsole
import typings.jupyterlabOutputarea.widgetMod.IOutputPrompt
import typings.jupyterlabOutputarea.widgetMod.IStdin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default implementation of `IContentFactory`.
  */
@JSImport("@jupyterlab/console/lib/panel", "ConsolePanel.ContentFactory")
@js.native
class ContentFactory ()
  extends typings.jupyterlabConsole.widgetMod.CodeConsole.ContentFactory
     with IContentFactory {
  /**
    * The editor factory we need to include in `CodeEditorWratter.IOptions`.
    *
    * This is a separate readonly attribute rather than a factory method as we need
    * to pass it around.
    */
  /* InferMemberOverrides */
  override val editorFactory: Factory = js.native
  /**
    * Create a new cell header for the parent widget.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createCellFooter(): ICellFooter = js.native
  /**
    * Create a new cell header for the parent widget.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createCellHeader(): ICellHeader = js.native
  /**
    * Create a new code cell widget.
    */
  /* CompleteClass */
  override def createCodeCell(options: typings.jupyterlabCells.widgetMod.CodeCell.IOptions): CodeCell = js.native
  /**
    * Create a new console panel.
    */
  /* CompleteClass */
  override def createConsole(options: typings.jupyterlabConsole.widgetMod.CodeConsole.IOptions): CodeConsole = js.native
  /**
    * Create an input prompt.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createInputPrompt(): IInputPrompt = js.native
  /**
    * Create an output prompt.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createOutputPrompt(): IOutputPrompt = js.native
  /**
    * Create a new raw cell widget.
    */
  /* CompleteClass */
  override def createRawCell(options: typings.jupyterlabCells.widgetMod.RawCell.IOptions): RawCell = js.native
  /**
    * Create an stdin widget.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def createStdin(options: typings.jupyterlabOutputarea.widgetMod.Stdin.IOptions): IStdin = js.native
  /**
    * The readonly editor factory that create code editors
    */
  /* InferMemberOverrides */
  @JSName("editorFactory")
  override def editorFactory_MContentFactory_ : Factory = js.native
}

/**
  * A namespace for the console panel content factory.
  */
@JSImport("@jupyterlab/console/lib/panel", "ConsolePanel.ContentFactory")
@js.native
object ContentFactory extends js.Object {
  /**
    * Options for the code console content factory.
    */
  type IOptions = typings.jupyterlabConsole.widgetMod.CodeConsole.ContentFactory.IOptions
}

