package typings.npmRun.mod

import typings.node.Buffer
import typings.node.anon.Stderr
import typings.node.anon.StderrStdout
import typings.node.anon.Stdout
import typings.node.anon.encodingBufferEncodingExe
import typings.node.anon.encodingbuffernullExecOpt
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.ExecException
import typings.node.childProcessMod.ExecOptions
import typings.node.childProcessMod.PromiseWithChild
import typings.node.fsMod.BaseEncodingOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecFunction extends js.Object {
  // no `options` definitely means stdout/stderr are `string`.
  def apply(command: String): ChildProcess = js.native
  def apply(
    command: String,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def apply(command: String, options: BaseEncodingOptions with ExecOptions): ChildProcess = js.native
  def apply(
    command: String,
    options: BaseEncodingOptions with ExecOptions,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  def apply(
    command: String,
    options: Null,
    callback: js.Function3[
      /* error */ ExecException | Null, 
      /* stdout */ String | Buffer, 
      /* stderr */ String | Buffer, 
      Unit
    ]
  ): ChildProcess = js.native
  // `options` with well known `encoding` means stdout/stderr are definitely `string`.
  def apply(command: String, options: encodingBufferEncodingExe): ChildProcess = js.native
  def apply(
    command: String,
    options: encodingBufferEncodingExe,
    callback: js.Function3[
      ExecException | Null, 
      Buffer | (/* stdout */ String), 
      Buffer | (/* stderr */ String), 
      Unit
    ]
  ): ChildProcess = js.native
  // `options` with `"buffer"` or `null` for `encoding` means stdout/stderr are definitely `Buffer`.
  def apply(command: String, options: encodingbuffernullExecOpt): ChildProcess = js.native
  def apply(
    command: String,
    options: encodingbuffernullExecOpt,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ Buffer, /* stderr */ Buffer, Unit]
  ): ChildProcess = js.native
  // `options` without an `encoding` means stdout/stderr are definitely `string`.
  def apply(command: String, options: ExecOptions): ChildProcess = js.native
  def apply(
    command: String,
    options: ExecOptions,
    callback: js.Function3[/* error */ ExecException | Null, /* stdout */ String, /* stderr */ String, Unit]
  ): ChildProcess = js.native
  def __promisify__(command: String): PromiseWithChild[Stderr] = js.native
  def __promisify__(command: String, options: BaseEncodingOptions with ExecOptions): PromiseWithChild[StderrStdout] = js.native
  def __promisify__(command: String, options: encodingBufferEncodingExe): PromiseWithChild[Stderr] = js.native
  def __promisify__(command: String, options: encodingbuffernullExecOpt): PromiseWithChild[Stdout] = js.native
  def __promisify__(command: String, options: ExecOptions): PromiseWithChild[Stderr] = js.native
}

