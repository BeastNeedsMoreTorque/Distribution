package typings.toJsonSchema.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jsonSchema.mod.JSONSchema4
import typings.jsonSchema.mod.JSONSchema4Type
import typings.jsonSchema.mod.JSONSchema4TypeName
import typings.jsonSchema.mod.JSONSchema4Version
import typings.toJsonSchema.toJsonSchemaBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONSchema3or4
  extends /* k */ StringDictionary[js.Any] {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  @JSName("$schema")
  var $schema: js.UndefOr[JSONSchema4Version] = js.undefined
  var additionalItems: js.UndefOr[Boolean | JSONSchema3or4] = js.undefined
  var additionalProperties: js.UndefOr[Boolean | JSONSchema3or4] = js.undefined
  var allOf: js.UndefOr[js.Array[JSONSchema4]] = js.undefined
  var anyOf: js.UndefOr[js.Array[JSONSchema4]] = js.undefined
  var default: js.UndefOr[JSONSchema4Type] = js.undefined
  var definitions: js.UndefOr[StringDictionary[JSONSchema4]] = js.undefined
  var dependencies: js.UndefOr[StringDictionary[JSONSchema3or4 | String | js.Array[String]]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  /** JSON Schema 3 only */
  var disallow: js.UndefOr[String | (js.Array[String | JSONSchema3or4])] = js.undefined
  /** JSON Schema 3 uses `divisibleBy` instead of `multipleOf`. */
  var divisibleBy: js.UndefOr[Double] = js.undefined
  var enum: js.UndefOr[js.Array[JSONSchema4Type]] = js.undefined
  var exclusiveMaximum: js.UndefOr[Boolean] = js.undefined
  var exclusiveMinimum: js.UndefOr[Boolean] = js.undefined
  var `extends`: js.UndefOr[JSONSchema3or4 | js.Array[JSONSchema3or4]] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[JSONSchema3or4 | js.Array[JSONSchema3or4]] = js.undefined
  var maxItems: js.UndefOr[Double] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var maxProperties: js.UndefOr[Double] = js.undefined
  var maximum: js.UndefOr[Double] = js.undefined
  var minItems: js.UndefOr[Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var minProperties: js.UndefOr[Double] = js.undefined
  var minimum: js.UndefOr[Double] = js.undefined
  var multipleOf: js.UndefOr[Double] = js.undefined
  var not: js.UndefOr[JSONSchema4] = js.undefined
  var oneOf: js.UndefOr[js.Array[JSONSchema4]] = js.undefined
  var pattern: js.UndefOr[String] = js.undefined
  var patternProperties: js.UndefOr[StringDictionary[JSONSchema3or4]] = js.undefined
  var properties: js.UndefOr[StringDictionary[JSONSchema3or4]] = js.undefined
  var required: js.UndefOr[Boolean | `false` | js.Array[String]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[JSONSchema4TypeName | js.Array[JSONSchema4TypeName]] = js.undefined
  var uniqueItems: js.UndefOr[Boolean] = js.undefined
}

object JSONSchema3or4 {
  @scala.inline
  def apply(
    $ref: String = null,
    $schema: JSONSchema4Version = null,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    additionalItems: Boolean | JSONSchema3or4 = null,
    additionalProperties: Boolean | JSONSchema3or4 = null,
    allOf: js.Array[JSONSchema4] = null,
    anyOf: js.Array[JSONSchema4] = null,
    default: js.UndefOr[Null | JSONSchema4Type] = js.undefined,
    definitions: StringDictionary[JSONSchema4] = null,
    dependencies: StringDictionary[JSONSchema3or4 | String | js.Array[String]] = null,
    description: String = null,
    disallow: String | (js.Array[String | JSONSchema3or4]) = null,
    divisibleBy: js.UndefOr[Double] = js.undefined,
    enum: js.Array[JSONSchema4Type] = null,
    exclusiveMaximum: js.UndefOr[Boolean] = js.undefined,
    exclusiveMinimum: js.UndefOr[Boolean] = js.undefined,
    `extends`: JSONSchema3or4 | js.Array[JSONSchema3or4] = null,
    format: String = null,
    id: String = null,
    items: JSONSchema3or4 | js.Array[JSONSchema3or4] = null,
    maxItems: js.UndefOr[Double] = js.undefined,
    maxLength: js.UndefOr[Double] = js.undefined,
    maxProperties: js.UndefOr[Double] = js.undefined,
    maximum: js.UndefOr[Double] = js.undefined,
    minItems: js.UndefOr[Double] = js.undefined,
    minLength: js.UndefOr[Double] = js.undefined,
    minProperties: js.UndefOr[Double] = js.undefined,
    minimum: js.UndefOr[Double] = js.undefined,
    multipleOf: js.UndefOr[Double] = js.undefined,
    not: JSONSchema4 = null,
    oneOf: js.Array[JSONSchema4] = null,
    pattern: String = null,
    patternProperties: StringDictionary[JSONSchema3or4] = null,
    properties: StringDictionary[JSONSchema3or4] = null,
    required: Boolean | `false` | js.Array[String] = null,
    title: String = null,
    `type`: JSONSchema4TypeName | js.Array[JSONSchema4TypeName] = null,
    uniqueItems: js.UndefOr[Boolean] = js.undefined
  ): JSONSchema3or4 = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref.asInstanceOf[js.Any])
    if ($schema != null) __obj.updateDynamic("$schema")($schema.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (additionalItems != null) __obj.updateDynamic("additionalItems")(additionalItems.asInstanceOf[js.Any])
    if (additionalProperties != null) __obj.updateDynamic("additionalProperties")(additionalProperties.asInstanceOf[js.Any])
    if (allOf != null) __obj.updateDynamic("allOf")(allOf.asInstanceOf[js.Any])
    if (anyOf != null) __obj.updateDynamic("anyOf")(anyOf.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (definitions != null) __obj.updateDynamic("definitions")(definitions.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (disallow != null) __obj.updateDynamic("disallow")(disallow.asInstanceOf[js.Any])
    if (!js.isUndefined(divisibleBy)) __obj.updateDynamic("divisibleBy")(divisibleBy.get.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusiveMaximum)) __obj.updateDynamic("exclusiveMaximum")(exclusiveMaximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exclusiveMinimum)) __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum.get.asInstanceOf[js.Any])
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(maxItems)) __obj.updateDynamic("maxItems")(maxItems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxProperties)) __obj.updateDynamic("maxProperties")(maxProperties.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minItems)) __obj.updateDynamic("minItems")(minItems.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minProperties)) __obj.updateDynamic("minProperties")(minProperties.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimum)) __obj.updateDynamic("minimum")(minimum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleOf)) __obj.updateDynamic("multipleOf")(multipleOf.get.asInstanceOf[js.Any])
    if (not != null) __obj.updateDynamic("not")(not.asInstanceOf[js.Any])
    if (oneOf != null) __obj.updateDynamic("oneOf")(oneOf.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (patternProperties != null) __obj.updateDynamic("patternProperties")(patternProperties.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(uniqueItems)) __obj.updateDynamic("uniqueItems")(uniqueItems.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONSchema3or4]
  }
}

