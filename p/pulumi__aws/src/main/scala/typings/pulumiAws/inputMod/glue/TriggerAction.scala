package typings.pulumiAws.inputMod.glue

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerAction extends js.Object {
  /**
    * Arguments to be passed to the job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes.
    */
  var arguments: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The name of the crawler to be executed. Conflicts with `jobName`.
    */
  var crawlerName: js.UndefOr[Input[String]] = js.native
  /**
    * The name of a job to be executed. Conflicts with `crawlerName`.
    */
  var jobName: js.UndefOr[Input[String]] = js.native
  /**
    * The job run timeout in minutes. It overrides the timeout value of the job.
    */
  var timeout: js.UndefOr[Input[Double]] = js.native
}

object TriggerAction {
  @scala.inline
  def apply(
    arguments: Input[StringDictionary[_]] = null,
    crawlerName: Input[String] = null,
    jobName: Input[String] = null,
    timeout: Input[Double] = null
  ): TriggerAction = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (crawlerName != null) __obj.updateDynamic("crawlerName")(crawlerName.asInstanceOf[js.Any])
    if (jobName != null) __obj.updateDynamic("jobName")(jobName.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerAction]
  }
}

