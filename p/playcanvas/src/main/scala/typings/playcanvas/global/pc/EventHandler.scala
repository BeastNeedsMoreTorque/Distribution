package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new event handler.
  * @example
  * var obj = new EventHandlerSubclass();
  
  // subscribe to an event
  obj.on('hello', function (str) {
  console.log('event hello is fired', str);
  });
  
  // fire event
  obj.fire('hello', 'world');
  */
@JSGlobal("pc.EventHandler")
@js.native
class EventHandler ()
  extends typings.playcanvas.pc.EventHandler

