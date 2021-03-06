package typings.officeUiFabricReact.colorRectangleTypesMod

import typings.officeUiFabricReact.interfacesMod.IColor
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColorRectangleProps extends js.Object {
  /**
    * Detailed description for how to use the color rectangle. Moving the thumb horizontally adjusts
    * saturation and moving it vertically adjusts value (essentially, brightness).
    * @defaultvalue 'Use left and right arrow keys to set saturation. Use up and down arrow keys to set brightness.'
    */
  var ariaDescription: js.UndefOr[String] = js.undefined
  /**
    * Label of the ColorRectangle for the benefit of screen reader users.
    * @defaultvalue 'Saturation and brightness'
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * Format string for the color rectangle's current value as read by screen readers.
    * The string must include descriptions and two placeholders for the current values:
    * `{0}` for saturation and `{1}` for value/brightness.
    * @defaultvalue `'Saturation {0} brightness {1}'`
    */
  var ariaValueFormat: js.UndefOr[String] = js.undefined
  /**
    * Additional CSS class(es) to apply to the ColorRectangle.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Current color of the rectangle.
    */
  var color: IColor
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IColorRectangle]] = js.undefined
  /**
    * Minimum width and height.
    */
  var minSize: js.UndefOr[Double] = js.undefined
  /**
    * Callback for when the color changes.
    */
  var onChange: js.UndefOr[
    js.Function2[
      /* ev */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], 
      /* color */ IColor, 
      Unit
    ]
  ] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IColorRectangleStyleProps, IColorRectangleStyles]] = js.undefined
  /**
    * Theme (provided through customization).
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IColorRectangleProps {
  @scala.inline
  def apply(
    color: IColor,
    ariaDescription: String = null,
    ariaLabel: String = null,
    ariaValueFormat: String = null,
    className: String = null,
    componentRef: IRefObject[IColorRectangle] = null,
    minSize: js.UndefOr[Double] = js.undefined,
    onChange: (/* ev */ (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], /* color */ IColor) => Unit = null,
    styles: IStyleFunctionOrObject[IColorRectangleStyleProps, IColorRectangleStyles] = null,
    theme: ITheme = null
  ): IColorRectangleProps = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    if (ariaDescription != null) __obj.updateDynamic("ariaDescription")(ariaDescription.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaValueFormat != null) __obj.updateDynamic("ariaValueFormat")(ariaValueFormat.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(minSize)) __obj.updateDynamic("minSize")(minSize.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorRectangleProps]
  }
}

