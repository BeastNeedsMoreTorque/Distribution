package typings.typescriptServices.global.TypeScript

import typings.typescriptServices.TypeScript.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullTypeReferenceSymbol")
@js.native
class PullTypeReferenceSymbol protected ()
  extends typings.typescriptServices.TypeScript.PullTypeReferenceSymbol {
  def this(referencedTypeSymbol: typings.typescriptServices.TypeScript.PullTypeSymbol) = this()
  /* CompleteClass */
  override def getAllowedToReferenceTypeParameters(): js.Array[typings.typescriptServices.TypeScript.PullTypeParameterSymbol] = js.native
  /* CompleteClass */
  override def getIsSpecialized(): Boolean = js.native
  /* CompleteClass */
  override def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
}

/* static members */
@JSGlobal("TypeScript.PullTypeReferenceSymbol")
@js.native
object PullTypeReferenceSymbol extends js.Object {
  def createTypeReference(`type`: typings.typescriptServices.TypeScript.PullTypeSymbol): typings.typescriptServices.TypeScript.PullTypeReferenceSymbol = js.native
}

