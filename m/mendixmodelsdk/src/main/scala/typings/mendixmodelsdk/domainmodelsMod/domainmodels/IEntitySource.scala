package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.baseModelMod.IModel
import typings.mendixmodelsdk.elementsMod.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 8.10.0: introduced
  */
@js.native
trait IEntitySource extends IElement {
  val containerAsEntity: IEntity = js.native
  @JSName("model")
  val model_IEntitySource: IModel = js.native
}

