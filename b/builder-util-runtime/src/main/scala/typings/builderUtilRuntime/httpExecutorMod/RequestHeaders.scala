package typings.builderUtilRuntime.httpExecutorMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.Dict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- org.scalablytyped.runtime.StringDictionary because Already inherited */ trait RequestHeaders
  extends Dict[Double | String | js.Array[String]]

object RequestHeaders {
  @scala.inline
  def apply(StringDictionary: StringDictionary[js.UndefOr[Double | String | js.Array[String]]] = null): RequestHeaders = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[RequestHeaders]
  }
}

