package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/operators/last", JSImport.Namespace)
@js.native
object operatorsLastMod extends js.Object {
  def last[T, D](): js.Any = js.native
  def last[T, S /* <: T */](
    predicate: js.Function3[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
      /* is S */ Boolean
    ]
  ): js.Any = js.native
  def last[T, S /* <: T */](
    predicate: js.Function3[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
      /* is S */ Boolean
    ],
    defaultValue: S
  ): js.Any = js.native
  def last[T, D](predicate: Null, defaultValue: D): js.Any = js.native
  @JSName("last")
  def last_TD[T, D](
    predicate: js.Function3[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
      Boolean
    ]
  ): js.Any = js.native
  @JSName("last")
  def last_TD[T, D](
    predicate: js.Function3[
      /* value */ T, 
      /* index */ Double, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<T> */ /* source */ js.Any, 
      Boolean
    ],
    defaultValue: D
  ): js.Any = js.native
}

