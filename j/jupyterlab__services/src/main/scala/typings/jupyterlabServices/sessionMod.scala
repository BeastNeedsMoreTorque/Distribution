package typings.jupyterlabServices

import typings.jupyterlabServices.anon.PickIModelidDeepPartialOm
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.sessionManagerMod.SessionManager.IOptions
import typings.jupyterlabServices.sessionSessionMod.IModel
import typings.jupyterlabServices.sessionSessionMod.ISessionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/session", JSImport.Namespace)
@js.native
object sessionMod extends js.Object {
  @js.native
  class SessionManager protected ()
    extends typings.jupyterlabServices.sessionManagerMod.SessionManager {
    /**
      * Construct a new session manager.
      *
      * @param options - The default options for each session.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  object SessionAPI extends js.Object {
    val SESSION_SERVICE_URL: /* "api/sessions" */ String = js.native
    def getSessionModel(id: String): js.Promise[IModel] = js.native
    def getSessionModel(id: String, settings: ISettings): js.Promise[IModel] = js.native
    def getSessionUrl(baseUrl: String, id: String): String = js.native
    def listRunning(): js.Promise[js.Array[IModel]] = js.native
    def listRunning(settings: ISettings): js.Promise[js.Array[IModel]] = js.native
    def shutdownSession(id: String): js.Promise[Unit] = js.native
    def shutdownSession(id: String, settings: ISettings): js.Promise[Unit] = js.native
    def startSession(options: ISessionOptions): js.Promise[IModel] = js.native
    def startSession(options: ISessionOptions, settings: ISettings): js.Promise[IModel] = js.native
    def updateSession(model: PickIModelidDeepPartialOm): js.Promise[IModel] = js.native
    def updateSession(model: PickIModelidDeepPartialOm, settings: ISettings): js.Promise[IModel] = js.native
  }
  
}

