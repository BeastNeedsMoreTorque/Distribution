package typings.logfmt.mod

import typings.logfmt.anon.ContentType
import typings.logfmt.anon.Delimiter
import typings.logfmt.anon.End
import typings.node.NodeJS.ReadWriteStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logfmt extends js.Object {
  var maxErrorLines: Double = js.native
  @JSName("requestLogger")
  var requestLogger_Original: RequestLogger = js.native
  var stream: WritableStream = js.native
  def bodyParser(): HTTPHandler = js.native
  def bodyParser(options: ContentType): HTTPHandler = js.native
  def bodyParserStream(): HTTPHandler = js.native
  def bodyParserStream(options: ContentType): HTTPHandler = js.native
  def error(err: Error): Unit = js.native
  def error(err: Error, id: String): Unit = js.native
  def log(): Unit = js.native
  def log(data: js.Object): Unit = js.native
  def log(data: js.Object, stream: WritableStream): Unit = js.native
  def namespace(data: js.Object): Logfmt = js.native
  def parse(line: String): js.Object = js.native
  def requestLogger(): HTTPHandler = js.native
  def requestLogger(formatter: RequestLoggerFormatter): HTTPHandler = js.native
  def requestLogger(options: RequestLoggerOptions): HTTPHandler = js.native
  def requestLogger(options: RequestLoggerOptions, formatter: RequestLoggerFormatter): HTTPHandler = js.native
  def streamParser(): ReadWriteStream = js.native
  def streamParser(options: End): ReadWriteStream = js.native
  def streamStringify(): ReadWriteStream = js.native
  def streamStringify(options: Delimiter): ReadWriteStream = js.native
  def stringify(data: js.Object): String = js.native
  def time(): Logfmt = js.native
  def time(label: String): Logfmt = js.native
}

