package typings.jose.mod.JWK

import typings.jose.mod.BasicParameters
import typings.jose.mod.Curves
import typings.jose.mod.keyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jose", "JWK.generateSync")
@js.native
object generateSync extends js.Object {
  def apply(kty: keyType): Key = js.native
  def apply(kty: keyType, crvOrSize: Double): Key = js.native
  def apply(kty: keyType, crvOrSize: Double, parameters: BasicParameters): Key = js.native
  def apply(kty: keyType, crvOrSize: Double, parameters: BasicParameters, `private`: Boolean): Key = js.native
  def apply(kty: keyType, crvOrSize: Curves): Key = js.native
  def apply(kty: keyType, crvOrSize: Curves, parameters: BasicParameters): Key = js.native
  def apply(kty: keyType, crvOrSize: Curves, parameters: BasicParameters, `private`: Boolean): Key = js.native
}

