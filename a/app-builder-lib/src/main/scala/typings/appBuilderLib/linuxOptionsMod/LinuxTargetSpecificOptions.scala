package typings.appBuilderLib.linuxOptionsMod

import typings.appBuilderLib.appBuilderLibStrings.bzip2
import typings.appBuilderLib.appBuilderLibStrings.gz
import typings.appBuilderLib.appBuilderLibStrings.xz
import typings.appBuilderLib.coreMod.Publish
import typings.appBuilderLib.coreMod.TargetSpecificOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinuxTargetSpecificOptions
  extends CommonLinuxOptions
     with TargetSpecificOptions {
  val afterInstall: js.UndefOr[String | Null] = js.undefined
  val afterRemove: js.UndefOr[String | Null] = js.undefined
  /**
    * The compression type.
    * @default xz
    */
  val compression: js.UndefOr[gz | bzip2 | xz | Null] = js.undefined
  /**
    * Package dependencies.
    */
  val depends: js.UndefOr[js.Array[String] | Null] = js.undefined
  /**
    * *Advanced only* The [fpm](https://github.com/jordansissel/fpm/wiki#usage) options.
    *
    * Example: `["--before-install=build/deb-preinstall.sh", "--after-upgrade=build/deb-postinstall.sh"]`
    */
  val fpm: js.UndefOr[js.Array[String] | Null] = js.undefined
  val icon: js.UndefOr[String] = js.undefined
  val maintainer: js.UndefOr[String | Null] = js.undefined
  /**
    * The package category.
    */
  val packageCategory: js.UndefOr[String | Null] = js.undefined
  val vendor: js.UndefOr[String | Null] = js.undefined
}

object LinuxTargetSpecificOptions {
  @scala.inline
  def apply(
    afterInstall: js.UndefOr[Null | String] = js.undefined,
    afterRemove: js.UndefOr[Null | String] = js.undefined,
    artifactName: js.UndefOr[Null | String] = js.undefined,
    category: js.UndefOr[Null | String] = js.undefined,
    compression: js.UndefOr[Null | gz | bzip2 | xz] = js.undefined,
    depends: js.UndefOr[Null | js.Array[String]] = js.undefined,
    description: js.UndefOr[Null | String] = js.undefined,
    desktop: js.UndefOr[Null | js.Any] = js.undefined,
    executableArgs: js.UndefOr[Null | js.Array[String]] = js.undefined,
    fpm: js.UndefOr[Null | js.Array[String]] = js.undefined,
    icon: String = null,
    maintainer: js.UndefOr[Null | String] = js.undefined,
    mimeTypes: js.UndefOr[Null | js.Array[String]] = js.undefined,
    packageCategory: js.UndefOr[Null | String] = js.undefined,
    publish: js.UndefOr[Null | Publish] = js.undefined,
    synopsis: js.UndefOr[Null | String] = js.undefined,
    vendor: js.UndefOr[Null | String] = js.undefined
  ): LinuxTargetSpecificOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(afterInstall)) __obj.updateDynamic("afterInstall")(afterInstall.asInstanceOf[js.Any])
    if (!js.isUndefined(afterRemove)) __obj.updateDynamic("afterRemove")(afterRemove.asInstanceOf[js.Any])
    if (!js.isUndefined(artifactName)) __obj.updateDynamic("artifactName")(artifactName.asInstanceOf[js.Any])
    if (!js.isUndefined(category)) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (!js.isUndefined(compression)) __obj.updateDynamic("compression")(compression.asInstanceOf[js.Any])
    if (!js.isUndefined(depends)) __obj.updateDynamic("depends")(depends.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(desktop)) __obj.updateDynamic("desktop")(desktop.asInstanceOf[js.Any])
    if (!js.isUndefined(executableArgs)) __obj.updateDynamic("executableArgs")(executableArgs.asInstanceOf[js.Any])
    if (!js.isUndefined(fpm)) __obj.updateDynamic("fpm")(fpm.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(maintainer)) __obj.updateDynamic("maintainer")(maintainer.asInstanceOf[js.Any])
    if (!js.isUndefined(mimeTypes)) __obj.updateDynamic("mimeTypes")(mimeTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(packageCategory)) __obj.updateDynamic("packageCategory")(packageCategory.asInstanceOf[js.Any])
    if (!js.isUndefined(publish)) __obj.updateDynamic("publish")(publish.asInstanceOf[js.Any])
    if (!js.isUndefined(synopsis)) __obj.updateDynamic("synopsis")(synopsis.asInstanceOf[js.Any])
    if (!js.isUndefined(vendor)) __obj.updateDynamic("vendor")(vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinuxTargetSpecificOptions]
  }
}

