package typings.uglifyJs.mod

import typings.std.RegExp
import typings.uglifyJs.uglifyJsStrings.all
import typings.uglifyJs.uglifyJsStrings.some
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputOptions extends js.Object {
  var ascii_only: js.UndefOr[Boolean] = js.undefined
  var beautify: js.UndefOr[Boolean] = js.undefined
  var braces: js.UndefOr[Boolean] = js.undefined
  var comments: js.UndefOr[Boolean | all | some | RegExp] = js.undefined
  var indent_level: js.UndefOr[Double] = js.undefined
  var indent_start: js.UndefOr[Boolean] = js.undefined
  var inline_script: js.UndefOr[Boolean] = js.undefined
  var keep_quoted_props: js.UndefOr[Boolean] = js.undefined
  var max_line_len: js.UndefOr[Boolean | Double] = js.undefined
  var preamble: js.UndefOr[String] = js.undefined
  var preserve_line: js.UndefOr[Boolean] = js.undefined
  var quote_keys: js.UndefOr[Boolean] = js.undefined
  var quote_style: js.UndefOr[OutputQuoteStyle] = js.undefined
  var semicolons: js.UndefOr[Boolean] = js.undefined
  var shebang: js.UndefOr[Boolean] = js.undefined
  var webkit: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var wrap_iife: js.UndefOr[Boolean] = js.undefined
}

object OutputOptions {
  @scala.inline
  def apply(
    ascii_only: js.UndefOr[Boolean] = js.undefined,
    beautify: js.UndefOr[Boolean] = js.undefined,
    braces: js.UndefOr[Boolean] = js.undefined,
    comments: Boolean | all | some | RegExp = null,
    indent_level: js.UndefOr[Double] = js.undefined,
    indent_start: js.UndefOr[Boolean] = js.undefined,
    inline_script: js.UndefOr[Boolean] = js.undefined,
    keep_quoted_props: js.UndefOr[Boolean] = js.undefined,
    max_line_len: Boolean | Double = null,
    preamble: String = null,
    preserve_line: js.UndefOr[Boolean] = js.undefined,
    quote_keys: js.UndefOr[Boolean] = js.undefined,
    quote_style: OutputQuoteStyle = null,
    semicolons: js.UndefOr[Boolean] = js.undefined,
    shebang: js.UndefOr[Boolean] = js.undefined,
    webkit: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    wrap_iife: js.UndefOr[Boolean] = js.undefined
  ): OutputOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascii_only)) __obj.updateDynamic("ascii_only")(ascii_only.get.asInstanceOf[js.Any])
    if (!js.isUndefined(beautify)) __obj.updateDynamic("beautify")(beautify.get.asInstanceOf[js.Any])
    if (!js.isUndefined(braces)) __obj.updateDynamic("braces")(braces.get.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_level)) __obj.updateDynamic("indent_level")(indent_level.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_start)) __obj.updateDynamic("indent_start")(indent_start.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inline_script)) __obj.updateDynamic("inline_script")(inline_script.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_quoted_props)) __obj.updateDynamic("keep_quoted_props")(keep_quoted_props.get.asInstanceOf[js.Any])
    if (max_line_len != null) __obj.updateDynamic("max_line_len")(max_line_len.asInstanceOf[js.Any])
    if (preamble != null) __obj.updateDynamic("preamble")(preamble.asInstanceOf[js.Any])
    if (!js.isUndefined(preserve_line)) __obj.updateDynamic("preserve_line")(preserve_line.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quote_keys)) __obj.updateDynamic("quote_keys")(quote_keys.get.asInstanceOf[js.Any])
    if (quote_style != null) __obj.updateDynamic("quote_style")(quote_style.asInstanceOf[js.Any])
    if (!js.isUndefined(semicolons)) __obj.updateDynamic("semicolons")(semicolons.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shebang)) __obj.updateDynamic("shebang")(shebang.get.asInstanceOf[js.Any])
    if (!js.isUndefined(webkit)) __obj.updateDynamic("webkit")(webkit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap_iife)) __obj.updateDynamic("wrap_iife")(wrap_iife.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputOptions]
  }
}

