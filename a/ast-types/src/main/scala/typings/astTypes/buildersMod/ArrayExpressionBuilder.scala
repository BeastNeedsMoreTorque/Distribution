package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsElements
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.RestElementKind
import typings.astTypes.kindsMod.SpreadElementKind
import typings.astTypes.namedTypesMod.namedTypes.ArrayExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayExpressionBuilder extends js.Object {
  def apply(elements: js.Array[ExpressionKind | SpreadElementKind | RestElementKind | Null]): ArrayExpression = js.native
  def from(params: AnonCommentsElements): ArrayExpression = js.native
}

