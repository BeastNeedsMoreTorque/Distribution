package typings.popmotionPose

import typings.popmotion.actionTypesMod.ColdSubscription
import typings.popmotionPose.flipMod.Action
import typings.popmotionPose.libTypesMod.Pose
import typings.popmotionPose.libTypesMod.PoserState
import typings.popmotionPose.typesMod.DomPopmotionPoser
import typings.popmotionPose.typesMod.TransitionDefinition
import typings.popmotionPose.typesMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion-pose/lib/dom/unit-conversion", JSImport.Namespace)
@js.native
object unitConversionMod extends js.Object {
  def convertPositionalUnits(
    state: PoserState[Value, Action[ColdSubscription], ColdSubscription, DomPopmotionPoser],
    nextPose: Pose[Action[ColdSubscription], TransitionDefinition]
  ): Pose[Action[ColdSubscription], TransitionDefinition] = js.native
  def isPositional(pose: Pose[Action[ColdSubscription], TransitionDefinition]): Boolean = js.native
}

