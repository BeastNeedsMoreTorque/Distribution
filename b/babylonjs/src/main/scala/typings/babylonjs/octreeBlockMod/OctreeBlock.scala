package typings.babylonjs.octreeBlockMod

import typings.babylonjs.mathPlaneMod.Plane
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.rayMod.Ray
import typings.babylonjs.smartArrayMod.SmartArrayNoDuplicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Culling/Octrees/octreeBlock", "OctreeBlock")
@js.native
class OctreeBlock[T] protected () extends js.Object {
  /**
    * Creates a new block
    * @param minPoint defines the minimum vector (in world space) of the block's bounding box
    * @param maxPoint defines the maximum vector (in world space) of the block's bounding box
    * @param capacity defines the maximum capacity of this block (if capacity is reached the block will be split into sub blocks)
    * @param depth defines the current depth of this block in the octree
    * @param maxDepth defines the maximal depth allowed (beyond this value, the capacity is ignored)
    * @param creationFunc defines a callback to call when an element is added to the block
    */
  def this(
    minPoint: Vector3,
    maxPoint: Vector3,
    capacity: Double,
    depth: Double,
    maxDepth: Double,
    creationFunc: js.Function2[/* entry */ T, /* block */ OctreeBlock[T], Unit]
  ) = this()
  var _boundingVectors: js.Any = js.native
  var _capacity: js.Any = js.native
  var _creationFunc: js.Any = js.native
  var _depth: js.Any = js.native
  var _maxDepth: js.Any = js.native
  var _maxPoint: js.Any = js.native
  var _minPoint: js.Any = js.native
  /**
    * Gets the list of block children
    */
  var blocks: js.Array[OctreeBlock[T]] = js.native
  /**
    * Gets the content of the current block
    */
  var entries: js.Array[T] = js.native
  /**
    * Add an array of elements to this block
    * @param entries defines the array of elements to add
    */
  def addEntries(entries: js.Array[T]): Unit = js.native
  /**
    * Add a new element to this block
    * @param entry defines the element to add
    */
  def addEntry(entry: T): Unit = js.native
  /**
    * Gets the maximum capacity of this block (if capacity is reached the block will be split into sub blocks)
    */
  def capacity: Double = js.native
  /**
    * Subdivide the content into child blocks (this block will then be empty)
    */
  def createInnerBlocks(): Unit = js.native
  /**
    * Test if the current block intersect with the given bounding sphere and if yes, then add its content to the selection array
    * @param sphereCenter defines the bounding sphere center
    * @param sphereRadius defines the bounding sphere radius
    * @param selection defines the array to store current content if selection is positive
    * @param allowDuplicate defines if the selection array can contains duplicated entries
    */
  def intersects(sphereCenter: Vector3, sphereRadius: Double, selection: SmartArrayNoDuplicate[T]): Unit = js.native
  def intersects(
    sphereCenter: Vector3,
    sphereRadius: Double,
    selection: SmartArrayNoDuplicate[T],
    allowDuplicate: Boolean
  ): Unit = js.native
  /**
    * Test if the current block intersect with the given ray and if yes, then add its content to the selection array
    * @param ray defines the ray to test with
    * @param selection defines the array to store current content if selection is positive
    */
  def intersectsRay(ray: Ray, selection: SmartArrayNoDuplicate[T]): Unit = js.native
  /**
    * Gets the maximum vector (in world space) of the block's bounding box
    */
  def maxPoint: Vector3 = js.native
  /**
    * Gets the minimum vector (in world space) of the block's bounding box
    */
  def minPoint: Vector3 = js.native
  /**
    * Remove an element from this block
    * @param entry defines the element to remove
    */
  def removeEntry(entry: T): Unit = js.native
  /**
    * Test if the current block intersects the furstum planes and if yes, then add its content to the selection array
    * @param frustumPlanes defines the frustum planes to test
    * @param selection defines the array to store current content if selection is positive
    * @param allowDuplicate defines if the selection array can contains duplicated entries
    */
  def select(frustumPlanes: js.Array[Plane], selection: SmartArrayNoDuplicate[T]): Unit = js.native
  def select(frustumPlanes: js.Array[Plane], selection: SmartArrayNoDuplicate[T], allowDuplicate: Boolean): Unit = js.native
}

/* static members */
@JSImport("babylonjs/Culling/Octrees/octreeBlock", "OctreeBlock")
@js.native
object OctreeBlock extends js.Object {
  /**
    * @hidden
    */
  def _CreateBlocks[T](
    worldMin: Vector3,
    worldMax: Vector3,
    entries: js.Array[T],
    maxBlockCapacity: Double,
    currentDepth: Double,
    maxDepth: Double,
    target: IOctreeContainer[T],
    creationFunc: js.Function2[/* entry */ T, /* block */ OctreeBlock[T], Unit]
  ): Unit = js.native
}

