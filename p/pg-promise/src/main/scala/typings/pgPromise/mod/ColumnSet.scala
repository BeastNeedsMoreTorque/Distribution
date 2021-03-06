package typings.pgPromise.mod

import typings.pgPromise.anon.From
import typings.pgPromise.anon.Prefix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// helpers.Column class;
// API: http://vitaly-t.github.io/pg-promise/helpers.ColumnSet.html
@JSImport("pg-promise", "ColumnSet")
@js.native
class ColumnSet[S] protected () extends js.Object {
  def this(columns: js.Array[String | IColumnConfig[S] | Column[S]]) = this()
  def this(columns: js.Object) = this()
  def this(columns: Column[S]) = this()
  def this(columns: js.Array[String | IColumnConfig[S] | Column[S]], options: IColumnSetOptions) = this()
  def this(columns: js.Object, options: IColumnSetOptions) = this()
  def this(columns: Column[S], options: IColumnSetOptions) = this()
  val columns: js.Array[Column[S]] = js.native
  val names: String = js.native
  val table: TableName = js.native
  val variables: String = js.native
  def assign(): String = js.native
  def assign(source: Prefix): String = js.native
  def assignColumns(): String = js.native
  def assignColumns(options: From[S]): String = js.native
  def extend(columns: js.Array[String | IColumnConfig[_] | Column[_]]): ColumnSet[_] = js.native
  def extend(columns: Column[_]): ColumnSet[_] = js.native
  def extend(columns: ColumnSet[_]): ColumnSet[_] = js.native
  def merge(columns: js.Array[String | IColumnConfig[_] | Column[_]]): ColumnSet[_] = js.native
  def merge(columns: Column[_]): ColumnSet[_] = js.native
  def merge(columns: ColumnSet[_]): ColumnSet[_] = js.native
  def prepare(obj: js.Object): js.Object = js.native
  def toString(level: Double): String = js.native
}

