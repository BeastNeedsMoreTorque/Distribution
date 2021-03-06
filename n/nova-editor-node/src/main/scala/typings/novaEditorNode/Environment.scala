package typings.novaEditorNode

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/environment/
@js.native
trait Environment extends js.Object {
  // undocumented in main documentation page, but referenced elsewhere
  val assistants: AssistantsRegistry = js.native
  val commands: CommandsRegistry = js.native
  val config: Configuration = js.native
  val credentials: Credentials = js.native
  val environment: StringDictionary[String] = js.native
  val extension: Extension = js.native
  val fs: FileSystem = js.native
  val locales: js.Array[String] = js.native
  val notifications: NotificationCenter = js.native
  val path: Path = js.native
  val subscriptions: CompositeDisposable = js.native
  val systemVersion: js.Tuple3[Double, Double, Double] = js.native
  val version: js.Tuple3[Double, Double, Double] = js.native
  val versionString: String = js.native
  val workspace: Workspace = js.native
  def beep(): Unit = js.native
  def inDevMode(): Boolean = js.native
  def isReleasedVersion(): Boolean = js.native
  def localize(): String = js.native
  def localize(key: String): String = js.native
  def localize(key: String, value: String): String = js.native
  def localize(key: String, value: String, tableName: String): String = js.native
  def localize(key: String, value: Null, tableName: String): String = js.native
  def localize(key: Null, value: String): String = js.native
  def localize(key: Null, value: String, tableName: String): String = js.native
  def localize(key: Null, value: Null, tableName: String): String = js.native
  def openConfig(): Unit = js.native
  def openConfig(identifier: String): Unit = js.native
  def openURL(url: String): Unit = js.native
  def openURL(url: String, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
}

