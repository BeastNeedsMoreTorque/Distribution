package typings.box2d.Box2D.Dynamics.Controllers

import typings.box2d.Box2D.Common.Math.b2Mat22
import typings.box2d.Box2D.Dynamics.b2Body
import typings.box2d.Box2D.Dynamics.b2DebugDraw
import typings.box2d.Box2D.Dynamics.b2World
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2TensorDampingController extends b2Controller {
  /**
    * Tensor to use in damping model.
    **/
  var T: b2Mat22
  /**
    * Set this to a positive number to clamp the maximum amount of damping done.
    * @default = 0
    **/
  var maxTimeStep: Double
  /**
    * Helper function to set T in a common case.
    * @param xDamping x
    * @param yDamping y
    **/
  def SetAxisAligned(xDamping: Double, yDamping: Double): Unit
}

object b2TensorDampingController {
  @scala.inline
  def apply(
    AddBody: b2Body => Unit,
    Clear: () => Unit,
    Draw: b2DebugDraw => Unit,
    GetBodyList: () => b2ControllerEdge,
    GetNext: () => b2Controller,
    GetWorld: () => b2World,
    RemoveBody: b2Body => Unit,
    SetAxisAligned: (Double, Double) => Unit,
    Step: js.Any => Unit,
    T: b2Mat22,
    m_bodyCount: Double,
    m_bodyList: b2ControllerEdge,
    maxTimeStep: Double
  ): b2TensorDampingController = {
    val __obj = js.Dynamic.literal(AddBody = js.Any.fromFunction1(AddBody), Clear = js.Any.fromFunction0(Clear), Draw = js.Any.fromFunction1(Draw), GetBodyList = js.Any.fromFunction0(GetBodyList), GetNext = js.Any.fromFunction0(GetNext), GetWorld = js.Any.fromFunction0(GetWorld), RemoveBody = js.Any.fromFunction1(RemoveBody), SetAxisAligned = js.Any.fromFunction2(SetAxisAligned), Step = js.Any.fromFunction1(Step), T = T.asInstanceOf[js.Any], m_bodyCount = m_bodyCount.asInstanceOf[js.Any], m_bodyList = m_bodyList.asInstanceOf[js.Any], maxTimeStep = maxTimeStep.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2TensorDampingController]
  }
}

