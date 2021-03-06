package typings.bpmnModdle.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputSet extends BaseElement {
  var dataOutputRefs: js.Array[DataOutput]
  var inputSetRefs: js.Array[InputSet]
  var name: String
  var optionalOutputRefs: js.Array[DataOutput]
  var whileExecutingOutputREfs: js.Array[DataOutput]
}

object OutputSet {
  @scala.inline
  def apply(
    $parent: TypeDerived,
    $type: ElementType,
    dataOutputRefs: js.Array[DataOutput],
    id: String,
    inputSetRefs: js.Array[InputSet],
    name: String,
    optionalOutputRefs: js.Array[DataOutput],
    whileExecutingOutputREfs: js.Array[DataOutput],
    $attrs: StringDictionary[js.Any] = null,
    documentation: js.Array[Documentation] = null,
    extensionDefinitions: js.Array[ExtensionDefinition] = null,
    extensionElements: ExtensionElements = null
  ): OutputSet = {
    val __obj = js.Dynamic.literal($parent = $parent.asInstanceOf[js.Any], $type = $type.asInstanceOf[js.Any], dataOutputRefs = dataOutputRefs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputSetRefs = inputSetRefs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionalOutputRefs = optionalOutputRefs.asInstanceOf[js.Any], whileExecutingOutputREfs = whileExecutingOutputREfs.asInstanceOf[js.Any])
    if ($attrs != null) __obj.updateDynamic("$attrs")($attrs.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extensionDefinitions != null) __obj.updateDynamic("extensionDefinitions")(extensionDefinitions.asInstanceOf[js.Any])
    if (extensionElements != null) __obj.updateDynamic("extensionElements")(extensionElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputSet]
  }
}

