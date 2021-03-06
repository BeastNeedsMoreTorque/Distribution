package typings.baseui.anon

import typings.react.mod.ReactNode
import typings.std.FlatArray
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Array<react.react.ReactNode>> */
trait ReadonlyArrayReactNode extends js.Object {
  val concat: js.Function1[/* repeated */ js.Array[ReactNode], js.Array[ReactNode]]
  val copyWithin: js.Function2[/* target */ Double, /* start */ Double, this.type]
  val entries: js.Function0[IterableIterator[js.Tuple2[Double, ReactNode]]]
  val every: js.Function1[
    /* callbackfn */ js.Function3[/* value */ ReactNode, /* index */ Double, /* array */ js.Array[ReactNode], _], 
    Boolean
  ]
  val fill: js.Function1[/* value */ ReactNode, this.type]
  val filter: js.Function1[
    /* callbackfn */ js.Function3[
      /* value */ ReactNode, 
      /* index */ Double, 
      /* array */ js.Array[ReactNode], 
      /* is react.react.ReactNode */ Boolean
    ], 
    js.Array[ReactNode]
  ]
  val find: js.Function1[
    /* predicate */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ ReactNode, 
      /* index */ Double, 
      /* obj */ js.Array[ReactNode], 
      /* is react.react.ReactNode */ Boolean
    ], 
    js.UndefOr[ReactNode]
  ]
  val findIndex: js.Function1[
    /* predicate */ js.Function3[/* value */ ReactNode, /* index */ Double, /* obj */ js.Array[ReactNode], _], 
    Double
  ]
  val flat: js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[_, typings.baseui.baseuiNumbers.`1`]]]
  val flatMap: js.Function1[
    /* callback */ js.ThisFunction3[
      /* this */ js.UndefOr[scala.Nothing], 
      /* value */ ReactNode, 
      /* index */ Double, 
      /* array */ js.Array[ReactNode], 
      _ | js.Array[_]
    ], 
    js.Array[_]
  ]
  val forEach: js.Function1[
    /* callbackfn */ js.Function3[/* value */ ReactNode, /* index */ Double, /* array */ js.Array[ReactNode], Unit], 
    Unit
  ]
  val includes: js.Function1[/* searchElement */ ReactNode, Boolean]
  val indexOf: js.Function1[/* searchElement */ ReactNode, Double]
  val join: js.Function0[String]
  val keys: js.Function0[IterableIterator[Double]]
  val lastIndexOf: js.Function1[/* searchElement */ ReactNode, Double]
  val length: Double
  val map: js.Function1[
    /* callbackfn */ js.Function3[/* value */ ReactNode, /* index */ Double, /* array */ js.Array[ReactNode], _], 
    js.Array[_]
  ]
  val pop: js.Function0[js.UndefOr[ReactNode]]
  val push: js.Function1[/* repeated */ ReactNode, Double]
  val reduce: js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ ReactNode, 
      /* currentValue */ ReactNode, 
      /* currentIndex */ Double, 
      /* array */ js.Array[ReactNode], 
      ReactNode
    ], 
    ReactNode
  ]
  val reduceRight: js.Function1[
    /* callbackfn */ js.Function4[
      /* previousValue */ ReactNode, 
      /* currentValue */ ReactNode, 
      /* currentIndex */ Double, 
      /* array */ js.Array[ReactNode], 
      ReactNode
    ], 
    ReactNode
  ]
  val reverse: js.Function0[js.Array[ReactNode]]
  val shift: js.Function0[js.UndefOr[ReactNode]]
  val slice: js.Function0[js.Array[ReactNode]]
  val some: js.Function1[
    /* callbackfn */ js.Function3[/* value */ ReactNode, /* index */ Double, /* array */ js.Array[ReactNode], _], 
    Boolean
  ]
  val sort: js.Function0[this.type]
  val splice: js.Function1[/* start */ Double, js.Array[ReactNode]]
  @JSName("toLocaleString")
  val toLocaleString_FReadonlyArrayReactNode: js.Function0[String]
  @JSName("toString")
  val toString_FReadonlyArrayReactNode: js.Function0[String]
  val unshift: js.Function1[/* repeated */ ReactNode, Double]
  val values: js.Function0[IterableIterator[ReactNode]]
}

object ReadonlyArrayReactNode {
  @scala.inline
  def apply(
    concat: /* repeated */ js.Array[ReactNode] => js.Array[ReactNode],
    copyWithin: (/* target */ Double, /* start */ Double) => ReadonlyArrayReactNode,
    entries: () => IterableIterator[js.Tuple2[Double, ReactNode]],
    every: /* callbackfn */ js.Function3[/* value */ ReactNode, /* index */ Double, /* array */ js.Array[ReactNode], _] => Boolean,
    fill: /* value */ ReactNode => ReadonlyArrayReactNode,
    filter: /* callbackfn */ js.Function3[
      /* value */ ReactNode, 
      /* index */ Double, 
      /* array */ js.Array[ReactNode], 
      /* is react.react.ReactNode */ Boolean
    ] => js.Array[ReactNode],
    find: /* predicate */ js.ThisFunction3[
      /* this */ Unit, 
      /* value */ ReactNode, 
      /* index */ Double, 
      /* obj */ js.Array[ReactNode], 
      /* is react.react.ReactNode */ Boolean
    ] => js.UndefOr[ReactNode],
    findIndex: /* predicate */ js.Function3[/* value */ ReactNode, /* index */ Double, /* obj */ js.Array[ReactNode], _] => Double,
    flat: js.ThisFunction0[/* this */ js.Any, js.Array[FlatArray[_, typings.baseui.baseuiNumbers.`1`]]],
    flatMap: /* callback */ js.ThisFunction3[
      /* this */ js.UndefOr[scala.Nothing], 
      /* value */ ReactNode, 
      /* index */ Double, 
      /* array */ js.Array[ReactNode], 
      _ | js.Array[_]
    ] => js.Array[_],
    forEach: /* callbackfn */ js.Function3[/* value */ ReactNode, /* index */ Double, /* array */ js.Array[ReactNode], Unit] => Unit,
    includes: /* searchElement */ ReactNode => Boolean,
    indexOf: /* searchElement */ ReactNode => Double,
    join: () => String,
    keys: () => IterableIterator[Double],
    lastIndexOf: /* searchElement */ ReactNode => Double,
    length: Double,
    map: /* callbackfn */ js.Function3[/* value */ ReactNode, /* index */ Double, /* array */ js.Array[ReactNode], _] => js.Array[_],
    pop: () => js.UndefOr[ReactNode],
    push: /* repeated */ ReactNode => Double,
    reduce: /* callbackfn */ js.Function4[
      /* previousValue */ ReactNode, 
      /* currentValue */ ReactNode, 
      /* currentIndex */ Double, 
      /* array */ js.Array[ReactNode], 
      ReactNode
    ] => ReactNode,
    reduceRight: /* callbackfn */ js.Function4[
      /* previousValue */ ReactNode, 
      /* currentValue */ ReactNode, 
      /* currentIndex */ Double, 
      /* array */ js.Array[ReactNode], 
      ReactNode
    ] => ReactNode,
    reverse: () => js.Array[ReactNode],
    shift: () => js.UndefOr[ReactNode],
    slice: () => js.Array[ReactNode],
    some: /* callbackfn */ js.Function3[/* value */ ReactNode, /* index */ Double, /* array */ js.Array[ReactNode], _] => Boolean,
    sort: () => ReadonlyArrayReactNode,
    splice: /* start */ Double => js.Array[ReactNode],
    toLocaleString: () => String,
    toString: () => String,
    unshift: /* repeated */ ReactNode => Double,
    values: () => IterableIterator[ReactNode]
  ): ReadonlyArrayReactNode = {
    val __obj = js.Dynamic.literal(concat = js.Any.fromFunction1(concat), copyWithin = js.Any.fromFunction2(copyWithin), entries = js.Any.fromFunction0(entries), every = js.Any.fromFunction1(every), fill = js.Any.fromFunction1(fill), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), findIndex = js.Any.fromFunction1(findIndex), flat = flat.asInstanceOf[js.Any], flatMap = js.Any.fromFunction1(flatMap), forEach = js.Any.fromFunction1(forEach), includes = js.Any.fromFunction1(includes), indexOf = js.Any.fromFunction1(indexOf), join = js.Any.fromFunction0(join), keys = js.Any.fromFunction0(keys), lastIndexOf = js.Any.fromFunction1(lastIndexOf), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), reduce = js.Any.fromFunction1(reduce), reduceRight = js.Any.fromFunction1(reduceRight), reverse = js.Any.fromFunction0(reverse), shift = js.Any.fromFunction0(shift), slice = js.Any.fromFunction0(slice), some = js.Any.fromFunction1(some), sort = js.Any.fromFunction0(sort), splice = js.Any.fromFunction1(splice), toLocaleString = js.Any.fromFunction0(toLocaleString), toString = js.Any.fromFunction0(toString), unshift = js.Any.fromFunction1(unshift), values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[ReadonlyArrayReactNode]
  }
}

