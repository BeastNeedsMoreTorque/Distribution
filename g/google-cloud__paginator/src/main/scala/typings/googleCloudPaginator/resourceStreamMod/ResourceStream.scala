package typings.googleCloudPaginator.resourceStreamMod

import typings.googleCloudPaginator.googleCloudPaginatorStrings.data
import typings.googleCloudPaginator.mod.ParsedArguments
import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/paginator/build/src/resource-stream", "ResourceStream")
@js.native
class ResourceStream[T] protected ()
  extends Transform
     with ResourceEvents[T] {
  def this(args: ParsedArguments, requestFn: js.Function) = this()
  var _ended: Boolean = js.native
  var _maxApiCalls: Double = js.native
  var _nextQuery: js.Object | Null = js.native
  var _reading: Boolean = js.native
  var _requestFn: js.Function = js.native
  var _requestsMade: Double = js.native
  var _resultsToSend: Double = js.native
  def _read(): Unit = js.native
  /* CompleteClass */
  @JSName("addListener")
  override def addListener_data(event: data, listener: js.Function1[T, Unit]): this.type = js.native
  /* CompleteClass */
  @JSName("emit")
  override def emit_data(event: data, data: T): Boolean = js.native
  def end(args: js.Any*): Unit = js.native
  /* CompleteClass */
  @JSName("on")
  override def on_data(event: data, listener: js.Function1[T, Unit]): this.type = js.native
  /* CompleteClass */
  @JSName("once")
  override def once_data(event: data, listener: js.Function1[T, Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T): T = js.native
  /* InferMemberOverrides */
  override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  /* CompleteClass */
  @JSName("prependListener")
  override def prependListener_data(event: data, listener: js.Function1[T, Unit]): this.type = js.native
  /* CompleteClass */
  @JSName("prependOnceListener")
  override def prependOnceListener_data(event: data, listener: js.Function1[T, Unit]): this.type = js.native
  /* CompleteClass */
  @JSName("removeListener")
  override def removeListener_data(event: data, listener: js.Function1[T, Unit]): this.type = js.native
}

