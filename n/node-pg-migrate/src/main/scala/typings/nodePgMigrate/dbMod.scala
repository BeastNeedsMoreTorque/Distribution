package typings.nodePgMigrate

import typings.nodePgMigrate.distTypesMod.DB
import typings.nodePgMigrate.distTypesMod.Logger
import typings.pg.mod.ClientBase
import typings.pg.mod.ClientConfig
import typings.pg.mod.QueryArrayConfig
import typings.pg.mod.QueryConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate/dist/db", JSImport.Namespace)
@js.native
object dbMod extends js.Object {
  @js.native
  trait DBConnection extends DB {
    def addBeforeCloseListener(listener: js.Any): Double = js.native
    def close(): js.Promise[Unit] = js.native
    def column(columnName: String, queryConfig: QueryArrayConfig[js.Array[_]]): js.Promise[js.Array[_]] = js.native
    def column(columnName: String, queryConfig: QueryArrayConfig[js.Array[_]], values: js.Array[_]): js.Promise[js.Array[_]] = js.native
    def column(columnName: String, queryConfig: QueryConfig[js.Array[_]]): js.Promise[js.Array[_]] = js.native
    def column(columnName: String, queryTextOrConfig: String): js.Promise[js.Array[_]] = js.native
    def column(columnName: String, queryTextOrConfig: String, values: js.Array[_]): js.Promise[js.Array[_]] = js.native
    def column(columnName: String, queryTextOrConfig: QueryConfig[js.Array[_]], values: js.Array[_]): js.Promise[js.Array[_]] = js.native
    def createConnection(): js.Promise[Unit] = js.native
  }
  
  def default(connection: String): DBConnection = js.native
  def default(connection: String, logger: Logger): DBConnection = js.native
  def default(connection: ClientBase): DBConnection = js.native
  def default(connection: ClientBase, logger: Logger): DBConnection = js.native
  def default(connection: ClientConfig): DBConnection = js.native
  def default(connection: ClientConfig, logger: Logger): DBConnection = js.native
}

