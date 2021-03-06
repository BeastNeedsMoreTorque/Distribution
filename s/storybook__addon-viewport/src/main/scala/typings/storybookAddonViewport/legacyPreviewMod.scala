package typings.storybookAddonViewport

import typings.storybookAddonViewport.viewportMod.ViewportMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-viewport/dist/legacy_preview", JSImport.Namespace)
@js.native
object legacyPreviewMod extends js.Object {
  val DEFAULT_VIEWPORT: /* "responsive" */ String = js.native
  val INITIAL_VIEWPORTS: ViewportMap = js.native
  val MINIMAL_VIEWPORTS: ViewportMap = js.native
  def configureViewport(): Unit = js.native
}

