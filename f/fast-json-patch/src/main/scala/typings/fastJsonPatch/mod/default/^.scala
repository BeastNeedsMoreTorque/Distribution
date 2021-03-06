package typings.fastJsonPatch.mod.default

import org.scalablytyped.runtime.Instantiable5
import typings.fastJsonPatch.moduleCoreMod.Operation
import typings.fastJsonPatch.moduleCoreMod.OperationResult
import typings.fastJsonPatch.moduleCoreMod.PatchResult
import typings.fastJsonPatch.moduleCoreMod.Validator_
import typings.fastJsonPatch.moduleDuplexMod.Observer
import typings.fastJsonPatch.moduleHelpersMod.JsonPatchErrorName
import typings.fastJsonPatch.moduleHelpersMod.PatchError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-json-patch", JSImport.Default)
@js.native
object ^ extends js.Object {
  var JsonPatchError: Instantiable5[
    /* message */ String, 
    /* name */ JsonPatchErrorName, 
    js.UndefOr[/* index */ Double], 
    js.UndefOr[/* operation */ js.Any], 
    js.UndefOr[/* tree */ js.Any], 
    PatchError
  ] = js.native
  @JSName("deepClone")
  var deepClone_Original: js.Function1[/* obj */ js.Any, _] = js.native
  @JSName("escapePathComponent")
  var escapePathComponent_Original: js.Function1[/* path */ String, String] = js.native
  @JSName("unescapePathComponent")
  var unescapePathComponent_Original: js.Function1[/* path */ String, String] = js.native
  def _areEquals(a: js.Any, b: js.Any): Boolean = js.native
  def applyOperation[T](document: T, operation: Operation): OperationResult[T] = js.native
  def applyOperation[T](document: T, operation: Operation, validateOperation: Boolean): OperationResult[T] = js.native
  def applyOperation[T](document: T, operation: Operation, validateOperation: Boolean, mutateDocument: Boolean): OperationResult[T] = js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = js.native
  def applyOperation[T](document: T, operation: Operation, validateOperation: Validator_[T]): OperationResult[T] = js.native
  def applyOperation[T](document: T, operation: Operation, validateOperation: Validator_[T], mutateDocument: Boolean): OperationResult[T] = js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): OperationResult[T] = js.native
  def applyOperation[T](
    document: T,
    operation: Operation,
    validateOperation: Validator_[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean,
    index: Double
  ): OperationResult[T] = js.native
  def applyPatch[T](document: T, patch: js.Array[Operation]): PatchResult[T] = js.native
  def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Boolean): PatchResult[T] = js.native
  def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Boolean, mutateDocument: Boolean): PatchResult[T] = js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Boolean,
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = js.native
  def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Validator_[T]): PatchResult[T] = js.native
  def applyPatch[T](document: T, patch: js.Array[Operation], validateOperation: Validator_[T], mutateDocument: Boolean): PatchResult[T] = js.native
  def applyPatch[T](
    document: T,
    patch: js.Array[Operation],
    validateOperation: Validator_[T],
    mutateDocument: Boolean,
    banPrototypeModifications: Boolean
  ): PatchResult[T] = js.native
  def applyReducer[T](document: T, operation: Operation, index: Double): T = js.native
  def compare(tree1: js.Array[_], tree2: js.Array[_]): js.Array[Operation] = js.native
  def compare(tree1: js.Array[_], tree2: js.Array[_], invertible: Boolean): js.Array[Operation] = js.native
  def compare(tree1: js.Array[_], tree2: js.Object): js.Array[Operation] = js.native
  def compare(tree1: js.Array[_], tree2: js.Object, invertible: Boolean): js.Array[Operation] = js.native
  def compare(tree1: js.Object, tree2: js.Array[_]): js.Array[Operation] = js.native
  def compare(tree1: js.Object, tree2: js.Array[_], invertible: Boolean): js.Array[Operation] = js.native
  def compare(tree1: js.Object, tree2: js.Object): js.Array[Operation] = js.native
  def compare(tree1: js.Object, tree2: js.Object, invertible: Boolean): js.Array[Operation] = js.native
  def deepClone(obj: js.Any): js.Any = js.native
  def escapePathComponent(path: String): String = js.native
  def generate[T](observer: Observer[js.Object]): js.Array[Operation] = js.native
  def generate[T](observer: Observer[js.Object], invertible: Boolean): js.Array[Operation] = js.native
  def getValueByPointer(document: js.Any, pointer: String): js.Any = js.native
  def observe[T](obj: js.Array[T]): Observer[T] = js.native
  def observe[T](obj: js.Array[T], callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = js.native
  def observe[T](obj: js.Object): Observer[T] = js.native
  def observe[T](obj: js.Object, callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = js.native
  def unescapePathComponent(path: String): String = js.native
  def unobserve[T](root: T, observer: Observer[T]): Unit = js.native
  def validate[T](sequence: js.Array[Operation]): PatchError = js.native
  def validate[T](sequence: js.Array[Operation], document: T): PatchError = js.native
  def validate[T](sequence: js.Array[Operation], document: T, externalValidator: Validator_[T]): PatchError = js.native
  def validator(operation: Operation, index: Double): Unit = js.native
  def validator(operation: Operation, index: Double, document: js.Any): Unit = js.native
  def validator(operation: Operation, index: Double, document: js.Any, existingPathFragment: String): Unit = js.native
}

