package typings.jsGraphAlgorithms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-graph-algorithms", "BreadthFirstSearch")
@js.native
class BreadthFirstSearch protected ()
  extends typings.jsGraphAlgorithms.JsGraphs.BreadthFirstSearch {
  def this(G: typings.jsGraphAlgorithms.JsGraphs.Graph, s: Double) = this()
  /* CompleteClass */
  override var V: js.Any = js.native
  /* CompleteClass */
  override var edgeTo: js.Any = js.native
  /* CompleteClass */
  override var marked: js.Any = js.native
  /* CompleteClass */
  override var s: js.Any = js.native
  /* CompleteClass */
  override def hasPathTo(v: Double): Boolean = js.native
  /* CompleteClass */
  override def pathTo(v: Double): js.Array[Double] = js.native
}

