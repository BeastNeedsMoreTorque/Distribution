package typings.node.childProcessMod

import typings.node.BufferEncoding
import typings.node.NodeJS.ArrayBufferView
import typings.node.NodeJS.ProcessEnv
import typings.node.NodeJS.Signals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpawnSyncOptionsWithStringEncoding extends SpawnSyncOptions {
  @JSName("encoding")
  var encoding_SpawnSyncOptionsWithStringEncoding: BufferEncoding
}

object SpawnSyncOptionsWithStringEncoding {
  @scala.inline
  def apply(
    encoding: BufferEncoding,
    argv0: String = null,
    cwd: String = null,
    env: ProcessEnv = null,
    gid: js.UndefOr[Double] = js.undefined,
    input: String | ArrayBufferView = null,
    killSignal: Signals | Double = null,
    maxBuffer: js.UndefOr[Double] = js.undefined,
    serialization: SerializationType = null,
    shell: Boolean | String = null,
    stdio: StdioOptions = null,
    timeout: js.UndefOr[Double] = js.undefined,
    uid: js.UndefOr[Double] = js.undefined,
    windowsHide: js.UndefOr[Boolean] = js.undefined,
    windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
  ): SpawnSyncOptionsWithStringEncoding = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (argv0 != null) __obj.updateDynamic("argv0")(argv0.asInstanceOf[js.Any])
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (!js.isUndefined(gid)) __obj.updateDynamic("gid")(gid.get.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (killSignal != null) __obj.updateDynamic("killSignal")(killSignal.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBuffer)) __obj.updateDynamic("maxBuffer")(maxBuffer.get.asInstanceOf[js.Any])
    if (serialization != null) __obj.updateDynamic("serialization")(serialization.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uid)) __obj.updateDynamic("uid")(uid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsHide)) __obj.updateDynamic("windowsHide")(windowsHide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsVerbatimArguments)) __obj.updateDynamic("windowsVerbatimArguments")(windowsVerbatimArguments.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpawnSyncOptionsWithStringEncoding]
  }
}

