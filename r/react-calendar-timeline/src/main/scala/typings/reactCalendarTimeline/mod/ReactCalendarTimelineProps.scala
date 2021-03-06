package typings.reactCalendarTimeline.mod

import typings.moment.mod.Moment
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.SyntheticEvent
import typings.reactCalendarTimeline.reactCalendarTimelineBooleans.`false`
import typings.reactCalendarTimeline.reactCalendarTimelineBooleans.`true`
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.both
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.move
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.resize
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.right
import typings.std.Date
import typings.std.Element
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactCalendarTimelineProps[CustomItem /* <: TimelineItemBase[_] */, CustomGroup /* <: TimelineGroupBase */] extends js.Object {
  var canChangeGroup: js.UndefOr[Boolean] = js.undefined
  var canMove: js.UndefOr[Boolean] = js.undefined
  var canResize: js.UndefOr[`false` | `true` | left | right | both] = js.undefined
  var clickTolerance: js.UndefOr[Double] = js.undefined
  var defaultTimeEnd: js.UndefOr[Date | Moment] = js.undefined
  var defaultTimeStart: js.UndefOr[Date | Moment] = js.undefined
  var dragSnap: js.UndefOr[Double] = js.undefined
  var groupRenderer: js.UndefOr[
    js.Function1[/* props */ ReactCalendarGroupRendererProps[CustomGroup], ReactNode]
  ] = js.undefined
  var groups: js.Array[CustomGroup]
  // Fields that are in propTypes but not documented
  var headerRef: js.UndefOr[Ref[_]] = js.undefined
  var horizontalLineClassNamesForGroup: js.UndefOr[js.Function1[/* group */ CustomGroup, js.Array[String]]] = js.undefined
  var itemHeightRatio: js.UndefOr[Double] = js.undefined
  var itemRenderer: js.UndefOr[js.Function1[/* props */ ReactCalendarItemRendererProps[CustomItem], ReactNode]] = js.undefined
  var itemTouchSendsClick: js.UndefOr[Boolean] = js.undefined
  var items: js.Array[CustomItem]
  var keys: js.UndefOr[TimelineKeys] = js.undefined
  var lineHeight: js.UndefOr[Double] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var minResizeWidth: js.UndefOr[Double] = js.undefined
  var minZoom: js.UndefOr[Double] = js.undefined
  var moveResizeValidator: js.UndefOr[
    js.Function4[
      /* action */ move | resize, 
      /* itemId */ Id, 
      /* time */ Double, 
      /* resizeEdge */ left | right, 
      Double
    ]
  ] = js.undefined
  var onBoundsChange: js.UndefOr[js.Function2[/* canvasTimeStart */ Double, /* canvasTimeEnd */ Double, _]] = js.undefined
  var onCanvasClick: js.UndefOr[
    js.Function3[
      /* groupId */ Id, 
      /* time */ Double, 
      /* e */ SyntheticEvent[Element, Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onCanvasContextMenu: js.UndefOr[
    js.Function3[
      /* groupId */ Id, 
      /* time */ Double, 
      /* e */ SyntheticEvent[Element, Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onCanvasDoubleClick: js.UndefOr[
    js.Function3[
      /* groupId */ Id, 
      /* time */ Double, 
      /* e */ SyntheticEvent[Element, Event], 
      scala.Unit
    ]
  ] = js.undefined
  var onItemClick: js.UndefOr[
    js.Function3[/* itemId */ Id, /* e */ SyntheticEvent[Element, Event], /* time */ Double, scala.Unit]
  ] = js.undefined
  var onItemContextMenu: js.UndefOr[
    js.Function3[/* itemId */ Id, /* e */ SyntheticEvent[Element, Event], /* time */ Double, scala.Unit]
  ] = js.undefined
  var onItemDeselect: js.UndefOr[js.Function1[/* e */ SyntheticEvent[Element, Event], scala.Unit]] = js.undefined
  var onItemDoubleClick: js.UndefOr[
    js.Function3[/* itemId */ Id, /* e */ SyntheticEvent[Element, Event], /* time */ Double, scala.Unit]
  ] = js.undefined
  var onItemDrag: js.UndefOr[
    js.Function1[/* itemDragObject */ OnItemDragObjectMove | OnItemDragObjectResize, scala.Unit]
  ] = js.undefined
  var onItemMove: js.UndefOr[
    js.Function3[/* itemId */ Id, /* dragTime */ Double, /* newGroupOrder */ Double, scala.Unit]
  ] = js.undefined
  var onItemResize: js.UndefOr[
    js.Function3[/* itemId */ Id, /* endTimeOrStartTime */ Double, /* edge */ left | right, scala.Unit]
  ] = js.undefined
  var onItemSelect: js.UndefOr[js.Function3[/* itemId */ Id, /* e */ js.Any, /* time */ Double, scala.Unit]] = js.undefined
  var onTimeChange: js.UndefOr[
    js.Function3[
      /* visibleTimeStart */ Double, 
      /* visibleTimeEnd */ Double, 
      /* updateScrollCanvas */ js.Function2[/* start */ Double, /* end */ Double, scala.Unit], 
      _
    ]
  ] = js.undefined
  var onZoom: js.UndefOr[js.Function1[/* timelineContext */ TimelineContext, scala.Unit]] = js.undefined
  var resizeDetector: js.UndefOr[js.Function1[/* containerResizeDetector */ js.Any, scala.Unit]] = js.undefined
  var rightSidebarContent: js.UndefOr[ReactNode] = js.undefined
  var rightSidebarWidth: js.UndefOr[Double] = js.undefined
  var scrollRef: js.UndefOr[Ref[_]] = js.undefined
  var selected: js.UndefOr[js.Array[Double]] = js.undefined
  var sidebarContent: js.UndefOr[ReactNode] = js.undefined
  var sidebarWidth: js.UndefOr[Double] = js.undefined
  var stackItems: js.UndefOr[Boolean] = js.undefined
  var timeSteps: js.UndefOr[TimelineTimeSteps] = js.undefined
  var traditionalZoom: js.UndefOr[Boolean] = js.undefined
  var useResizeHandle: js.UndefOr[Boolean] = js.undefined
  var verticalLineClassNamesForTime: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, js.UndefOr[js.Array[String]]]] = js.undefined
  var visibleTimeEnd: js.UndefOr[Date | Moment | Double] = js.undefined
  var visibleTimeStart: js.UndefOr[Date | Moment | Double] = js.undefined
}

object ReactCalendarTimelineProps {
  @scala.inline
  def apply[/* <: typings.reactCalendarTimeline.mod.TimelineItemBase[_] */ CustomItem, /* <: typings.reactCalendarTimeline.mod.TimelineGroupBase */ CustomGroup](
    groups: js.Array[CustomGroup],
    items: js.Array[CustomItem],
    canChangeGroup: js.UndefOr[Boolean] = js.undefined,
    canMove: js.UndefOr[Boolean] = js.undefined,
    canResize: `false` | `true` | left | right | both = null,
    clickTolerance: js.UndefOr[Double] = js.undefined,
    defaultTimeEnd: Date | Moment = null,
    defaultTimeStart: Date | Moment = null,
    dragSnap: js.UndefOr[Double] = js.undefined,
    groupRenderer: /* props */ ReactCalendarGroupRendererProps[CustomGroup] => ReactNode = null,
    headerRef: js.UndefOr[Null | Ref[_]] = js.undefined,
    horizontalLineClassNamesForGroup: /* group */ CustomGroup => js.Array[String] = null,
    itemHeightRatio: js.UndefOr[Double] = js.undefined,
    itemRenderer: /* props */ ReactCalendarItemRendererProps[CustomItem] => ReactNode = null,
    itemTouchSendsClick: js.UndefOr[Boolean] = js.undefined,
    keys: TimelineKeys = null,
    lineHeight: js.UndefOr[Double] = js.undefined,
    maxZoom: js.UndefOr[Double] = js.undefined,
    minResizeWidth: js.UndefOr[Double] = js.undefined,
    minZoom: js.UndefOr[Double] = js.undefined,
    moveResizeValidator: (/* action */ move | resize, /* itemId */ Id, /* time */ Double, /* resizeEdge */ left | right) => Double = null,
    onBoundsChange: (/* canvasTimeStart */ Double, /* canvasTimeEnd */ Double) => _ = null,
    onCanvasClick: (/* groupId */ Id, /* time */ Double, /* e */ SyntheticEvent[Element, Event]) => scala.Unit = null,
    onCanvasContextMenu: (/* groupId */ Id, /* time */ Double, /* e */ SyntheticEvent[Element, Event]) => scala.Unit = null,
    onCanvasDoubleClick: (/* groupId */ Id, /* time */ Double, /* e */ SyntheticEvent[Element, Event]) => scala.Unit = null,
    onItemClick: (/* itemId */ Id, /* e */ SyntheticEvent[Element, Event], /* time */ Double) => scala.Unit = null,
    onItemContextMenu: (/* itemId */ Id, /* e */ SyntheticEvent[Element, Event], /* time */ Double) => scala.Unit = null,
    onItemDeselect: /* e */ SyntheticEvent[Element, Event] => scala.Unit = null,
    onItemDoubleClick: (/* itemId */ Id, /* e */ SyntheticEvent[Element, Event], /* time */ Double) => scala.Unit = null,
    onItemDrag: /* itemDragObject */ OnItemDragObjectMove | OnItemDragObjectResize => scala.Unit = null,
    onItemMove: (/* itemId */ Id, /* dragTime */ Double, /* newGroupOrder */ Double) => scala.Unit = null,
    onItemResize: (/* itemId */ Id, /* endTimeOrStartTime */ Double, /* edge */ left | right) => scala.Unit = null,
    onItemSelect: (/* itemId */ Id, /* e */ js.Any, /* time */ Double) => scala.Unit = null,
    onTimeChange: (/* visibleTimeStart */ Double, /* visibleTimeEnd */ Double, /* updateScrollCanvas */ js.Function2[/* start */ Double, /* end */ Double, scala.Unit]) => _ = null,
    onZoom: /* timelineContext */ TimelineContext => scala.Unit = null,
    resizeDetector: /* containerResizeDetector */ js.Any => scala.Unit = null,
    rightSidebarContent: ReactNode = null,
    rightSidebarWidth: js.UndefOr[Double] = js.undefined,
    scrollRef: js.UndefOr[Null | Ref[_]] = js.undefined,
    selected: js.Array[Double] = null,
    sidebarContent: ReactNode = null,
    sidebarWidth: js.UndefOr[Double] = js.undefined,
    stackItems: js.UndefOr[Boolean] = js.undefined,
    timeSteps: TimelineTimeSteps = null,
    traditionalZoom: js.UndefOr[Boolean] = js.undefined,
    useResizeHandle: js.UndefOr[Boolean] = js.undefined,
    verticalLineClassNamesForTime: (/* start */ Double, /* end */ Double) => js.UndefOr[js.Array[String]] = null,
    visibleTimeEnd: Date | Moment | Double = null,
    visibleTimeStart: Date | Moment | Double = null
  ): ReactCalendarTimelineProps[CustomItem, CustomGroup] = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    if (!js.isUndefined(canChangeGroup)) __obj.updateDynamic("canChangeGroup")(canChangeGroup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canMove)) __obj.updateDynamic("canMove")(canMove.get.asInstanceOf[js.Any])
    if (canResize != null) __obj.updateDynamic("canResize")(canResize.asInstanceOf[js.Any])
    if (!js.isUndefined(clickTolerance)) __obj.updateDynamic("clickTolerance")(clickTolerance.get.asInstanceOf[js.Any])
    if (defaultTimeEnd != null) __obj.updateDynamic("defaultTimeEnd")(defaultTimeEnd.asInstanceOf[js.Any])
    if (defaultTimeStart != null) __obj.updateDynamic("defaultTimeStart")(defaultTimeStart.asInstanceOf[js.Any])
    if (!js.isUndefined(dragSnap)) __obj.updateDynamic("dragSnap")(dragSnap.get.asInstanceOf[js.Any])
    if (groupRenderer != null) __obj.updateDynamic("groupRenderer")(js.Any.fromFunction1(groupRenderer))
    if (!js.isUndefined(headerRef)) __obj.updateDynamic("headerRef")(headerRef.asInstanceOf[js.Any])
    if (horizontalLineClassNamesForGroup != null) __obj.updateDynamic("horizontalLineClassNamesForGroup")(js.Any.fromFunction1(horizontalLineClassNamesForGroup))
    if (!js.isUndefined(itemHeightRatio)) __obj.updateDynamic("itemHeightRatio")(itemHeightRatio.get.asInstanceOf[js.Any])
    if (itemRenderer != null) __obj.updateDynamic("itemRenderer")(js.Any.fromFunction1(itemRenderer))
    if (!js.isUndefined(itemTouchSendsClick)) __obj.updateDynamic("itemTouchSendsClick")(itemTouchSendsClick.get.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (!js.isUndefined(lineHeight)) __obj.updateDynamic("lineHeight")(lineHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minResizeWidth)) __obj.updateDynamic("minResizeWidth")(minResizeWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minZoom)) __obj.updateDynamic("minZoom")(minZoom.get.asInstanceOf[js.Any])
    if (moveResizeValidator != null) __obj.updateDynamic("moveResizeValidator")(js.Any.fromFunction4(moveResizeValidator))
    if (onBoundsChange != null) __obj.updateDynamic("onBoundsChange")(js.Any.fromFunction2(onBoundsChange))
    if (onCanvasClick != null) __obj.updateDynamic("onCanvasClick")(js.Any.fromFunction3(onCanvasClick))
    if (onCanvasContextMenu != null) __obj.updateDynamic("onCanvasContextMenu")(js.Any.fromFunction3(onCanvasContextMenu))
    if (onCanvasDoubleClick != null) __obj.updateDynamic("onCanvasDoubleClick")(js.Any.fromFunction3(onCanvasDoubleClick))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction3(onItemClick))
    if (onItemContextMenu != null) __obj.updateDynamic("onItemContextMenu")(js.Any.fromFunction3(onItemContextMenu))
    if (onItemDeselect != null) __obj.updateDynamic("onItemDeselect")(js.Any.fromFunction1(onItemDeselect))
    if (onItemDoubleClick != null) __obj.updateDynamic("onItemDoubleClick")(js.Any.fromFunction3(onItemDoubleClick))
    if (onItemDrag != null) __obj.updateDynamic("onItemDrag")(js.Any.fromFunction1(onItemDrag))
    if (onItemMove != null) __obj.updateDynamic("onItemMove")(js.Any.fromFunction3(onItemMove))
    if (onItemResize != null) __obj.updateDynamic("onItemResize")(js.Any.fromFunction3(onItemResize))
    if (onItemSelect != null) __obj.updateDynamic("onItemSelect")(js.Any.fromFunction3(onItemSelect))
    if (onTimeChange != null) __obj.updateDynamic("onTimeChange")(js.Any.fromFunction3(onTimeChange))
    if (onZoom != null) __obj.updateDynamic("onZoom")(js.Any.fromFunction1(onZoom))
    if (resizeDetector != null) __obj.updateDynamic("resizeDetector")(js.Any.fromFunction1(resizeDetector))
    if (rightSidebarContent != null) __obj.updateDynamic("rightSidebarContent")(rightSidebarContent.asInstanceOf[js.Any])
    if (!js.isUndefined(rightSidebarWidth)) __obj.updateDynamic("rightSidebarWidth")(rightSidebarWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollRef)) __obj.updateDynamic("scrollRef")(scrollRef.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (sidebarContent != null) __obj.updateDynamic("sidebarContent")(sidebarContent.asInstanceOf[js.Any])
    if (!js.isUndefined(sidebarWidth)) __obj.updateDynamic("sidebarWidth")(sidebarWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stackItems)) __obj.updateDynamic("stackItems")(stackItems.get.asInstanceOf[js.Any])
    if (timeSteps != null) __obj.updateDynamic("timeSteps")(timeSteps.asInstanceOf[js.Any])
    if (!js.isUndefined(traditionalZoom)) __obj.updateDynamic("traditionalZoom")(traditionalZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useResizeHandle)) __obj.updateDynamic("useResizeHandle")(useResizeHandle.get.asInstanceOf[js.Any])
    if (verticalLineClassNamesForTime != null) __obj.updateDynamic("verticalLineClassNamesForTime")(js.Any.fromFunction2(verticalLineClassNamesForTime))
    if (visibleTimeEnd != null) __obj.updateDynamic("visibleTimeEnd")(visibleTimeEnd.asInstanceOf[js.Any])
    if (visibleTimeStart != null) __obj.updateDynamic("visibleTimeStart")(visibleTimeStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactCalendarTimelineProps[CustomItem, CustomGroup]]
  }
}

