package typings.fastCsvParse

import typings.fastCsvParse.typesMod.Row
import typings.fastCsvParse.typesMod.RowTransformFunction
import typings.fastCsvParse.typesMod.RowValidate
import typings.fastCsvParse.typesMod.RowValidatorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fast-csv/parse/build/src/transforms/RowTransformerValidator", JSImport.Namespace)
@js.native
object rowTransformerValidatorMod extends js.Object {
  @js.native
  class RowTransformerValidator[I /* <: Row[_] */, O /* <: Row[_] */] () extends js.Object {
    var _rowTransform: js.Any = js.native
    var _rowValidator: js.Any = js.native
    var callTransformer: js.Any = js.native
    var callValidator: js.Any = js.native
    def rowTransform(transformFunction: RowTransformFunction[I, O]): js.Any = js.native
    def rowValidator(validateFunction: RowValidate[O]): js.Any = js.native
    def transformAndValidate(row: I, cb: RowValidatorCallback[O]): Unit = js.native
  }
  
  /* static members */
  @js.native
  object RowTransformerValidator extends js.Object {
    var createTransform: js.Any = js.native
    var createValidator: js.Any = js.native
  }
  
}

