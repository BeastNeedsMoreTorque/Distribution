package typings.stylus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlockColumn extends js.Object {
  var __type: String
  var block: typings.stylus.mod.Stylus.Nodes.Block
  var column: Double
  var filename: String
  var lineno: Double
}

object BlockColumn {
  @scala.inline
  def apply(
    __type: String,
    block: typings.stylus.mod.Stylus.Nodes.Block,
    column: Double,
    filename: String,
    lineno: Double
  ): BlockColumn = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockColumn]
  }
}

