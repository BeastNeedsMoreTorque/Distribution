package typings.velocityDashAnimate

import typings.velocityDashAnimate.jquery.velocity.Easing
import typings.velocityDashAnimate.jquery.velocity.ElementCallback
import typings.velocityDashAnimate.jquery.velocity.Options
import typings.velocityDashAnimate.jquery.velocity.Properties
import typings.velocityDashAnimate.jquery.velocity.RegisteredEffectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def velocity(name: String, options: RegisteredEffectOptions): JQuery = js.native
  def velocity(options: Anon_Options): JQuery = js.native
  def velocity(properties: Properties): JQuery = js.native
  def velocity(properties: Properties, complete: ElementCallback): JQuery = js.native
  def velocity(properties: Properties, duration: Double): JQuery = js.native
  def velocity(properties: Properties, duration: Double, complete: ElementCallback): JQuery = js.native
  def velocity(properties: Properties, duration: Double, easing: Easing): JQuery = js.native
  def velocity(properties: Properties, duration: Double, easing: Easing, complete: ElementCallback): JQuery = js.native
  def velocity(properties: Properties, easing: Easing): JQuery = js.native
  def velocity(properties: Properties, easing: Easing, complete: ElementCallback): JQuery = js.native
  def velocity(properties: Properties, options: Options): JQuery = js.native
}

