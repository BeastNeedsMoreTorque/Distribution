package typings.aureliaDependencyInjection.mod

import typings.aureliaDependencyInjection.anon.Inject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-dependency-injection", "lazy")
@js.native
object `lazy` extends js.Object {
  def apply[TBase, TImpl /* <: Impl[TBase] */, TArgs /* <: Args[TBase] */](keyValue: js.Any): js.Function3[
    /* target */ (DependencyCtor[TBase, TImpl, TArgs]) with (Inject[TArgs, TBase]), 
    /* _key */ js.Any, 
    /* index */ Double, 
    Unit
  ] = js.native
}

