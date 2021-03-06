package typings.rax.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mixin[P, S]
  extends ComponentLifecycle[P, S, js.Any] {
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.undefined
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var getDefaultProps: js.UndefOr[js.Function0[P]] = js.undefined
  var getInitialState: js.UndefOr[js.Function0[S]] = js.undefined
  var mixins: js.UndefOr[js.Array[Mixin[P, S]]] = js.undefined
  var propTypes: js.UndefOr[ValidationMap[_]] = js.undefined
  var statics: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object Mixin {
  @scala.inline
  def apply[P, S](
    childContextTypes: ValidationMap[_] = null,
    componentDidCatch: (/* error */ Error, /* errorInfo */ ErrorInfo) => Unit = null,
    componentDidMount: () => Unit = null,
    componentDidUpdate: (P, S, /* snapshot */ js.UndefOr[js.Any]) => Unit = null,
    componentWillMount: () => Unit = null,
    componentWillReceiveProps: (P, /* nextContext */ js.Any) => Unit = null,
    componentWillUnmount: () => Unit = null,
    componentWillUpdate: (P, S, /* nextContext */ js.Any) => Unit = null,
    contextTypes: ValidationMap[_] = null,
    displayName: String = null,
    getDefaultProps: () => P = null,
    getInitialState: () => S = null,
    getSnapshotBeforeUpdate: (P, S) => js.Any | Null = null,
    mixins: js.Array[Mixin[P, S]] = null,
    propTypes: ValidationMap[_] = null,
    shouldComponentUpdate: (P, S, /* nextContext */ js.Any) => Boolean = null,
    statics: StringDictionary[js.Any] = null
  ): Mixin[P, S] = {
    val __obj = js.Dynamic.literal()
    if (childContextTypes != null) __obj.updateDynamic("childContextTypes")(childContextTypes.asInstanceOf[js.Any])
    if (componentDidCatch != null) __obj.updateDynamic("componentDidCatch")(js.Any.fromFunction2(componentDidCatch))
    if (componentDidMount != null) __obj.updateDynamic("componentDidMount")(js.Any.fromFunction0(componentDidMount))
    if (componentDidUpdate != null) __obj.updateDynamic("componentDidUpdate")(js.Any.fromFunction3(componentDidUpdate))
    if (componentWillMount != null) __obj.updateDynamic("componentWillMount")(js.Any.fromFunction0(componentWillMount))
    if (componentWillReceiveProps != null) __obj.updateDynamic("componentWillReceiveProps")(js.Any.fromFunction2(componentWillReceiveProps))
    if (componentWillUnmount != null) __obj.updateDynamic("componentWillUnmount")(js.Any.fromFunction0(componentWillUnmount))
    if (componentWillUpdate != null) __obj.updateDynamic("componentWillUpdate")(js.Any.fromFunction3(componentWillUpdate))
    if (contextTypes != null) __obj.updateDynamic("contextTypes")(contextTypes.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (getDefaultProps != null) __obj.updateDynamic("getDefaultProps")(js.Any.fromFunction0(getDefaultProps))
    if (getInitialState != null) __obj.updateDynamic("getInitialState")(js.Any.fromFunction0(getInitialState))
    if (getSnapshotBeforeUpdate != null) __obj.updateDynamic("getSnapshotBeforeUpdate")(js.Any.fromFunction2(getSnapshotBeforeUpdate))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (propTypes != null) __obj.updateDynamic("propTypes")(propTypes.asInstanceOf[js.Any])
    if (shouldComponentUpdate != null) __obj.updateDynamic("shouldComponentUpdate")(js.Any.fromFunction3(shouldComponentUpdate))
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mixin[P, S]]
  }
}

