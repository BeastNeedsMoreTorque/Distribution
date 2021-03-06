package typings.reactResizeDetector.mod

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import typings.reactResizeDetector.anon.Leading
import typings.reactResizeDetector.reactResizeDetectorStrings.debounce
import typings.reactResizeDetector.reactResizeDetectorStrings.throttle
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactResizeDetectorProps extends Props[ReactResizeDetector] {
  /**
    * Trigger onResize on height change.
    * Default: false
    */
  var handleHeight: js.UndefOr[Boolean] = js.undefined
  /**
    * Trigger onResize on width change.
    * Default: false
    */
  var handleWidth: js.UndefOr[Boolean] = js.undefined
  /**
    * Valid only for a callback-pattern.
    * Ignored for other render types.
    * Set resize-detector's node type.
    * You can pass any valid React node: string with node's name or element.
    * Can be useful when you need to handle table's or paragraph's resizes.
    * Default: "div"
    */
  var nodeType: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any
  ] = js.undefined
  /**
    * Function that will be invoked with width and height arguments.
    * Default: undefined
    */
  var onResize: js.UndefOr[js.Function2[/* width */ Double, /* height */ Double, Unit]] = js.undefined
  /**
    * A selector of an element to observe.
    * You can use this property to attach resize-observer to any DOM element.
    * Please refer to the querySelector docs.
    * Default: undefined
    */
  var querySelector: js.UndefOr[String] = js.undefined
  /**
    * Possible values: "throttle" and "debounce".
    * See lodash docs for more information.
    * undefined - callback will be fired for every frame.
    * Default: undefined
    */
  var refreshMode: js.UndefOr[throttle | debounce] = js.undefined
  /**
    * Use this in conjunction with refreshMode. An object in shape of { leading: bool, trailing: bool }.
    * Please refer to lodash's docs for more info.
    * Default: undefined
    */
  var refreshOptions: js.UndefOr[Leading] = js.undefined
  /**
    * Use this in conjunction with refreshMode.
    * Important! It's a numeric prop so set it accordingly, e.g. refreshRate={500}.
    * efault: 1000.
    */
  var refreshRate: js.UndefOr[Double] = js.undefined
  var render: js.UndefOr[js.Function1[/* props */ ReactResizeDetectorDimensions, ReactNode]] = js.undefined
  /**
    * Do not trigger onResize when a component mounts.
    * Default: false
    */
  var skipOnMount: js.UndefOr[Boolean] = js.undefined
   // will be passed to React.createElement()
  /**
    * A DOM element to observe.
    * By default it's a parent element in relation to the ReactResizeDetector component.
    * But you can pass any DOM element to observe.
    * This property is omitted when you pass querySelector.
    * Default: undefined
    */
  var targetDomEl: js.UndefOr[HTMLElement] = js.undefined
}

object ReactResizeDetectorProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    handleHeight: js.UndefOr[Boolean] = js.undefined,
    handleWidth: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    nodeType: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any = null,
    onResize: (/* width */ Double, /* height */ Double) => Unit = null,
    querySelector: String = null,
    ref: js.UndefOr[Null | LegacyRef[ReactResizeDetector]] = js.undefined,
    refreshMode: throttle | debounce = null,
    refreshOptions: Leading = null,
    refreshRate: js.UndefOr[Double] = js.undefined,
    render: /* props */ ReactResizeDetectorDimensions => ReactNode = null,
    skipOnMount: js.UndefOr[Boolean] = js.undefined,
    targetDomEl: HTMLElement = null
  ): ReactResizeDetectorProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(handleHeight)) __obj.updateDynamic("handleHeight")(handleHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(handleWidth)) __obj.updateDynamic("handleWidth")(handleWidth.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (nodeType != null) __obj.updateDynamic("nodeType")(nodeType.asInstanceOf[js.Any])
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction2(onResize))
    if (querySelector != null) __obj.updateDynamic("querySelector")(querySelector.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (refreshMode != null) __obj.updateDynamic("refreshMode")(refreshMode.asInstanceOf[js.Any])
    if (refreshOptions != null) __obj.updateDynamic("refreshOptions")(refreshOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshRate)) __obj.updateDynamic("refreshRate")(refreshRate.get.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (!js.isUndefined(skipOnMount)) __obj.updateDynamic("skipOnMount")(skipOnMount.get.asInstanceOf[js.Any])
    if (targetDomEl != null) __obj.updateDynamic("targetDomEl")(targetDomEl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactResizeDetectorProps]
  }
}

