package typings.sequelize.mod

import typings.sequelize.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypeArray extends DataTypeAbstract {
  /**
    * Array field for Postgre
    *
    * Accepts type any of the DataTypes
    */
  def apply(options: Type): DataTypeArray = js.native
  def apply(`type`: DataTypeAbstract): DataTypeArray = js.native
}

