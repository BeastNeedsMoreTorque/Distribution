package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MariaDbParameters extends js.Object {
  /**
    * Database.
    */
  var Database: typings.awsSdk.quicksightMod.Database = js.native
  /**
    * Host.
    */
  var Host: typings.awsSdk.quicksightMod.Host = js.native
  /**
    * Port.
    */
  var Port: typings.awsSdk.quicksightMod.Port = js.native
}

object MariaDbParameters {
  @scala.inline
  def apply(Database: Database, Host: Host, Port: Port): MariaDbParameters = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[MariaDbParameters]
  }
}

