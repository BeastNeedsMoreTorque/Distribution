package typings.formik.anon

import typings.formik.typesMod.FormikContextType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formik[Values] extends js.Object {
  var formik: FormikContextType[Values]
}

object Formik {
  @scala.inline
  def apply[Values](formik: FormikContextType[Values]): Formik[Values] = {
    val __obj = js.Dynamic.literal(formik = formik.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formik[Values]]
  }
}

