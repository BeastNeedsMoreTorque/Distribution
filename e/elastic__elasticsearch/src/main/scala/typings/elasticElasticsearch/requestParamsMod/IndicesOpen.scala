package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.all
import typings.elasticElasticsearch.elasticElasticsearchStrings.closed
import typings.elasticElasticsearch.elasticElasticsearchStrings.hidden
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesOpen extends Generic {
  var allow_no_indices: js.UndefOr[Boolean] = js.undefined
  var expand_wildcards: js.UndefOr[open | closed | hidden | none | all] = js.undefined
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  var index: String | js.Array[String]
  var master_timeout: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[String] = js.undefined
  var wait_for_active_shards: js.UndefOr[String] = js.undefined
}

object IndicesOpen {
  @scala.inline
  def apply(
    index: String | js.Array[String],
    allow_no_indices: js.UndefOr[Boolean] = js.undefined,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    expand_wildcards: open | closed | hidden | none | all = null,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    ignore_unavailable: js.UndefOr[Boolean] = js.undefined,
    master_timeout: String = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    timeout: String = null,
    wait_for_active_shards: String = null
  ): IndicesOpen = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_no_indices)) __obj.updateDynamic("allow_no_indices")(allow_no_indices.get.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.get.asInstanceOf[js.Any])
    if (expand_wildcards != null) __obj.updateDynamic("expand_wildcards")(expand_wildcards.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore_unavailable)) __obj.updateDynamic("ignore_unavailable")(ignore_unavailable.get.asInstanceOf[js.Any])
    if (master_timeout != null) __obj.updateDynamic("master_timeout")(master_timeout.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (wait_for_active_shards != null) __obj.updateDynamic("wait_for_active_shards")(wait_for_active_shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesOpen]
  }
}

