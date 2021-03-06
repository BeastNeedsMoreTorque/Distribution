package typings.pouchdbLiveFind.PouchDB

import typings.pouchdbLiveFind.PouchDB.LiveFind.LiveFeed
import typings.pouchdbLiveFind.PouchDB.LiveFind.RequestDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Database[Content /* <: js.Object */] extends js.Object {
  def liveFind(requestDef: RequestDef[Content]): LiveFeed[Content]
}

object Database {
  @scala.inline
  def apply[/* <: js.Object */ Content](liveFind: RequestDef[Content] => LiveFeed[Content]): Database[Content] = {
    val __obj = js.Dynamic.literal(liveFind = js.Any.fromFunction1(liveFind))
    __obj.asInstanceOf[Database[Content]]
  }
}

