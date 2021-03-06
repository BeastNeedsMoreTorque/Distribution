package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.MeshParticleEmitter")
@js.native
/**
  * Creates a new instance MeshParticleEmitter
  * @param mesh defines the mesh to use as source
  */
class MeshParticleEmitter ()
  extends typings.babylonjs.BABYLON.MeshParticleEmitter {
  def this(/** Defines the mesh to use as source */
  mesh: typings.babylonjs.BABYLON.AbstractMesh) = this()
  /* CompleteClass */
  override var _indices: js.Any = js.native
  /* CompleteClass */
  override var _normals: js.Any = js.native
  /* CompleteClass */
  override var _positions: js.Any = js.native
  /* CompleteClass */
  override var _storedNormal: js.Any = js.native
  /**
    * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
    */
  /* CompleteClass */
  override var direction1: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
    */
  /* CompleteClass */
  override var direction2: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * Gets or sets a boolean indicating that particle directions must be built from mesh face normals
    */
  /* CompleteClass */
  override var useMeshNormalsForDirection: Boolean = js.native
  /**
    * Called by the GPUParticleSystem to setup the update shader
    * @param effect defines the update shader
    */
  /* CompleteClass */
  override def applyToShader(effect: typings.babylonjs.BABYLON.Effect): Unit = js.native
  /**
    * Returns a string representing the class name
    * @returns a string containing the class name
    */
  /* CompleteClass */
  override def getClassName(): String = js.native
  /**
    * Returns a string to use to update the GPU particles update shader
    * @returns the effect defines string
    */
  /* CompleteClass */
  override def getEffectDefines(): String = js.native
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    * @param scene defines the hosting scene
    */
  /* CompleteClass */
  override def parse(serializationObject: js.Any, scene: typings.babylonjs.BABYLON.Scene): Unit = js.native
  /**
    * Serializes the particle system to a JSON object.
    * @returns the JSON object
    */
  /* CompleteClass */
  override def serialize(): js.Any = js.native
  /**
    * Called by the particle System when the direction is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param directionToUpdate is the direction vector to update with the result
    * @param particle is the particle we are computed the direction for
    * @param isLocal defines if the direction should be set in local space
    */
  /* CompleteClass */
  override def startDirectionFunction(
    worldMatrix: typings.babylonjs.BABYLON.Matrix,
    directionToUpdate: typings.babylonjs.BABYLON.Vector3,
    particle: typings.babylonjs.BABYLON.Particle,
    isLocal: Boolean
  ): Unit = js.native
  /**
    * Called by the particle System when the position is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param positionToUpdate is the position vector to update with the result
    * @param particle is the particle we are computed the position for
    * @param isLocal defines if the position should be set in local space
    */
  /* CompleteClass */
  override def startPositionFunction(
    worldMatrix: typings.babylonjs.BABYLON.Matrix,
    positionToUpdate: typings.babylonjs.BABYLON.Vector3,
    particle: typings.babylonjs.BABYLON.Particle,
    isLocal: Boolean
  ): Unit = js.native
}

