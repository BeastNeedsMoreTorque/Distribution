package typings.parchment

import typings.parchment.anon.Instantiable
import typings.parchment.anon.InstantiableBlot
import typings.parchment.blotMod.Blot
import typings.parchment.blotMod.Parent
import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parchment/dist/src/blot/abstract/container", JSImport.Namespace)
@js.native
object containerMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.parchment.linkedNodeMod.LinkedNode because Already inherited
  - typings.parchment.blotMod.Blot because Already inherited
  - typings.parchment.blotMod.Parent because var conflicts: domNode, next, parent, prev, scroll. Inlined children, appendChild, descendant, descendant, descendants, descendants, insertBefore, insertBefore, moveChildren, moveChildren, path, path, removeChild, unwrap */ @js.native
  trait ContainerBlot
    extends typings.parchment.shadowMod.default {
    var children: typings.parchment.linkedListMod.default[Blot] = js.native
    @JSName("domNode")
    var domNode_ContainerBlot: HTMLElement = js.native
    def appendChild(other: Blot): Unit = js.native
    def build(): Unit = js.native
    def descendant(criteria: js.Function1[/* blot */ Blot, Boolean], index: Double): js.Tuple2[Blot | Null, Double] = js.native
    def descendant(criteria: InstantiableBlot, index: Double): js.Tuple2[Blot | Null, Double] = js.native
    def descendant[T](`type`: Instantiable[T], index: Double): js.Tuple2[T, Double] = js.native
    @JSName("descendant")
    def descendant_T[T](matcher: js.Function1[/* blot */ Blot, Boolean], index: Double): js.Tuple2[T, Double] = js.native
    def descendants(criteria: js.Function1[/* blot */ Blot, Boolean], index: Double, length: Double): js.Array[Blot] = js.native
    def descendants(criteria: InstantiableBlot, index: Double, length: Double): js.Array[Blot] = js.native
    def descendants[T](`type`: Instantiable[T], index: Double, length: Double): js.Array[T] = js.native
    @JSName("descendants")
    def descendants_T[T](matcher: js.Function1[/* blot */ Blot, Boolean], index: Double, length: Double): js.Array[T] = js.native
    def insertBefore(childBlot: Blot): Unit = js.native
    def insertBefore(childBlot: Blot, refBlot: Blot): Unit = js.native
    def moveChildren(targetParent: Parent): Unit = js.native
    def moveChildren(targetParent: Parent, refNode: Blot): Unit = js.native
    def path(index: Double): js.Array[js.Tuple2[Blot, Double]] = js.native
    def path(index: Double, inclusive: Boolean): js.Array[js.Tuple2[Blot, Double]] = js.native
    def removeChild(child: Blot): Unit = js.native
    def unwrap(): Unit = js.native
  }
  
  @js.native
  class default protected () extends ContainerBlot {
    def this(domNode: Node) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var allowedChildren: js.Array[_] = js.native
    var defaultChild: String = js.native
  }
  
}

