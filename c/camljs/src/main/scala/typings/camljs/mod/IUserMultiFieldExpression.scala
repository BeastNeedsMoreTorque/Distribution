package typings.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserMultiFieldExpression extends js.Object {
  /** DEPRECATED: "Eq" operation in CAML works exactly the same as "Includes". To avoid confusion, please use Includes. */
  def EqualTo(value: js.Any): IExpression
  /** DEPRECATED: use "IncludesSuchItemThat().ValueAsText().EqualTo(value)" instead. */
  def Includes(value: js.Any): IExpression
  /** Checks a condition against every item in the multi lookup value */
  def IncludesSuchItemThat(): IUserFieldExpression
  /** Checks whether the field values collection is not empty */
  def IsNotNull(): IExpression
  /** Checks whether the field values collection is empty */
  def IsNull(): IExpression
  /** DEPRECATED: "Neq" operation in CAML works exactly the same as "NotIncludes". To avoid confusion, please use NotIncludes. */
  def NotEqualTo(value: js.Any): IExpression
  /** DEPRECATED: use "IncludesSuchItemThat().ValueAsText().NotEqualTo(value)" instead. */
  def NotIncludes(value: js.Any): IExpression
}

object IUserMultiFieldExpression {
  @scala.inline
  def apply(
    EqualTo: js.Any => IExpression,
    Includes: js.Any => IExpression,
    IncludesSuchItemThat: () => IUserFieldExpression,
    IsNotNull: () => IExpression,
    IsNull: () => IExpression,
    NotEqualTo: js.Any => IExpression,
    NotIncludes: js.Any => IExpression
  ): IUserMultiFieldExpression = {
    val __obj = js.Dynamic.literal(EqualTo = js.Any.fromFunction1(EqualTo), Includes = js.Any.fromFunction1(Includes), IncludesSuchItemThat = js.Any.fromFunction0(IncludesSuchItemThat), IsNotNull = js.Any.fromFunction0(IsNotNull), IsNull = js.Any.fromFunction0(IsNull), NotEqualTo = js.Any.fromFunction1(NotEqualTo), NotIncludes = js.Any.fromFunction1(NotIncludes))
    __obj.asInstanceOf[IUserMultiFieldExpression]
  }
}

