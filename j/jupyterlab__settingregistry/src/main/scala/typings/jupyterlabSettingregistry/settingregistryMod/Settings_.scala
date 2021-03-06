package typings.jupyterlabSettingregistry.settingregistryMod

import typings.jupyterlabSettingregistry.anon.User
import typings.jupyterlabSettingregistry.settingregistryMod.ISchemaValidator.IError
import typings.jupyterlabSettingregistry.settingregistryMod.Settings.IOptions
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISchema
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISettings
import typings.luminoCoreutils.jsonMod.PartialJSONValue
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/settingregistry/lib/settingregistry", "Settings")
@js.native
class Settings_ protected () extends ISettings {
  /**
    * Instantiate a new plugin settings manager.
    */
  def this(options: IOptions) = this()
  var _changed: js.Any = js.native
  var _isDisposed: js.Any = js.native
  /**
    * Handle plugin changes in the setting registry.
    */
  var _onPluginChanged: js.Any = js.native
  /**
    * A signal that emits when the plugin's settings have changed.
    */
  /* CompleteClass */
  override val changed: ISignal[this.type, Unit] = js.native
  /**
    * The composite of user settings and extension defaults.
    */
  /* CompleteClass */
  override val composite: ReadonlyPartialJSONObject = js.native
  /**
    * The plugin's ID.
    */
  /* CompleteClass */
  override val id: String = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /* CompleteClass */
  override val plugin: IPlugin = js.native
  /**
    * The plugin settings raw text value.
    */
  /* CompleteClass */
  override val raw: String = js.native
  /**
    * The setting registry instance used as a back-end for these settings.
    */
  val registry: ISettingRegistry = js.native
  /**
    * The plugin's schema.
    */
  /* CompleteClass */
  override val schema: ISchema = js.native
  /**
    * The user settings.
    */
  /* CompleteClass */
  override val user: ReadonlyPartialJSONObject = js.native
  /**
    * The published version of the NPM package containing these settings.
    */
  /* CompleteClass */
  override val version: String = js.native
  /**
    * Return the defaults in a commented JSON format.
    */
  /* CompleteClass */
  override def annotatedDefaults(): String = js.native
  /**
    * A signal that emits when the plugin's settings have changed.
    */
  @JSName("changed")
  def changed_MSettings_ : ISignal[this.type, Unit] = js.native
  /**
    * The composite of user settings and extension defaults.
    */
  @JSName("composite")
  def composite_MSettings_ : ReadonlyPartialJSONObject = js.native
  /**
    * Calculate the default value of a setting by iterating through the schema.
    *
    * @param key - The name of the setting whose default value is calculated.
    *
    * @returns A calculated default JSON value for a specific setting.
    */
  /* CompleteClass */
  override def default(key: String): js.UndefOr[PartialJSONValue] = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Get an individual setting.
    *
    * @param key - The name of the setting being retrieved.
    *
    * @returns The setting value.
    */
  /* CompleteClass */
  override def get(key: String): User = js.native
  /**
    * Test whether the plugin settings manager disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MSettings_ : Boolean = js.native
  @JSName("plugin")
  def plugin_MSettings_ : IPlugin = js.native
  /**
    * The plugin settings raw text value.
    */
  @JSName("raw")
  def raw_MSettings_ : String = js.native
  /**
    * Remove a single setting.
    *
    * @param key - The name of the setting being removed.
    *
    * @returns A promise that resolves when the setting is removed.
    *
    * #### Notes
    * This function is asynchronous because it writes to the setting registry.
    */
  /* CompleteClass */
  override def remove(key: String): js.Promise[Unit] = js.native
  /**
    * Save all of the plugin's user settings at once.
    */
  /* CompleteClass */
  override def save(raw: String): js.Promise[Unit] = js.native
  /**
    * The plugin's schema.
    */
  @JSName("schema")
  def schema_MSettings_ : ISchema = js.native
  /**
    * Set a single setting.
    *
    * @param key - The name of the setting being set.
    *
    * @param value - The value of the setting.
    *
    * @returns A promise that resolves when the setting has been saved.
    *
    * #### Notes
    * This function is asynchronous because it writes to the setting registry.
    */
  /* CompleteClass */
  override def set(key: String, value: PartialJSONValue): js.Promise[Unit] = js.native
  /**
    * The user settings.
    */
  @JSName("user")
  def user_MSettings_ : ReadonlyPartialJSONObject = js.native
  /**
    * Validates raw settings with comments.
    *
    * @param raw - The JSON with comments string being validated.
    *
    * @returns A list of errors or `null` if valid.
    */
  /* CompleteClass */
  override def validate(raw: String): js.Array[IError] | Null = js.native
  /**
    * The published version of the NPM package containing these settings.
    */
  @JSName("version")
  def version_MSettings_ : String = js.native
}

