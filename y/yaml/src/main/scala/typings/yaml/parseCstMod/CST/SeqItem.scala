package typings.yaml.parseCstMod.CST

import typings.yaml.anon.Handle
import typings.yaml.anon.Verbatim
import typings.yaml.utilMod.Type.SEQ_ITEM
import typings.yaml.utilMod.YAMLSyntaxError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeqItem extends Node {
  var node: ContentNode | Null
  @JSName("type")
  var type_SeqItem: SEQ_ITEM
}

object SeqItem {
  @scala.inline
  def apply(
    hasComment: Boolean,
    hasProps: Boolean,
    jsonLike: Boolean,
    props: js.Array[Range],
    `type`: SEQ_ITEM,
    valueRangeContainsNewline: Boolean,
    anchor: String = null,
    comment: String = null,
    context: ParseContext = null,
    error: YAMLSyntaxError = null,
    node: ContentNode = null,
    range: Range = null,
    rawValue: String = null,
    tag: Verbatim | Handle = null,
    value: String = null,
    valueRange: Range = null
  ): SeqItem = {
    val __obj = js.Dynamic.literal(hasComment = hasComment.asInstanceOf[js.Any], hasProps = hasProps.asInstanceOf[js.Any], jsonLike = jsonLike.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], valueRangeContainsNewline = valueRangeContainsNewline.asInstanceOf[js.Any], anchor = anchor.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueRange = valueRange.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeqItem]
  }
}

