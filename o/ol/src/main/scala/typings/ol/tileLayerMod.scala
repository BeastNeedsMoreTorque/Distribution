package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.extentMod.Extent
import typings.ol.pluggableMapMod.FrameState
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/TileLayer", JSImport.Namespace)
@js.native
object tileLayerMod extends js.Object {
  @js.native
  trait CanvasTileLayerRenderer
    extends typings.ol.canvasLayerMod.default[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]] {
    var renderedPixelRatio: Double = js.native
    var renderedProjection: typings.ol.projectionMod.default = js.native
    var renderedRevision: Double = js.native
    var renderedTiles: js.Array[typings.ol.olTileMod.default] = js.native
    var tmpExtent: Extent = js.native
    def drawTileImage(
      tile: typings.ol.imageTileMod.default,
      frameState: FrameState,
      x: Double,
      y: Double,
      w: Double,
      h: Double,
      gutter: Double,
      transition: Boolean,
      opacity: Double
    ): Unit = js.native
    def getTile(z: Double, x: Double, y: Double, frameState: FrameState): typings.ol.olTileMod.default = js.native
    /* protected */ def getTileImage(tile: typings.ol.imageTileMod.default): HTMLCanvasElement | HTMLImageElement | HTMLVideoElement = js.native
    /* protected */ def isDrawableTile(tile: typings.ol.olTileMod.default): Boolean = js.native
    /* protected */ def manageTilePyramid(
      frameState: FrameState,
      tileSource: typings.ol.sourceTileMod.default,
      tileGrid: typings.ol.tilegridTileGridMod.default,
      pixelRatio: Double,
      projection: typings.ol.projectionMod.default,
      extent: Extent,
      currentZ: Double,
      preload: Double
    ): Unit = js.native
    /* protected */ def manageTilePyramid(
      frameState: FrameState,
      tileSource: typings.ol.sourceTileMod.default,
      tileGrid: typings.ol.tilegridTileGridMod.default,
      pixelRatio: Double,
      projection: typings.ol.projectionMod.default,
      extent: Extent,
      currentZ: Double,
      preload: Double,
      opt_tileCallback: js.Function0[Unit]
    ): Unit = js.native
    /* protected */ def scheduleExpireCache(frameState: FrameState, tileSource: typings.ol.sourceTileMod.default): Unit = js.native
    /* protected */ def updateUsedTiles(
      usedTiles: StringDictionary[StringDictionary[Boolean]],
      tileSource: typings.ol.sourceTileMod.default,
      tile: typings.ol.olTileMod.default
    ): Unit = js.native
  }
  
  @js.native
  class default protected () extends CanvasTileLayerRenderer {
    def this(tileLayer: typings.ol.tileMod.default) = this()
    def this(tileLayer: typings.ol.vectorTileMod.default) = this()
  }
  
}

