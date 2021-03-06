package typings.materializeCss

import typings.materializeCss.M.AutocompleteData
import typings.materializeCss.M.ChipData
import typings.materializeCss.anon.PartialAutocompleteOptionData
import typings.materializeCss.anon.PartialCarouselOptionsDist
import typings.materializeCss.anon.PartialChipsOptionsAutocompleteOptions
import typings.materializeCss.anon.PartialCollapsibleOptionsAccordion
import typings.materializeCss.anon.PartialDatepickerOptionsAutoClose
import typings.materializeCss.anon.PartialDropdownOptionsAlignment
import typings.materializeCss.anon.PartialFloatingActionButt
import typings.materializeCss.anon.PartialFormSelectOptions
import typings.materializeCss.anon.PartialMaterialboxOptionsInDuration
import typings.materializeCss.anon.PartialModalOptionsDismissible
import typings.materializeCss.anon.PartialParallaxOptions
import typings.materializeCss.anon.PartialPushpinOptionsBottom
import typings.materializeCss.anon.PartialScrollSpyOptions
import typings.materializeCss.anon.PartialSidenavOptionsDraggable
import typings.materializeCss.anon.PartialSliderOptions
import typings.materializeCss.anon.PartialTabsOptionsDuration
import typings.materializeCss.anon.PartialTapTargetOptionsOnClose
import typings.materializeCss.anon.PartialTimepickerOptions
import typings.materializeCss.anon.PartialTooltipOptions
import typings.materializeCss.materializeCssStrings.addChip
import typings.materializeCss.materializeCssStrings.close
import typings.materializeCss.materializeCssStrings.deleteChip
import typings.materializeCss.materializeCssStrings.destroy
import typings.materializeCss.materializeCssStrings.getSelectedValues
import typings.materializeCss.materializeCssStrings.gotoDate
import typings.materializeCss.materializeCssStrings.hours
import typings.materializeCss.materializeCssStrings.minutes
import typings.materializeCss.materializeCssStrings.next
import typings.materializeCss.materializeCssStrings.open
import typings.materializeCss.materializeCssStrings.pause
import typings.materializeCss.materializeCssStrings.prev
import typings.materializeCss.materializeCssStrings.recalculateDimensions
import typings.materializeCss.materializeCssStrings.select
import typings.materializeCss.materializeCssStrings.selectChip
import typings.materializeCss.materializeCssStrings.selectOption
import typings.materializeCss.materializeCssStrings.set
import typings.materializeCss.materializeCssStrings.setDate
import typings.materializeCss.materializeCssStrings.showView
import typings.materializeCss.materializeCssStrings.start
import typings.materializeCss.materializeCssStrings.updateData
import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def autocomplete(): JQuery = js.native
  // Pick<T,K> to check methods exist.
  def autocomplete(method: /* keyof materialize-css.anon.PickAutocompleteopenclose */ open | close | destroy): JQuery = js.native
  def autocomplete(method: selectOption, el: Element): JQuery = js.native
  def autocomplete(method: updateData, data: AutocompleteData): JQuery = js.native
  def autocomplete(options: PartialAutocompleteOptionData): JQuery = js.native
  def carousel(): JQuery = js.native
  def carousel(method: destroy): JQuery = js.native
  def carousel(method: next): JQuery = js.native
  def carousel(method: next, n: Double): JQuery = js.native
  def carousel(method: prev): JQuery = js.native
  def carousel(method: prev, n: Double): JQuery = js.native
  def carousel(method: set): JQuery = js.native
  def carousel(method: set, n: Double): JQuery = js.native
  def carousel(options: PartialCarouselOptionsDist): JQuery = js.native
  def characterCounter(): JQuery = js.native
  def characterCounter(method: destroy): JQuery = js.native
  def chips(): JQuery = js.native
  def chips(method: addChip, chip: ChipData): JQuery = js.native
  def chips(method: deleteChip): JQuery = js.native
  def chips(method: deleteChip, n: Double): JQuery = js.native
  def chips(method: destroy): JQuery = js.native
  def chips(method: selectChip, n: Double): JQuery = js.native
  def chips(options: PartialChipsOptionsAutocompleteOptions): JQuery = js.native
  def collapsible(): JQuery = js.native
  def collapsible(method: close, n: Double): JQuery = js.native
  def collapsible(method: destroy): JQuery = js.native
  def collapsible(method: open, n: Double): JQuery = js.native
  def collapsible(options: PartialCollapsibleOptionsAccordion): JQuery = js.native
  def datepicker(): JQuery = js.native
  def datepicker(method: /* keyof materialize-css.anon.PickDatepickeropenclosede */ open | close | destroy): JQuery = js.native
  def datepicker(method: gotoDate, date: Date): JQuery = js.native
  def datepicker(method: setDate): JQuery = js.native
  def datepicker(method: setDate, date: Date): JQuery = js.native
  def datepicker(options: PartialDatepickerOptionsAutoClose): JQuery = js.native
  def dropdown(): JQuery = js.native
  def dropdown(
    method: /* keyof materialize-css.anon.PickDropdownrecalculateDi */ recalculateDimensions | open | close | destroy
  ): JQuery = js.native
  def dropdown(options: PartialDropdownOptionsAlignment): JQuery = js.native
  def floatingActionButton(): JQuery = js.native
  def floatingActionButton(method: /* keyof materialize-css.anon.PickFloatingActionButtono */ open | close | destroy): JQuery = js.native
  def floatingActionButton(options: PartialFloatingActionButt): JQuery = js.native
  def formSelect(): JQuery = js.native
  def formSelect(method: /* keyof materialize-css.anon.PickFormSelectgetSelected */ getSelectedValues | destroy): JQuery = js.native
  def formSelect(options: PartialFormSelectOptions): JQuery = js.native
  def materialbox(): JQuery = js.native
  def materialbox(method: /* keyof materialize-css.anon.PickMaterialboxdestroyope */ destroy | open | close): JQuery = js.native
  def materialbox(options: PartialMaterialboxOptionsInDuration): JQuery = js.native
  def modal(): JQuery = js.native
  def modal(method: /* keyof materialize-css.anon.PickModalopenclosedestroy */ open | close | destroy): JQuery = js.native
  def modal(options: PartialModalOptionsDismissible): JQuery = js.native
  def parallax(): JQuery = js.native
  def parallax(method: destroy): JQuery = js.native
  def parallax(options: PartialParallaxOptions): JQuery = js.native
  def pushpin(): JQuery = js.native
  def pushpin(method: destroy): JQuery = js.native
  def pushpin(options: PartialPushpinOptionsBottom): JQuery = js.native
  def range(): JQuery = js.native
  def range(method: destroy): JQuery = js.native
  def scrollSpy(): JQuery = js.native
  def scrollSpy(method: destroy): JQuery = js.native
  def scrollSpy(options: PartialScrollSpyOptions): JQuery = js.native
  def sidenav(): JQuery = js.native
  def sidenav(method: /* keyof materialize-css.anon.PickSidenavopenclosedestr */ open | close | destroy): JQuery = js.native
  def sidenav(options: PartialSidenavOptionsDraggable): JQuery = js.native
  def slider(): JQuery = js.native
  def slider(
    method: /* keyof materialize-css.anon.PickSliderpausestartnextp */ start | next | prev | destroy | pause
  ): JQuery = js.native
  def slider(options: PartialSliderOptions): JQuery = js.native
  def tabs(): JQuery = js.native
  def tabs(method: destroy): JQuery = js.native
  def tabs(method: select, tabId: String): JQuery = js.native
  def tabs(options: PartialTabsOptionsDuration): JQuery = js.native
  def tapTarget(): JQuery = js.native
  def tapTarget(method: /* keyof materialize-css.anon.PickTapTargetopenclosedes */ open | close | destroy): JQuery = js.native
  def tapTarget(options: PartialTapTargetOptionsOnClose): JQuery = js.native
  def timepicker(): JQuery = js.native
  def timepicker(method: /* keyof materialize-css.anon.PickTimepickeropenclosede */ open | close | destroy): JQuery = js.native
  def timepicker(options: PartialTimepickerOptions): JQuery = js.native
  @JSName("timepicker")
  def timepicker_hours(method: showView, view: hours): JQuery = js.native
  @JSName("timepicker")
  def timepicker_minutes(method: showView, view: minutes): JQuery = js.native
  def tooltip(): JQuery = js.native
  def tooltip(method: /* keyof materialize-css.anon.PickTooltipopenclosedestr */ open | close | destroy): JQuery = js.native
  def tooltip(options: PartialTooltipOptions): JQuery = js.native
}

