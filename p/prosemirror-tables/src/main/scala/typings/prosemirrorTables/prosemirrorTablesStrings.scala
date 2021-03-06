package typings.prosemirrorTables

import typings.prosemirrorTables.mod.TableRoles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object prosemirrorTablesStrings {
  @js.native
  sealed trait cell extends TableRoles
  
  @js.native
  sealed trait column extends js.Object
  
  @js.native
  sealed trait header_cell extends TableRoles
  
  @js.native
  sealed trait row extends TableRoles
  
  @js.native
  sealed trait table extends TableRoles
  
  @scala.inline
  def cell: cell = "cell".asInstanceOf[cell]
  @scala.inline
  def column: column = "column".asInstanceOf[column]
  @scala.inline
  def header_cell: header_cell = "header_cell".asInstanceOf[header_cell]
  @scala.inline
  def row: row = "row".asInstanceOf[row]
  @scala.inline
  def table: table = "table".asInstanceOf[table]
}

