package typings.antDesignReactNative.modalModalMod

import typings.antDesignReactNative.anon.AnimateAppear
import typings.antDesignReactNative.anon.AntLocale
import typings.antDesignReactNative.modalPropsTypeMod.Action
import typings.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typings.antDesignReactNative.modalPropsTypeMod.CallbackOrActions
import typings.react.mod.ReactNode
import typings.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/modal/Modal", JSImport.Default)
@js.native
class default () extends AntmModal

/* static members */
@JSImport("@ant-design/react-native/lib/modal/Modal", JSImport.Default)
@js.native
object default extends js.Object {
  var alert: js.Function4[
    /* title */ ReactNode, 
    /* content */ ReactNode, 
    /* actions */ js.UndefOr[js.Array[Action[TextStyle]]], 
    /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
    Double
  ] = js.native
  var contextTypes: AntLocale = js.native
  var defaultProps: AnimateAppear = js.native
  var operation: js.Function2[
    /* actions */ js.Array[_], 
    /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
    Double
  ] = js.native
  var prompt: js.Function7[
    /* title */ ReactNode, 
    /* message */ ReactNode, 
    /* callbackOrActions */ CallbackOrActions[TextStyle], 
    /* type */ js.UndefOr[String], 
    /* defaultValue */ js.UndefOr[String], 
    /* placeholders */ js.UndefOr[js.Array[String]], 
    /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
    js.UndefOr[Double]
  ] = js.native
}

