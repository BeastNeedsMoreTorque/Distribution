package typings.yaml.parseCstMod.CST

import typings.yaml.anon.Errors
import typings.yaml.anon.Handle
import typings.yaml.anon.Verbatim
import typings.yaml.utilMod.Type.ALIAS
import typings.yaml.utilMod.Type.BLOCK_FOLDED
import typings.yaml.utilMod.Type.BLOCK_LITERAL
import typings.yaml.utilMod.Type.FLOW_MAP
import typings.yaml.utilMod.Type.FLOW_SEQ
import typings.yaml.utilMod.Type.MAP
import typings.yaml.utilMod.Type.PLAIN
import typings.yaml.utilMod.Type.QUOTE_DOUBLE
import typings.yaml.utilMod.Type.QUOTE_SINGLE
import typings.yaml.utilMod.Type.SEQ
import typings.yaml.utilMod.YAMLSyntaxError
import typings.yaml.yamlStrings.CLIP
import typings.yaml.yamlStrings.KEEP
import typings.yaml.yamlStrings.STRIP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.yaml.parseCstMod.CST.Alias
  - typings.yaml.parseCstMod.CST.Scalar
  - typings.yaml.parseCstMod.CST.Map
  - typings.yaml.parseCstMod.CST.Seq
  - typings.yaml.parseCstMod.CST.FlowCollection
*/
trait ContentNode extends js.Object

object ContentNode {
  @scala.inline
  def Alias(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    rawValue: String,
    `type`: ALIAS,
    valueRangeContainsNewline: Boolean,
    anchor: String = null,
    comment: String = null,
    context: ParseContext = null,
    error: YAMLSyntaxError = null,
    range: Range = null,
    tag: Verbatim | Handle = null,
    value: String = null,
    valueRange: Range = null
  ): ContentNode = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any], anchor = anchor.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueRange = valueRange.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentNode]
  }
  @scala.inline
  def Map(
    hasComment: Boolean,
    hasProps: Boolean,
    items: js.Array[BlankLine | Comment | Alias | Scalar | MapItem],
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: MAP,
    valueRangeContainsNewline: Boolean,
    anchor: String = null,
    comment: String = null,
    context: ParseContext = null,
    error: YAMLSyntaxError = null,
    range: Range = null,
    rawValue: String = null,
    tag: Verbatim | Handle = null,
    value: String = null,
    valueRange: Range = null
  ): ContentNode = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any], anchor = anchor.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueRange = valueRange.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentNode]
  }
  @scala.inline
  def PlainValue(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: PLAIN,
    valueRangeContainsNewline: Boolean,
    anchor: String = null,
    comment: String = null,
    context: ParseContext = null,
    error: YAMLSyntaxError = null,
    range: Range = null,
    rawValue: String = null,
    strValue: String = null,
    tag: Verbatim | Handle = null,
    value: String = null,
    valueRange: Range = null
  ): ContentNode = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any], anchor = anchor.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], strValue = strValue.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueRange = valueRange.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentNode]
  }
  @scala.inline
  def Seq(
    hasComment: Boolean,
    hasProps: Boolean,
    items: js.Array[BlankLine | Comment | SeqItem],
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: SEQ,
    valueRangeContainsNewline: Boolean,
    anchor: String = null,
    comment: String = null,
    context: ParseContext = null,
    error: YAMLSyntaxError = null,
    range: Range = null,
    rawValue: String = null,
    tag: Verbatim | Handle = null,
    value: String = null,
    valueRange: Range = null
  ): ContentNode = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any], anchor = anchor.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueRange = valueRange.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentNode]
  }
  @scala.inline
  def BlockValue(
    chomping: CLIP | KEEP | STRIP,
    hasComment: Boolean,
    hasProps: Boolean,
    header: Range,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: BLOCK_FOLDED | BLOCK_LITERAL,
    valueRangeContainsNewline: Boolean,
    anchor: String = null,
    blockIndent: Double = null.asInstanceOf[Double],
    comment: String = null,
    context: ParseContext = null,
    error: YAMLSyntaxError = null,
    range: Range = null,
    rawValue: String = null,
    strValue: String = null,
    tag: Verbatim | Handle = null,
    value: String = null,
    valueRange: Range = null
  ): ContentNode = {
    val __obj = js.Dynamic.literal(chomping = chomping.asInstanceOf[js.Any], hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any], anchor = anchor.asInstanceOf[js.Any], blockIndent = blockIndent.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], strValue = strValue.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueRange = valueRange.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentNode]
  }
  @scala.inline
  def QuoteValue(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: QUOTE_DOUBLE | QUOTE_SINGLE,
    valueRangeContainsNewline: Boolean,
    anchor: String = null,
    comment: String = null,
    context: ParseContext = null,
    error: YAMLSyntaxError = null,
    range: Range = null,
    rawValue: String = null,
    strValue: String | Errors = null,
    tag: Verbatim | Handle = null,
    value: String = null,
    valueRange: Range = null
  ): ContentNode = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any], anchor = anchor.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], strValue = strValue.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueRange = valueRange.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentNode]
  }
  @scala.inline
  def FlowCollection(
    hasComment: Boolean,
    hasProps: Boolean,
    items: js.Array[
      FlowChar | BlankLine | Comment | Alias | Scalar | typings.yaml.parseCstMod.CST.FlowCollection
    ],
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: FLOW_MAP | FLOW_SEQ,
    valueRangeContainsNewline: Boolean,
    anchor: String = null,
    comment: String = null,
    context: ParseContext = null,
    error: YAMLSyntaxError = null,
    range: Range = null,
    rawValue: String = null,
    tag: Verbatim | Handle = null,
    value: String = null,
    valueRange: Range = null
  ): ContentNode = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any], anchor = anchor.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueRange = valueRange.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentNode]
  }
}

