package typings.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mongodb.mongodbStrings.off
  - typings.mongodb.mongodbStrings.slow_only
  - typings.mongodb.mongodbStrings.all
*/
trait ProfilingLevel extends js.Object

object ProfilingLevel {
  @scala.inline
  def all: typings.mongodb.mongodbStrings.all = "all".asInstanceOf[typings.mongodb.mongodbStrings.all]
  @scala.inline
  def off: typings.mongodb.mongodbStrings.off = "off".asInstanceOf[typings.mongodb.mongodbStrings.off]
  @scala.inline
  def slow_only: typings.mongodb.mongodbStrings.slow_only = "slow_only".asInstanceOf[typings.mongodb.mongodbStrings.slow_only]
}

