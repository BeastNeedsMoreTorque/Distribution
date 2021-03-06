package typings.hapiWreck.mod.Client.read

import typings.hapiWreck.hapiWreckStrings.force
import typings.hapiWreck.hapiWreckStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Determines how to handle gzipped payloads.
    *
    * @default false
    */
  val gunzip: js.UndefOr[Boolean | force] = js.undefined
  /**
    * Determines how to parse the payload as JSON.
    */
  val json: js.UndefOr[Boolean | strict | force] = js.undefined
  /**
    * The maximum allowed response payload size.
    * 
    * @default 0
    */
  val maxBytes: js.UndefOr[Double] = js.undefined
  /**
    * The number of milliseconds to wait while reading data before aborting handling of the response.
    * 
    * @default 0
    */
  val timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    gunzip: Boolean | force = null,
    json: Boolean | strict | force = null,
    maxBytes: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (gunzip != null) __obj.updateDynamic("gunzip")(gunzip.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (!js.isUndefined(maxBytes)) __obj.updateDynamic("maxBytes")(maxBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

