package typings.antDesignIconsVue

import typings.antDesignIconsSvg.typesMod.IconDefinition
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/icons-vue/lib/icons/TagsFilled", JSImport.Namespace)
@js.native
object tagsFilledMod extends js.Object {
  @js.native
  trait TagsFilled extends Vue {
    var icon: IconDefinition = js.native
    var rotate: js.UndefOr[Double] = js.native
    var spin: js.UndefOr[Boolean] = js.native
    var tabIndex: js.UndefOr[Double] = js.native
    var twoToneColor: js.UndefOr[String | (js.Tuple2[String, String])] = js.native
  }
  
  @js.native
  class default () extends TagsFilled
  
  /* static members */
  @js.native
  object default extends js.Object {
    def install(vue: VueConstructor[Vue]): Unit = js.native
  }
  
}

