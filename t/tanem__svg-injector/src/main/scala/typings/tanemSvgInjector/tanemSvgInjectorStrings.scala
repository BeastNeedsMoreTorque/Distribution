package typings.tanemSvgInjector

import typings.tanemSvgInjector.typesMod.EvalScripts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object tanemSvgInjectorStrings {
  @js.native
  sealed trait always extends EvalScripts
  
  @js.native
  sealed trait never extends EvalScripts
  
  @js.native
  sealed trait once extends EvalScripts
  
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  @scala.inline
  def once: once = "once".asInstanceOf[once]
}

