package typings.gapiClientFitness

import typings.gapiClientFitness.gapi.client.fitness.UsersResource
import typings.gapiClientFitness.gapiClientFitnessStrings.fitness
import typings.gapiClientFitness.gapiClientFitnessStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      val users: UsersResource = js.native
      /** Load Fitness v1 */
      def load(name: fitness, version: v1): js.Thenable[Unit] = js.native
      def load(name: fitness, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

