package typings.storybookAddonKnobs.selectMod

import typings.storybookAddonKnobs.typesTypesMod.KnobControlProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectTypeProps[T /* <: SelectTypeKnobValue */] extends KnobControlProps[T] {
  @JSName("knob")
  var knob_SelectTypeProps: SelectTypeKnob[T]
}

object SelectTypeProps {
  @scala.inline
  def apply[/* <: typings.storybookAddonKnobs.selectMod.SelectTypeKnobValue */ T](knob: SelectTypeKnob[T], onChange: T => T): SelectTypeProps[T] = {
    val __obj = js.Dynamic.literal(knob = knob.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[SelectTypeProps[T]]
  }
}

