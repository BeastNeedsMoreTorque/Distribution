package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Strings extends js.Object {
  /**
    * If set to false any calls to eval or function constructors (Function, GeneratorFunction, etc)
    * will throw an EvalError.
    * @default true
    */
  var strings: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to false any attempt to compile a WebAssembly module will throw a WebAssembly.CompileError.
    * @default true
    */
  var wasm: js.UndefOr[Boolean] = js.undefined
}

object Strings {
  @scala.inline
  def apply(strings: js.UndefOr[Boolean] = js.undefined, wasm: js.UndefOr[Boolean] = js.undefined): Strings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(strings)) __obj.updateDynamic("strings")(strings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wasm)) __obj.updateDynamic("wasm")(wasm.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Strings]
  }
}

