package typings.phaser.phaserMod.Loader.FileTypes

import typings.phaser.Phaser.Loader.File
import typings.phaser.Phaser.Loader.LoaderPlugin
import typings.phaser.Phaser.Loader.MultiFile
import typings.phaser.Phaser.Types.Loader.FileTypes.UnityAtlasFileConfig
import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single text file based Unity Texture Atlas File suitable for loading by the Loader.
  * 
  * These are created when you use the Phaser.Loader.LoaderPlugin#unityAtlas method and are not typically created directly.
  * 
  * For documentation about what all the arguments and configuration options mean please see Phaser.Loader.LoaderPlugin#unityAtlas.
  */
@JSImport("phaser", "Loader.FileTypes.UnityAtlasFile")
@js.native
class UnityAtlasFile protected ()
  extends typings.phaser.Phaser.Loader.FileTypes.UnityAtlasFile {
  /**
    * 
    * @param loader A reference to the Loader that is responsible for this file.
    * @param key The key to use for this file, or a file configuration object.
    * @param textureURL The absolute or relative URL to load the texture image file from. If undefined or `null` it will be set to `<key>.png`, i.e. if `key` was "alien" then the URL will be "alien.png".
    * @param atlasURL The absolute or relative URL to load the texture atlas data file from. If undefined or `null` it will be set to `<key>.txt`, i.e. if `key` was "alien" then the URL will be "alien.txt".
    * @param textureXhrSettings An XHR Settings configuration object for the atlas image file. Used in replacement of the Loaders default XHR Settings.
    * @param atlasXhrSettings An XHR Settings configuration object for the atlas data file. Used in replacement of the Loaders default XHR Settings.
    */
  def this(loader: LoaderPlugin, key: String) = this()
  def this(loader: LoaderPlugin, key: UnityAtlasFileConfig) = this()
  def this(loader: LoaderPlugin, key: String, textureURL: String) = this()
  def this(loader: LoaderPlugin, key: String, textureURL: js.Array[String]) = this()
  def this(loader: LoaderPlugin, key: UnityAtlasFileConfig, textureURL: String) = this()
  def this(loader: LoaderPlugin, key: UnityAtlasFileConfig, textureURL: js.Array[String]) = this()
  def this(loader: LoaderPlugin, key: String, textureURL: String, atlasURL: String) = this()
  def this(loader: LoaderPlugin, key: String, textureURL: js.Array[String], atlasURL: String) = this()
  def this(loader: LoaderPlugin, key: UnityAtlasFileConfig, textureURL: String, atlasURL: String) = this()
  def this(loader: LoaderPlugin, key: UnityAtlasFileConfig, textureURL: js.Array[String], atlasURL: String) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: UnityAtlasFileConfig,
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: UnityAtlasFileConfig,
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: String,
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: UnityAtlasFileConfig,
    textureURL: String,
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  def this(
    loader: LoaderPlugin,
    key: UnityAtlasFileConfig,
    textureURL: js.Array[String],
    atlasURL: String,
    textureXhrSettings: XHRSettingsObject,
    atlasXhrSettings: XHRSettingsObject
  ) = this()
  /**
    * A reference to the Loaders baseURL at the time this MultiFile was created.
    * Used to populate child-files.
    */
  /* CompleteClass */
  override var baseURL: String = js.native
  /**
    * The completion status of this MultiFile.
    */
  /* CompleteClass */
  override var complete: Boolean = js.native
  /**
    * A storage container for transient data that the loading files need.
    */
  /* CompleteClass */
  override var config: js.Any = js.native
  /**
    * The number of files that failed to load.
    */
  /* CompleteClass */
  override var failed: integer = js.native
  /**
    * Array of files that make up this MultiFile.
    */
  /* CompleteClass */
  override var files: js.Array[File] = js.native
  /**
    * Unique cache key (unique within its file type)
    */
  /* CompleteClass */
  override var key: String = js.native
  /**
    * A reference to the Loader that is going to load this file.
    */
  /* CompleteClass */
  override var loader: LoaderPlugin = js.native
  /**
    * A reference to the Loaders path at the time this MultiFile was created.
    * Used to populate child-files.
    */
  /* CompleteClass */
  override var path: String = js.native
  /**
    * The number of files to load.
    */
  /* CompleteClass */
  override var pending: integer = js.native
  /**
    * A reference to the Loaders prefix at the time this MultiFile was created.
    * Used to populate child-files.
    */
  /* CompleteClass */
  override var prefix: String = js.native
  /**
    * The file type string for sorting within the Loader.
    */
  /* CompleteClass */
  override var `type`: String = js.native
  /**
    * Adds this file to its target cache upon successful loading and processing.
    */
  /* CompleteClass */
  override def addToCache(): Unit = js.native
  /**
    * Adds another child to this MultiFile, increases the pending count and resets the completion status.
    * @param files The File to add to this MultiFile.
    */
  /* CompleteClass */
  override def addToMultiFile(files: File): MultiFile = js.native
  /**
    * Checks if this MultiFile is ready to process its children or not.
    */
  /* CompleteClass */
  override def isReadyToProcess(): Boolean = js.native
  /**
    * Called by each File when it finishes loading.
    * @param file The File that has completed processing.
    */
  /* CompleteClass */
  override def onFileComplete(file: File): Unit = js.native
  /**
    * Called by each File that fails to load.
    * @param file The File that has failed to load.
    */
  /* CompleteClass */
  override def onFileFailed(file: File): Unit = js.native
}

