package typings.jsGraphAlgorithms.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexMinPQ[T] extends js.Object {
  var N: js.Any
  var compare: js.Any
  var keys: js.Any
  var pq: js.Any
  var qp: js.Any
  def containsIndex(index: Double): Boolean
  def decreaseKey(index: Double, key: T): Unit
  def delMin(): Double
  def insert(index: Double, key: T): Unit
  def isEmpty(): Boolean
  def min(): Double
  def minKey(): T | Null
  def sink(k: Double): Unit
  def size(): Double
  def swim(k: Double): Unit
}

object IndexMinPQ {
  @scala.inline
  def apply[T](
    N: js.Any,
    compare: js.Any,
    containsIndex: Double => Boolean,
    decreaseKey: (Double, T) => Unit,
    delMin: () => Double,
    insert: (Double, T) => Unit,
    isEmpty: () => Boolean,
    keys: js.Any,
    min: () => Double,
    minKey: () => T | Null,
    pq: js.Any,
    qp: js.Any,
    sink: Double => Unit,
    size: () => Double,
    swim: Double => Unit
  ): IndexMinPQ[T] = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], compare = compare.asInstanceOf[js.Any], containsIndex = js.Any.fromFunction1(containsIndex), decreaseKey = js.Any.fromFunction2(decreaseKey), delMin = js.Any.fromFunction0(delMin), insert = js.Any.fromFunction2(insert), isEmpty = js.Any.fromFunction0(isEmpty), keys = keys.asInstanceOf[js.Any], min = js.Any.fromFunction0(min), minKey = js.Any.fromFunction0(minKey), pq = pq.asInstanceOf[js.Any], qp = qp.asInstanceOf[js.Any], sink = js.Any.fromFunction1(sink), size = js.Any.fromFunction0(size), swim = js.Any.fromFunction1(swim))
    __obj.asInstanceOf[IndexMinPQ[T]]
  }
}

