package typings.relayRuntime.mod

import typings.relayRuntime.relayModernEnvironmentMod.EnvironmentConfig
import typings.relayRuntime.relayModernEnvironmentMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("relay-runtime", "Environment")
@js.native
class Environment protected () extends default {
  def this(config: EnvironmentConfig) = this()
}

