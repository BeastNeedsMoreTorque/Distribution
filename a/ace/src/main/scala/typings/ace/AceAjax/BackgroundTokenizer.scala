package typings.ace.AceAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundTokenizer extends js.Object {
  var states: js.Array[_]
  /**
    * Emits the `'update'` event. `firstRow` and `lastRow` are used to define the boundaries of the region to be updated.
    * @param firstRow The starting row region
    * @param lastRow The final row region
    **/
  def fireUpdateEvent(firstRow: Double, lastRow: Double): Unit
  /**
    * [Returns the state of tokenization at the end of a row.]{: #BackgroundTokenizer.getState}
    * @param row The row to get state at
    **/
  def getState(row: Double): String
  /**
    * Gives list of tokens of the row. (tokens are cached)
    * @param row The row to get tokens at
    **/
  def getTokens(row: Double): js.Array[TokenInfo]
  /**
    * Sets a new document to associate with this object.
    * @param doc The new document to associate with
    **/
  def setDocument(doc: Document): Unit
  /**
    * Sets a new tokenizer for this object.
    * @param tokenizer The new tokenizer to use
    **/
  def setTokenizer(tokenizer: Tokenizer): Unit
  /**
    * Starts tokenizing at the row indicated.
    * @param startRow The row to start at
    **/
  def start(startRow: Double): Unit
  /**
    * Stops tokenizing.
    **/
  def stop(): Unit
}

object BackgroundTokenizer {
  @scala.inline
  def apply(
    fireUpdateEvent: (Double, Double) => Unit,
    getState: Double => String,
    getTokens: Double => js.Array[TokenInfo],
    setDocument: Document => Unit,
    setTokenizer: Tokenizer => Unit,
    start: Double => Unit,
    states: js.Array[_],
    stop: () => Unit
  ): BackgroundTokenizer = {
    val __obj = js.Dynamic.literal(fireUpdateEvent = js.Any.fromFunction2(fireUpdateEvent), getState = js.Any.fromFunction1(getState), getTokens = js.Any.fromFunction1(getTokens), setDocument = js.Any.fromFunction1(setDocument), setTokenizer = js.Any.fromFunction1(setTokenizer), start = js.Any.fromFunction1(start), states = states.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[BackgroundTokenizer]
  }
}

