package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a single field in the database.  Fields are grouped by their
  * &quot;Collection Group&quot;, which represent all collections in the
  * database with the same id.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1Field extends js.Object {
  /**
    * The index configuration for this field. If unset, field indexing will
    * revert to the configuration defined by the `ancestor_field`. To
    * explicitly remove all indexes for this field, specify an index config
    * with an empty list of indexes.
    */
  var indexConfig: js.UndefOr[SchemaGoogleFirestoreAdminV1IndexConfig] = js.native
  /**
    * A field name of the form
    * `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/fields/{field_path}`
    * A field path may be a simple field name, e.g. `address` or a path to
    * fields within map_value , e.g. `address.city`, or a special field path.
    * The only valid special field is `*`, which represents any field.  Field
    * paths may be quoted using ` (backtick). The only character that needs to
    * be escaped within a quoted field path is the backtick character itself,
    * escaped using a backslash. Special characters in field paths that must be
    * quoted include: `*`, `.`, ``` (backtick), `[`, `]`, as well as any ascii
    * symbolic characters.  Examples: (Note: Comments here are written in
    * markdown syntax, so there is an  additional layer of backticks to
    * represent a code block) `\`address.city\`` represents a field named
    * `address.city`, not the map key `city` in the field `address`. `\`*\``
    * represents a field named `*`, not any field.  A special `Field` contains
    * the default indexing settings for all fields. This field&#39;s resource
    * name is:
    * `projects/{project_id}/databases/{database_id}/collectionGroups/__default__/fields/x
    * Indexes defined on this `Field` will be applied to all fields which do
    * not have their own `Field` index configuration.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaGoogleFirestoreAdminV1Field {
  @scala.inline
  def apply(indexConfig: SchemaGoogleFirestoreAdminV1IndexConfig = null, name: String = null): SchemaGoogleFirestoreAdminV1Field = {
    val __obj = js.Dynamic.literal()
    if (indexConfig != null) __obj.updateDynamic("indexConfig")(indexConfig.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1Field]
  }
}

