package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShaderCodeConditionNode extends ShaderCodeNode

object ShaderCodeConditionNode {
  @scala.inline
  def apply(
    children: js.Array[ShaderCodeNode],
    isValid: org.scalablytyped.runtime.StringDictionary[String] => Boolean,
    line: String,
    process: (org.scalablytyped.runtime.StringDictionary[String], ProcessingOptions) => String,
    additionalDefineKey: String = null,
    additionalDefineValue: String = null
  ): ShaderCodeConditionNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isValid = js.Any.fromFunction1(isValid), line = line.asInstanceOf[js.Any], process = js.Any.fromFunction2(process))
    if (additionalDefineKey != null) __obj.updateDynamic("additionalDefineKey")(additionalDefineKey.asInstanceOf[js.Any])
    if (additionalDefineValue != null) __obj.updateDynamic("additionalDefineValue")(additionalDefineValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShaderCodeConditionNode]
  }
}

