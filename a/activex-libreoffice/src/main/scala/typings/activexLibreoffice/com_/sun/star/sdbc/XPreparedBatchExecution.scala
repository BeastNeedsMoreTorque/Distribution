package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used for batch execution on PreparedStatements.
  *
  * A {@link com.sun.star.sdbc.PreparedStatement} uses one precompiled SQL {@link Statement} . In batch execution it is possible to set collection of
  * parameter settings, which are executed in one batch job.
  */
trait XPreparedBatchExecution extends XInterface {
  /**
    * adds a set of parameters to the batch.
    * @throws SQLException if a database access error occurs.
    */
  def addBatch(): Unit
  /**
    * makes the set of commands in the current batch empty.
    * @throws SQLException if a database access error occurs.
    */
  def clearBatch(): Unit
  /**
    * submits a batch of commands to the database for execution.
    * @returns an array of update counts containing one element for each command in the batch. The array is ordered according to the order in which commands wer
    * @throws SQLException if a database access error occurs.
    */
  def executeBatch(): SafeArray[Double]
}

object XPreparedBatchExecution {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addBatch: () => Unit,
    clearBatch: () => Unit,
    executeBatch: () => SafeArray[Double],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPreparedBatchExecution = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addBatch = js.Any.fromFunction0(addBatch), clearBatch = js.Any.fromFunction0(clearBatch), executeBatch = js.Any.fromFunction0(executeBatch), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPreparedBatchExecution]
  }
}

