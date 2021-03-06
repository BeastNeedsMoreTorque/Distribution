package typings.materialUi

import typings.materialUi.MaterialUI.Styles.Colors
import typings.materialUi.MaterialUI.Styles.MuiThemeProviderProps
import typings.materialUi.MaterialUI.Styles.RawTheme
import typings.materialUi.MaterialUI.Styles.Spacing
import typings.materialUi.MaterialUI.Styles.Transitions
import typings.materialUi.MaterialUI.Styles.Typography
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("material-ui/styles", JSImport.Namespace)
@js.native
object stylesMod extends js.Object {
  @js.native
  class MuiThemeProvider ()
    extends Component[MuiThemeProviderProps, js.Object, js.Any]
  
  var DarkRawTheme: RawTheme = js.native
  var LightRawTheme: RawTheme = js.native
  var colors: Colors = js.native
  var darkBaseTheme: RawTheme = js.native
  var lightBaseTheme: RawTheme = js.native
  var spacing: Spacing = js.native
  var transitions: Transitions = js.native
  var typography: Typography = js.native
  var zIndex: typings.materialUi.MaterialUI.Styles.zIndex = js.native
  def getMuiTheme(muiTheme: typings.materialUi.MaterialUI.Styles.MuiTheme*): typings.materialUi.MaterialUI.Styles.MuiTheme = js.native
  type MuiTheme = typings.materialUi.MaterialUI.Styles.MuiTheme
}

