package typings.systemTask.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemTask extends js.Object {
  var `type`: String = js.native
  def cleanupHandler(task: SystemTask, cleanupItems: js.Array[_]): js.Promise[_] = js.native
  def insertPreprocessItemsHandler(task: SystemTask): js.Promise[_] = js.native
  def isValidProcess(): Unit = js.native
  def log(`type`: String, message: String): Unit = js.native
  def log(`type`: String, message: String, detail: js.Any): Unit = js.native
  def preprocessHandler(task: SystemTask, preProcessItem: js.Any): js.Promise[_] = js.native
  def processHandler(task: SystemTask, processItem: js.Any): js.Promise[_] = js.native
  def start(): Unit = js.native
}

