package typings.ethersprojectTransactions.mod

import typings.ethersprojectBytes.mod.BytesLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ethersproject/transactions", "parse")
@js.native
object parse extends js.Object {
  def apply(rawTransaction: BytesLike): Transaction = js.native
}

