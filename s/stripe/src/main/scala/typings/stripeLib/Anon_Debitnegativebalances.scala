package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debitnegativebalances extends js.Object {
  /**
    * A Boolean indicating if Stripe should try to reclaim negative balances from
    * an attached bank account. See our Understanding Connect Account Balances
    * documentation for details. Default value is true for Express accounts and
    * false for Custom accounts.
    */
  var debit_negative_balances: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Details on when funds from charges are available, and when they are paid out
    * to an external account. See our Setting Bank and Debit Card Payouts
    * documentation for details.
    */
  var schedule: js.UndefOr[Anon_Daily] = js.undefined
  /**
    * The text that appears on the bank account statement for payouts. If not set,
    * this defaults to the platform’s bank descriptor as set in the Dashboard.
    */
  var statement_descriptor: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Debitnegativebalances {
  @scala.inline
  def apply(
    debit_negative_balances: js.UndefOr[scala.Boolean] = js.undefined,
    schedule: Anon_Daily = null,
    statement_descriptor: java.lang.String = null
  ): Anon_Debitnegativebalances = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debit_negative_balances)) __obj.updateDynamic("debit_negative_balances")(debit_negative_balances)
    if (schedule != null) __obj.updateDynamic("schedule")(schedule)
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    __obj.asInstanceOf[Anon_Debitnegativebalances]
  }
}

