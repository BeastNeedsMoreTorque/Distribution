package typings.activexLibreoffice.com_.sun.star.script.vba

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XVBACompatibility extends js.Object {
  var ProjectName: String
  var RunningVBAScripts: Double
  var VBACompatibilityMode: Boolean
  def addVBAScriptListener(Listener: XVBAScriptListener): Unit
  def broadcastVBAScriptEvent(Identifier: Double, ModuleName: String): Unit
  def removeVBAScriptListener(Listener: XVBAScriptListener): Unit
}

object XVBACompatibility {
  @scala.inline
  def apply(
    ProjectName: String,
    RunningVBAScripts: Double,
    VBACompatibilityMode: Boolean,
    addVBAScriptListener: XVBAScriptListener => Unit,
    broadcastVBAScriptEvent: (Double, String) => Unit,
    removeVBAScriptListener: XVBAScriptListener => Unit
  ): XVBACompatibility = {
    val __obj = js.Dynamic.literal(ProjectName = ProjectName.asInstanceOf[js.Any], RunningVBAScripts = RunningVBAScripts.asInstanceOf[js.Any], VBACompatibilityMode = VBACompatibilityMode.asInstanceOf[js.Any], addVBAScriptListener = js.Any.fromFunction1(addVBAScriptListener), broadcastVBAScriptEvent = js.Any.fromFunction2(broadcastVBAScriptEvent), removeVBAScriptListener = js.Any.fromFunction1(removeVBAScriptListener))
    __obj.asInstanceOf[XVBACompatibility]
  }
}

