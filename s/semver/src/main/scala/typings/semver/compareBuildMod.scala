package typings.semver

import typings.semver.semverMod.^
import typings.semver.semverNumbers.`-1`
import typings.semver.semverNumbers.`0`
import typings.semver.semverNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("semver/functions/compare-build", JSImport.Namespace)
@js.native
object compareBuildMod extends js.Object {
  /**
    * Compares two versions including build identifiers (the bit after `+` in the semantic version string).
    *
    * Sorts in ascending order when passed to `Array.sort()`.
    *
    * @return
    * - `0` if `v1` == `v2`
    * - `1` if `v1` is greater
    * - `-1` if `v2` is greater.
    *
    * @since 6.1.0
    */
  def apply(a: String, b: String): `1` | `0` | `-1` = js.native
  def apply(a: String, b: ^): `1` | `0` | `-1` = js.native
  def apply(a: ^, b: String): `1` | `0` | `-1` = js.native
  def apply(a: ^, b: ^): `1` | `0` | `-1` = js.native
}

