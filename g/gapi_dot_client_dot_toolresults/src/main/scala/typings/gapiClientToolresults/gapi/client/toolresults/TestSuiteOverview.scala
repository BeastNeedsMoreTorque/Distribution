package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestSuiteOverview extends js.Object {
  /**
    * Number of test cases in error, typically set by the service by parsing the xml_source.
    *
    * - In create/response: always set - In update request: never
    */
  var errorCount: js.UndefOr[Double] = js.undefined
  /**
    * Number of failed test cases, typically set by the service by parsing the xml_source. May also be set by the user.
    *
    * - In create/response: always set - In update request: never
    */
  var failureCount: js.UndefOr[Double] = js.undefined
  /**
    * The name of the test suite.
    *
    * - In create/response: always set - In update request: never
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Number of test cases not run, typically set by the service by parsing the xml_source.
    *
    * - In create/response: always set - In update request: never
    */
  var skippedCount: js.UndefOr[Double] = js.undefined
  /**
    * Number of test cases, typically set by the service by parsing the xml_source.
    *
    * - In create/response: always set - In update request: never
    */
  var totalCount: js.UndefOr[Double] = js.undefined
  /**
    * If this test suite was parsed from XML, this is the URI where the original XML file is stored.
    *
    * Note: Multiple test suites can share the same xml_source
    *
    * Returns INVALID_ARGUMENT if the uri format is not supported.
    *
    * - In create/response: optional - In update request: never
    */
  var xmlSource: js.UndefOr[FileReference] = js.undefined
}

object TestSuiteOverview {
  @scala.inline
  def apply(
    errorCount: js.UndefOr[Double] = js.undefined,
    failureCount: js.UndefOr[Double] = js.undefined,
    name: String = null,
    skippedCount: js.UndefOr[Double] = js.undefined,
    totalCount: js.UndefOr[Double] = js.undefined,
    xmlSource: FileReference = null
  ): TestSuiteOverview = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(errorCount)) __obj.updateDynamic("errorCount")(errorCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failureCount)) __obj.updateDynamic("failureCount")(failureCount.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(skippedCount)) __obj.updateDynamic("skippedCount")(skippedCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalCount)) __obj.updateDynamic("totalCount")(totalCount.get.asInstanceOf[js.Any])
    if (xmlSource != null) __obj.updateDynamic("xmlSource")(xmlSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSuiteOverview]
  }
}

