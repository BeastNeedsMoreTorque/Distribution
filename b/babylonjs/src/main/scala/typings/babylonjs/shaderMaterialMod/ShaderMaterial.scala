package typings.babylonjs.shaderMaterialMod

import typings.babylonjs.anon.PartialIShaderMaterialOpt
import typings.babylonjs.materialMod.Material
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.mathVectorMod.Vector4
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.textureMod.Texture
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/shaderMaterial", "ShaderMaterial")
@js.native
class ShaderMaterial protected () extends Material {
  /**
    * Instantiate a new shader material.
    * The ShaderMaterial object has the necessary methods to pass data from your scene to the Vertex and Fragment Shaders and returns a material that can be applied to any mesh.
    * This returned material effects how the mesh will look based on the code in the shaders.
    * @see http://doc.babylonjs.com/how_to/shader_material
    * @param name Define the name of the material in the scene
    * @param scene Define the scene the material belongs to
    * @param shaderPath Defines  the route to the shader code in one of three ways:
    *  * object: { vertex: "custom", fragment: "custom" }, used with Effect.ShadersStore["customVertexShader"] and Effect.ShadersStore["customFragmentShader"]
    *  * object: { vertexElement: "vertexShaderCode", fragmentElement: "fragmentShaderCode" }, used with shader code in script tags
    *  * object: { vertexSource: "vertex shader code string", fragmentSource: "fragment shader code string" } using with strings containing the shaders code
    *  * string: "./COMMON_NAME", used with external files COMMON_NAME.vertex.fx and COMMON_NAME.fragment.fx in index.html folder.
    * @param options Define the options used to create the shader
    */
  def this(name: String, scene: Scene, shaderPath: js.Any) = this()
  def this(name: String, scene: Scene, shaderPath: js.Any, options: PartialIShaderMaterialOpt) = this()
  var _cachedWorldViewMatrix: js.Any = js.native
  var _cachedWorldViewProjectionMatrix: js.Any = js.native
  var _checkCache: js.Any = js.native
  var _checkUniform: js.Any = js.native
  var _colors3: js.Any = js.native
  var _colors3Arrays: js.Any = js.native
  var _colors4: js.Any = js.native
  var _colors4Arrays: js.Any = js.native
  var _floats: js.Any = js.native
  var _floatsArrays: js.Any = js.native
  var _ints: js.Any = js.native
  var _matrices: js.Any = js.native
  var _matrices2x2: js.Any = js.native
  var _matrices3x3: js.Any = js.native
  var _matrixArrays: js.Any = js.native
  var _multiview: js.Any = js.native
  var _options: js.Any = js.native
  var _renderId: js.Any = js.native
  var _shaderPath: js.Any = js.native
  var _textureArrays: js.Any = js.native
  var _textures: js.Any = js.native
  var _vectors2: js.Any = js.native
  var _vectors2Arrays: js.Any = js.native
  var _vectors3: js.Any = js.native
  var _vectors3Arrays: js.Any = js.native
  var _vectors4: js.Any = js.native
  var _vectors4Arrays: js.Any = js.native
  /**
    * Gets the options used to compile the shader.
    * They can be modified to trigger a new compilation
    */
  def options: IShaderMaterialOptions = js.native
  /**
    * Set a vec2 array in the shader from a number array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setArray2(name: String, value: js.Array[Double]): ShaderMaterial = js.native
  /**
    * Set a vec3 array in the shader from a number array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setArray3(name: String, value: js.Array[Double]): ShaderMaterial = js.native
  /**
    * Set a vec4 array in the shader from a number array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setArray4(name: String, value: js.Array[Double]): ShaderMaterial = js.native
  /**
    * Set a vec3 in the shader from a Color3.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setColor3(name: String, value: Color3): ShaderMaterial = js.native
  /**
    * Set a vec3 array in the shader from a Color3 array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setColor3Array(name: String, value: js.Array[Color3]): ShaderMaterial = js.native
  /**
    * Set a vec4 in the shader from a Color4.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setColor4(name: String, value: Color4): ShaderMaterial = js.native
  /**
    * Set a vec4 array in the shader from a Color4 array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setColor4Array(name: String, value: js.Array[Color4]): ShaderMaterial = js.native
  /**
    * Set a float in the shader.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setFloat(name: String, value: Double): ShaderMaterial = js.native
  /**
    * Set an array of floats in the shader.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setFloats(name: String, value: js.Array[Double]): ShaderMaterial = js.native
  /**
    * Set a int in the shader.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setInt(name: String, value: Double): ShaderMaterial = js.native
  /**
    * Set a float32Array in the shader from a matrix array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setMatrices(name: String, value: js.Array[Matrix]): ShaderMaterial = js.native
  /**
    * Set a mat4 in the shader from a Matrix.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setMatrix(name: String, value: Matrix): ShaderMaterial = js.native
  /**
    * Set a mat2 in the shader from a Float32Array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setMatrix2x2(name: String, value: Float32Array): ShaderMaterial = js.native
  /**
    * Set a mat3 in the shader from a Float32Array.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setMatrix3x3(name: String, value: Float32Array): ShaderMaterial = js.native
  /**
    * Set a texture in the shader.
    * @param name Define the name of the uniform samplers as defined in the shader
    * @param texture Define the texture to bind to this sampler
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setTexture(name: String, texture: Texture): ShaderMaterial = js.native
  /**
    * Set a texture array in the shader.
    * @param name Define the name of the uniform sampler array as defined in the shader
    * @param textures Define the list of textures to bind to this sampler
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setTextureArray(name: String, textures: js.Array[Texture]): ShaderMaterial = js.native
  /**
    * Set a vec2 in the shader from a Vector2.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setVector2(name: String, value: Vector2): ShaderMaterial = js.native
  /**
    * Set a vec3 in the shader from a Vector3.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setVector3(name: String, value: Vector3): ShaderMaterial = js.native
  /**
    * Set a vec4 in the shader from a Vector4.
    * @param name Define the name of the uniform as defined in the shader
    * @param value Define the value to give to the uniform
    * @return the material itself allowing "fluent" like uniform updates
    */
  def setVector4(name: String, value: Vector4): ShaderMaterial = js.native
  /**
    * Gets the shader path used to define the shader code
    * It can be modified to trigger a new compilation
    */
  def shaderPath: js.Any = js.native
  /**
    * Sets the shader path used to define the shader code
    * It can be modified to trigger a new compilation
    */
  def shaderPath(shaderPath: js.Any): js.Any = js.native
}

/* static members */
@JSImport("babylonjs/Materials/shaderMaterial", "ShaderMaterial")
@js.native
object ShaderMaterial extends js.Object {
  /**
    * Creates a shader material from parsed shader material data
    * @param source defines the JSON represnetation of the material
    * @param scene defines the hosting scene
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @returns a new material
    */
  def Parse(source: js.Any, scene: Scene, rootUrl: String): ShaderMaterial = js.native
}

