package typings.expoAsset.assetSourceResolverWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-asset/build/AssetSourceResolver.web", JSImport.Default)
@js.native
class default protected () extends AssetSourceResolver {
  def this(serverUrl: js.UndefOr[Null | String], jsbundleUrl: js.UndefOr[Null | String], asset: PackagerAsset) = this()
  /* CompleteClass */
  override var asset: PackagerAsset = js.native
  /* CompleteClass */
  override def assetServerURL(): ResolvedAssetSource = js.native
  /* CompleteClass */
  override def defaultAsset(): ResolvedAssetSource = js.native
  /* CompleteClass */
  override def drawableFolderInBundle(): ResolvedAssetSource = js.native
  /* CompleteClass */
  override def fromSource(source: String): ResolvedAssetSource = js.native
  /* CompleteClass */
  override def isLoadedFromFileSystem(): Boolean = js.native
  /* CompleteClass */
  override def isLoadedFromServer(): Boolean = js.native
  /* CompleteClass */
  override def resourceIdentifierWithoutScale(): ResolvedAssetSource = js.native
  /* CompleteClass */
  override def scaledAssetPath(): ResolvedAssetSource = js.native
  /* CompleteClass */
  override def scaledAssetURLNearBundle(): ResolvedAssetSource = js.native
}

/* static members */
@JSImport("expo-asset/build/AssetSourceResolver.web", JSImport.Default)
@js.native
object default extends js.Object {
  def pickScale(scales: js.Array[Double], deviceScale: Double): Double = js.native
}

