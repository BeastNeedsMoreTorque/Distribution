package typings.reactTypist.mod

import typings.reactTypist.mod.Typist.CurrentTextProps
import typings.reactTypist.mod.Typist.CursorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypistProps extends js.Object {
  var avgTypingDelay: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var cursor: js.UndefOr[CursorProps] = js.undefined
  var delayGenerator: js.UndefOr[
    js.Function3[/* mean */ Double, /* std */ Double, /* current */ CurrentTextProps, Double]
  ] = js.undefined
  var onCharacterTyped: js.UndefOr[js.Function2[/* char */ String, /* charIndex */ Double, Unit]] = js.undefined
  var onLineTyped: js.UndefOr[js.Function2[/* line */ String, /* lineIndex */ Double, Unit]] = js.undefined
  var onTypingDone: js.UndefOr[js.Function0[Unit]] = js.undefined
  var startDelay: js.UndefOr[Double] = js.undefined
  var stdTypingDelay: js.UndefOr[Double] = js.undefined
}

object TypistProps {
  @scala.inline
  def apply(
    avgTypingDelay: js.UndefOr[Double] = js.undefined,
    className: String = null,
    cursor: CursorProps = null,
    delayGenerator: (/* mean */ Double, /* std */ Double, /* current */ CurrentTextProps) => Double = null,
    onCharacterTyped: (/* char */ String, /* charIndex */ Double) => Unit = null,
    onLineTyped: (/* line */ String, /* lineIndex */ Double) => Unit = null,
    onTypingDone: () => Unit = null,
    startDelay: js.UndefOr[Double] = js.undefined,
    stdTypingDelay: js.UndefOr[Double] = js.undefined
  ): TypistProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(avgTypingDelay)) __obj.updateDynamic("avgTypingDelay")(avgTypingDelay.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (delayGenerator != null) __obj.updateDynamic("delayGenerator")(js.Any.fromFunction3(delayGenerator))
    if (onCharacterTyped != null) __obj.updateDynamic("onCharacterTyped")(js.Any.fromFunction2(onCharacterTyped))
    if (onLineTyped != null) __obj.updateDynamic("onLineTyped")(js.Any.fromFunction2(onLineTyped))
    if (onTypingDone != null) __obj.updateDynamic("onTypingDone")(js.Any.fromFunction0(onTypingDone))
    if (!js.isUndefined(startDelay)) __obj.updateDynamic("startDelay")(startDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stdTypingDelay)) __obj.updateDynamic("stdTypingDelay")(stdTypingDelay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypistProps]
  }
}

