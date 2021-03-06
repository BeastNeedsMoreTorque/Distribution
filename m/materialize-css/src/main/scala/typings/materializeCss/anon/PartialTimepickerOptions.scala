package typings.materializeCss.anon

import typings.materializeCss.M.Modal
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.TimepickerOptions> */
trait PartialTimepickerOptions extends js.Object {
  var autoClose: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[String] = js.undefined
  var defaultTime: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var fromNow: js.UndefOr[Double] = js.undefined
  var i18n: js.UndefOr[
    Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternationalizationOptions */ _
    ]
  ] = js.undefined
  var onCloseEnd: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.undefined
  var onCloseStart: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.undefined
  var onOpenEnd: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.undefined
  var onOpenStart: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.undefined
  var onSelect: js.UndefOr[js.ThisFunction2[/* this */ Modal, /* hour */ Double, /* minute */ Double, Unit]] = js.undefined
  var showClearBtn: js.UndefOr[Boolean] = js.undefined
  var twelveHour: js.UndefOr[Boolean] = js.undefined
  var vibrate: js.UndefOr[Boolean] = js.undefined
}

object PartialTimepickerOptions {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[Boolean] = js.undefined,
    container: String = null,
    defaultTime: String = null,
    duration: js.UndefOr[Double] = js.undefined,
    fromNow: js.UndefOr[Double] = js.undefined,
    i18n: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify InternationalizationOptions */ _
    ] = null,
    onCloseEnd: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit] = null,
    onCloseStart: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit] = null,
    onOpenEnd: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit] = null,
    onOpenStart: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit] = null,
    onSelect: js.ThisFunction2[/* this */ Modal, /* hour */ Double, /* minute */ Double, Unit] = null,
    showClearBtn: js.UndefOr[Boolean] = js.undefined,
    twelveHour: js.UndefOr[Boolean] = js.undefined,
    vibrate: js.UndefOr[Boolean] = js.undefined
  ): PartialTimepickerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.get.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (defaultTime != null) __obj.updateDynamic("defaultTime")(defaultTime.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fromNow)) __obj.updateDynamic("fromNow")(fromNow.get.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (onCloseEnd != null) __obj.updateDynamic("onCloseEnd")(onCloseEnd.asInstanceOf[js.Any])
    if (onCloseStart != null) __obj.updateDynamic("onCloseStart")(onCloseStart.asInstanceOf[js.Any])
    if (onOpenEnd != null) __obj.updateDynamic("onOpenEnd")(onOpenEnd.asInstanceOf[js.Any])
    if (onOpenStart != null) __obj.updateDynamic("onOpenStart")(onOpenStart.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(showClearBtn)) __obj.updateDynamic("showClearBtn")(showClearBtn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(twelveHour)) __obj.updateDynamic("twelveHour")(twelveHour.get.asInstanceOf[js.Any])
    if (!js.isUndefined(vibrate)) __obj.updateDynamic("vibrate")(vibrate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTimepickerOptions]
  }
}

