package typings.winrtUwp.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the messages stored on an SMS Device and information about the message store. */
trait SmsDeviceMessageStore extends js.Object {
  /** Indicates the maximum number of messages that can be stored in the device store. The client can use this value to determine how to maintain enough space in the device store to receive new messages from the network. */
  var maxMessages: Double
  /**
    * Deletes the message with the specified ID. Because the device might be busy, the operation executes asynchronously. The asynchronous operation object returns immediately.
    * @param messageId Integer ID of the message to delete, which was previously read from an SmsTextMessage object obtained from the device message store.
    * @return A new message operation object that is used to start and track the asynchronous operation.
    */
  def deleteMessageAsync(messageId: Double): IPromiseWithIAsyncAction
  /**
    * Deletes the messages to which the filter applies. The filter can be used to delete all messages, or only messages that are read, unread, sent, or in a draft state. Because the operation might not be instantaneous, it executes asynchronously. The asynchronous operation object returns immediately.
    * @param messageFilter A search filter that specifies which messages to delete.
    * @return A new message operation object that is used to start and track the asynchronous operation.
    */
  def deleteMessagesAsync(messageFilter: SmsMessageFilter): IPromiseWithIAsyncAction
  /**
    * Retrieves the message with the specified ID. The device might be busy, so the method executes asynchronously. The asynchronous operation object returns immediately.
    * @param messageId ID of the message to retrieve.
    * @return Returns a new message operation object that is used to start and track the asynchronous operation.
    */
  def getMessageAsync(messageId: Double): IPromiseWithIAsyncOperation[ISmsMessage]
  /**
    * Retrieves a list of messages that match the conditions specified in a filter. The messages can be filtered as read, unread, sent, or in the draft state.
    * @param messageFilter ID of the message to retrieve.
    * @return Returns a new message operation object that is used to start and track the asynchronous operation.
    */
  def getMessagesAsync(messageFilter: SmsMessageFilter): IPromiseWithIAsyncOperationWithProgress[IVectorView[_], Double]
}

object SmsDeviceMessageStore {
  @scala.inline
  def apply(
    deleteMessageAsync: Double => IPromiseWithIAsyncAction,
    deleteMessagesAsync: SmsMessageFilter => IPromiseWithIAsyncAction,
    getMessageAsync: Double => IPromiseWithIAsyncOperation[ISmsMessage],
    getMessagesAsync: SmsMessageFilter => IPromiseWithIAsyncOperationWithProgress[IVectorView[_], Double],
    maxMessages: Double
  ): SmsDeviceMessageStore = {
    val __obj = js.Dynamic.literal(deleteMessageAsync = js.Any.fromFunction1(deleteMessageAsync), deleteMessagesAsync = js.Any.fromFunction1(deleteMessagesAsync), getMessageAsync = js.Any.fromFunction1(getMessageAsync), getMessagesAsync = js.Any.fromFunction1(getMessagesAsync), maxMessages = maxMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsDeviceMessageStore]
  }
}

