package typings.tstl

import typings.std.Date
import typings.tstl.anon.PickILockablelockunlock
import typings.tstl.anon.PickILockabletrylockunloc
import typings.tstl.anon.PickITimedLockabletrylock
import typings.tstl.anon.PickITimedLockabletrylockTrylockuntil
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/thread/UniqueLock", JSImport.Namespace)
@js.native
object uniqueLockMod extends js.Object {
  @js.native
  object UniqueLock extends js.Object {
    def lock[Mutex /* <: PickILockablelockunlock */](mutex: Mutex, closure: Closure): js.Promise[Unit] = js.native
    @JSName("try_lock")
    def tryLock[Mutex /* <: PickILockabletrylockunloc */](mutex: Mutex, closure: Closure): js.Promise[Boolean] = js.native
    @JSName("try_lock_for")
    def tryLockFor[Mutex /* <: PickITimedLockabletrylock */](mutex: Mutex, ms: Double, closure: Closure): js.Promise[Boolean] = js.native
    @JSName("try_lock_until")
    def tryLockUntil[Mutex /* <: PickITimedLockabletrylockTrylockuntil */](mutex: Mutex, at: Date, closure: Closure): js.Promise[Boolean] = js.native
    type Closure = js.Function0[Unit | js.Promise[Unit]]
  }
  
}

