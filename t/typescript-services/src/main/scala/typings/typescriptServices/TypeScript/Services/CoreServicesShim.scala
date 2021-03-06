package typings.typescriptServices.TypeScript.Services

import typings.typescriptServices.TypeScript.ILogger
import typings.typescriptServices.TypeScript.IScriptSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoreServicesShim extends ShimBase {
  var host: ICoreServicesHost
  var logger: ILogger
  var services: CoreServices
  def dumpMemory(dummy: js.Any): String
  /* private */ def forwardJSONCall(actionDescription: js.Any, action: js.Any): js.Any
  def getDefaultCompilationSettings(): String
  def getMemoryInfo(dummy: js.Any): String
  def getPreProcessedFileInfo(fileName: String, sourceText: IScriptSnapshot): String
}

object CoreServicesShim {
  @scala.inline
  def apply(
    dispose: js.Any => Unit,
    dumpMemory: js.Any => String,
    factory: js.Any,
    forwardJSONCall: (js.Any, js.Any) => js.Any,
    getDefaultCompilationSettings: () => String,
    getMemoryInfo: js.Any => String,
    getPreProcessedFileInfo: (String, IScriptSnapshot) => String,
    host: ICoreServicesHost,
    logger: ILogger,
    services: CoreServices
  ): CoreServicesShim = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction1(dispose), dumpMemory = js.Any.fromFunction1(dumpMemory), factory = factory.asInstanceOf[js.Any], forwardJSONCall = js.Any.fromFunction2(forwardJSONCall), getDefaultCompilationSettings = js.Any.fromFunction0(getDefaultCompilationSettings), getMemoryInfo = js.Any.fromFunction1(getMemoryInfo), getPreProcessedFileInfo = js.Any.fromFunction2(getPreProcessedFileInfo), host = host.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreServicesShim]
  }
}

