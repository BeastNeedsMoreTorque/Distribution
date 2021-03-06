package typings.googleapis.storageV1beta2Mod.storageV1beta2

import typings.googleapis.anon.Generation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Compose request.
  */
@js.native
trait SchemaComposeRequest extends js.Object {
  /**
    * Properties of the resulting object
    */
  var destination: js.UndefOr[SchemaObject] = js.native
  /**
    * The kind of item this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The list of source objects that will be concatenated into a single
    * object.
    */
  var sourceObjects: js.UndefOr[js.Array[Generation]] = js.native
}

object SchemaComposeRequest {
  @scala.inline
  def apply(destination: SchemaObject = null, kind: String = null, sourceObjects: js.Array[Generation] = null): SchemaComposeRequest = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (sourceObjects != null) __obj.updateDynamic("sourceObjects")(sourceObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaComposeRequest]
  }
}

