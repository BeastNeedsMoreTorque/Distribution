package typings.flowjs.mod

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFlowFile extends js.Object {
  var averageSpeed: Double
  var chunks: js.Array[_]
  var currentSpeed: Double
  var error: Boolean
  var file: File
  var flowObj: IFlow
  var name: String
  var paused: Boolean
  var relativePath: String
  var size: Double
  var uniqueIdentifier: String
  def bootstrap(): Unit
  def cancel(): Unit
  def getExtension(): String
  def getType(): String
  def isComplete(): Boolean
  def isUploading(): Boolean
  def pause(): Unit
  def progress(relative: Boolean): Double
  def resume(): Unit
  def retry(): Unit
  def sizeUploaded(): Double
  def timeRemaining(): Double
}

object IFlowFile {
  @scala.inline
  def apply(
    averageSpeed: Double,
    bootstrap: () => Unit,
    cancel: () => Unit,
    chunks: js.Array[_],
    currentSpeed: Double,
    error: Boolean,
    file: File,
    flowObj: IFlow,
    getExtension: () => String,
    getType: () => String,
    isComplete: () => Boolean,
    isUploading: () => Boolean,
    name: String,
    pause: () => Unit,
    paused: Boolean,
    progress: Boolean => Double,
    relativePath: String,
    resume: () => Unit,
    retry: () => Unit,
    size: Double,
    sizeUploaded: () => Double,
    timeRemaining: () => Double,
    uniqueIdentifier: String
  ): IFlowFile = {
    val __obj = js.Dynamic.literal(averageSpeed = averageSpeed.asInstanceOf[js.Any], bootstrap = js.Any.fromFunction0(bootstrap), cancel = js.Any.fromFunction0(cancel), chunks = chunks.asInstanceOf[js.Any], currentSpeed = currentSpeed.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], flowObj = flowObj.asInstanceOf[js.Any], getExtension = js.Any.fromFunction0(getExtension), getType = js.Any.fromFunction0(getType), isComplete = js.Any.fromFunction0(isComplete), isUploading = js.Any.fromFunction0(isUploading), name = name.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), paused = paused.asInstanceOf[js.Any], progress = js.Any.fromFunction1(progress), relativePath = relativePath.asInstanceOf[js.Any], resume = js.Any.fromFunction0(resume), retry = js.Any.fromFunction0(retry), size = size.asInstanceOf[js.Any], sizeUploaded = js.Any.fromFunction0(sizeUploaded), timeRemaining = js.Any.fromFunction0(timeRemaining), uniqueIdentifier = uniqueIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFlowFile]
  }
}

