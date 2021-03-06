package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Eventsurl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppsCreateFromManifestResponseData extends js.Object {
  var client_id: String
  var client_secret: String
  var created_at: String
  var description: String
  var external_url: String
  var html_url: String
  var id: Double
  var name: String
  var node_id: String
  var owner: Eventsurl
  var pem: String
  var updated_at: String
  var webhook_secret: String
}

object AppsCreateFromManifestResponseData {
  @scala.inline
  def apply(
    client_id: String,
    client_secret: String,
    created_at: String,
    description: String,
    external_url: String,
    html_url: String,
    id: Double,
    name: String,
    node_id: String,
    owner: Eventsurl,
    pem: String,
    updated_at: String,
    webhook_secret: String
  ): AppsCreateFromManifestResponseData = {
    val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], external_url = external_url.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], pem = pem.asInstanceOf[js.Any], updated_at = updated_at.asInstanceOf[js.Any], webhook_secret = webhook_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsCreateFromManifestResponseData]
  }
}

