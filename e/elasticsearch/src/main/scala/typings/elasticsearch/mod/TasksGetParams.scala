package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TasksGetParams extends GenericParams {
  var taskId: js.UndefOr[String] = js.undefined
  var waitForCompletion: js.UndefOr[Boolean] = js.undefined
}

object TasksGetParams {
  @scala.inline
  def apply(
    body: js.Any = null,
    filterPath: String | js.Array[String] = null,
    ignore: Double | js.Array[Double] = null,
    maxRetries: js.UndefOr[Double] = js.undefined,
    method: String = null,
    requestTimeout: js.UndefOr[Double] = js.undefined,
    taskId: String = null,
    waitForCompletion: js.UndefOr[Boolean] = js.undefined
  ): TasksGetParams = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    if (taskId != null) __obj.updateDynamic("taskId")(taskId.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForCompletion)) __obj.updateDynamic("waitForCompletion")(waitForCompletion.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TasksGetParams]
  }
}

