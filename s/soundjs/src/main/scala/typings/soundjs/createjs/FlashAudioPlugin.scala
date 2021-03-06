package typings.soundjs.createjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashAudioPlugin extends AbstractPlugin {
  // properties
  var flashReady: Boolean
  var showOutput: Boolean
}

object FlashAudioPlugin {
  @scala.inline
  def apply(
    create: (String, Double, Double) => AbstractSoundInstance,
    flashReady: Boolean,
    getVolume: () => Double,
    isPreloadComplete: String => Boolean,
    isPreloadStarted: String => Boolean,
    isSupported: () => Boolean,
    preload: js.Object => Unit,
    register: (String, Double) => js.Object,
    removeAllSounds: String => Unit,
    removeSound: String => Unit,
    setMute: Boolean => Boolean,
    setVolume: Double => Boolean,
    showOutput: Boolean
  ): FlashAudioPlugin = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create), flashReady = flashReady.asInstanceOf[js.Any], getVolume = js.Any.fromFunction0(getVolume), isPreloadComplete = js.Any.fromFunction1(isPreloadComplete), isPreloadStarted = js.Any.fromFunction1(isPreloadStarted), isSupported = js.Any.fromFunction0(isSupported), preload = js.Any.fromFunction1(preload), register = js.Any.fromFunction2(register), removeAllSounds = js.Any.fromFunction1(removeAllSounds), removeSound = js.Any.fromFunction1(removeSound), setMute = js.Any.fromFunction1(setMute), setVolume = js.Any.fromFunction1(setVolume), showOutput = showOutput.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashAudioPlugin]
  }
}

