package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.AND
import typings.elasticElasticsearch.elasticElasticsearchStrings.OR
import typings.elasticElasticsearch.elasticElasticsearchStrings.all
import typings.elasticElasticsearch.elasticElasticsearchStrings.always
import typings.elasticElasticsearch.elasticElasticsearchStrings.closed
import typings.elasticElasticsearch.elasticElasticsearchStrings.dfs_query_then_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.hidden
import typings.elasticElasticsearch.elasticElasticsearchStrings.missing
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.open
import typings.elasticElasticsearch.elasticElasticsearchStrings.popular
import typings.elasticElasticsearch.elasticElasticsearchStrings.query_then_fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncSearchSubmit[T] extends Generic {
  var _source: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_exclude: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_excludes: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_include: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_includes: js.UndefOr[String | js.Array[String]] = js.undefined
  var allow_no_indices: js.UndefOr[Boolean] = js.undefined
  var allow_partial_search_results: js.UndefOr[Boolean] = js.undefined
  var analyze_wildcard: js.UndefOr[Boolean] = js.undefined
  var analyzer: js.UndefOr[String] = js.undefined
  var batched_reduce_size: js.UndefOr[Double] = js.undefined
  var body: js.UndefOr[T] = js.undefined
  var default_operator: js.UndefOr[AND | OR] = js.undefined
  var df: js.UndefOr[String] = js.undefined
  var docvalue_fields: js.UndefOr[String | js.Array[String]] = js.undefined
  var expand_wildcards: js.UndefOr[open | closed | hidden | none | all] = js.undefined
  var explain: js.UndefOr[Boolean] = js.undefined
  var from: js.UndefOr[Double] = js.undefined
  var ignore_throttled: js.UndefOr[Boolean] = js.undefined
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[String | js.Array[String]] = js.undefined
  var keep_alive: js.UndefOr[String] = js.undefined
  var keep_on_completion: js.UndefOr[Boolean] = js.undefined
  var lenient: js.UndefOr[Boolean] = js.undefined
  var max_concurrent_shard_requests: js.UndefOr[Double] = js.undefined
  var preference: js.UndefOr[String] = js.undefined
  var q: js.UndefOr[String] = js.undefined
  var request_cache: js.UndefOr[Boolean] = js.undefined
  var routing: js.UndefOr[String | js.Array[String]] = js.undefined
  var search_type: js.UndefOr[query_then_fetch | dfs_query_then_fetch] = js.undefined
  var seq_no_primary_term: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var sort: js.UndefOr[String | js.Array[String]] = js.undefined
  var stats: js.UndefOr[String | js.Array[String]] = js.undefined
  var stored_fields: js.UndefOr[String | js.Array[String]] = js.undefined
  var suggest_field: js.UndefOr[String] = js.undefined
  var suggest_mode: js.UndefOr[missing | popular | always] = js.undefined
  var suggest_size: js.UndefOr[Double] = js.undefined
  var suggest_text: js.UndefOr[String] = js.undefined
  var terminate_after: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[String] = js.undefined
  var track_scores: js.UndefOr[Boolean] = js.undefined
  var track_total_hits: js.UndefOr[Boolean] = js.undefined
  var typed_keys: js.UndefOr[Boolean] = js.undefined
  var version: js.UndefOr[Boolean] = js.undefined
  var wait_for_completion_timeout: js.UndefOr[String] = js.undefined
}

object AsyncSearchSubmit {
  @scala.inline
  def apply[T](
    _source: String | js.Array[String] = null,
    _source_exclude: String | js.Array[String] = null,
    _source_excludes: String | js.Array[String] = null,
    _source_include: String | js.Array[String] = null,
    _source_includes: String | js.Array[String] = null,
    allow_no_indices: js.UndefOr[Boolean] = js.undefined,
    allow_partial_search_results: js.UndefOr[Boolean] = js.undefined,
    analyze_wildcard: js.UndefOr[Boolean] = js.undefined,
    analyzer: String = null,
    batched_reduce_size: js.UndefOr[Double] = js.undefined,
    body: T = null,
    default_operator: AND | OR = null,
    df: String = null,
    docvalue_fields: String | js.Array[String] = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    expand_wildcards: open | closed | hidden | none | all = null,
    explain: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    from: js.UndefOr[Double] = js.undefined,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    ignore_throttled: js.UndefOr[Boolean] = js.undefined,
    ignore_unavailable: js.UndefOr[Boolean] = js.undefined,
    index: String | js.Array[String] = null,
    keep_alive: String = null,
    keep_on_completion: js.UndefOr[Boolean] = js.undefined,
    lenient: js.UndefOr[Boolean] = js.undefined,
    max_concurrent_shard_requests: js.UndefOr[Double] = js.undefined,
    method: String = null,
    preference: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    q: String = null,
    request_cache: js.UndefOr[Boolean] = js.undefined,
    routing: String | js.Array[String] = null,
    search_type: query_then_fetch | dfs_query_then_fetch = null,
    seq_no_primary_term: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    sort: String | js.Array[String] = null,
    source: String = null,
    stats: String | js.Array[String] = null,
    stored_fields: String | js.Array[String] = null,
    suggest_field: String = null,
    suggest_mode: missing | popular | always = null,
    suggest_size: js.UndefOr[Double] = js.undefined,
    suggest_text: String = null,
    terminate_after: js.UndefOr[Double] = js.undefined,
    timeout: String = null,
    track_scores: js.UndefOr[Boolean] = js.undefined,
    track_total_hits: js.UndefOr[Boolean] = js.undefined,
    typed_keys: js.UndefOr[Boolean] = js.undefined,
    version: js.UndefOr[Boolean] = js.undefined,
    wait_for_completion_timeout: String = null
  ): AsyncSearchSubmit[T] = {
    val __obj = js.Dynamic.literal()
    if (_source != null) __obj.updateDynamic("_source")(_source.asInstanceOf[js.Any])
    if (_source_exclude != null) __obj.updateDynamic("_source_exclude")(_source_exclude.asInstanceOf[js.Any])
    if (_source_excludes != null) __obj.updateDynamic("_source_excludes")(_source_excludes.asInstanceOf[js.Any])
    if (_source_include != null) __obj.updateDynamic("_source_include")(_source_include.asInstanceOf[js.Any])
    if (_source_includes != null) __obj.updateDynamic("_source_includes")(_source_includes.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_no_indices)) __obj.updateDynamic("allow_no_indices")(allow_no_indices.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_partial_search_results)) __obj.updateDynamic("allow_partial_search_results")(allow_partial_search_results.get.asInstanceOf[js.Any])
    if (!js.isUndefined(analyze_wildcard)) __obj.updateDynamic("analyze_wildcard")(analyze_wildcard.get.asInstanceOf[js.Any])
    if (analyzer != null) __obj.updateDynamic("analyzer")(analyzer.asInstanceOf[js.Any])
    if (!js.isUndefined(batched_reduce_size)) __obj.updateDynamic("batched_reduce_size")(batched_reduce_size.get.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (default_operator != null) __obj.updateDynamic("default_operator")(default_operator.asInstanceOf[js.Any])
    if (df != null) __obj.updateDynamic("df")(df.asInstanceOf[js.Any])
    if (docvalue_fields != null) __obj.updateDynamic("docvalue_fields")(docvalue_fields.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.get.asInstanceOf[js.Any])
    if (expand_wildcards != null) __obj.updateDynamic("expand_wildcards")(expand_wildcards.asInstanceOf[js.Any])
    if (!js.isUndefined(explain)) __obj.updateDynamic("explain")(explain.get.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore_throttled)) __obj.updateDynamic("ignore_throttled")(ignore_throttled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore_unavailable)) __obj.updateDynamic("ignore_unavailable")(ignore_unavailable.get.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (keep_alive != null) __obj.updateDynamic("keep_alive")(keep_alive.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_on_completion)) __obj.updateDynamic("keep_on_completion")(keep_on_completion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lenient)) __obj.updateDynamic("lenient")(lenient.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_concurrent_shard_requests)) __obj.updateDynamic("max_concurrent_shard_requests")(max_concurrent_shard_requests.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (preference != null) __obj.updateDynamic("preference")(preference.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.get.asInstanceOf[js.Any])
    if (q != null) __obj.updateDynamic("q")(q.asInstanceOf[js.Any])
    if (!js.isUndefined(request_cache)) __obj.updateDynamic("request_cache")(request_cache.get.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing.asInstanceOf[js.Any])
    if (search_type != null) __obj.updateDynamic("search_type")(search_type.asInstanceOf[js.Any])
    if (!js.isUndefined(seq_no_primary_term)) __obj.updateDynamic("seq_no_primary_term")(seq_no_primary_term.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (stats != null) __obj.updateDynamic("stats")(stats.asInstanceOf[js.Any])
    if (stored_fields != null) __obj.updateDynamic("stored_fields")(stored_fields.asInstanceOf[js.Any])
    if (suggest_field != null) __obj.updateDynamic("suggest_field")(suggest_field.asInstanceOf[js.Any])
    if (suggest_mode != null) __obj.updateDynamic("suggest_mode")(suggest_mode.asInstanceOf[js.Any])
    if (!js.isUndefined(suggest_size)) __obj.updateDynamic("suggest_size")(suggest_size.get.asInstanceOf[js.Any])
    if (suggest_text != null) __obj.updateDynamic("suggest_text")(suggest_text.asInstanceOf[js.Any])
    if (!js.isUndefined(terminate_after)) __obj.updateDynamic("terminate_after")(terminate_after.get.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(track_scores)) __obj.updateDynamic("track_scores")(track_scores.get.asInstanceOf[js.Any])
    if (!js.isUndefined(track_total_hits)) __obj.updateDynamic("track_total_hits")(track_total_hits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(typed_keys)) __obj.updateDynamic("typed_keys")(typed_keys.get.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    if (wait_for_completion_timeout != null) __obj.updateDynamic("wait_for_completion_timeout")(wait_for_completion_timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncSearchSubmit[T]]
  }
}

