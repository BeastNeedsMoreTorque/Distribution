package typings.jupyterlabObservables.observablejsonMod

import typings.jupyterlabObservables.observablemapMod.IObservableMap
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObservableJSON
  extends IObservableMap[js.UndefOr[ReadonlyPartialJSONValue]] {
  /**
    * Serialize the model to JSON.
    */
  def toJSON(): PartialJSONObject
}

@JSImport("@jupyterlab/observables/lib/observablejson", "IObservableJSON")
@js.native
object IObservableJSON extends js.Object {
  /**
    * A type alias for observable JSON changed args.
    */
  type IChangedArgs = typings.jupyterlabObservables.observablemapMod.IObservableMap.IChangedArgs[ReadonlyPartialJSONValue]
}

