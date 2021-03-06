package typings.ow

import typings.node.Buffer
import typings.ow.basePredicateMod.BasePredicate
import typings.ow.predicateMod.Predicate
import typings.ow.predicateMod.PredicateOptions
import typings.std.ArrayBuffer
import typings.std.DataView
import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Int16Array
import typings.std.Int32Array
import typings.std.Int8Array
import typings.std.Iterable
import typings.std.RegExp
import typings.std.Uint16Array
import typings.std.Uint32Array
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import typings.typeFest.basicMod.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ow/dist/source/predicates", JSImport.Namespace)
@js.native
object predicatesMod extends js.Object {
  @js.native
  class AnyPredicate[T] protected ()
    extends typings.ow.anyMod.AnyPredicate[T] {
    def this(predicates: js.Array[BasePredicate[_]]) = this()
    def this(predicates: js.Array[BasePredicate[_]], options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class ArrayPredicate[T] ()
    extends typings.ow.arrayMod.ArrayPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class BooleanPredicate ()
    extends typings.ow.booleanMod.BooleanPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class DatePredicate ()
    extends typings.ow.dateMod.DatePredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class ErrorPredicate ()
    extends typings.ow.errorMod.ErrorPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class MapPredicate[T1, T2] ()
    extends typings.ow.mapMod.MapPredicate[T1, T2] {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class NumberPredicate ()
    extends typings.ow.numberMod.NumberPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class ObjectPredicate ()
    extends typings.ow.objectMod.ObjectPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  trait Predicates extends js.Object {
    /**
      Test the value to be an array.
      */
    val array: typings.ow.arrayMod.ArrayPredicate[_] = js.native
    /**
      Test the value to be a ArrayBuffer.
      */
    val arrayBuffer: Predicate[ArrayBuffer] = js.native
    /**
      Test the value to be a boolean.
      */
    val boolean: typings.ow.booleanMod.BooleanPredicate = js.native
    /**
      Test the value to be a Buffer.
      */
    val buffer: Predicate[Buffer] = js.native
    /**
      Test the value to be a DataView.
      */
    val dataView: Predicate[DataView] = js.native
    /**
      Test the value to be a Date.
      */
    val date: typings.ow.dateMod.DatePredicate = js.native
    /**
      Test the value to be an Error.
      */
    val error: typings.ow.errorMod.ErrorPredicate = js.native
    /**
      Test the value to be a Float32Array.
      */
    val float32Array: Predicate[Float32Array] = js.native
    /**
      Test the value to be a Float64Array.
      */
    val float64Array: Predicate[Float64Array] = js.native
    /**
      Test the value to be a Function.
      */
    val function: Predicate[js.Function] = js.native
    /**
      Test the value to be a Int16Array.
      */
    val int16Array: Predicate[Int16Array] = js.native
    /**
      Test the value to be a Int32Array.
      */
    val int32Array: Predicate[Int32Array] = js.native
    /**
      Test the value to be a Int8Array.
      */
    val int8Array: Predicate[Int8Array] = js.native
    /**
      Test the value to be Iterable.
      */
    val iterable: Predicate[Iterable[_]] = js.native
    /**
      Test the value to be a Map.
      */
    val map: typings.ow.mapMod.MapPredicate[_, _] = js.native
    /**
      Test the value to be not a number.
      */
    val nan: Predicate[Double] = js.native
    /**
      Test the value to be null.
      */
    val `null`: Predicate[Null] = js.native
    /**
      Test the value to be null or undefined.
      */
    val nullOrUndefined: Predicate[js.UndefOr[Null]] = js.native
    /**
      Test the value to be a number.
      */
    val number: typings.ow.numberMod.NumberPredicate = js.native
    /**
      Test the value to be an object.
      */
    val `object`: typings.ow.objectMod.ObjectPredicate = js.native
    /**
      Test the value to be a Promise.
      */
    val promise: Predicate[js.Promise[_]] = js.native
    /**
      Test the value to be a RegExp.
      */
    val regExp: Predicate[RegExp] = js.native
    /**
      Test the value to be a Set.
      */
    val set: typings.ow.setMod.SetPredicate[_] = js.native
    /**
      Test the value to be a string.
      */
    val string: typings.ow.stringMod.StringPredicate = js.native
    /**
      Test the value to be a Symbol.
      */
    val symbol: Predicate[js.Symbol] = js.native
    /**
      Test the value to be a typed array.
      */
    val typedArray: Predicate[TypedArray] = js.native
    /**
      Test the value to be a Uint16Array.
      */
    val uint16Array: Predicate[Uint16Array] = js.native
    /**
      Test the value to be a Uint32Array.
      */
    val uint32Array: Predicate[Uint32Array] = js.native
    /**
      Test the value to be a Uint8Array.
      */
    val uint8Array: Predicate[Uint8Array] = js.native
    /**
      Test the value to be a Uint8ClampedArray.
      */
    val uint8ClampedArray: Predicate[Uint8ClampedArray] = js.native
    /**
      Test the value to be undefined.
      */
    val undefined: Predicate[js.UndefOr[scala.Nothing]] = js.native
    /**
      Test the value to be a WeakMap.
      */
    val weakMap: typings.ow.weakMapMod.WeakMapPredicate[js.Object] = js.native
    /**
      Test the value to be a WeakSet.
      */
    val weakSet: typings.ow.weakSetMod.WeakSetPredicate[js.Object] = js.native
    def any(predicate: BasePredicate[_]*): typings.ow.anyMod.AnyPredicate[_] = js.native
    /**
      Test that the value matches at least one of the given predicates.
      */
    def any[T1](p1: BasePredicate[T1]): typings.ow.anyMod.AnyPredicate[T1] = js.native
    def any[T1, T2](p1: BasePredicate[T1], p2: BasePredicate[T2]): typings.ow.anyMod.AnyPredicate[T1 | T2] = js.native
    def any[T1, T2, T3](p1: BasePredicate[T1], p2: BasePredicate[T2], p3: BasePredicate[T3]): typings.ow.anyMod.AnyPredicate[T1 | T2 | T3] = js.native
    def any[T1, T2, T3, T4](p1: BasePredicate[T1], p2: BasePredicate[T2], p3: BasePredicate[T3], p4: BasePredicate[T4]): typings.ow.anyMod.AnyPredicate[T1 | T2 | T3 | T4] = js.native
    def any[T1, T2, T3, T4, T5](
      p1: BasePredicate[T1],
      p2: BasePredicate[T2],
      p3: BasePredicate[T3],
      p4: BasePredicate[T4],
      p5: BasePredicate[T5]
    ): typings.ow.anyMod.AnyPredicate[T1 | T2 | T3 | T4 | T5] = js.native
    def any[T1, T2, T3, T4, T5, T6](
      p1: BasePredicate[T1],
      p2: BasePredicate[T2],
      p3: BasePredicate[T3],
      p4: BasePredicate[T4],
      p5: BasePredicate[T5],
      p6: BasePredicate[T6]
    ): typings.ow.anyMod.AnyPredicate[T1 | T2 | T3 | T4 | T5 | T6] = js.native
    def any[T1, T2, T3, T4, T5, T6, T7](
      p1: BasePredicate[T1],
      p2: BasePredicate[T2],
      p3: BasePredicate[T3],
      p4: BasePredicate[T4],
      p5: BasePredicate[T5],
      p6: BasePredicate[T6],
      p7: BasePredicate[T7]
    ): typings.ow.anyMod.AnyPredicate[T1 | T2 | T3 | T4 | T5 | T6 | T7] = js.native
    def any[T1, T2, T3, T4, T5, T6, T7, T8](
      p1: BasePredicate[T1],
      p2: BasePredicate[T2],
      p3: BasePredicate[T3],
      p4: BasePredicate[T4],
      p5: BasePredicate[T5],
      p6: BasePredicate[T6],
      p7: BasePredicate[T7],
      p8: BasePredicate[T8]
    ): typings.ow.anyMod.AnyPredicate[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8] = js.native
    def any[T1, T2, T3, T4, T5, T6, T7, T8, T9](
      p1: BasePredicate[T1],
      p2: BasePredicate[T2],
      p3: BasePredicate[T3],
      p4: BasePredicate[T4],
      p5: BasePredicate[T5],
      p6: BasePredicate[T6],
      p7: BasePredicate[T7],
      p8: BasePredicate[T8],
      p9: BasePredicate[T9]
    ): typings.ow.anyMod.AnyPredicate[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9] = js.native
    def any[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
      p1: BasePredicate[T1],
      p2: BasePredicate[T2],
      p3: BasePredicate[T3],
      p4: BasePredicate[T4],
      p5: BasePredicate[T5],
      p6: BasePredicate[T6],
      p7: BasePredicate[T7],
      p8: BasePredicate[T8],
      p9: BasePredicate[T9],
      p10: BasePredicate[T10]
    ): typings.ow.anyMod.AnyPredicate[T1 | T2 | T3 | T4 | T5 | T6 | T7 | T8 | T9 | T10] = js.native
  }
  
  @js.native
  /**
    @hidden
    */
  class SetPredicate[T] ()
    extends typings.ow.setMod.SetPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class StringPredicate ()
    extends typings.ow.stringMod.StringPredicate {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class WeakMapPredicate[KeyType /* <: js.Object */] ()
    extends typings.ow.weakMapMod.WeakMapPredicate[KeyType] {
    def this(options: PredicateOptions) = this()
  }
  
  @js.native
  /**
    @hidden
    */
  class WeakSetPredicate[T /* <: js.Object */] ()
    extends typings.ow.weakSetMod.WeakSetPredicate[T] {
    def this(options: PredicateOptions) = this()
  }
  
  def default[T](`object`: T): T with Predicates = js.native
  def default[T](`object`: T, options: PredicateOptions): T with Predicates = js.native
}

