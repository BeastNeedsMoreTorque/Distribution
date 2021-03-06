package typings.babylonjs.particlesIndexMod

import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Particles/index", "SubEmitter")
@js.native
class SubEmitter protected ()
  extends typings.babylonjs.subEmitterMod.SubEmitter {
  /**
    * Creates a sub emitter
    * @param particleSystem the particle system to be used by the sub emitter
    */
  def this(/**
    * the particle system to be used by the sub emitter
    */
  particleSystem: typings.babylonjs.particleSystemMod.ParticleSystem) = this()
}

/* static members */
@JSImport("babylonjs/Particles/index", "SubEmitter")
@js.native
object SubEmitter extends js.Object {
  /**
    * Creates a new SubEmitter from a serialized JSON version
    * @param serializationObject defines the JSON object to read from
    * @param scene defines the hosting scene
    * @param rootUrl defines the rootUrl for data loading
    * @returns a new SubEmitter
    */
  def Parse(serializationObject: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.subEmitterMod.SubEmitter = js.native
  /** @hidden */
  def _ParseParticleSystem(system: js.Any, scene: Scene, rootUrl: String): typings.babylonjs.particleSystemMod.ParticleSystem = js.native
}

