package typings.firebaseStorage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object observerMod {
  type CompleteFn = js.Function0[scala.Unit]
  type ErrorFn = js.Function1[
    /* error */ typings.std.Error | typings.firebaseStorage.errorMod.FirebaseStorageError, 
    scala.Unit
  ]
  type NextFn[T] = js.Function1[/* value */ T, scala.Unit]
  type Subscribe[T] = js.Function3[
    /* next */ js.UndefOr[
      typings.firebaseStorage.observerMod.NextFn[T] | typings.firebaseStorage.observerMod.StorageObserver[T] | scala.Null
    ], 
    /* error */ js.UndefOr[typings.firebaseStorage.observerMod.ErrorFn | scala.Null], 
    /* complete */ js.UndefOr[typings.firebaseStorage.observerMod.CompleteFn | scala.Null], 
    typings.firebaseStorage.observerMod.Unsubscribe
  ]
  type Unsubscribe = js.Function0[scala.Unit]
}
