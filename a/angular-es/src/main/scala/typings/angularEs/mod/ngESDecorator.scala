package typings.angularEs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Decorated target
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- js.Function because Already inherited
- typings.angularEs.mod.MethodDecorator because var conflicts: length. Inlined  */ @js.native
trait ngESDecorator extends ClassDecorator {
  def apply(target: js.Function, ngName: String): Unit = js.native
  def apply(target: js.Function, ngName: String, ngArguments: js.Array[_]): Unit = js.native
  def apply(target: js.Function, ngName: String, ngArguments: js.Array[_], ngType: String): Unit = js.native
  def apply(
    target: js.Function,
    ngName: String,
    ngArguments: js.Array[_],
    ngType: String,
    injectAsProperty: js.Array[String]
  ): Unit = js.native
  def apply(target: js.Object): Unit = js.native
  def apply(target: js.Object, ngName: String): Unit = js.native
  def apply(target: js.Object, ngName: String, ngArguments: js.Array[_]): Unit = js.native
  def apply(target: js.Object, ngName: String, ngArguments: js.Array[_], ngType: String): Unit = js.native
  def apply(
    target: js.Object,
    ngName: String,
    ngArguments: js.Array[_],
    ngType: String,
    injectAsProperty: js.Array[String]
  ): Unit = js.native
}

