package typings.rxCoreBinding

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.rxCore.Rx.IDisposable
import typings.rxCore.Rx.IScheduler
import typings.rxCore.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx")
@js.native
object Rx extends js.Object {
  @js.native
  trait AsyncSubjectStatic
    extends Instantiable0[AsyncSubject[js.Object]]
  
  @js.native
  trait BehaviorSubject[T] extends ISubject[T] {
    def getValue(): T = js.native
  }
  
  @js.native
  trait BehaviorSubjectStatic
    extends Instantiable1[/* initialValue */ js.Object, BehaviorSubject[js.Object]]
  
  @js.native
  trait ConnectableObservable[T] extends Observable[T] {
    def connect(): IDisposable = js.native
    def refCount(): Observable[T] = js.native
  }
  
  @js.native
  trait ConnectableObservableStatic
    extends Instantiable0[ConnectableObservable[js.Object]]
  
  @js.native
  trait ISubject[T]
    extends Observable[T]
       with Observer[T]
       with IDisposable {
    def hasObservers(): Boolean = js.native
  }
  
  @js.native
  trait Observable[T] extends js.Object {
    def multicast(subject: Observable[T]): ConnectableObservable[T] = js.native
    def multicast[TResult](
      subjectSelector: js.Function0[ISubject[T]],
      selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]]
    ): Observable[T] = js.native
    def publish(): ConnectableObservable[T] = js.native
    def publish[TResult](selector: js.Function1[/* source */ ConnectableObservable[T], Observable[TResult]]): Observable[TResult] = js.native
    def publishLast(): ConnectableObservable[T] = js.native
    def publishLast[TResult](selector: js.Function1[/* source */ ConnectableObservable[T], Observable[TResult]]): Observable[TResult] = js.native
    def publishValue(initialValue: T): ConnectableObservable[T] = js.native
    def publishValue[TResult](
      selector: js.Function1[/* source */ ConnectableObservable[T], Observable[TResult]],
      initialValue: T
    ): Observable[TResult] = js.native
    def replay(): ConnectableObservable[T] = js.native
        // hack to catch first omitted parameter
    def replay(selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]]): Observable[T] = js.native
    def replay(selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]], bufferSize: Double): Observable[T] = js.native
    def replay(
      selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]],
      bufferSize: Double,
      window: Double
    ): Observable[T] = js.native
    def replay(
      selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]],
      bufferSize: Double,
      window: Double,
      scheduler: IScheduler
    ): Observable[T] = js.native
    def replay(selector: Boolean): ConnectableObservable[T] = js.native
    def replay(selector: Boolean, bufferSize: Double): ConnectableObservable[T] = js.native
    def replay(selector: Boolean, bufferSize: Double, window: Double): ConnectableObservable[T] = js.native
    def replay(selector: Boolean, bufferSize: Double, window: Double, scheduler: IScheduler): ConnectableObservable[T] = js.native
    /**
      * Returns an observable sequence that shares a single subscription to the underlying sequence.
      * This operator is a specialization of publish which creates a subscription when the number of observers goes from zero to one,
      * then shares that subscription with all subsequent observers until the number of observers returns to zero, at which point the subscription is disposed.
      *
      * @example
      * var res = source.share();
      *
      * @returns An observable sequence that contains the elements of a sequence produced by multicasting the source sequence.
      */
    def share(): Observable[T] = js.native
    def shareReplay(): Observable[T] = js.native
    def shareReplay(bufferSize: Double): Observable[T] = js.native
    def shareReplay(bufferSize: Double, window: Double): Observable[T] = js.native
    def shareReplay(bufferSize: Double, window: Double, scheduler: IScheduler): Observable[T] = js.native
    /**
      * Returns an observable sequence that shares a single subscription to the underlying sequence and starts with an initialValue.
      * This operator is a specialization of publishValue which creates a subscription when the number of observers goes from zero to one,
      * then shares that subscription with all subsequent observers until the number of observers returns to zero, at which point the subscription is disposed.
      *
      * @example
      * var res = source.shareValue(42);
      *
      * @param initialValue Initial value received by observers upon subscription.
      * @returns An observable sequence that contains the elements of a sequence produced by multicasting the source sequence.
      */
    def shareValue(initialValue: T): Observable[T] = js.native
  }
  
  @js.native
  trait ReplaySubjectStatic
    extends Instantiable0[ReplaySubject[js.Object]]
       with Instantiable1[/* bufferSize */ Double, ReplaySubject[js.Object]]
       with Instantiable2[/* bufferSize */ Double, /* window */ Double, ReplaySubject[js.Object]]
       with Instantiable3[
          /* bufferSize */ Double, 
          /* window */ Double, 
          /* scheduler */ IScheduler, 
          ReplaySubject[js.Object]
        ]
  
  @js.native
  trait SubjectStatic
    extends Instantiable0[Subject[js.Object]] {
    def create[T](): ISubject[T] = js.native
    def create[T](observer: Observer[T]): ISubject[T] = js.native
    def create[T](observer: Observer[T], observable: Observable[T]): ISubject[T] = js.native
  }
  
  type AsyncSubject[T] = Subject[T]
  type ReplaySubject[T] = Subject[T]
  type Subject[T] = ISubject[T]
}

