package typings.devexpressAspnetcoreBootstrap.global.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DevExpress.AspNetCore.BootstrapCardViewBatchEditApi")
@js.native
class BootstrapCardViewBatchEditApi protected ()
  extends typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore.BootstrapCardViewBatchEditApi {
  protected def this(instance: js.Any) = this()
  /* CompleteClass */
  override val instance: js.Any = js.native
  /* CompleteClass */
  override def addNewCard(): Unit = js.native
  /* CompleteClass */
  override def deleteCard(visibleIndex: Double): Unit = js.native
  /* CompleteClass */
  override def deleteCardByKey(key: js.Any): Unit = js.native
  /* CompleteClass */
  override def getCardVisibleIndices(includeDeleted: Boolean): js.Array[Double] = js.native
  /* CompleteClass */
  override def getDeletedCardIndices(): js.Array[Double] = js.native
  /* CompleteClass */
  override def getInsertedCardIndices(): js.Array[Double] = js.native
  /* CompleteClass */
  override def isDeletedCard(visibleIndex: Double): Boolean = js.native
  /* CompleteClass */
  override def isNewCard(visibleIndex: Double): Boolean = js.native
  /* CompleteClass */
  override def recoverCard(visibleIndex: Double): Unit = js.native
  /* CompleteClass */
  override def recoverCardByKey(key: js.Any): Unit = js.native
  /* CompleteClass */
  override def validateCard(visibleIndex: Double): Boolean = js.native
  /* CompleteClass */
  override def validateCards(validateOnlyModified: Boolean): Boolean = js.native
}

