package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Static data for an LContainer */
trait TContainerNode
  extends TNode
     with TNodeWithLocalRefs {
  @JSName("child")
  var child_TContainerNode: Null
  /**
    * Container nodes will have parents unless:
    *
    * - They are the first node of a component or embedded view
    * - They are dynamically created
    */
  @JSName("parent")
  var parent_TContainerNode: ɵangularPackagesCoreCoreBe | TElementContainerNode | Null
  @JSName("projection")
  var projection_TContainerNode: Null
}

object TContainerNode {
  @scala.inline
  def apply(
    child: Null,
    classBindings: TStylingRange,
    directiveEnd: Double,
    directiveStart: Double,
    directiveStylingLast: Double,
    flags: TNodeFlags,
    index: Double,
    injectorIndex: Double,
    projection: Null,
    providerIndexes: TNodeProviderIndexes,
    styleBindings: TStylingRange,
    `type`: TNodeType,
    attrs: TAttributes = null,
    classes: String = null,
    classesWithoutHost: String = null,
    initialInputs: js.UndefOr[Null | InitialInputData] = js.undefined,
    inputs: PropertyAliases = null,
    localNames: js.Array[String | Double] = null,
    mergedAttrs: TAttributes = null,
    next: TNode = null,
    outputs: PropertyAliases = null,
    parent: ɵangularPackagesCoreCoreBe | TElementContainerNode = null,
    projectionNext: TNode = null,
    propertyBindings: js.Array[Double] = null,
    residualClasses: js.UndefOr[Null | KeyValueArray[_]] = js.undefined,
    residualStyles: js.UndefOr[Null | KeyValueArray[_]] = js.undefined,
    styles: String = null,
    stylesWithoutHost: String = null,
    tViews: TView | js.Array[TView] = null,
    tagName: String = null
  ): TContainerNode = {
    val __obj = js.Dynamic.literal(child = child.asInstanceOf[js.Any], classBindings = classBindings.asInstanceOf[js.Any], directiveEnd = directiveEnd.asInstanceOf[js.Any], directiveStart = directiveStart.asInstanceOf[js.Any], directiveStylingLast = directiveStylingLast.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], injectorIndex = injectorIndex.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], providerIndexes = providerIndexes.asInstanceOf[js.Any], styleBindings = styleBindings.asInstanceOf[js.Any], attrs = attrs.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], classesWithoutHost = classesWithoutHost.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], localNames = localNames.asInstanceOf[js.Any], mergedAttrs = mergedAttrs.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], projectionNext = projectionNext.asInstanceOf[js.Any], propertyBindings = propertyBindings.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], stylesWithoutHost = stylesWithoutHost.asInstanceOf[js.Any], tViews = tViews.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(initialInputs)) __obj.updateDynamic("initialInputs")(initialInputs.asInstanceOf[js.Any])
    if (!js.isUndefined(residualClasses)) __obj.updateDynamic("residualClasses")(residualClasses.asInstanceOf[js.Any])
    if (!js.isUndefined(residualStyles)) __obj.updateDynamic("residualStyles")(residualStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TContainerNode]
  }
}

