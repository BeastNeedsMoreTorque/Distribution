package typings.webpackbar.mod

import typings.webpackbar.anon.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  val color: String
  val details: js.Array[String]
  /** @default false */
  val done: Boolean
  /** @default false */
  val hasErrors: Boolean
  /** @default '' */
  val message: String
  val name: String
  /** @default -1 */
  val progress: Double
  val request: Null | File
  /** @default null */
  val start: (js.Tuple2[Double, Double]) | Null
}

object Status {
  @scala.inline
  def apply(
    color: String,
    details: js.Array[String],
    done: Boolean,
    hasErrors: Boolean,
    message: String,
    name: String,
    progress: Double,
    request: File = null,
    start: js.Tuple2[Double, Double] = null
  ): Status = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], hasErrors = hasErrors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
}

