package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.BabylonFileParser
import typings.babylonjs.BABYLON.IParticleSystem
import typings.babylonjs.BABYLON.IndividualBabylonFileParser
import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.AbstractScene")
@js.native
abstract class AbstractScene ()
  extends typings.babylonjs.BABYLON.AbstractScene {
  /**
    * ActionManagers available on the scene.
    */
  /* CompleteClass */
  override var actionManagers: js.Array[typings.babylonjs.BABYLON.AbstractActionManager] = js.native
  /**
    * All of the animation groups added to this scene
    * @see http://doc.babylonjs.com/how_to/group
    */
  /* CompleteClass */
  override var animationGroups: js.Array[typings.babylonjs.BABYLON.AnimationGroup] = js.native
  /**
    * Gets a list of Animations associated with the scene
    */
  /* CompleteClass */
  override var animations: js.Array[typings.babylonjs.BABYLON.Animation] = js.native
  /** All of the cameras added to this scene
    * @see http://doc.babylonjs.com/babylon101/cameras
    */
  /* CompleteClass */
  override var cameras: js.Array[typings.babylonjs.BABYLON.Camera] = js.native
  /**
    * The list of effect layers (highlights/glow) added to the scene
    * @see http://doc.babylonjs.com/how_to/highlight_layer
    * @see http://doc.babylonjs.com/how_to/glow_layer
    */
  /* CompleteClass */
  override var effectLayers: js.Array[typings.babylonjs.BABYLON.EffectLayer] = js.native
  /**
    * Environment texture for the scene
    */
  /* CompleteClass */
  override var environmentTexture: Nullable[typings.babylonjs.BABYLON.BaseTexture] = js.native
  /**
    * The list of geometries used in the scene.
    */
  /* CompleteClass */
  override var geometries: js.Array[typings.babylonjs.BABYLON.Geometry] = js.native
  /**
    * The list of layers (background and foreground) of the scene
    */
  /* CompleteClass */
  override var layers: js.Array[typings.babylonjs.BABYLON.Layer] = js.native
  /**
    * The list of lens flare system added to the scene
    * @see http://doc.babylonjs.com/how_to/how_to_use_lens_flares
    */
  /* CompleteClass */
  override var lensFlareSystems: js.Array[typings.babylonjs.BABYLON.LensFlareSystem] = js.native
  /**
    * All of the lights added to this scene
    * @see http://doc.babylonjs.com/babylon101/lights
    */
  /* CompleteClass */
  override var lights: js.Array[typings.babylonjs.BABYLON.Light] = js.native
  /**
    * All of the materials added to this scene
    * In the context of a Scene, it is not supposed to be modified manually.
    * Any addition or removal should be done using the addMaterial and removeMaterial Scene methods.
    * Note also that the order of the Material within the array is not significant and might change.
    * @see http://doc.babylonjs.com/babylon101/materials
    */
  /* CompleteClass */
  override var materials: js.Array[typings.babylonjs.BABYLON.Material] = js.native
  /**
    * All of the (abstract) meshes added to this scene
    */
  /* CompleteClass */
  override var meshes: js.Array[typings.babylonjs.BABYLON.AbstractMesh] = js.native
  /**
    * The list of morph target managers added to the scene
    * @see http://doc.babylonjs.com/how_to/how_to_dynamically_morph_a_mesh
    */
  /* CompleteClass */
  override var morphTargetManagers: js.Array[typings.babylonjs.BABYLON.MorphTargetManager] = js.native
  /**
    * All of the multi-materials added to this scene
    * @see http://doc.babylonjs.com/how_to/multi_materials
    */
  /* CompleteClass */
  override var multiMaterials: js.Array[typings.babylonjs.BABYLON.MultiMaterial] = js.native
  /**
    * All of the particle systems added to this scene
    * @see http://doc.babylonjs.com/babylon101/particles
    */
  /* CompleteClass */
  override var particleSystems: js.Array[IParticleSystem] = js.native
  /**
    * The list of procedural textures added to the scene
    * @see http://doc.babylonjs.com/how_to/how_to_use_procedural_textures
    */
  /* CompleteClass */
  override var proceduralTextures: js.Array[typings.babylonjs.BABYLON.ProceduralTexture] = js.native
  /**
    * The list of reflection probes added to the scene
    * @see http://doc.babylonjs.com/how_to/how_to_use_reflection_probes
    */
  /* CompleteClass */
  override var reflectionProbes: js.Array[typings.babylonjs.BABYLON.ReflectionProbe] = js.native
  /**
    * Gets the list of root nodes (ie. nodes with no parent)
    */
  /* CompleteClass */
  override var rootNodes: js.Array[typings.babylonjs.BABYLON.Node] = js.native
  /**
    * The list of skeletons added to the scene
    * @see http://doc.babylonjs.com/how_to/how_to_use_bones_and_skeletons
    */
  /* CompleteClass */
  override var skeletons: js.Array[typings.babylonjs.BABYLON.Skeleton] = js.native
  /**
    * The list of sounds used in the scene.
    */
  /* CompleteClass */
  override var sounds: Nullable[js.Array[typings.babylonjs.BABYLON.Sound]] = js.native
  /**
    * Textures to keep.
    */
  /* CompleteClass */
  override var textures: js.Array[typings.babylonjs.BABYLON.BaseTexture] = js.native
  /**
    * All of the tranform nodes added to this scene
    * In the context of a Scene, it is not supposed to be modified manually.
    * Any addition or removal should be done using the addTransformNode and removeTransformNode Scene methods.
    * Note also that the order of the TransformNode wihin the array is not significant and might change.
    * @see http://doc.babylonjs.com/how_to/transformnode
    */
  /* CompleteClass */
  override var transformNodes: js.Array[typings.babylonjs.BABYLON.TransformNode] = js.native
  /**
    * Adds the given effect layer to this scene
    * @param newEffectLayer defines the effect layer to add
    */
  /* CompleteClass */
  override def addEffectLayer(newEffectLayer: typings.babylonjs.BABYLON.EffectLayer): Unit = js.native
  /**
    * Adds the given lens flare system to this scene
    * @param newLensFlareSystem The lens flare system to add
    */
  /* CompleteClass */
  override def addLensFlareSystem(newLensFlareSystem: typings.babylonjs.BABYLON.LensFlareSystem): Unit = js.native
  /**
    * Adds the given reflection probe to this scene.
    * @param newReflectionProbe The reflection probe to add
    */
  /* CompleteClass */
  override def addReflectionProbe(newReflectionProbe: typings.babylonjs.BABYLON.ReflectionProbe): Unit = js.native
  /**
    * Return a the first highlight layer of the scene with a given name.
    * @param name The name of the highlight layer to look for.
    * @return The highlight layer if found otherwise null.
    */
  /* CompleteClass */
  override def getGlowLayerByName(name: String): Nullable[typings.babylonjs.BABYLON.GlowLayer] = js.native
  /**
    * Return a the first highlight layer of the scene with a given name.
    * @param name The name of the highlight layer to look for.
    * @return The highlight layer if found otherwise null.
    */
  /* CompleteClass */
  override def getHighlightLayerByName(name: String): Nullable[typings.babylonjs.BABYLON.HighlightLayer] = js.native
  /**
    * Gets a lens flare system using its id
    * @param id defines the id to look for
    * @returns the lens flare system or null if not found
    */
  /* CompleteClass */
  override def getLensFlareSystemByID(id: String): Nullable[typings.babylonjs.BABYLON.LensFlareSystem] = js.native
  /**
    * Gets a lens flare system using its name
    * @param name defines the name to look for
    * @returns the lens flare system or null if not found
    */
  /* CompleteClass */
  override def getLensFlareSystemByName(name: String): Nullable[typings.babylonjs.BABYLON.LensFlareSystem] = js.native
  /**
    * @returns all meshes, lights, cameras, transformNodes and bones
    */
  /* CompleteClass */
  override def getNodes(): js.Array[typings.babylonjs.BABYLON.Node] = js.native
  /**
    * Removes the given effect layer from this scene.
    * @param toRemove defines the effect layer to remove
    * @returns the index of the removed effect layer
    */
  /* CompleteClass */
  override def removeEffectLayer(toRemove: typings.babylonjs.BABYLON.EffectLayer): Double = js.native
  /**
    * Removes the given lens flare system from this scene.
    * @param toRemove The lens flare system to remove
    * @returns The index of the removed lens flare system
    */
  /* CompleteClass */
  override def removeLensFlareSystem(toRemove: typings.babylonjs.BABYLON.LensFlareSystem): Double = js.native
  /**
    * Removes the given reflection probe from this scene.
    * @param toRemove The reflection probe to remove
    * @returns The index of the removed reflection probe
    */
  /* CompleteClass */
  override def removeReflectionProbe(toRemove: typings.babylonjs.BABYLON.ReflectionProbe): Double = js.native
}

/* static members */
@JSGlobal("BABYLON.AbstractScene")
@js.native
object AbstractScene extends js.Object {
  /**
    * Stores the list of available parsers in the application.
    */
  var _BabylonFileParsers: js.Any = js.native
  /**
    * Stores the list of available individual parsers in the application.
    */
  var _IndividualBabylonFileParsers: js.Any = js.native
  /**
    * Adds n individual parser in the list of available ones
    * @param name Defines the name of the parser
    * @param parser Defines the parser to add
    */
  def AddIndividualParser(name: String, parser: IndividualBabylonFileParser): Unit = js.native
  /**
    * Adds a parser in the list of available ones
    * @param name Defines the name of the parser
    * @param parser Defines the parser to add
    */
  def AddParser(name: String, parser: BabylonFileParser): Unit = js.native
  /**
    * Gets an individual parser from the list of avaialble ones
    * @param name Defines the name of the parser
    * @returns the requested parser or null
    */
  def GetIndividualParser(name: String): Nullable[IndividualBabylonFileParser] = js.native
  /**
    * Gets a general parser from the list of avaialble ones
    * @param name Defines the name of the parser
    * @returns the requested parser or null
    */
  def GetParser(name: String): Nullable[BabylonFileParser] = js.native
  /**
    * Parser json data and populate both a scene and its associated container object
    * @param jsonData Defines the data to parse
    * @param scene Defines the scene to parse the data for
    * @param container Defines the container attached to the parsing sequence
    * @param rootUrl Defines the root url of the data
    */
  def Parse(
    jsonData: js.Any,
    scene: typings.babylonjs.BABYLON.Scene,
    container: typings.babylonjs.BABYLON.AssetContainer,
    rootUrl: String
  ): Unit = js.native
}

