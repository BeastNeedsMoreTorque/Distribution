package typings.systemService.mod

import typings.systemLogger.mod.FileConfiguration
import typings.systemLogger.mod.LoggerConfiguration
import typings.systemLogger.mod.SourcesConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("system-service", "Logger")
@js.native
class Logger ()
  extends typings.systemLogger.mod.Logger {
  def this(configuration: LoggerConfiguration) = this()
  def this(configuration: LoggerConfiguration, fileConfig: FileConfiguration) = this()
  def this(
    configuration: LoggerConfiguration,
    fileConfig: FileConfiguration,
    sourceConfig: SourcesConfiguration
  ) = this()
}

