package typings.rcFieldForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formMod {
  type RenderProps = js.Function2[
    /* values */ typings.rcFieldForm.interfaceMod.Store, 
    /* form */ typings.rcFieldForm.interfaceMod.FormInstance, 
    typings.react.mod.global.JSX.Element | typings.react.mod.ReactNode
  ]
}
