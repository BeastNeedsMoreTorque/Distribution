package typings.jupyterlabCompleter.tokensMod.ICompletionManager

import typings.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typings.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The attributes of a completable object that can change and sync at runtime.
  */
trait ICompletableAttributes extends js.Object {
  /**
    * The data connector used to populate the completer.
    */
  var connector: IDataConnector[IReply, Unit, IRequest, String]
  /**
    * The host editor for the completer.
    */
  var editor: IEditor | Null
}

object ICompletableAttributes {
  @scala.inline
  def apply(connector: IDataConnector[IReply, Unit, IRequest, String], editor: IEditor = null): ICompletableAttributes = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompletableAttributes]
  }
}

