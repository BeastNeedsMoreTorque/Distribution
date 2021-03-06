package typings.openapiFramework.basePathMod

import org.scalablytyped.runtime.StringDictionary
import typings.openapiFramework.anon.Enum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePath extends js.Object {
  val path: String
  val variables: StringDictionary[Enum]
  def hasVariables(): Boolean
}

object BasePath {
  @scala.inline
  def apply(hasVariables: () => Boolean, path: String, variables: StringDictionary[Enum]): BasePath = {
    val __obj = js.Dynamic.literal(hasVariables = js.Any.fromFunction0(hasVariables), path = path.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePath]
  }
}

