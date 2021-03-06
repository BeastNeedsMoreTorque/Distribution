package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait predominantCategories extends js.Object {
  /**
    * Determines predominant categories for a layer based on a given set of competing numeric fields and returns the number of features belonging to each category.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-predominantCategories.html#predominantCategories)
    *
    * @param params See the table below for details of each parameter.
    * @param params.layer The layer from which to generate predominant categories for the given set of `fields`.
    * @param params.fields An array of numeric fields from which to determine predominant categories. The fields must all be number fields and they must be competing or complementary (e.g. population totals by language spoken at home, or harvested acres by crop type, or the results of an election by candidate or party).
    * @param params.view The view in which features will be rendered.
    * @param params.signal Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def predominantCategories(params: predominantCategoriesPredominantCategoriesParams): js.Promise[PredominantCategoriesResult]
}

object predominantCategories {
  @scala.inline
  def apply(
    predominantCategories: predominantCategoriesPredominantCategoriesParams => js.Promise[PredominantCategoriesResult]
  ): predominantCategories = {
    val __obj = js.Dynamic.literal(predominantCategories = js.Any.fromFunction1(predominantCategories))
    __obj.asInstanceOf[predominantCategories]
  }
}

