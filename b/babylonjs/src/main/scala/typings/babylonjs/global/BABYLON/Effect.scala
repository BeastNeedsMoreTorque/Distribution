package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IColor3Like
import typings.babylonjs.BABYLON.IColor4Like
import typings.babylonjs.BABYLON.IEffectCreationOptions
import typings.babylonjs.BABYLON.IEffectFallbacks
import typings.babylonjs.BABYLON.IMatrixLike
import typings.babylonjs.BABYLON.IPipelineContext
import typings.babylonjs.BABYLON.IVector2Like
import typings.babylonjs.BABYLON.IVector3Like
import typings.babylonjs.BABYLON.IVector4Like
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.WebGLUniformLocation
import typings.std.Float32Array
import typings.std.Int32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Effect")
@js.native
class Effect protected ()
  extends typings.babylonjs.BABYLON.Effect {
  /**
    * Instantiates an effect.
    * An effect can be used to create/manage/execute vertex and fragment shaders.
    * @param baseName Name of the effect.
    * @param attributesNamesOrOptions List of attribute names that will be passed to the shader or set of all options to create the effect.
    * @param uniformsNamesOrEngine List of uniform variable names that will be passed to the shader or the engine that will be used to render effect.
    * @param samplers List of sampler variables that will be passed to the shader.
    * @param engine Engine to be used to render the effect
    * @param defines Define statements to be added to the shader.
    * @param fallbacks Possible fallbacks for this effect to improve performance when needed.
    * @param onCompiled Callback that will be called when the shader is compiled.
    * @param onError Callback that will be called if an error occurs during shader compilation.
    * @param indexParameters Parameters to be used with Babylons include syntax to iterate over an array (eg. {lights: 10})
    */
  def this(
    baseName: js.Any,
    attributesNamesOrOptions: js.Array[String],
    uniformsNamesOrEngine: js.Array[String],
    samplers: js.UndefOr[Nullable[js.Array[String]]],
    engine: js.UndefOr[typings.babylonjs.BABYLON.ThinEngine],
    defines: js.UndefOr[Nullable[String]],
    fallbacks: js.UndefOr[Nullable[IEffectFallbacks]],
    onCompiled: js.UndefOr[Nullable[js.Function1[/* effect */ typings.babylonjs.BABYLON.Effect, Unit]]],
    onError: js.UndefOr[
        Nullable[
          js.Function2[/* effect */ typings.babylonjs.BABYLON.Effect, /* errors */ String, Unit]
        ]
      ],
    indexParameters: js.UndefOr[js.Any]
  ) = this()
  def this(
    baseName: js.Any,
    attributesNamesOrOptions: js.Array[String],
    uniformsNamesOrEngine: typings.babylonjs.BABYLON.ThinEngine,
    samplers: js.UndefOr[Nullable[js.Array[String]]],
    engine: js.UndefOr[typings.babylonjs.BABYLON.ThinEngine],
    defines: js.UndefOr[Nullable[String]],
    fallbacks: js.UndefOr[Nullable[IEffectFallbacks]],
    onCompiled: js.UndefOr[Nullable[js.Function1[/* effect */ typings.babylonjs.BABYLON.Effect, Unit]]],
    onError: js.UndefOr[
        Nullable[
          js.Function2[/* effect */ typings.babylonjs.BABYLON.Effect, /* errors */ String, Unit]
        ]
      ],
    indexParameters: js.UndefOr[js.Any]
  ) = this()
  def this(
    baseName: js.Any,
    attributesNamesOrOptions: IEffectCreationOptions,
    uniformsNamesOrEngine: js.Array[String],
    samplers: js.UndefOr[Nullable[js.Array[String]]],
    engine: js.UndefOr[typings.babylonjs.BABYLON.ThinEngine],
    defines: js.UndefOr[Nullable[String]],
    fallbacks: js.UndefOr[Nullable[IEffectFallbacks]],
    onCompiled: js.UndefOr[Nullable[js.Function1[/* effect */ typings.babylonjs.BABYLON.Effect, Unit]]],
    onError: js.UndefOr[
        Nullable[
          js.Function2[/* effect */ typings.babylonjs.BABYLON.Effect, /* errors */ String, Unit]
        ]
      ],
    indexParameters: js.UndefOr[js.Any]
  ) = this()
  def this(
    baseName: js.Any,
    attributesNamesOrOptions: IEffectCreationOptions,
    uniformsNamesOrEngine: typings.babylonjs.BABYLON.ThinEngine,
    samplers: js.UndefOr[Nullable[js.Array[String]]],
    engine: js.UndefOr[typings.babylonjs.BABYLON.ThinEngine],
    defines: js.UndefOr[Nullable[String]],
    fallbacks: js.UndefOr[Nullable[IEffectFallbacks]],
    onCompiled: js.UndefOr[Nullable[js.Function1[/* effect */ typings.babylonjs.BABYLON.Effect, Unit]]],
    onError: js.UndefOr[
        Nullable[
          js.Function2[/* effect */ typings.babylonjs.BABYLON.Effect, /* errors */ String, Unit]
        ]
      ],
    indexParameters: js.UndefOr[js.Any]
  ) = this()
  /* CompleteClass */
  override var _allFallbacksProcessed: js.Any = js.native
  /* CompleteClass */
  override var _attributeLocationByName: js.Any = js.native
  /* CompleteClass */
  override var _attributes: js.Any = js.native
  /* CompleteClass */
  override var _attributesNames: js.Any = js.native
  /** @hidden */
  /* CompleteClass */
  override var _bonesComputationForcedToCPU: Boolean = js.native
  /* CompleteClass */
  override var _checkIsReady: js.Any = js.native
  /* CompleteClass */
  override var _compilationError: js.Any = js.native
  /* CompleteClass */
  override var _engine: js.Any = js.native
  /* CompleteClass */
  override var _fallbacks: js.Any = js.native
  /* CompleteClass */
  override var _fragmentSourceCode: js.Any = js.native
  /* CompleteClass */
  override var _fragmentSourceCodeOverride: js.Any = js.native
  /* CompleteClass */
  override var _indexParameters: js.Any = js.native
  /* CompleteClass */
  override var _isReady: js.Any = js.native
  /* CompleteClass */
  override var _isReadyInternal: js.Any = js.native
  /**
    * Key for the effect.
    * @hidden
    */
  /* CompleteClass */
  override var _key: String = js.native
  /* CompleteClass */
  override var _loadShader: js.Any = js.native
  /** @hidden */
  /* CompleteClass */
  override var _onBindObservable: Nullable[typings.babylonjs.BABYLON.Observable[typings.babylonjs.BABYLON.Effect]] = js.native
  /**
    * Compiled shader to webGL program.
    * @hidden
    */
  /* CompleteClass */
  override var _pipelineContext: Nullable[IPipelineContext] = js.native
  /* CompleteClass */
  override var _processCompilationErrors: js.Any = js.native
  /* CompleteClass */
  override var _samplerList: js.Any = js.native
  /* CompleteClass */
  override var _samplers: js.Any = js.native
  /* CompleteClass */
  override var _transformFeedbackVaryings: js.Any = js.native
  /* CompleteClass */
  override var _uniformBuffersNames: js.Any = js.native
  /* CompleteClass */
  override var _uniforms: js.Any = js.native
  /* CompleteClass */
  override var _uniformsNames: js.Any = js.native
  /* CompleteClass */
  override var _useFinalCode: js.Any = js.native
  /* CompleteClass */
  override var _valueCache: js.Any = js.native
  /* CompleteClass */
  override var _vertexSourceCode: js.Any = js.native
  /* CompleteClass */
  override var _vertexSourceCodeOverride: js.Any = js.native
  /**
    * @hidden
    * Specifies if the effect was previously ready
    */
  /* CompleteClass */
  override var _wasPreviouslyReady: Boolean = js.native
  /**
    * String container all the define statements that should be set on the shader.
    */
  /* CompleteClass */
  override var defines: String = js.native
  /**
    * Name of the effect.
    */
  /* CompleteClass */
  override var name: js.Any = js.native
  /**
    * Callback that will be called when effect is bound.
    */
  /* CompleteClass */
  override var onBind: Nullable[js.Function1[/* effect */ this.type, Unit]] = js.native
  /**
    * Observable that will be called when the shader is compiled.
    * It is recommended to use executeWhenCompile() or to make sure that scene.isReady() is called to get this observable raised.
    */
  /* CompleteClass */
  override var onCompileObservable: typings.babylonjs.BABYLON.Observable[typings.babylonjs.BABYLON.Effect] = js.native
  /**
    * Callback that will be called when the shader is compiled.
    */
  /* CompleteClass */
  override var onCompiled: Nullable[js.Function1[/* effect */ this.type, Unit]] = js.native
  /**
    * Callback that will be called if an error occurs during shader compilation.
    */
  /* CompleteClass */
  override var onError: Nullable[js.Function2[/* effect */ this.type, /* errors */ String, Unit]] = js.native
  /**
    * Observable that will be called if an error occurs during shader compilation.
    */
  /* CompleteClass */
  override var onErrorObservable: typings.babylonjs.BABYLON.Observable[typings.babylonjs.BABYLON.Effect] = js.native
  /**
    * Unique ID of the effect.
    */
  /* CompleteClass */
  override var uniqueId: Double = js.native
  /**
    * Binds a texture to the engine to be used as output of the shader.
    * @param channel Name of the output variable.
    * @param texture Texture to bind.
    * @hidden
    */
  /* CompleteClass */
  override def _bindTexture(channel: String, texture: Nullable[typings.babylonjs.BABYLON.InternalTexture]): Unit = js.native
  /** @hidden */
  /* CompleteClass */
  override def _cacheFloat2(uniformName: String, x: Double, y: Double): Boolean = js.native
  /** @hidden */
  /* CompleteClass */
  override def _cacheFloat3(uniformName: String, x: Double, y: Double, z: Double): Boolean = js.native
  /** @hidden */
  /* CompleteClass */
  override def _cacheFloat4(uniformName: String, x: Double, y: Double, z: Double, w: Double): Boolean = js.native
  /** @hidden */
  /* CompleteClass */
  override def _cacheMatrix(uniformName: String, matrix: IMatrixLike): Boolean = js.native
  /**
    * Prepares the effect
    * @hidden
    */
  /* CompleteClass */
  override def _prepareEffect(): Unit = js.native
  /**
    * Recompiles the webGL program
    * @param vertexSourceCode The source code for the vertex shader.
    * @param fragmentSourceCode The source code for the fragment shader.
    * @param onCompiled Callback called when completed.
    * @param onError Callback called on error.
    * @hidden
    */
  /* CompleteClass */
  override def _rebuildProgram(
    vertexSourceCode: String,
    fragmentSourceCode: String,
    onCompiled: js.Function1[/* pipelineContext */ IPipelineContext, Unit],
    onError: js.Function1[/* message */ String, Unit]
  ): Unit = js.native
  /**
    * Gets a boolean indicating that all fallbacks were used during compilation
    * @returns true if all fallbacks were used
    */
  /* CompleteClass */
  override def allFallbacksProcessed(): Boolean = js.native
  /**
    * Binds block to a uniform.
    * @param blockName Name of the block to bind.
    * @param index Index to bind.
    */
  /* CompleteClass */
  override def bindUniformBlock(blockName: String, index: Double): Unit = js.native
  /**
    * Binds a buffer to a uniform.
    * @param buffer Buffer to bind.
    * @param name Name of the uniform variable to bind to.
    */
  /* CompleteClass */
  override def bindUniformBuffer(buffer: typings.babylonjs.BABYLON.DataBuffer, name: String): Unit = js.native
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Adds a callback to the onCompiled observable and call the callback imediatly if already ready.
    * @param func The callback to be used.
    */
  /* CompleteClass */
  override def executeWhenCompiled(func: js.Function1[/* effect */ this.type, Unit]): Unit = js.native
  /**
    * Returns the attribute at the given index.
    * @param index The index of the attribute.
    * @returns The location of the attribute.
    */
  /* CompleteClass */
  override def getAttributeLocation(index: Double): Double = js.native
  /**
    * Returns the attribute based on the name of the variable.
    * @param name of the attribute to look up.
    * @returns the attribute location.
    */
  /* CompleteClass */
  override def getAttributeLocationByName(name: String): Double = js.native
  /**
    * The number of attributes.
    * @returns the numnber of attributes.
    */
  /* CompleteClass */
  override def getAttributesCount(): Double = js.native
  /**
    * The set of names of attribute variables for the shader.
    * @returns An array of attribute names.
    */
  /* CompleteClass */
  override def getAttributesNames(): js.Array[String] = js.native
  /**
    * The error from the last compilation.
    * @returns the error string.
    */
  /* CompleteClass */
  override def getCompilationError(): String = js.native
  /**
    * The engine the effect was initialized with.
    * @returns the engine.
    */
  /* CompleteClass */
  override def getEngine(): typings.babylonjs.BABYLON.Engine = js.native
  /**
    * The pipeline context for this effect
    * @returns the associated pipeline context
    */
  /* CompleteClass */
  override def getPipelineContext(): Nullable[IPipelineContext] = js.native
  /**
    * Returns an array of sampler variable names
    * @returns The array of sampler variable neames.
    */
  /* CompleteClass */
  override def getSamplers(): js.Array[String] = js.native
  /**
    * Returns the attribute based on the name of the variable.
    * @param uniformName of the uniform to look up.
    * @returns the location of the uniform.
    */
  /* CompleteClass */
  override def getUniform(uniformName: String): Nullable[WebGLUniformLocation] = js.native
  /**
    * Gets the index of a uniform variable.
    * @param uniformName of the uniform to look up.
    * @returns the index.
    */
  /* CompleteClass */
  override def getUniformIndex(uniformName: String): Double = js.native
  /**
    * If the effect has been compiled and prepared.
    * @returns if the effect is compiled and prepared.
    */
  /* CompleteClass */
  override def isReady(): Boolean = js.native
  /**
    * Checks if the effect is supported. (Must be called after compilation)
    */
  /* CompleteClass */
  override def isSupported: Boolean = js.native
  /**
    * Unique key for this effect
    */
  /* CompleteClass */
  override def key: String = js.native
  /**
    * Observable that will be called when effect is bound.
    */
  /* CompleteClass */
  override def onBindObservable: typings.babylonjs.BABYLON.Observable[typings.babylonjs.BABYLON.Effect] = js.native
  /**
    * Sets an array on a uniform variable.
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setArray(uniformName: String, array: js.Array[Double]): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets an array 2 on a uniform variable. (Array is specified as single array eg. [1,2,3,4] will result in [[1,2],[3,4]] in the shader)
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setArray2(uniformName: String, array: js.Array[Double]): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets an array 3 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6] will result in [[1,2,3],[4,5,6]] in the shader)
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setArray3(uniformName: String, array: js.Array[Double]): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets an array 4 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6,7,8] will result in [[1,2,3,4],[5,6,7,8]] in the shader)
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setArray4(uniformName: String, array: js.Array[Double]): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets a boolean on a uniform variable.
    * @param uniformName Name of the variable.
    * @param bool value to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setBool(uniformName: String, bool: Boolean): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets a Color3 on a uniform variable.
    * @param uniformName Name of the variable.
    * @param color3 Value to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setColor3(uniformName: String, color3: IColor3Like): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets a Color4 on a uniform variable.
    * @param uniformName Name of the variable.
    * @param color3 Value to be set.
    * @param alpha Alpha value to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setColor4(uniformName: String, color3: IColor3Like, alpha: Double): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets a depth stencil texture from a render target on the engine to be used in the shader.
    * @param channel Name of the sampler variable.
    * @param texture Texture to set.
    */
  /* CompleteClass */
  override def setDepthStencilTexture(channel: String, texture: Nullable[typings.babylonjs.BABYLON.RenderTargetTexture]): Unit = js.native
  /**
    * Sets a Color4 on a uniform variable
    * @param uniformName defines the name of the variable
    * @param color4 defines the value to be set
    * @returns this effect.
    */
  /* CompleteClass */
  override def setDirectColor4(uniformName: String, color4: IColor4Like): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets a float on a uniform variable.
    * @param uniformName Name of the variable.
    * @param value value to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setFloat(uniformName: String, value: Double): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets a float2 on a uniform variable.
    * @param uniformName Name of the variable.
    * @param x First float in float2.
    * @param y Second float in float2.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setFloat2(uniformName: String, x: Double, y: Double): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets a float3 on a uniform variable.
    * @param uniformName Name of the variable.
    * @param x First float in float3.
    * @param y Second float in float3.
    * @param z Third float in float3.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setFloat3(uniformName: String, x: Double, y: Double, z: Double): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets a float4 on a uniform variable.
    * @param uniformName Name of the variable.
    * @param x First float in float4.
    * @param y Second float in float4.
    * @param z Third float in float4.
    * @param w Fourth float in float4.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setFloat4(uniformName: String, x: Double, y: Double, z: Double, w: Double): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets an float array on a uniform variable.
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setFloatArray(uniformName: String, array: Float32Array): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets an float array 2 on a uniform variable. (Array is specified as single array eg. [1,2,3,4] will result in [[1,2],[3,4]] in the shader)
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setFloatArray2(uniformName: String, array: Float32Array): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets an float array 3 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6] will result in [[1,2,3],[4,5,6]] in the shader)
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setFloatArray3(uniformName: String, array: Float32Array): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets an float array 4 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6,7,8] will result in [[1,2,3,4],[5,6,7,8]] in the shader)
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setFloatArray4(uniformName: String, array: Float32Array): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets an interger value on a uniform variable.
    * @param uniformName Name of the variable.
    * @param value Value to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setInt(uniformName: String, value: Double): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets an int array on a uniform variable.
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setIntArray(uniformName: String, array: Int32Array): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets an int array 2 on a uniform variable. (Array is specified as single array eg. [1,2,3,4] will result in [[1,2],[3,4]] in the shader)
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setIntArray2(uniformName: String, array: Int32Array): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets an int array 3 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6] will result in [[1,2,3],[4,5,6]] in the shader)
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setIntArray3(uniformName: String, array: Int32Array): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets an int array 4 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6,7,8] will result in [[1,2,3,4],[5,6,7,8]] in the shader)
    * @param uniformName Name of the variable.
    * @param array array to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setIntArray4(uniformName: String, array: Int32Array): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets matrices on a uniform variable.
    * @param uniformName Name of the variable.
    * @param matrices matrices to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setMatrices(uniformName: String, matrices: Float32Array): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets matrix on a uniform variable.
    * @param uniformName Name of the variable.
    * @param matrix matrix to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setMatrix(uniformName: String, matrix: IMatrixLike): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets a 2x2 matrix on a uniform variable. (Speicified as [1,2,3,4] will result in [1,2][3,4] matrix)
    * @param uniformName Name of the variable.
    * @param matrix matrix to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setMatrix2x2(uniformName: String, matrix: Float32Array): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets a 3x3 matrix on a uniform variable. (Speicified as [1,2,3,4,5,6,7,8,9] will result in [1,2,3][4,5,6][7,8,9] matrix)
    * @param uniformName Name of the variable.
    * @param matrix matrix to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setMatrix3x3(uniformName: String, matrix: Float32Array): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets a texture on the engine to be used in the shader.
    * @param channel Name of the sampler variable.
    * @param texture Texture to set.
    */
  /* CompleteClass */
  override def setTexture(channel: String, texture: Nullable[typings.babylonjs.BABYLON.BaseTexture]): Unit = js.native
  /**
    * Sets an array of textures on the engine to be used in the shader.
    * @param channel Name of the variable.
    * @param textures Textures to set.
    */
  /* CompleteClass */
  override def setTextureArray(channel: String, textures: js.Array[typings.babylonjs.BABYLON.BaseTexture]): Unit = js.native
  /**
    * Sets a texture to be the input of the specified post process. (To use the output, pass in the next post process in the pipeline)
    * @param channel Name of the sampler variable.
    * @param postProcess Post process to get the input texture from.
    */
  /* CompleteClass */
  override def setTextureFromPostProcess(channel: String, postProcess: Nullable[typings.babylonjs.BABYLON.PostProcess]): Unit = js.native
  /**
    * (Warning! setTextureFromPostProcessOutput may be desired instead)
    * Sets the input texture of the passed in post process to be input of this effect. (To use the output of the passed in post process use setTextureFromPostProcessOutput)
    * @param channel Name of the sampler variable.
    * @param postProcess Post process to get the output texture from.
    */
  /* CompleteClass */
  override def setTextureFromPostProcessOutput(channel: String, postProcess: Nullable[typings.babylonjs.BABYLON.PostProcess]): Unit = js.native
  /**
    * Sets a Vector2 on a uniform variable.
    * @param uniformName Name of the variable.
    * @param vector2 vector2 to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setVector2(uniformName: String, vector2: IVector2Like): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets a Vector3 on a uniform variable.
    * @param uniformName Name of the variable.
    * @param vector3 Value to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setVector3(uniformName: String, vector3: IVector3Like): typings.babylonjs.BABYLON.Effect = js.native
  /**
    * Sets a Vector4 on a uniform variable.
    * @param uniformName Name of the variable.
    * @param vector4 Value to be set.
    * @returns this effect.
    */
  /* CompleteClass */
  override def setVector4(uniformName: String, vector4: IVector4Like): typings.babylonjs.BABYLON.Effect = js.native
}

/* static members */
@JSGlobal("BABYLON.Effect")
@js.native
object Effect extends js.Object {
  /**
    * Store of each included file for a shader (The can be looked up using effect.key)
    */
  var IncludesShadersStore: org.scalablytyped.runtime.StringDictionary[String] = js.native
  /**
    * Gets or sets the relative url used to load shaders if using the engine in non-minified mode
    */
  var ShadersRepository: String = js.native
  /**
    * Store of each shader (The can be looked up using effect.key)
    */
  var ShadersStore: org.scalablytyped.runtime.StringDictionary[String] = js.native
  var _baseCache: js.Any = js.native
  var _uniqueIdSeed: js.Any = js.native
  /**
    * This function will add a new shader to the shader store
    * @param name the name of the shader
    * @param pixelShader optional pixel shader content
    * @param vertexShader optional vertex shader content
    */
  def RegisterShader(name: String): Unit = js.native
  def RegisterShader(name: String, pixelShader: String): Unit = js.native
  def RegisterShader(name: String, pixelShader: String, vertexShader: String): Unit = js.native
  /**
    * Resets the cache of effects.
    */
  def ResetCache(): Unit = js.native
}

