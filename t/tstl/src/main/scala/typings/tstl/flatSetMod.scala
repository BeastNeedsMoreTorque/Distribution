package typings.tstl

import org.scalablytyped.runtime.Instantiable0
import typings.tstl.comparatorMod.Comparator
import typings.tstl.flatSetMod.FlatSet.Iterator
import typings.tstl.flatSetMod.FlatSet.ReverseIterator
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.itreesetMod.ITreeSet
import typings.tstl.tstlBooleans.`true`
import typings.tstl.uniqueTreeSetMod.UniqueTreeSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental/container/FlatSet", JSImport.Namespace)
@js.native
object flatSetMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    *
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  class FlatSet[Key] () extends UniqueTreeSet[Key, FlatSet[Key], Iterator[Key], ReverseIterator[Key]] {
    def this(comp: Comparator[Key, Key]) = this()
    /**
      * Initializer Constructor.
      *
      * @param items Items to assign.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(items: js.Array[Key]) = this()
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: FlatSet[Key]) = this()
    /**
      * Range Constructor.
      *
      * @param first Input iterator of the first position.
      * @param last Input iterator of the last position.
      * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
      */
    def this(
      first: IForwardIterator[Key, IForwardIterator[Key, _]],
      last: IForwardIterator[Key, IForwardIterator[Key, _]]
    ) = this()
    def this(items: js.Array[Key], comp: Comparator[Key, Key]) = this()
    def this(
      first: IForwardIterator[Key, IForwardIterator[Key, _]],
      last: IForwardIterator[Key, IForwardIterator[Key, _]],
      comp: Comparator[Key, Key]
    ) = this()
    var key_comp_ : js.Any = js.native
    /* protected */ def _Handle_erase(has0: js.Object, has1: js.Object): Unit = js.native
    /* protected */ def _Handle_insert(has0: js.Object, has1: js.Object): Unit = js.native
    /**
      * @inheritDoc
      */
    def nth(index: Double): Iterator[Key] = js.native
  }
  
  @js.native
  object FlatSet extends js.Object {
    val Iterator: Instantiable0[
        typings.tstl.setElementVectorMod.SetElementVector.Iterator[
          js.Object, 
          Boolean, 
          ITreeSet[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
            typings.tstl.setElementVectorMod.SetElementVector.Iterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ], 
            typings.tstl.setElementVectorMod.SetElementVector.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val ReverseIterator: Instantiable0[
        typings.tstl.setElementVectorMod.SetElementVector.ReverseIterator[
          js.Object, 
          Boolean, 
          ITreeSet[
            /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
            /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any, 
            typings.tstl.setElementVectorMod.SetElementVector.Iterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ], 
            typings.tstl.setElementVectorMod.SetElementVector.ReverseIterator[
              /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Unique */ js.Any, 
              /* import warning: RewrittenClass.unapply cls was tparam Source */ js.Any
            ]
          ]
        ]
      ] = js.native
    val __MODULE: /* "experimental" */ String = js.native
    type Iterator[Key] = typings.tstl.setElementVectorMod.SetElementVector.Iterator[Key, `true`, FlatSet[Key]]
    type ReverseIterator[Key] = typings.tstl.setElementVectorMod.SetElementVector.ReverseIterator[Key, `true`, FlatSet[Key]]
  }
  
}

