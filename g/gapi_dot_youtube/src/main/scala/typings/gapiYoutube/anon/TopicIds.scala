package typings.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicIds extends js.Object {
  /**
    * A list of Freebase topic IDs associated with the video. You can retrieve information about each topic using the Freebase Topic API.
    */
  var topicIds: js.Array[String]
}

object TopicIds {
  @scala.inline
  def apply(topicIds: js.Array[String]): TopicIds = {
    val __obj = js.Dynamic.literal(topicIds = topicIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicIds]
  }
}

