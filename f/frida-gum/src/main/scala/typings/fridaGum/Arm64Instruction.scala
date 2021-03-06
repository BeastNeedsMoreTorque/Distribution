package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arm64Instruction extends Instruction {
  /**
    * Array of objects describing each operand.
    */
  var operands: js.Array[Arm64Operand]
  /**
    * Registers implicitly read by this instruction.
    */
  var regsRead: js.Array[Arm64Register]
  /**
    * Registers implicitly written to by this instruction.
    */
  var regsWritten: js.Array[Arm64Register]
}

object Arm64Instruction {
  @scala.inline
  def apply(
    address: NativePointer,
    groups: js.Array[String],
    mnemonic: String,
    next: NativePointer,
    opStr: String,
    operands: js.Array[Arm64Operand],
    regsRead: js.Array[Arm64Register],
    regsWritten: js.Array[Arm64Register],
    size: Double
  ): Arm64Instruction = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], mnemonic = mnemonic.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], opStr = opStr.asInstanceOf[js.Any], operands = operands.asInstanceOf[js.Any], regsRead = regsRead.asInstanceOf[js.Any], regsWritten = regsWritten.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arm64Instruction]
  }
}

