package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains settings related to the ASPxClientCommandConsts.INSERTVIDEO_COMMAND command parameter.
  */
trait ASPxClientHtmlEditorInsertVideoCommandArguments extends ASPxClientHtmlEditorChangeHtml5MediaElementCommandArguments {
  /**
    * Defines the URL of an image that is shown while the video file is downloading, or until an end-user clicks the play button.
    */
  var posterUrl: String
}

object ASPxClientHtmlEditorInsertVideoCommandArguments {
  @scala.inline
  def apply(
    GetCommandName: () => String,
    align: String,
    autoPlay: Boolean,
    id: String,
    loop: Boolean,
    posterUrl: String,
    preloadMode: String,
    selectedElement: js.Any,
    showPlayerControls: Boolean,
    src: String,
    styleSettings: ASPxClientHtmlEditorCommandStyleSettings
  ): ASPxClientHtmlEditorInsertVideoCommandArguments = {
    val __obj = js.Dynamic.literal(GetCommandName = js.Any.fromFunction0(GetCommandName), align = align.asInstanceOf[js.Any], autoPlay = autoPlay.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], posterUrl = posterUrl.asInstanceOf[js.Any], preloadMode = preloadMode.asInstanceOf[js.Any], selectedElement = selectedElement.asInstanceOf[js.Any], showPlayerControls = showPlayerControls.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], styleSettings = styleSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorInsertVideoCommandArguments]
  }
}

