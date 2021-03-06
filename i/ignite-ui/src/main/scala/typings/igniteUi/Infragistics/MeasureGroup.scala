package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeasureGroup extends js.Object {
  /**
    * Returns the caption of the measure group used when displaying the name of the measure group to the user.
    *
    * @param value
    */
  def caption(value: js.Object): String
  /**
    * Returns the name of the catalog to which this measure group belongs.
    *
    * @param value
    */
  def catalogName(value: js.Object): String
  /**
    * Returns the name of the cube to which this measure group belongs
    *
    * @param value
    */
  def cubeName(value: js.Object): String
  /**
    * Returns a user-friendly description of the measure group.
    *
    * @param value
    */
  def description(value: js.Object): String
  /**
    * Returns the name of the measure group.
    *
    * @param value
    */
  def name(value: js.Object): String
}

object MeasureGroup {
  @scala.inline
  def apply(
    caption: js.Object => String,
    catalogName: js.Object => String,
    cubeName: js.Object => String,
    description: js.Object => String,
    name: js.Object => String
  ): MeasureGroup = {
    val __obj = js.Dynamic.literal(caption = js.Any.fromFunction1(caption), catalogName = js.Any.fromFunction1(catalogName), cubeName = js.Any.fromFunction1(cubeName), description = js.Any.fromFunction1(description), name = js.Any.fromFunction1(name))
    __obj.asInstanceOf[MeasureGroup]
  }
}

