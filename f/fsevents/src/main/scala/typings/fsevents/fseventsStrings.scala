package typings.fsevents

import typings.fsevents.fseventsMod.BaseEventType
import typings.fsevents.fseventsMod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object fseventsStrings {
  @js.native
  sealed trait change extends js.Object
  
  @js.native
  sealed trait created extends BaseEventType
  
  @js.native
  sealed trait deleted extends BaseEventType
  
  @js.native
  sealed trait directory extends js.Object
  
  @js.native
  sealed trait file extends js.Object
  
  @js.native
  sealed trait fsevent extends js.Object
  
  @js.native
  sealed trait modified extends BaseEventType
  
  @js.native
  sealed trait moved extends js.Object
  
  @js.native
  sealed trait `moved-in` extends EventType
  
  @js.native
  sealed trait `moved-out` extends EventType
  
  @js.native
  sealed trait `root-changed` extends BaseEventType
  
  @js.native
  sealed trait symlink extends js.Object
  
  @js.native
  sealed trait unknown extends BaseEventType
  
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  @scala.inline
  def created: created = "created".asInstanceOf[created]
  @scala.inline
  def deleted: deleted = "deleted".asInstanceOf[deleted]
  @scala.inline
  def directory: directory = "directory".asInstanceOf[directory]
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  @scala.inline
  def fsevent: fsevent = "fsevent".asInstanceOf[fsevent]
  @scala.inline
  def modified: modified = "modified".asInstanceOf[modified]
  @scala.inline
  def moved: moved = "moved".asInstanceOf[moved]
  @scala.inline
  def `moved-in`: `moved-in` = "moved-in".asInstanceOf[`moved-in`]
  @scala.inline
  def `moved-out`: `moved-out` = "moved-out".asInstanceOf[`moved-out`]
  @scala.inline
  def `root-changed`: `root-changed` = "root-changed".asInstanceOf[`root-changed`]
  @scala.inline
  def symlink: symlink = "symlink".asInstanceOf[symlink]
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
}

