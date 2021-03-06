package typings.graphqlTools.anon

import typings.graphql.formatErrorMod.GraphQLFormattedError
import typings.graphqlTools.graphqlToolsStrings.CHILDREN
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors extends js.Object {
  var errors: js.UndefOr[js.Array[GraphQLFormattedError[Record[String, _]]]] = js.undefined
  var kind: CHILDREN
}

object Errors {
  @scala.inline
  def apply(kind: CHILDREN, errors: js.Array[GraphQLFormattedError[Record[String, _]]] = null): Errors = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
}

