package typings.jsGraphAlgorithms.global.JsGraphs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsGraphs.ConnectedComponents")
@js.native
class ConnectedComponents protected ()
  extends typings.jsGraphAlgorithms.JsGraphs.ConnectedComponents {
  def this(G: typings.jsGraphAlgorithms.JsGraphs.Graph) = this()
  /* CompleteClass */
  override var count: js.Any = js.native
  /* CompleteClass */
  override var id: js.Any = js.native
  /* CompleteClass */
  override var marked: js.Any = js.native
  /* CompleteClass */
  override def componentCount(): Double = js.native
  /* CompleteClass */
  override def componentId(v: Double): Double = js.native
  /* CompleteClass */
  override def dfs(G: typings.jsGraphAlgorithms.JsGraphs.Graph, v: Double): Unit = js.native
}

