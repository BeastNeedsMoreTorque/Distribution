package typings.ejWebAll.global.ej

import typings.ejWebAll.ej.Changes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.TableModel")
@js.native
class TableModel protected ()
  extends typings.ejWebAll.ej.TableModel {
  def this(
    name: String,
    jsonArray: js.Array[_],
    dataManager: typings.ejWebAll.ej.DataManager,
    modelComputed: js.Any
  ) = this()
  /* CompleteClass */
  override def bindTo(element: js.Any): Unit = js.native
  /* CompleteClass */
  override def get(index: Double): Unit = js.native
  /* CompleteClass */
  override def getChanges(): Changes = js.native
  /* CompleteClass */
  override def insert(json: js.Any): Unit = js.native
  /* CompleteClass */
  override def isDirty(): Boolean = js.native
  /* CompleteClass */
  override def length(): Double = js.native
  /* CompleteClass */
  override def off(eventName: String, handler: js.Any): Unit = js.native
  /* CompleteClass */
  override def on(eventName: String, handler: js.Any): Unit = js.native
  /* CompleteClass */
  override def rejectChanges(): Unit = js.native
  /* CompleteClass */
  override def remove(key: String): Unit = js.native
  /* CompleteClass */
  override def saveChanges(): Unit = js.native
  /* CompleteClass */
  override def setDataManager(dataManager: typings.ejWebAll.ej.DataManager): Unit = js.native
  /* CompleteClass */
  override def setDirty(dirty: js.Any, model: js.Any): Unit = js.native
  /* CompleteClass */
  override def toArray(): js.Array[_] = js.native
  /* CompleteClass */
  override def update(value: js.Any): Unit = js.native
}

