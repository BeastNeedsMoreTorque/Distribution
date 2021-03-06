package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AccessibilitySupport extends js.Object

@JSImport("monaco-editor", "editor.AccessibilitySupport")
@js.native
object AccessibilitySupport extends js.Object {
  @js.native
  sealed trait Disabled extends AccessibilitySupport
  
  @js.native
  sealed trait Enabled extends AccessibilitySupport
  
  /**
    * This should be the browser case where it is not known if a screen reader is attached or no.
    */
  @js.native
  sealed trait Unknown extends AccessibilitySupport
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AccessibilitySupport with Double] = js.native
  /* 1 */ @js.native
  object Disabled extends TopLevel[Disabled with Double]
  
  /* 2 */ @js.native
  object Enabled extends TopLevel[Enabled with Double]
  
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
}

