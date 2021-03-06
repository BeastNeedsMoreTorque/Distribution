package typings.officeUiFabricReact.calendarYearMod

import typings.officeUiFabricReact.calendarTypesMod.ICalendarIconStrings
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarYearProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var maxYear: js.UndefOr[Double] = js.undefined
  var minYear: js.UndefOr[Double] = js.undefined
  var navigatedYear: js.UndefOr[Double] = js.undefined
  var navigationIcons: js.UndefOr[ICalendarIconStrings] = js.undefined
  var onHeaderSelect: js.UndefOr[js.Function1[/* focus */ Boolean, Unit]] = js.undefined
  var onRenderTitle: js.UndefOr[js.Function1[/* props */ ICalendarYearHeaderProps, ReactNode]] = js.undefined
  var onRenderYear: js.UndefOr[js.Function1[/* year */ Double, ReactNode]] = js.undefined
  var onSelectYear: js.UndefOr[js.Function1[/* year */ Double, Unit]] = js.undefined
  var selectedYear: js.UndefOr[Double] = js.undefined
  var strings: js.UndefOr[ICalendarYearStrings] = js.undefined
}

object ICalendarYearProps {
  @scala.inline
  def apply(
    className: String = null,
    maxYear: js.UndefOr[Double] = js.undefined,
    minYear: js.UndefOr[Double] = js.undefined,
    navigatedYear: js.UndefOr[Double] = js.undefined,
    navigationIcons: ICalendarIconStrings = null,
    onHeaderSelect: /* focus */ Boolean => Unit = null,
    onRenderTitle: /* props */ ICalendarYearHeaderProps => ReactNode = null,
    onRenderYear: /* year */ Double => ReactNode = null,
    onSelectYear: /* year */ Double => Unit = null,
    selectedYear: js.UndefOr[Double] = js.undefined,
    strings: ICalendarYearStrings = null
  ): ICalendarYearProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(maxYear)) __obj.updateDynamic("maxYear")(maxYear.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minYear)) __obj.updateDynamic("minYear")(minYear.get.asInstanceOf[js.Any])
    if (!js.isUndefined(navigatedYear)) __obj.updateDynamic("navigatedYear")(navigatedYear.get.asInstanceOf[js.Any])
    if (navigationIcons != null) __obj.updateDynamic("navigationIcons")(navigationIcons.asInstanceOf[js.Any])
    if (onHeaderSelect != null) __obj.updateDynamic("onHeaderSelect")(js.Any.fromFunction1(onHeaderSelect))
    if (onRenderTitle != null) __obj.updateDynamic("onRenderTitle")(js.Any.fromFunction1(onRenderTitle))
    if (onRenderYear != null) __obj.updateDynamic("onRenderYear")(js.Any.fromFunction1(onRenderYear))
    if (onSelectYear != null) __obj.updateDynamic("onSelectYear")(js.Any.fromFunction1(onSelectYear))
    if (!js.isUndefined(selectedYear)) __obj.updateDynamic("selectedYear")(selectedYear.get.asInstanceOf[js.Any])
    if (strings != null) __obj.updateDynamic("strings")(strings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarYearProps]
  }
}

