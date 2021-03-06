package typings.npmInstallWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DevFunction = js.Function2[/* module */ java.lang.String, /* path */ java.lang.String, scala.Boolean]
  /**
    * Speed up development by automatically installing & saving dependencies with Webpack.
    */
  type NpmInstallPlugin = typings.webpack.mod.Plugin
}
