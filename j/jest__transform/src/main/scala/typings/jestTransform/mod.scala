package typings.jestTransform

import typings.jestTransform.jestTransformStrings.ObjectDotLessthansignanonymousGreaterthansign
import typings.jestTransform.scriptTransformerMod.default
import typings.jestTransform.typesMod.ShouldInstrumentOptions
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/transform/build", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ScriptTransformer protected () extends default {
    def this(config: ProjectConfig) = this()
  }
  
  def shouldInstrument(filename: Path, options: ShouldInstrumentOptions, config: ProjectConfig): Boolean = js.native
  /* static members */
  @js.native
  object ScriptTransformer extends js.Object {
    var EVAL_RESULT_VARIABLE: ObjectDotLessthansignanonymousGreaterthansign = js.native
  }
  
}

