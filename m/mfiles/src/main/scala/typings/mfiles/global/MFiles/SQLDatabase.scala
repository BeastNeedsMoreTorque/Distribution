package typings.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IImpersonation
import typings.mfiles.ISQLDatabase
import typings.mfiles.MFiles.MFDBEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.SQLDatabase")
@js.native
class SQLDatabase () extends ISQLDatabase {
  /* CompleteClass */
  override var AdminUser: IImpersonation = js.native
  /* CompleteClass */
  override var BasicUser: IImpersonation = js.native
  /* CompleteClass */
  override var Engine: MFDBEngine = js.native
  /* CompleteClass */
  override var Name: String = js.native
  /* CompleteClass */
  override var Server: String = js.native
  /* CompleteClass */
  override def Clone(): ISQLDatabase = js.native
}

@JSGlobal("MFiles.SQLDatabase")
@js.native
object SQLDatabase extends Instantiable0[ISQLDatabase]

