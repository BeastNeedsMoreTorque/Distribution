package typings.rbx

import typings.rbx.anon.AsElementType
import typings.rbx.anon.ColumnGroupPropsBackgroundColor
import typings.rbx.anon.Desktop
import typings.rbx.anon.Fullhd
import typings.rbx.anon.PickBadgeHelpersPropsFloa
import typings.rbx.columnMod.ColumnBreakpointOptions
import typings.rbx.exoticMod.ForwardRefAsExoticComponent
import typings.rbx.exoticMod.FromReactType
import typings.rbx.helpersMod.HelpersPropsOverrides
import typings.rbx.rbxStrings.as
import typings.rbx.rbxStrings.backgroundColor
import typings.rbx.rbxStrings.badge
import typings.rbx.rbxStrings.badgeColor
import typings.rbx.rbxStrings.badgeOutlined
import typings.rbx.rbxStrings.badgeRounded
import typings.rbx.rbxStrings.badgeSize
import typings.rbx.rbxStrings.className
import typings.rbx.rbxStrings.clearfix
import typings.rbx.rbxStrings.clipped
import typings.rbx.rbxStrings.desktop
import typings.rbx.rbxStrings.fullhd
import typings.rbx.rbxStrings.hidden
import typings.rbx.rbxStrings.invisible
import typings.rbx.rbxStrings.italic
import typings.rbx.rbxStrings.marginless
import typings.rbx.rbxStrings.mobile
import typings.rbx.rbxStrings.narrow
import typings.rbx.rbxStrings.offset
import typings.rbx.rbxStrings.overlay
import typings.rbx.rbxStrings.paddingless
import typings.rbx.rbxStrings.pull
import typings.rbx.rbxStrings.radiusless
import typings.rbx.rbxStrings.relative
import typings.rbx.rbxStrings.responsive
import typings.rbx.rbxStrings.shadowless
import typings.rbx.rbxStrings.size
import typings.rbx.rbxStrings.srOnly
import typings.rbx.rbxStrings.tablet
import typings.rbx.rbxStrings.textAlign
import typings.rbx.rbxStrings.textColor
import typings.rbx.rbxStrings.textSize
import typings.rbx.rbxStrings.textTransform
import typings.rbx.rbxStrings.textWeight
import typings.rbx.rbxStrings.tooltip
import typings.rbx.rbxStrings.tooltipActive
import typings.rbx.rbxStrings.tooltipColor
import typings.rbx.rbxStrings.tooltipMultiline
import typings.rbx.rbxStrings.tooltipPosition
import typings.rbx.rbxStrings.tooltipResponsive
import typings.rbx.rbxStrings.touch
import typings.rbx.rbxStrings.unselectable
import typings.rbx.rbxStrings.widescreen
import typings.react.mod.ComponentProps
import typings.react.mod.ElementType
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.std.Exclude
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rbx/grid/columns", JSImport.Namespace)
@js.native
object columnsMod extends js.Object {
  @js.native
  object Column extends js.Object {
    @JSName("$$typeof")
    var DollarDollartypeof: js.Symbol = js.native
    var Group: ForwardRefAsExoticComponent[ColumnGroupPropsBackgroundColor, ElementType[_]] = js.native
    var defaultProps: AsElementType with (Partial[
        HelpersPropsOverrides with PickBadgeHelpersPropsFloa with Fullhd with ColumnBreakpointOptions with (Pick[_, String | Double | js.Symbol])
      ]) = js.native
    var displayName: js.UndefOr[String] = js.native
    def apply[TAsComponent /* <: ElementType[_] */](
      props: Desktop[TAsComponent] with HelpersPropsOverrides with PickBadgeHelpersPropsFloa with ColumnBreakpointOptions with (Pick[
          ComponentProps[TAsComponent], 
          Exclude[
            /* keyof react.react.ComponentProps<TAsComponent> */ String, 
            hidden | overlay | size | italic | relative | tooltip | touch | as | mobile | tablet | desktop | widescreen | fullhd | className | badge | badgeColor | badgeOutlined | badgeRounded | badgeSize | clearfix | pull | marginless | paddingless | radiusless | shadowless | unselectable | clipped | responsive | textAlign | textSize | tooltipActive | tooltipColor | tooltipMultiline | tooltipPosition | tooltipResponsive | backgroundColor | textColor | textTransform | textWeight | invisible | srOnly | narrow | offset
          ]
        ]) with (RefAttributes[TAsComponent | FromReactType[TAsComponent]])
    ): Element | Null = js.native
  }
  
}

