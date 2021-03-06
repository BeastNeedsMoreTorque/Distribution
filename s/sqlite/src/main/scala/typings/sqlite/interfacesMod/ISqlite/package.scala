package typings.sqlite.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ISqlite {
  /**
    * Allows for input of a normal SQL string or
    * `sql-template-strings` object
    */
  type SqlType = typings.sqlite.sqlTemplateStringsMod.SQLStatement | java.lang.String
}
