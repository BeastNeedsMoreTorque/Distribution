package typings.pulumiKubernetes.inputMod.apiextensions.v1beta1

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).
  */
trait JSONSchemaProps extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[Input[String]] = js.undefined
  @JSName("$schema")
  var $schema: js.UndefOr[Input[String]] = js.undefined
  var additionalItems: js.UndefOr[Input[JSONSchemaProps | Boolean]] = js.undefined
  var additionalProperties: js.UndefOr[Input[JSONSchemaProps | Boolean]] = js.undefined
  var allOf: js.UndefOr[Input[js.Array[Input[JSONSchemaProps]]]] = js.undefined
  var anyOf: js.UndefOr[Input[js.Array[Input[JSONSchemaProps]]]] = js.undefined
  /**
    * default is a default value for undefined object fields. Defaulting is a beta feature under
    * the CustomResourceDefaulting feature gate. CustomResourceDefinitions with defaults must be
    * created using the v1 (or newer) CustomResourceDefinition API.
    */
  var default: js.UndefOr[Input[_]] = js.undefined
  var definitions: js.UndefOr[Input[js.Object]] = js.undefined
  var dependencies: js.UndefOr[Input[js.Object]] = js.undefined
  var description: js.UndefOr[Input[String]] = js.undefined
  var enum: js.UndefOr[Input[js.Array[Input[_]]]] = js.undefined
  var example: js.UndefOr[Input[_]] = js.undefined
  var exclusiveMaximum: js.UndefOr[Input[Boolean]] = js.undefined
  var exclusiveMinimum: js.UndefOr[Input[Boolean]] = js.undefined
  var externalDocs: js.UndefOr[Input[ExternalDocumentation]] = js.undefined
  /**
    * format is an OpenAPI v3 format string. Unknown formats are ignored. The following formats
    * are validated:
    *
    * - bsonobjectid: a bson object ID, i.e. a 24 characters hex string - uri: an URI as parsed
    * by Golang net/url.ParseRequestURI - email: an email address as parsed by Golang
    * net/mail.ParseAddress - hostname: a valid representation for an Internet host name, as
    * defined by RFC 1034, section 3.1 [RFC1034]. - ipv4: an IPv4 IP as parsed by Golang
    * net.ParseIP - ipv6: an IPv6 IP as parsed by Golang net.ParseIP - cidr: a CIDR as parsed by
    * Golang net.ParseCIDR - mac: a MAC address as parsed by Golang net.ParseMAC - uuid: an UUID
    * that allows uppercase defined by the regex
    * (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid3: an UUID3
    * that allows uppercase defined by the regex
    * (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?3[0-9a-f]{3}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid4: an UUID4
    * that allows uppercase defined by the regex
    * (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?4[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - uuid5: an
    * UUID5 that allows uppercase defined by the regex
    * (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?5[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - isbn: an
    * ISBN10 or ISBN13 number string like "0321751043" or "978-0321751041" - isbn10: an ISBN10
    * number string like "0321751043" - isbn13: an ISBN13 number string like "978-0321751041" -
    * creditcard: a credit card number defined by the regex
    * ^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|6(?:011|5[0-9][0-9])[0-9]{12}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|(?:2131|1800|35\d{3})\d{11})$
    * with any non digit characters mixed in - ssn: a U.S. social security number following the
    * regex ^\d{3}[- ]?\d{2}[- ]?\d{4}$ - hexcolor: an hexadecimal color code like "#FFFFFF:
    * following the regex ^#?([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$ - rgbcolor: an RGB color code like
    * rgb like "rgb(255,255,2559" - byte: base64 encoded binary data - password: any kind of
    * string - date: a date string like "2006-01-02" as defined by full-date in RFC3339 -
    * duration: a duration string like "22 ns" as parsed by Golang time.ParseDuration or
    * compatible with Scala duration format - datetime: a date time string like
    * "2014-12-15T19:30:20.000Z" as defined by date-time in RFC3339.
    */
  var format: js.UndefOr[Input[String]] = js.undefined
  var id: js.UndefOr[Input[String]] = js.undefined
  var items: js.UndefOr[Input[JSONSchemaProps | js.Array[_]]] = js.undefined
  var maxItems: js.UndefOr[Input[Double]] = js.undefined
  var maxLength: js.UndefOr[Input[Double]] = js.undefined
  var maxProperties: js.UndefOr[Input[Double]] = js.undefined
  var maximum: js.UndefOr[Input[Double]] = js.undefined
  var minItems: js.UndefOr[Input[Double]] = js.undefined
  var minLength: js.UndefOr[Input[Double]] = js.undefined
  var minProperties: js.UndefOr[Input[Double]] = js.undefined
  var minimum: js.UndefOr[Input[Double]] = js.undefined
  var multipleOf: js.UndefOr[Input[Double]] = js.undefined
  var not: js.UndefOr[Input[JSONSchemaProps]] = js.undefined
  var nullable: js.UndefOr[Input[Boolean]] = js.undefined
  var oneOf: js.UndefOr[Input[js.Array[Input[JSONSchemaProps]]]] = js.undefined
  var pattern: js.UndefOr[Input[String]] = js.undefined
  var patternProperties: js.UndefOr[Input[js.Object]] = js.undefined
  var properties: js.UndefOr[Input[js.Object]] = js.undefined
  var required: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var title: js.UndefOr[Input[String]] = js.undefined
  var `type`: js.UndefOr[Input[String]] = js.undefined
  var uniqueItems: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes
    * runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to
    * further restrict the embedded object. kind, apiVersion and metadata are validated
    * automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not
    * have to be if the object is fully specified (up to kind, apiVersion, metadata).
    */
  var x_kubernetes_embedded_resource: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * x-kubernetes-int-or-string specifies that this value is either an integer or a string. If
    * this is true, an empty type is allowed and type as child of anyOf is permitted if following
    * one of the following patterns:
    *
    * 1) anyOf:
    *    - type: integer
    *    - type: string
    * 2) allOf:
    *    - anyOf:
    *      - type: integer
    *      - type: string
    *    - ... zero or more
    */
  var x_kubernetes_int_or_string: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type `map` by
    * specifying the keys used as the index of the map.
    *
    * This tag MUST only be used on lists that have the "x-kubernetes-list-type" extension set to
    * "map". Also, the values specified for this attribute must be a scalar typed field of the
    * child structure (no nesting is supported).
    *
    * The properties specified must either be required or have a default value, to ensure those
    * properties are present for all list items.
    */
  var x_kubernetes_list_map_keys: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * x-kubernetes-list-type annotates an array to further describe its topology. This extension
    * must only be used on lists and may have 3 possible values:
    *
    * 1) `atomic`: the list is treated as a single entity, like a scalar.
    *      Atomic lists will be entirely replaced when updated. This extension
    *      may be used on any type of list (struct, scalar, ...).
    * 2) `set`:
    *      Sets are lists that must not have multiple items with the same value. Each
    *      value must be a scalar, an object with x-kubernetes-map-type `atomic` or an
    *      array with x-kubernetes-list-type `atomic`.
    * 3) `map`:
    *      These lists are like maps in that their elements have a non-index key
    *      used to identify them. Order is preserved upon merge. The map tag
    *      must only be used on a list with elements of type object.
    * Defaults to atomic for arrays.
    */
  var x_kubernetes_list_type: js.UndefOr[Input[String]] = js.undefined
  /**
    * x-kubernetes-map-type annotates an object to further describe its topology. This extension
    * must only be used when type is object and may have 2 possible values:
    *
    * 1) `granular`:
    *      These maps are actual maps (key-value pairs) and each fields are independent
    *      from each other (they can each be manipulated by separate actors). This is
    *      the default behaviour for all maps.
    * 2) `atomic`: the list is treated as a single entity, like a scalar.
    *      Atomic maps will be entirely replaced when updated.
    */
  var x_kubernetes_map_type: js.UndefOr[Input[String]] = js.undefined
  /**
    * x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields
    * which are not specified in the validation schema. This affects fields recursively, but
    * switches back to normal pruning behaviour if nested properties or additionalProperties are
    * specified in the schema. This can either be true or undefined. False is forbidden.
    */
  var x_kubernetes_preserve_unknown_fields: js.UndefOr[Input[Boolean]] = js.undefined
}

object JSONSchemaProps {
  @scala.inline
  def apply(
    $ref: Input[String] = null,
    $schema: Input[String] = null,
    additionalItems: Input[JSONSchemaProps | Boolean] = null,
    additionalProperties: Input[JSONSchemaProps | Boolean] = null,
    allOf: Input[js.Array[Input[JSONSchemaProps]]] = null,
    anyOf: Input[js.Array[Input[JSONSchemaProps]]] = null,
    default: Input[_] = null,
    definitions: Input[js.Object] = null,
    dependencies: Input[js.Object] = null,
    description: Input[String] = null,
    enum: Input[js.Array[Input[_]]] = null,
    example: Input[_] = null,
    exclusiveMaximum: Input[Boolean] = null,
    exclusiveMinimum: Input[Boolean] = null,
    externalDocs: Input[ExternalDocumentation] = null,
    format: Input[String] = null,
    id: Input[String] = null,
    items: Input[JSONSchemaProps | js.Array[_]] = null,
    maxItems: Input[Double] = null,
    maxLength: Input[Double] = null,
    maxProperties: Input[Double] = null,
    maximum: Input[Double] = null,
    minItems: Input[Double] = null,
    minLength: Input[Double] = null,
    minProperties: Input[Double] = null,
    minimum: Input[Double] = null,
    multipleOf: Input[Double] = null,
    not: Input[JSONSchemaProps] = null,
    nullable: Input[Boolean] = null,
    oneOf: Input[js.Array[Input[JSONSchemaProps]]] = null,
    pattern: Input[String] = null,
    patternProperties: Input[js.Object] = null,
    properties: Input[js.Object] = null,
    required: Input[js.Array[Input[String]]] = null,
    title: Input[String] = null,
    `type`: Input[String] = null,
    uniqueItems: Input[Boolean] = null,
    x_kubernetes_embedded_resource: Input[Boolean] = null,
    x_kubernetes_int_or_string: Input[Boolean] = null,
    x_kubernetes_list_map_keys: Input[js.Array[Input[String]]] = null,
    x_kubernetes_list_type: Input[String] = null,
    x_kubernetes_map_type: Input[String] = null,
    x_kubernetes_preserve_unknown_fields: Input[Boolean] = null
  ): JSONSchemaProps = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref.asInstanceOf[js.Any])
    if ($schema != null) __obj.updateDynamic("$schema")($schema.asInstanceOf[js.Any])
    if (additionalItems != null) __obj.updateDynamic("additionalItems")(additionalItems.asInstanceOf[js.Any])
    if (additionalProperties != null) __obj.updateDynamic("additionalProperties")(additionalProperties.asInstanceOf[js.Any])
    if (allOf != null) __obj.updateDynamic("allOf")(allOf.asInstanceOf[js.Any])
    if (anyOf != null) __obj.updateDynamic("anyOf")(anyOf.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (definitions != null) __obj.updateDynamic("definitions")(definitions.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (example != null) __obj.updateDynamic("example")(example.asInstanceOf[js.Any])
    if (exclusiveMaximum != null) __obj.updateDynamic("exclusiveMaximum")(exclusiveMaximum.asInstanceOf[js.Any])
    if (exclusiveMinimum != null) __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum.asInstanceOf[js.Any])
    if (externalDocs != null) __obj.updateDynamic("externalDocs")(externalDocs.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (maxItems != null) __obj.updateDynamic("maxItems")(maxItems.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (maxProperties != null) __obj.updateDynamic("maxProperties")(maxProperties.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minItems != null) __obj.updateDynamic("minItems")(minItems.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (minProperties != null) __obj.updateDynamic("minProperties")(minProperties.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (multipleOf != null) __obj.updateDynamic("multipleOf")(multipleOf.asInstanceOf[js.Any])
    if (not != null) __obj.updateDynamic("not")(not.asInstanceOf[js.Any])
    if (nullable != null) __obj.updateDynamic("nullable")(nullable.asInstanceOf[js.Any])
    if (oneOf != null) __obj.updateDynamic("oneOf")(oneOf.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (patternProperties != null) __obj.updateDynamic("patternProperties")(patternProperties.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uniqueItems != null) __obj.updateDynamic("uniqueItems")(uniqueItems.asInstanceOf[js.Any])
    if (x_kubernetes_embedded_resource != null) __obj.updateDynamic("x_kubernetes_embedded_resource")(x_kubernetes_embedded_resource.asInstanceOf[js.Any])
    if (x_kubernetes_int_or_string != null) __obj.updateDynamic("x_kubernetes_int_or_string")(x_kubernetes_int_or_string.asInstanceOf[js.Any])
    if (x_kubernetes_list_map_keys != null) __obj.updateDynamic("x_kubernetes_list_map_keys")(x_kubernetes_list_map_keys.asInstanceOf[js.Any])
    if (x_kubernetes_list_type != null) __obj.updateDynamic("x_kubernetes_list_type")(x_kubernetes_list_type.asInstanceOf[js.Any])
    if (x_kubernetes_map_type != null) __obj.updateDynamic("x_kubernetes_map_type")(x_kubernetes_map_type.asInstanceOf[js.Any])
    if (x_kubernetes_preserve_unknown_fields != null) __obj.updateDynamic("x_kubernetes_preserve_unknown_fields")(x_kubernetes_preserve_unknown_fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONSchemaProps]
  }
}

