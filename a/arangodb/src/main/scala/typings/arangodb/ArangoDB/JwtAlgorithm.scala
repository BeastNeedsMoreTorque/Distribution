package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.arangodb.arangodbStrings.HS512
  - typings.arangodb.arangodbStrings.HS384
  - typings.arangodb.arangodbStrings.HS256
*/
trait JwtAlgorithm extends js.Object

object JwtAlgorithm {
  @scala.inline
  def HS256: typings.arangodb.arangodbStrings.HS256 = "HS256".asInstanceOf[typings.arangodb.arangodbStrings.HS256]
  @scala.inline
  def HS384: typings.arangodb.arangodbStrings.HS384 = "HS384".asInstanceOf[typings.arangodb.arangodbStrings.HS384]
  @scala.inline
  def HS512: typings.arangodb.arangodbStrings.HS512 = "HS512".asInstanceOf[typings.arangodb.arangodbStrings.HS512]
}

