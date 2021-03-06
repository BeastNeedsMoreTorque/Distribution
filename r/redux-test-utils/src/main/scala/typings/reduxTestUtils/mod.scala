package typings.reduxTestUtils

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-test-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait mockDispatch[S] extends js.Object {
    @JSName("dispatch")
    var dispatch_Original: Dispatch[S] = js.native
    def dispatch[T /* <: S */](action: T): T = js.native
    def getAction(`type`: js.Any): js.UndefOr[AnyAction] = js.native
    def getActions(): js.Array[AnyAction] = js.native
    def isActionDispatched(action: AnyAction): Boolean = js.native
    def isActionTypeDispatched(`type`: js.Any): Boolean = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reduxTestUtils.mod.mockDispatch because var conflicts: dispatch_Original. Inlined getActions, getAction, isActionTypeDispatched, isActionDispatched */ @js.native
  trait mockStore[S] extends Store[S, AnyAction] {
    def getAction(`type`: js.Any): js.UndefOr[AnyAction] = js.native
    def getActions(): js.Array[AnyAction] = js.native
    def isActionDispatched(action: AnyAction): Boolean = js.native
    def isActionTypeDispatched(`type`: js.Any): Boolean = js.native
  }
  
  def createMockDispatch(): mockDispatch[_] = js.native
  def createMockStore(): mockStore[_] = js.native
  def createMockStore(state: js.Any): mockStore[_] = js.native
}

