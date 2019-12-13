package typings.atAntDashDesignProDashLayout

import typings.atAntDashDesignProDashLayout.libBasicLayoutMod.BasicLayoutProps
import typings.atAntDashDesignProDashLayout.libFooterMod.FooterProps
import typings.atAntDashDesignProDashLayout.libGetPageTitleMod.GetPageTitleProps
import typings.atAntDashDesignProDashLayout.libGridContentMod.GridContentProps
import typings.atAntDashDesignProDashLayout.libHeaderMod.HeaderView
import typings.atAntDashDesignProDashLayout.libPageHeaderWrapperMod.PageHeaderWrapperProps
import typings.atAntDashDesignProDashLayout.libRouteContextMod.RouteContextType
import typings.atAntDashDesignProDashLayout.libSettingDrawerMod.SettingDrawerProps
import typings.atAntDashDesignProDashLayout.libTopNavHeaderMod.TopNavHeaderProps
import typings.atAntDashDesignProDashLayout.libTypingsMod.MenuDataItem
import typings.atAntDashDesignProDashLayout.libTypingsMod.MessageDescriptor
import typings.atAntDashDesignProDashLayout.libTypingsMod.Route
import typings.react.reactMod.Context
import typings.react.reactMod.FC
import typings.react.reactMod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/pro-layout", JSImport.Namespace)
@js.native
object atAntDashDesignProDashLayoutMod extends js.Object {
  @js.native
  class DefaultHeader () extends HeaderView
  
  /**
    * 🌃 Powerful and easy to use beautiful layout
    * 🏄‍ Support multiple topics and layout types
    * @param props
    */
  val BasicLayout: FC[BasicLayoutProps] = js.native
  val DefaultFooter: FC[FooterProps] = js.native
  /**
    * This component can support contentWidth so you don't need to calculate the width
    * contentWidth=Fixed, width will is 1200
    * @param props
    */
  val GridContent: SFC[GridContentProps] = js.native
  val PageHeaderWrapper: SFC[PageHeaderWrapperProps] = js.native
  val PageLoading: FC[Anon_Tip] = js.native
  val RouteContext: Context[RouteContextType] = js.native
  val SettingDrawer: FC[SettingDrawerProps] = js.native
  val TopNavHeader: FC[TopNavHeaderProps] = js.native
  /**
    * 🌃 Powerful and easy to use beautiful layout
    * 🏄‍ Support multiple topics and layout types
    * @param props
    */
  val default: FC[BasicLayoutProps] = js.native
  def getMenuData(routes: js.Array[Route]): Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.UndefOr[scala.Nothing],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Anon_Breadcrumb = js.native
  def getMenuData(routes: js.Array[Route], menu: Anon_Locale): Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: Anon_Locale,
    formatMessage: js.UndefOr[scala.Nothing],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: Anon_Locale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Anon_Breadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: Anon_Locale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Anon_Breadcrumb = js.native
  def getPageTitle(props: GetPageTitleProps): String = js.native
  def getPageTitle(props: GetPageTitleProps, ignoreTile: Boolean): String = js.native
}

