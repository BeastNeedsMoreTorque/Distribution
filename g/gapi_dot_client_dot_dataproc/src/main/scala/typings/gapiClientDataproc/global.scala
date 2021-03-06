package typings.gapiClientDataproc

import typings.gapiClientDataproc.gapi.client.dataproc.ProjectsResource
import typings.gapiClientDataproc.gapiClientDataprocStrings.dataproc
import typings.gapiClientDataproc.gapiClientDataprocStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val projects: ProjectsResource = js.native
      /** Load Google Cloud Dataproc API v1 */
      def load(name: dataproc, version: v1): js.Thenable[Unit] = js.native
      def load(name: dataproc, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

