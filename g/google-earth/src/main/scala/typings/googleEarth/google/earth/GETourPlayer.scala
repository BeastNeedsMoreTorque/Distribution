package typings.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GETourPlayer extends js.Object {
  /**
    * The current elapsed playing time of the active tour, in seconds.
    */
  def getCurrentTime(): Double
  /**
    * The total duration of the active tour, in seconds. If no tour is loaded, the behavior of this method is undefined.
    */
  def getDuration(): Double
  /**
    * Pauses the currently active tour.
    */
  def pause(): Unit
  /**
    * Plays the currently active tour.
    */
  def play(): Unit
  /**
    * Resets the currently active tour, stopping playback and rewinding to the start of the tour.
    */
  def reset(): Unit
  /**
    * The current elapsed playing time of the active tour, in seconds.
    */
  def setCurrentTime(currentTime: Double): Unit
  /**
    * Enters the given tour object, exiting any other currently active tour.
    * This method does not automatically begin playing the tour. 
    * If the argument is null, then any currently active tour is exited and normal globe navigation is enabled.
    */
  def setTour(tour: KmlTour): Unit
}

object GETourPlayer {
  @scala.inline
  def apply(
    getCurrentTime: () => Double,
    getDuration: () => Double,
    pause: () => Unit,
    play: () => Unit,
    reset: () => Unit,
    setCurrentTime: Double => Unit,
    setTour: KmlTour => Unit
  ): GETourPlayer = {
    val __obj = js.Dynamic.literal(getCurrentTime = js.Any.fromFunction0(getCurrentTime), getDuration = js.Any.fromFunction0(getDuration), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), reset = js.Any.fromFunction0(reset), setCurrentTime = js.Any.fromFunction1(setCurrentTime), setTour = js.Any.fromFunction1(setTour))
    __obj.asInstanceOf[GETourPlayer]
  }
}

