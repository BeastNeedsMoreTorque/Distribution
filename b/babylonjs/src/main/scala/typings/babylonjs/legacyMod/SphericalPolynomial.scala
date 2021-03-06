package typings.babylonjs.legacyMod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "SphericalPolynomial")
@js.native
class SphericalPolynomial ()
  extends typings.babylonjs.indexMod.SphericalPolynomial

/* static members */
@JSImport("babylonjs/Legacy/legacy", "SphericalPolynomial")
@js.native
object SphericalPolynomial extends js.Object {
  /**
    * Constructs a spherical polynomial from an array.
    * @param data defines the 9x3 coefficients (x, y, z, xx, yy, zz, yz, zx, xy)
    * @returns the spherical polynomial
    */
  def FromArray(data: ArrayLike[ArrayLike[Double]]): typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial = js.native
  /**
    * Gets the spherical polynomial from harmonics
    * @param harmonics the spherical harmonics
    * @returns the spherical polynomial
    */
  def FromHarmonics(harmonics: typings.babylonjs.sphericalPolynomialMod.SphericalHarmonics): typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial = js.native
}

