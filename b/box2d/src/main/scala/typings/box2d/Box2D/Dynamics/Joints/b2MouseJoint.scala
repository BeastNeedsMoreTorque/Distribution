package typings.box2d.Box2D.Dynamics.Joints

import typings.box2d.Box2D.Common.Math.b2Vec2
import typings.box2d.Box2D.Dynamics.b2Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2MouseJoint extends b2Joint {
  /**
    * Gets the damping ratio.
    * @return Damping ratio.
    **/
  def GetDampingRatio(): Double
  /**
    * Gets the frequency.
    * @return Frequency.
    **/
  def GetFrequency(): Double
  /**
    * Gets the max force.
    * @return Max force.
    **/
  def GetMaxForce(): Double
  /**
    * Gets the target.
    * @return Target.
    **/
  def GetTarget(): b2Vec2
  /**
    * Sets the damping ratio.
    * @param ratio New damping ratio.
    **/
  def SetDampingRatio(ratio: Double): Unit
  /**
    * Sets the frequency.
    * @param hz New frequency (hertz).
    **/
  def SetFrequency(hz: Double): Unit
  /**
    * Sets the max force.
    * @param maxForce New max force.
    **/
  def SetMaxForce(maxForce: Double): Unit
  /**
    * Use this to update the target point.
    * @param target New target.
    **/
  def SetTarget(target: b2Vec2): Unit
}

object b2MouseJoint {
  @scala.inline
  def apply(
    GetAnchorA: () => b2Vec2,
    GetAnchorB: () => b2Vec2,
    GetBodyA: () => b2Body,
    GetBodyB: () => b2Body,
    GetDampingRatio: () => Double,
    GetFrequency: () => Double,
    GetMaxForce: () => Double,
    GetNext: () => b2Joint,
    GetReactionForce: Double => b2Vec2,
    GetReactionTorque: Double => Double,
    GetTarget: () => b2Vec2,
    GetType: () => Double,
    GetUserData: () => js.Any,
    IsActive: () => Boolean,
    SetDampingRatio: Double => Unit,
    SetFrequency: Double => Unit,
    SetMaxForce: Double => Unit,
    SetTarget: b2Vec2 => Unit,
    SetUserData: js.Any => Unit
  ): b2MouseJoint = {
    val __obj = js.Dynamic.literal(GetAnchorA = js.Any.fromFunction0(GetAnchorA), GetAnchorB = js.Any.fromFunction0(GetAnchorB), GetBodyA = js.Any.fromFunction0(GetBodyA), GetBodyB = js.Any.fromFunction0(GetBodyB), GetDampingRatio = js.Any.fromFunction0(GetDampingRatio), GetFrequency = js.Any.fromFunction0(GetFrequency), GetMaxForce = js.Any.fromFunction0(GetMaxForce), GetNext = js.Any.fromFunction0(GetNext), GetReactionForce = js.Any.fromFunction1(GetReactionForce), GetReactionTorque = js.Any.fromFunction1(GetReactionTorque), GetTarget = js.Any.fromFunction0(GetTarget), GetType = js.Any.fromFunction0(GetType), GetUserData = js.Any.fromFunction0(GetUserData), IsActive = js.Any.fromFunction0(IsActive), SetDampingRatio = js.Any.fromFunction1(SetDampingRatio), SetFrequency = js.Any.fromFunction1(SetFrequency), SetMaxForce = js.Any.fromFunction1(SetMaxForce), SetTarget = js.Any.fromFunction1(SetTarget), SetUserData = js.Any.fromFunction1(SetUserData))
    __obj.asInstanceOf[b2MouseJoint]
  }
}

