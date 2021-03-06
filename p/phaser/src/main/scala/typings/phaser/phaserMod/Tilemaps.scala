package typings.phaser.phaserMod

import typings.phaser.Phaser.Types.Tilemaps.GIDData
import typings.phaser.Phaser.Types.Tilemaps.LayerDataConfig
import typings.phaser.Phaser.Types.Tilemaps.MapDataConfig
import typings.phaser.Phaser.Types.Tilemaps.ObjectLayerConfig
import typings.phaser.Phaser.Types.Tilemaps.TiledObject
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("phaser", "Tilemaps")
@js.native
object Tilemaps extends js.Object {
  /**
    * A Dynamic Tilemap Layer is a Game Object that renders LayerData from a Tilemap when used in combination
    * with one, or more, Tilesets.
    * 
    * A Dynamic Tilemap Layer trades some speed for being able to apply powerful effects. Unlike a
    * Static Tilemap Layer, you can apply per-tile effects like tint or alpha, and you can change the
    * tiles in a DynamicTilemapLayer.
    * 
    * Use this over a Static Tilemap Layer when you need those features.
    */
  @js.native
  class DynamicTilemapLayer protected ()
    extends typings.phaser.Phaser.Tilemaps.DynamicTilemapLayer {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs.
      * @param tilemap The Tilemap this layer is a part of.
      * @param layerIndex The index of the LayerData associated with this layer.
      * @param tileset The tileset, or an array of tilesets, used to render this layer. Can be a string or a Tileset object.
      * @param x The world x position where the top left of this layer will be placed. Default 0.
      * @param y The world y position where the top left of this layer will be placed. Default 0.
      */
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: integer,
      tileset: String
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: integer,
      tileset: js.Array[String | typings.phaser.Phaser.Tilemaps.Tileset]
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: integer,
      tileset: typings.phaser.Phaser.Tilemaps.Tileset
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: integer,
      tileset: String,
      x: Double
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: integer,
      tileset: js.Array[String | typings.phaser.Phaser.Tilemaps.Tileset],
      x: Double
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: integer,
      tileset: typings.phaser.Phaser.Tilemaps.Tileset,
      x: Double
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: integer,
      tileset: String,
      x: Double,
      y: Double
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: integer,
      tileset: js.Array[String | typings.phaser.Phaser.Tilemaps.Tileset],
      x: Double,
      y: Double
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: integer,
      tileset: typings.phaser.Phaser.Tilemaps.Tileset,
      x: Double,
      y: Double
    ) = this()
    /**
      * The depth of this Game Object within the Scene.
      * 
      * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
      * of Game Objects, without actually moving their position in the display list.
      * 
      * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
      * value will always render in front of one with a lower value.
      * 
      * Setting the depth will queue a depth sort event within the Scene.
      */
    /* CompleteClass */
    override var depth: Double = js.native
    /**
      * The displayed height of this Game Object.
      * 
      * This value takes into account the scale factor.
      * 
      * Setting this value will adjust the Game Object's scale property.
      */
    /* CompleteClass */
    override var displayHeight: Double = js.native
    /**
      * The displayed width of this Game Object.
      * 
      * This value takes into account the scale factor.
      * 
      * Setting this value will adjust the Game Object's scale property.
      */
    /* CompleteClass */
    override var displayWidth: Double = js.native
    /**
      * The horizontally flipped state of the Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override var flipX: Boolean = js.native
    /**
      * The vertically flipped state of the Game Object.
      * 
      * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override var flipY: Boolean = js.native
    /**
      * The native (un-scaled) height of this Game Object.
      * 
      * Changing this value will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or use
      * the `displayHeight` property.
      */
    /* CompleteClass */
    override var height: Double = js.native
    /**
      * The visible state of the Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      */
    /* CompleteClass */
    override var visible: Boolean = js.native
    /**
      * The native (un-scaled) width of this Game Object.
      * 
      * Changing this value will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or use
      * the `displayWidth` property.
      */
    /* CompleteClass */
    override var width: Double = js.native
    /**
      * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
      */
    /* CompleteClass */
    override def resetFlip(): this.type = js.native
    /**
      * The depth of this Game Object within the Scene.
      * 
      * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
      * of Game Objects, without actually moving their position in the display list.
      * 
      * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
      * value will always render in front of one with a lower value.
      * 
      * Setting the depth will queue a depth sort event within the Scene.
      * @param value The depth of this Game Object.
      */
    /* CompleteClass */
    override def setDepth(value: integer): this.type = js.native
    /**
      * Sets the display size of this Game Object.
      * 
      * Calling this will adjust the scale.
      * @param width The width of this Game Object.
      * @param height The height of this Game Object.
      */
    /* CompleteClass */
    override def setDisplaySize(width: Double, height: Double): this.type = js.native
    /**
      * Sets the horizontal and vertical flipped state of this Game Object.
      * 
      * A Game Object that is flipped will render inversed on the flipped axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
      * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlip(x: Boolean, y: Boolean): this.type = js.native
    /**
      * Sets the horizontal flipped state of this Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      * @param value The flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlipX(value: Boolean): this.type = js.native
    /**
      * Sets the vertical flipped state of this Game Object.
      * @param value The flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlipY(value: Boolean): this.type = js.native
    /**
      * Sets the internal size of this Game Object, as used for frame or physics body creation.
      * 
      * This will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or call the
      * `setDisplaySize` method, which is the same thing as changing the scale but allows you
      * to do so by giving pixel values.
      * 
      * If you have enabled this Game Object for input, changing the size will _not_ change the
      * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
      * @param width The width of this Game Object.
      * @param height The height of this Game Object.
      */
    /* CompleteClass */
    override def setSize(width: Double, height: Double): this.type = js.native
    /**
      * Sets the visibility of this Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      * @param value The visible state of the Game Object.
      */
    /* CompleteClass */
    override def setVisible(value: Boolean): this.type = js.native
    /**
      * Toggles the horizontal flipped state of this Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override def toggleFlipX(): this.type = js.native
    /**
      * Toggles the vertical flipped state of this Game Object.
      */
    /* CompleteClass */
    override def toggleFlipY(): this.type = js.native
  }
  
  /**
    * An Image Collection is a special Tile Set containing multiple images, with no slicing into each image.
    * 
    * Image Collections are normally created automatically when Tiled data is loaded.
    */
  @js.native
  class ImageCollection protected ()
    extends typings.phaser.Phaser.Tilemaps.ImageCollection {
    /**
      * 
      * @param name The name of the image collection in the map data.
      * @param firstgid The first image index this image collection contains.
      * @param width Width of widest image (in pixels). Default 32.
      * @param height Height of tallest image (in pixels). Default 32.
      * @param margin The margin around all images in the collection (in pixels). Default 0.
      * @param spacing The spacing between each image in the collection (in pixels). Default 0.
      * @param properties Custom Image Collection properties. Default {}.
      */
    def this(name: String, firstgid: integer) = this()
    def this(name: String, firstgid: integer, width: integer) = this()
    def this(name: String, firstgid: integer, width: integer, height: integer) = this()
    def this(name: String, firstgid: integer, width: integer, height: integer, margin: integer) = this()
    def this(
      name: String,
      firstgid: integer,
      width: integer,
      height: integer,
      margin: integer,
      spacing: integer
    ) = this()
    def this(
      name: String,
      firstgid: integer,
      width: integer,
      height: integer,
      margin: integer,
      spacing: integer,
      properties: js.Object
    ) = this()
    /**
      * The Tiled firstgid value.
      * This is the starting index of the first image index this Image Collection contains.
      */
    /* CompleteClass */
    override var firstgid: integer = js.native
    /**
      * The height of the tallest image (in pixels).
      */
    /* CompleteClass */
    override val imageHeight: integer = js.native
    /**
      * The margin around the images in the collection (in pixels).
      * Use `setSpacing` to change.
      */
    /* CompleteClass */
    override val imageMarge: integer = js.native
    /**
      * The spacing between each image in the collection (in pixels).
      * Use `setSpacing` to change.
      */
    /* CompleteClass */
    override val imageSpacing: integer = js.native
    /**
      * The width of the widest image (in pixels).
      */
    /* CompleteClass */
    override val imageWidth: integer = js.native
    /**
      * The cached images that are a part of this collection.
      */
    /* CompleteClass */
    override val images: js.Array[_] = js.native
    /**
      * The name of the Image Collection.
      */
    /* CompleteClass */
    override var name: String = js.native
    /**
      * Image Collection-specific properties that are typically defined in the Tiled editor.
      */
    /* CompleteClass */
    override var properties: js.Object = js.native
    /**
      * The total number of images in the image collection.
      */
    /* CompleteClass */
    override val total: integer = js.native
    /**
      * Add an image to this Image Collection.
      * @param gid The gid of the image in the Image Collection.
      * @param image The the key of the image in the Image Collection and in the cache.
      */
    /* CompleteClass */
    override def addImage(gid: integer, image: String): typings.phaser.Phaser.Tilemaps.ImageCollection = js.native
    /**
      * Returns true if and only if this image collection contains the given image index.
      * @param imageIndex The image index to search for.
      */
    /* CompleteClass */
    override def containsImageIndex(imageIndex: integer): Boolean = js.native
  }
  
  /**
    * A class for representing data about about a layer in a map. Maps are parsed from CSV, Tiled,
    * etc. into this format. Tilemap, StaticTilemapLayer and DynamicTilemapLayer have a reference
    * to this data and use it to look up and perform operations on tiles.
    */
  @js.native
  /**
    * 
    * @param config The Layer Data configuration object.
    */
  class LayerData ()
    extends typings.phaser.Phaser.Tilemaps.LayerData {
    def this(config: LayerDataConfig) = this()
    /**
      * The alpha value of the layer.
      */
    /* CompleteClass */
    override var alpha: Double = js.native
    /**
      * The base tile height.
      */
    /* CompleteClass */
    override var baseTileHeight: Double = js.native
    /**
      * The base tile width.
      */
    /* CompleteClass */
    override var baseTileWidth: Double = js.native
    /**
      * An array of physics bodies.
      */
    /* CompleteClass */
    override var bodies: js.Array[_] = js.native
    /**
      * An array of callbacks.
      */
    /* CompleteClass */
    override var callbacks: js.Array[_] = js.native
    /**
      * Tile Collision ID index map.
      */
    /* CompleteClass */
    override var collideIndexes: js.Array[_] = js.native
    /**
      * An array of the tile data indexes.
      */
    /* CompleteClass */
    override var data: js.Array[js.Array[typings.phaser.Phaser.Tilemaps.Tile]] = js.native
    /**
      * The height of the layer in tiles.
      */
    /* CompleteClass */
    override var height: Double = js.native
    /**
      * The height in pixels of the entire layer.
      */
    /* CompleteClass */
    override var heightInPixels: Double = js.native
    /**
      * Tile ID index map.
      */
    /* CompleteClass */
    override var indexes: js.Array[_] = js.native
    /**
      * The name of the layer, if specified in Tiled.
      */
    /* CompleteClass */
    override var name: String = js.native
    /**
      * Layer specific properties (can be specified in Tiled)
      */
    /* CompleteClass */
    override var properties: js.Array[js.Object] = js.native
    /**
      * The pixel height of the tiles.
      */
    /* CompleteClass */
    override var tileHeight: Double = js.native
    /**
      * The pixel width of the tiles.
      */
    /* CompleteClass */
    override var tileWidth: Double = js.native
    /**
      * A reference to the Tilemap layer that owns this data.
      */
    /* CompleteClass */
    override var tilemapLayer: typings.phaser.Phaser.Tilemaps.DynamicTilemapLayer | typings.phaser.Phaser.Tilemaps.StaticTilemapLayer = js.native
    /**
      * Is the layer visible or not?
      */
    /* CompleteClass */
    override var visible: Boolean = js.native
    /**
      * The width of the layer in tiles.
      */
    /* CompleteClass */
    override var width: Double = js.native
    /**
      * The width in pixels of the entire layer.
      */
    /* CompleteClass */
    override var widthInPixels: Double = js.native
    /**
      * The x offset of where to draw from the top left.
      */
    /* CompleteClass */
    override var x: Double = js.native
    /**
      * The y offset of where to draw from the top left.
      */
    /* CompleteClass */
    override var y: Double = js.native
  }
  
  /**
    * A class for representing data about a map. Maps are parsed from CSV, Tiled, etc. into this
    * format. A Tilemap object get a copy of this data and then unpacks the needed properties into
    * itself.
    */
  @js.native
  /**
    * 
    * @param config The Map configuration object.
    */
  class MapData ()
    extends typings.phaser.Phaser.Tilemaps.MapData {
    def this(config: MapDataConfig) = this()
    /**
      * An object of collision data. Must be created as physics object or will return undefined.
      */
    /* CompleteClass */
    override var collision: js.Object = js.native
    /**
      * The format of the map data.
      */
    /* CompleteClass */
    override var format: integer = js.native
    /**
      * The height of the entire tilemap.
      */
    /* CompleteClass */
    override var height: Double = js.native
    /**
      * The height in pixels of the entire tilemap.
      */
    /* CompleteClass */
    override var heightInPixels: Double = js.native
    /**
      * The collection of images the map uses(specified in Tiled)
      */
    /* CompleteClass */
    override var imageCollections: js.Array[_] = js.native
    /**
      * An array of Tiled Image Layers.
      */
    /* CompleteClass */
    override var images: js.Array[_] = js.native
    /**
      * If the map is infinite or not.
      */
    /* CompleteClass */
    override var infinite: Boolean = js.native
    /**
      * An array with all the layers configured to the MapData.
      */
    /* CompleteClass */
    override var layers: js.Array[typings.phaser.Phaser.Tilemaps.LayerData] | typings.phaser.Phaser.Tilemaps.ObjectLayer = js.native
    /**
      * The key in the Phaser cache that corresponds to the loaded tilemap data.
      */
    /* CompleteClass */
    override var name: String = js.native
    /**
      * An object of Tiled Object Layers.
      */
    /* CompleteClass */
    override var objects: js.Object = js.native
    /**
      * The orientation of the map data (i.e. orthogonal, isometric, hexagonal), default 'orthogonal'.
      */
    /* CompleteClass */
    override var orientation: String = js.native
    /**
      * Map specific properties (can be specified in Tiled)
      */
    /* CompleteClass */
    override var properties: js.Object = js.native
    /**
      * Determines the draw order of tilemap. Default is right-down
      * 
      * 0, or 'right-down'
      * 1, or 'left-down'
      * 2, or 'right-up'
      * 3, or 'left-up'
      */
    /* CompleteClass */
    override var renderOrder: String = js.native
    /**
      * The height of the tiles.
      */
    /* CompleteClass */
    override var tileHeight: Double = js.native
    /**
      * The width of the tiles.
      */
    /* CompleteClass */
    override var tileWidth: Double = js.native
    /**
      * An array of tile instances.
      */
    /* CompleteClass */
    override var tiles: js.Array[_] = js.native
    /**
      * An array of Tilesets.
      */
    /* CompleteClass */
    override var tilesets: js.Array[typings.phaser.Phaser.Tilemaps.Tileset] = js.native
    /**
      * The version of the map data (as specified in Tiled).
      */
    /* CompleteClass */
    override var version: String = js.native
    /**
      * The width of the entire tilemap.
      */
    /* CompleteClass */
    override var width: Double = js.native
    /**
      * The width in pixels of the entire tilemap.
      */
    /* CompleteClass */
    override var widthInPixels: Double = js.native
  }
  
  /**
    * A class for representing a Tiled object layer in a map. This mirrors the structure of a Tiled
    * object layer, except:
    *  - "x" & "y" properties are ignored since these cannot be changed in Tiled.
    *  - "offsetx" & "offsety" are applied to the individual object coordinates directly, so they
    *    are ignored as well.
    *  - "draworder" is ignored.
    */
  @js.native
  /**
    * 
    * @param config The data for the layer from the Tiled JSON object.
    */
  class ObjectLayer ()
    extends typings.phaser.Phaser.Tilemaps.ObjectLayer {
    def this(config: ObjectLayerConfig) = this()
    /**
      * The name of the Object Layer.
      */
    /* CompleteClass */
    override var name: String = js.native
    /**
      * An array of all objects on this Object Layer.
      * 
      * Each Tiled object corresponds to a JavaScript object in this array. It has an `id` (unique),
      * `name` (as assigned in Tiled), `type` (as assigned in Tiled), `rotation` (in clockwise degrees),
      * `properties` (if any), `visible` state (`true` if visible, `false` otherwise),
      * `x` and `y` coordinates (in pixels, relative to the tilemap), and a `width` and `height` (in pixels).
      * 
      * An object tile has a `gid` property (GID of the represented tile), a `flippedHorizontal` property,
      * a `flippedVertical` property, and `flippedAntiDiagonal` property.
      * The {@link http://docs.mapeditor.org/en/latest/reference/tmx-map-format/|Tiled documentation} contains
      * information on flipping and rotation.
      * 
      * Polylines have a `polyline` property, which is an array of objects corresponding to points,
      * where each point has an `x` property and a `y` property. Polygons have an identically structured
      * array in their `polygon` property. Text objects have a `text` property with the text's properties.
      * 
      * Rectangles and ellipses have a `rectangle` or `ellipse` property set to `true`.
      */
    /* CompleteClass */
    override var objects: js.Array[TiledObject] = js.native
    /**
      * The opacity of the layer, between 0 and 1.
      */
    /* CompleteClass */
    override var opacity: Double = js.native
    /**
      * The custom properties defined on the Object Layer, keyed by their name.
      */
    /* CompleteClass */
    override var properties: js.Object = js.native
    /**
      * The type of each custom property defined on the Object Layer, keyed by its name.
      */
    /* CompleteClass */
    override var propertyTypes: js.Object = js.native
    /**
      * The type of the layer, which should be `objectgroup`.
      */
    /* CompleteClass */
    override var `type`: String = js.native
    /**
      * Whether the layer is shown (`true`) or hidden (`false`).
      */
    /* CompleteClass */
    override var visible: Boolean = js.native
  }
  
  /**
    * A Static Tilemap Layer is a Game Object that renders LayerData from a Tilemap when used in combination
    * with one, or more, Tilesets.
    * 
    * A Static Tilemap Layer is optimized for rendering speed over flexibility. You cannot apply per-tile
    * effects like tint or alpha, or change the tiles or tilesets the layer uses.
    * 
    * Use a Static Tilemap Layer instead of a Dynamic Tilemap Layer when you don't need tile manipulation features.
    */
  @js.native
  class StaticTilemapLayer protected ()
    extends typings.phaser.Phaser.Tilemaps.StaticTilemapLayer {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs.
      * @param tilemap The Tilemap this layer is a part of.
      * @param layerIndex The index of the LayerData associated with this layer.
      * @param tileset The tileset, or an array of tilesets, used to render this layer. Can be a string or a Tileset object.
      * @param x The world x position where the top left of this layer will be placed. Default 0.
      * @param y The world y position where the top left of this layer will be placed. Default 0.
      */
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: integer,
      tileset: String
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: integer,
      tileset: js.Array[String | typings.phaser.Phaser.Tilemaps.Tileset]
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: integer,
      tileset: typings.phaser.Phaser.Tilemaps.Tileset
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: integer,
      tileset: String,
      x: Double
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: integer,
      tileset: js.Array[String | typings.phaser.Phaser.Tilemaps.Tileset],
      x: Double
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: integer,
      tileset: typings.phaser.Phaser.Tilemaps.Tileset,
      x: Double
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: integer,
      tileset: String,
      x: Double,
      y: Double
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: integer,
      tileset: js.Array[String | typings.phaser.Phaser.Tilemaps.Tileset],
      x: Double,
      y: Double
    ) = this()
    def this(
      scene: typings.phaser.Phaser.Scene,
      tilemap: typings.phaser.Phaser.Tilemaps.Tilemap,
      layerIndex: integer,
      tileset: typings.phaser.Phaser.Tilemaps.Tileset,
      x: Double,
      y: Double
    ) = this()
    /**
      * The depth of this Game Object within the Scene.
      * 
      * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
      * of Game Objects, without actually moving their position in the display list.
      * 
      * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
      * value will always render in front of one with a lower value.
      * 
      * Setting the depth will queue a depth sort event within the Scene.
      */
    /* CompleteClass */
    override var depth: Double = js.native
    /**
      * The displayed height of this Game Object.
      * 
      * This value takes into account the scale factor.
      * 
      * Setting this value will adjust the Game Object's scale property.
      */
    /* CompleteClass */
    override var displayHeight: Double = js.native
    /**
      * The displayed width of this Game Object.
      * 
      * This value takes into account the scale factor.
      * 
      * Setting this value will adjust the Game Object's scale property.
      */
    /* CompleteClass */
    override var displayWidth: Double = js.native
    /**
      * The horizontally flipped state of the Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override var flipX: Boolean = js.native
    /**
      * The vertically flipped state of the Game Object.
      * 
      * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override var flipY: Boolean = js.native
    /**
      * The native (un-scaled) height of this Game Object.
      * 
      * Changing this value will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or use
      * the `displayHeight` property.
      */
    /* CompleteClass */
    override var height: Double = js.native
    /**
      * The visible state of the Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      */
    /* CompleteClass */
    override var visible: Boolean = js.native
    /**
      * The native (un-scaled) width of this Game Object.
      * 
      * Changing this value will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or use
      * the `displayWidth` property.
      */
    /* CompleteClass */
    override var width: Double = js.native
    /**
      * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
      */
    /* CompleteClass */
    override def resetFlip(): this.type = js.native
    /**
      * The depth of this Game Object within the Scene.
      * 
      * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
      * of Game Objects, without actually moving their position in the display list.
      * 
      * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
      * value will always render in front of one with a lower value.
      * 
      * Setting the depth will queue a depth sort event within the Scene.
      * @param value The depth of this Game Object.
      */
    /* CompleteClass */
    override def setDepth(value: integer): this.type = js.native
    /**
      * Sets the display size of this Game Object.
      * 
      * Calling this will adjust the scale.
      * @param width The width of this Game Object.
      * @param height The height of this Game Object.
      */
    /* CompleteClass */
    override def setDisplaySize(width: Double, height: Double): this.type = js.native
    /**
      * Sets the horizontal and vertical flipped state of this Game Object.
      * 
      * A Game Object that is flipped will render inversed on the flipped axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
      * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlip(x: Boolean, y: Boolean): this.type = js.native
    /**
      * Sets the horizontal flipped state of this Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      * @param value The flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlipX(value: Boolean): this.type = js.native
    /**
      * Sets the vertical flipped state of this Game Object.
      * @param value The flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlipY(value: Boolean): this.type = js.native
    /**
      * Sets the internal size of this Game Object, as used for frame or physics body creation.
      * 
      * This will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or call the
      * `setDisplaySize` method, which is the same thing as changing the scale but allows you
      * to do so by giving pixel values.
      * 
      * If you have enabled this Game Object for input, changing the size will _not_ change the
      * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
      * @param width The width of this Game Object.
      * @param height The height of this Game Object.
      */
    /* CompleteClass */
    override def setSize(width: Double, height: Double): this.type = js.native
    /**
      * Sets the visibility of this Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      * @param value The visible state of the Game Object.
      */
    /* CompleteClass */
    override def setVisible(value: Boolean): this.type = js.native
    /**
      * Toggles the horizontal flipped state of this Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override def toggleFlipX(): this.type = js.native
    /**
      * Toggles the vertical flipped state of this Game Object.
      */
    /* CompleteClass */
    override def toggleFlipY(): this.type = js.native
  }
  
  /**
    * A Tile is a representation of a single tile within the Tilemap. This is a lightweight data
    * representation, so its position information is stored without factoring in scroll, layer
    * scale or layer position.
    */
  @js.native
  class Tile protected ()
    extends typings.phaser.Phaser.Tilemaps.Tile {
    /**
      * 
      * @param layer The LayerData object in the Tilemap that this tile belongs to.
      * @param index The unique index of this tile within the map.
      * @param x The x coordinate of this tile in tile coordinates.
      * @param y The y coordinate of this tile in tile coordinates.
      * @param width Width of the tile in pixels.
      * @param height Height of the tile in pixels.
      * @param baseWidth The base width a tile in the map (in pixels). Tiled maps support
      * multiple tileset sizes within one map, but they are still placed at intervals of the base
      * tile width.
      * @param baseHeight The base height of the tile in pixels (in pixels). Tiled maps
      * support multiple tileset sizes within one map, but they are still placed at intervals of the
      * base tile height.
      */
    def this(
      layer: typings.phaser.Phaser.Tilemaps.LayerData,
      index: integer,
      x: integer,
      y: integer,
      width: integer,
      height: integer,
      baseWidth: integer,
      baseHeight: integer
    ) = this()
    /**
      * The horizontally flipped state of the Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override var flipX: Boolean = js.native
    /**
      * The vertically flipped state of the Game Object.
      * 
      * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override var flipY: Boolean = js.native
    /**
      * The visible state of the Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      */
    /* CompleteClass */
    override var visible: Boolean = js.native
    /**
      * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
      */
    /* CompleteClass */
    override def resetFlip(): this.type = js.native
    /**
      * Sets the horizontal and vertical flipped state of this Game Object.
      * 
      * A Game Object that is flipped will render inversed on the flipped axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
      * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlip(x: Boolean, y: Boolean): this.type = js.native
    /**
      * Sets the horizontal flipped state of this Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      * @param value The flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlipX(value: Boolean): this.type = js.native
    /**
      * Sets the vertical flipped state of this Game Object.
      * @param value The flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlipY(value: Boolean): this.type = js.native
    /**
      * Sets the visibility of this Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      * @param value The visible state of the Game Object.
      */
    /* CompleteClass */
    override def setVisible(value: Boolean): this.type = js.native
    /**
      * Toggles the horizontal flipped state of this Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override def toggleFlipX(): this.type = js.native
    /**
      * Toggles the vertical flipped state of this Game Object.
      */
    /* CompleteClass */
    override def toggleFlipY(): this.type = js.native
  }
  
  /**
    * A Tilemap is a container for Tilemap data. This isn't a display object, rather, it holds data
    * about the map and allows you to add tilesets and tilemap layers to it. A map can have one or
    * more tilemap layers (StaticTilemapLayer or DynamicTilemapLayer), which are the display
    * objects that actually render tiles.
    * 
    * The Tilemap data be parsed from a Tiled JSON file, a CSV file or a 2D array. Tiled is a free
    * software package specifically for creating tile maps, and is available from:
    * http://www.mapeditor.org
    * 
    * A Tilemap has handy methods for getting & manipulating the tiles within a layer. You can only
    * use the methods that change tiles (e.g. removeTileAt) on a DynamicTilemapLayer.
    * 
    * Note that all Tilemaps use a base tile size to calculate dimensions from, but that a
    * StaticTilemapLayer or DynamicTilemapLayer may have its own unique tile size that overrides
    * it.
    * 
    * As of Phaser 3.21.0, if your tilemap includes layer groups (a feature of Tiled 1.2.0+) these
    * will be traversed and the following properties will affect children:
    * - opacity (blended with parent) and visibility (parent overrides child)
    * - Vertical and horizontal offset
    * The grouping hierarchy is not preserved and all layers will be flattened into a single array.
    * Group layers are parsed during Tilemap construction but are discarded after parsing so dynamic
    * layers will NOT continue to be affected by a parent.
    * 
    * To avoid duplicate layer names, a layer that is a child of a group layer will have its parent
    * group name prepended with a '/'.  For example, consider a group called 'ParentGroup' with a
    * child called 'Layer 1'. In the Tilemap object, 'Layer 1' will have the name
    * 'ParentGroup/Layer 1'.
    */
  @js.native
  class Tilemap protected ()
    extends typings.phaser.Phaser.Tilemaps.Tilemap {
    /**
      * 
      * @param scene The Scene to which this Tilemap belongs.
      * @param mapData A MapData instance containing Tilemap data.
      */
    def this(scene: typings.phaser.Phaser.Scene, mapData: typings.phaser.Phaser.Tilemaps.MapData) = this()
  }
  
  /**
    * A Tileset is a combination of an image containing the tiles and a container for data about
    * each tile.
    */
  @js.native
  class Tileset protected ()
    extends typings.phaser.Phaser.Tilemaps.Tileset {
    /**
      * 
      * @param name The name of the tileset in the map data.
      * @param firstgid The first tile index this tileset contains.
      * @param tileWidth Width of each tile (in pixels). Default 32.
      * @param tileHeight Height of each tile (in pixels). Default 32.
      * @param tileMargin The margin around all tiles in the sheet (in pixels). Default 0.
      * @param tileSpacing The spacing between each tile in the sheet (in pixels). Default 0.
      * @param tileProperties Custom properties defined per tile in the Tileset.
      * These typically are custom properties created in Tiled when editing a tileset. Default {}.
      * @param tileData Data stored per tile. These typically are created in Tiled
      * when editing a tileset, e.g. from Tiled's tile collision editor or terrain editor. Default {}.
      */
    def this(
      name: String,
      firstgid: integer,
      tileWidth: js.UndefOr[integer],
      tileHeight: js.UndefOr[integer],
      tileMargin: js.UndefOr[integer],
      tileSpacing: js.UndefOr[integer],
      tileProperties: js.UndefOr[js.Object],
      tileData: js.UndefOr[js.Object]
    ) = this()
  }
  
  /**
    * Create a Tilemap from the given key or data. If neither is given, make a blank Tilemap. When
    * loading from CSV or a 2D array, you should specify the tileWidth & tileHeight. When parsing from
    * a map from Tiled, the tileWidth, tileHeight, width & height will be pulled from the map data. For
    * an empty map, you should specify tileWidth, tileHeight, width & height.
    * @param scene The Scene to which this Tilemap belongs.
    * @param key The key in the Phaser cache that corresponds to the loaded tilemap data.
    * @param tileWidth The width of a tile in pixels. Default 32.
    * @param tileHeight The height of a tile in pixels. Default 32.
    * @param width The width of the map in tiles. Default 10.
    * @param height The height of the map in tiles. Default 10.
    * @param data Instead of loading from the cache, you can also load directly from
    * a 2D array of tile indexes.
    * @param insertNull Controls how empty tiles, tiles with an index of -1, in the
    * map data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
    * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
    * the tile data doesn't need to change then setting this value to `true` will help with memory
    * consumption. However if your map is small or you need to update the tiles dynamically, then leave
    * the default value set. Default false.
    */
  def ParseToTilemap(
    scene: typings.phaser.Phaser.Scene,
    key: js.UndefOr[String],
    tileWidth: js.UndefOr[integer],
    tileHeight: js.UndefOr[integer],
    width: js.UndefOr[integer],
    height: js.UndefOr[integer],
    data: js.UndefOr[js.Array[js.Array[integer]]],
    insertNull: js.UndefOr[Boolean]
  ): typings.phaser.Phaser.Tilemaps.Tilemap = js.native
  @js.native
  object Formats extends js.Object {
    /**
      * 2D Array Map Type
      */
    var ARRAY_2D: Double = js.native
    /**
      * CSV Map Type
      */
    var CSV: Double = js.native
    /**
      * Tiled JSON Map Type
      */
    var TILED_JSON: Double = js.native
    /**
      * Weltmeister (Impact.js) Map Type
      */
    var WELTMEISTER: Double = js.native
  }
  
  @js.native
  object Parsers extends js.Object {
    def Parse(
      name: String,
      mapFormat: integer,
      data: String,
      tileWidth: integer,
      tileHeight: integer,
      insertNull: Boolean
    ): typings.phaser.Phaser.Tilemaps.MapData = js.native
    /**
      * Parses raw data of a given Tilemap format into a new MapData object. If no recognized data format
      * is found, returns `null`. When loading from CSV or a 2D array, you should specify the tileWidth &
      * tileHeight. When parsing from a map from Tiled, the tileWidth & tileHeight will be pulled from
      * the map data.
      * @param name The name of the tilemap, used to set the name on the MapData.
      * @param mapFormat See ../Formats.js.
      * @param data 2D array, CSV string or Tiled JSON object.
      * @param tileWidth The width of a tile in pixels. Required for 2D array and CSV, but
      * ignored for Tiled JSON.
      * @param tileHeight The height of a tile in pixels. Required for 2D array and CSV, but
      * ignored for Tiled JSON.
      * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
      * data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
      * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
      * the tile data doesn't need to change then setting this value to `true` will help with memory
      * consumption. However if your map is small or you need to update the tiles dynamically, then leave
      * the default value set.
      */
    def Parse(
      name: String,
      mapFormat: integer,
      data: js.Array[js.Array[integer]],
      tileWidth: integer,
      tileHeight: integer,
      insertNull: Boolean
    ): typings.phaser.Phaser.Tilemaps.MapData = js.native
    def Parse(
      name: String,
      mapFormat: integer,
      data: js.Object,
      tileWidth: integer,
      tileHeight: integer,
      insertNull: Boolean
    ): typings.phaser.Phaser.Tilemaps.MapData = js.native
    /**
      * Parses a 2D array of tile indexes into a new MapData object with a single layer.
      * @param name The name of the tilemap, used to set the name on the MapData.
      * @param data 2D array, CSV string or Tiled JSON object.
      * @param tileWidth The width of a tile in pixels.
      * @param tileHeight The height of a tile in pixels.
      * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
      * data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
      * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
      * the tile data doesn't need to change then setting this value to `true` will help with memory
      * consumption. However if your map is small or you need to update the tiles dynamically, then leave
      * the default value set.
      */
    def Parse2DArray(
      name: String,
      data: js.Array[js.Array[integer]],
      tileWidth: integer,
      tileHeight: integer,
      insertNull: Boolean
    ): typings.phaser.Phaser.Tilemaps.MapData = js.native
    /**
      * Parses a CSV string of tile indexes into a new MapData object with a single layer.
      * @param name The name of the tilemap, used to set the name on the MapData.
      * @param data CSV string of tile indexes.
      * @param tileWidth The width of a tile in pixels.
      * @param tileHeight The height of a tile in pixels.
      * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
      * data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
      * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
      * the tile data doesn't need to change then setting this value to `true` will help with memory
      * consumption. However if your map is small or you need to update the tiles dynamically, then leave
      * the default value set.
      */
    def ParseCSV(name: String, data: String, tileWidth: integer, tileHeight: integer, insertNull: Boolean): typings.phaser.Phaser.Tilemaps.MapData = js.native
    @js.native
    object Impact extends js.Object {
      /**
        * Parses all tilemap layers in an Impact JSON object into new LayerData objects.
        * @param json The Impact JSON object.
        * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
        * data are handled (see {@link Phaser.Tilemaps.Parsers.Tiled.ParseJSONTiled}).
        */
      def ParseTileLayers(json: js.Object, insertNull: Boolean): js.Array[typings.phaser.Phaser.Tilemaps.LayerData] = js.native
      /**
        * Tilesets and Image Collections
        * @param json The Impact JSON data.
        */
      def ParseTilesets(json: js.Object): js.Array[_] = js.native
      /**
        * Parses a Weltmeister JSON object into a new MapData object.
        * @param name The name of the tilemap, used to set the name on the MapData.
        * @param json The Weltmeister JSON object.
        * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
        * data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
        * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
        * the tile data doesn't need to change then setting this value to `true` will help with memory
        * consumption. However if your map is small or you need to update the tiles dynamically, then leave
        * the default value set.
        */
      def ParseWeltmeister(name: String, json: js.Object, insertNull: Boolean): typings.phaser.Phaser.Tilemaps.MapData = js.native
    }
    
    @js.native
    object Tiled extends js.Object {
      /**
        * Copy properties from tileset to tiles.
        * @param mapData The Map Data object.
        */
      def AssignTileProperties(mapData: typings.phaser.Phaser.Tilemaps.MapData): Unit = js.native
      /**
        * Decode base-64 encoded data, for example as exported by Tiled.
        * @param data Base-64 encoded data to decode.
        */
      def Base64Decode(data: js.Object): js.Array[_] = js.native
      /**
        * Master list of tiles -> x, y, index in tileset.
        * @param mapData The Map Data object.
        */
      def BuildTilesetIndex(mapData: typings.phaser.Phaser.Tilemaps.MapData): js.Array[_] = js.native
      /**
        * Parse a Tiled group layer and create a state object for inheriting.
        * @param json The Tiled JSON object.
        * @param currentl The current group layer from the Tiled JSON file.
        * @param parentstate The state of the parent group (if any).
        */
      def CreateGroupLayer(json: js.Object): js.Object = js.native
      def CreateGroupLayer(json: js.Object, currentl: js.Object): js.Object = js.native
      def CreateGroupLayer(json: js.Object, currentl: js.Object, parentstate: js.Object): js.Object = js.native
      /**
        * See Tiled documentation on tile flipping:
        * http://docs.mapeditor.org/en/latest/reference/tmx-map-format/
        * @param gid A Tiled GID.
        */
      def ParseGID(gid: Double): GIDData = js.native
      /**
        * Parses a Tiled JSON object into an array of objects with details about the image layers.
        * @param json The Tiled JSON object.
        */
      def ParseImageLayers(json: js.Object): js.Array[_] = js.native
      /**
        * Parses a Tiled JSON object into a new MapData object.
        * @param name The name of the tilemap, used to set the name on the MapData.
        * @param json The Tiled JSON object.
        * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
        * data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
        * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
        * the tile data doesn't need to change then setting this value to `true` will help with memory
        * consumption. However if your map is small or you need to update the tiles dynamically, then leave
        * the default value set.
        */
      def ParseJSONTiled(name: String, json: js.Object, insertNull: Boolean): typings.phaser.Phaser.Tilemaps.MapData = js.native
      /**
        * Convert a Tiled object to an internal parsed object normalising and copying properties over, while applying optional x and y offsets. The parsed object will always have the properties `id`, `name`, `type`, `rotation`, `properties`, `visible`, `x`, `y`, `width` and `height`. Other properties will be added according to the object type (such as text, polyline, gid etc.)
        * @param tiledObject Tiled object to convert to an internal parsed object normalising and copying properties over.
        * @param offsetX Optional additional offset to apply to the object's x property. Defaults to 0. Default 0.
        * @param offsetY Optional additional offset to apply to the object's y property. Defaults to 0. Default 0.
        */
      def ParseObject(tiledObject: js.Object): js.Object = js.native
      def ParseObject(tiledObject: js.Object, offsetX: Double): js.Object = js.native
      def ParseObject(tiledObject: js.Object, offsetX: Double, offsetY: Double): js.Object = js.native
      /**
        * Parses a Tiled JSON object into an array of ObjectLayer objects.
        * @param json The Tiled JSON object.
        */
      def ParseObjectLayers(json: js.Object): js.Array[_] = js.native
      /**
        * Parses all tilemap layers in a Tiled JSON object into new LayerData objects.
        * @param json The Tiled JSON object.
        * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
        * data are handled (see {@link Phaser.Tilemaps.Parsers.Tiled.ParseJSONTiled}).
        */
      def ParseTileLayers(json: js.Object, insertNull: Boolean): js.Array[typings.phaser.Phaser.Tilemaps.LayerData] = js.native
      /**
        * Tilesets and Image Collections
        * @param json The Tiled JSON data.
        */
      def ParseTilesets(json: js.Object): js.Object = js.native
    }
    
  }
  
}

