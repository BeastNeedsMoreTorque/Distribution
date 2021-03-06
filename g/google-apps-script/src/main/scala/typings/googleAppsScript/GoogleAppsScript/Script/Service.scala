package typings.googleAppsScript.GoogleAppsScript.Script

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access and manipulate script publishing.
  */
trait Service extends js.Object {
  /** @deprecated DO NOT USE */ def disable(): Unit
  def getUrl(): String
  def isEnabled(): Boolean
}

object Service {
  @scala.inline
  def apply(disable: () => Unit, getUrl: () => String, isEnabled: () => Boolean): Service = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), getUrl = js.Any.fromFunction0(getUrl), isEnabled = js.Any.fromFunction0(isEnabled))
    __obj.asInstanceOf[Service]
  }
}

