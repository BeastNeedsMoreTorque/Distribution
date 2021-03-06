package typings.mssql.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mssql", "Transaction")
@js.native
class Transaction () extends EventEmitter {
  def this(connection: ConnectionPool) = this()
  var isolationLevel: IIsolationLevel = js.native
  /**
    * Begin a transaction.
    * @param [isolationLevel] - Controls the locking and row versioning behavior of TSQL statements issued by a connection.
    * @param [callback] A callback which is called after transaction has began, or an error has occurred. If omited, method returns Promise.
    */
  def begin(): js.Promise[Transaction] = js.native
  def begin(isolationLevel: IIsolationLevel): js.Promise[Transaction] = js.native
  def begin(
    isolationLevel: IIsolationLevel,
    callback: js.Function1[/* err */ js.UndefOr[ConnectionError | TransactionError], Unit]
  ): Transaction = js.native
  @JSName("begin")
  def begin_Transaction(): Transaction = js.native
  @JSName("begin")
  def begin_Transaction(isolationLevel: IIsolationLevel): Transaction = js.native
  def commit(): js.Promise[Unit] = js.native
  def commit(callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def request(): Request = js.native
  def rollback(): js.Promise[Unit] = js.native
  def rollback(callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
}

