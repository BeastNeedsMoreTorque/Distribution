package typings.pulumiPulumi.codePathsMod

import typings.pulumiPulumi.assetMod.Archive
import typings.pulumiPulumi.assetMod.Asset
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/runtime/closure/codePaths", "computeCodePaths")
@js.native
object computeCodePaths extends js.Object {
  def apply(): js.Promise[Map[String, Asset | Archive]] = js.native
  def apply(extraIncludePaths: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = js.native
  def apply(extraIncludePaths: js.Array[String], extraIncludePackages: js.Array[String]): js.Promise[Map[String, Asset | Archive]] = js.native
  def apply(
    extraIncludePaths: js.Array[String],
    extraIncludePackages: js.Array[String],
    extraExcludePackages: js.Array[String]
  ): js.Promise[Map[String, Asset | Archive]] = js.native
  def apply(options: CodePathOptions): js.Promise[Map[String, Asset | Archive]] = js.native
}

