package typings.draftJs.mod.Draft.Model.Entity

import typings.draftJs.mod.Draft.Model.Constants.DraftEntityMutability
import typings.draftJs.mod.Draft.Model.Constants.DraftEntityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of a document entity, consisting of a `type` and relevant
  * `data`, metadata about the entity.
  *
  * For instance, a "link" entity might provide a URI, and a "mention"
  * entity might provide the mentioned user's ID. These pieces of data
  * may be used when rendering the entity as part of a ContentBlock DOM
  * representation. For a link, the data would be used as an href for
  * the rendered anchor. For a mention, the ID could be used to retrieve
  * a hovercard.
  */
trait DraftEntityInstance extends js.Object {
  def getData(): js.Any
  def getMutability(): DraftEntityMutability
  def getType(): DraftEntityType
}

object DraftEntityInstance {
  @scala.inline
  def apply(getData: () => js.Any, getMutability: () => DraftEntityMutability, getType: () => DraftEntityType): DraftEntityInstance = {
    val __obj = js.Dynamic.literal(getData = js.Any.fromFunction0(getData), getMutability = js.Any.fromFunction0(getMutability), getType = js.Any.fromFunction0(getType))
    __obj.asInstanceOf[DraftEntityInstance]
  }
}

