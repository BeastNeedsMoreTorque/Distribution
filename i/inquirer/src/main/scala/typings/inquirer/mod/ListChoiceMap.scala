package typings.inquirer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides all valid choice-types for the `ListQuestion`.
  *
  * @template T
  * The type of the answers.
  */
trait ListChoiceMap[T /* <: Answers */] extends BaseChoiceMap[T] {
  var ListChoiceOptions: typings.inquirer.mod.ListChoiceOptions[T]
}

object ListChoiceMap {
  @scala.inline
  def apply[/* <: typings.inquirer.mod.Answers */ T](
    Choice: typings.inquirer.choiceMod.^[T],
    ChoiceOptions: ChoiceOptions[T],
    ListChoiceOptions: ListChoiceOptions[T],
    Separator: typings.inquirer.separatorMod.^,
    SeparatorOptions: SeparatorOptions
  ): ListChoiceMap[T] = {
    val __obj = js.Dynamic.literal(Choice = Choice.asInstanceOf[js.Any], ChoiceOptions = ChoiceOptions.asInstanceOf[js.Any], ListChoiceOptions = ListChoiceOptions.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any], SeparatorOptions = SeparatorOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChoiceMap[T]]
  }
}

