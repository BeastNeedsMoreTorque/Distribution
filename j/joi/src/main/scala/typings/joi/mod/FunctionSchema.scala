package typings.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.joi.mod._SchemaLike because Already inherited
- typings.joi.mod._Schema because Already inherited */ @js.native
trait FunctionSchema extends AnySchema {
  /**
    * Specifies the arity of the function where:
    * @param n - the arity expected.
    */
  def arity(n: Double): this.type = js.native
  /**
    * Specifies the minimal arity of the function where:
    * @param n - the minimal arity expected.
    */
  def maxArity(n: Double): this.type = js.native
  /**
    * Specifies the minimal arity of the function where:
    * @param n - the minimal arity expected.
    */
  def minArity(n: Double): this.type = js.native
  /**
    * Requires the function to be a Joi reference.
    */
  def ref(): this.type = js.native
}

