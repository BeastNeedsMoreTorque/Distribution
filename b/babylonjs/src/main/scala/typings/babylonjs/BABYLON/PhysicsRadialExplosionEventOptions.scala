package typings.babylonjs.BABYLON

import typings.babylonjs.anon.DiameterSegments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicsRadialExplosionEventOptions extends js.Object {
  /**
    * The strenght of the force in correspondence to the distance of the affected object
    */
  var falloff: PhysicsRadialImpulseFalloff
  /**
    * The radius of the sphere for the radial explosion.
    */
  var radius: Double
  /**
    * Sphere options for the radial explosion.
    */
  var sphere: DiameterSegments
  /**
    * The strenth of the explosion.
    */
  var strength: Double
  /**
    * Sphere options for the radial explosion.
    */
  def affectedImpostorsCallback(affectedImpostorsWithData: js.Array[PhysicsAffectedImpostorWithData]): Unit
}

object PhysicsRadialExplosionEventOptions {
  @scala.inline
  def apply(
    affectedImpostorsCallback: js.Array[PhysicsAffectedImpostorWithData] => Unit,
    falloff: PhysicsRadialImpulseFalloff,
    radius: Double,
    sphere: DiameterSegments,
    strength: Double
  ): PhysicsRadialExplosionEventOptions = {
    val __obj = js.Dynamic.literal(affectedImpostorsCallback = js.Any.fromFunction1(affectedImpostorsCallback), falloff = falloff.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], sphere = sphere.asInstanceOf[js.Any], strength = strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsRadialExplosionEventOptions]
  }
}

