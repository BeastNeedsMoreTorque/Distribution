package typings.firefoxWebextBrowser.browser.menus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ContextType to override, to allow menu items from other extensions in the menu. Currently only 'bookmark' and
  * 'tab' are supported. showDefaults cannot be used with this option.
  */
/* Rewritten from type alias, can be one of: 
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark
  - typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab
*/
trait OverrideContextContext extends js.Object

object OverrideContextContext {
  @scala.inline
  def bookmark: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark = "bookmark".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.bookmark]
  @scala.inline
  def tab: typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab = "tab".asInstanceOf[typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.tab]
}

