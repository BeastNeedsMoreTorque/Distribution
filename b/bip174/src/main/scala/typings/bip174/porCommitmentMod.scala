package typings.bip174

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.PorCommitment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bip174/src/lib/converter/input/porCommitment", JSImport.Namespace)
@js.native
object porCommitmentMod extends js.Object {
  val expected: /* "string" */ String = js.native
  def canAdd(currentData: js.Any, newData: js.Any): Boolean = js.native
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.PorCommitment */ Boolean = js.native
  def decode(keyVal: KeyValue): PorCommitment = js.native
  def encode(data: PorCommitment): KeyValue = js.native
}

