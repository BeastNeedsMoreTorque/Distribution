package typings.aframe.mod

import typings.aframe.anon.ComponentName
import typings.aframe.anon.Data
import typings.aframe.anon.El
import typings.aframe.anon.Id
import typings.aframe.anon.Name
import typings.aframe.anon.State
import typings.std.Event
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityEventMap extends js.Object {
  var `child-attached`: DetailEvent[El] = js.native
  var `child-detached`: DetailEvent[El] = js.native
  var componentchanged: DetailEvent[Id] = js.native
  var componentinitialized: DetailEvent[Data] = js.native
  var componentremoved: DetailEvent[Name] = js.native
  @JSName("loaded")
  var loaded_Original: EventListener = js.native
  @JSName("pause")
  var pause_Original: EventListener = js.native
  @JSName("play")
  var play_Original: EventListener = js.native
  var schemachanged: DetailEvent[ComponentName] = js.native
  var stateadded: DetailEvent[State] = js.native
  var stateremoved: DetailEvent[State] = js.native
  def loaded(evt: Event): Unit = js.native
  def pause(evt: Event): Unit = js.native
  def play(evt: Event): Unit = js.native
}

