package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.ProcessingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ShaderCodeTestNode")
@js.native
class ShaderCodeTestNode ()
  extends typings.babylonjs.BABYLON.ShaderCodeTestNode {
  /* CompleteClass */
  override var children: js.Array[typings.babylonjs.BABYLON.ShaderCodeNode] = js.native
  /* CompleteClass */
  override var line: String = js.native
  /* CompleteClass */
  override var testExpression: typings.babylonjs.BABYLON.ShaderDefineExpression = js.native
  /* CompleteClass */
  override def isValid(preprocessors: org.scalablytyped.runtime.StringDictionary[String]): Boolean = js.native
  /* CompleteClass */
  override def process(preprocessors: org.scalablytyped.runtime.StringDictionary[String], options: ProcessingOptions): String = js.native
}

