package typings.tensorflowTfjsData.testUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/util/test_utils", "FakeAudioContext")
@js.native
class FakeAudioContext () extends js.Object {
  val sampleRate: /* 44100 */ Double = js.native
  def close(): Unit = js.native
  def createAnalyser(): FakeAnalyser = js.native
  def createMediaStreamSource(): FakeMediaStreamAudioSourceNode = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-data/dist/util/test_utils", "FakeAudioContext")
@js.native
object FakeAudioContext extends js.Object {
  def createInstance(): FakeAudioContext = js.native
}

