package typings.rdfjsSerializerJsonld.mod

import typings.node.eventsMod.EventEmitter
import typings.rdfJs.mod.BaseQuad
import typings.rdfJs.mod.Sink
import typings.rdfJs.mod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Serializer[Q /* <: BaseQuad */] extends Sink[Stream[Q], EventEmitter] {
  def `import`(stream: Stream[Q], options: SerializerOptions): EventEmitter = js.native
}

