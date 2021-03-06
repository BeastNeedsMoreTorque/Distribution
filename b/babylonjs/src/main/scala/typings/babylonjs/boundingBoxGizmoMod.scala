package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.gizmoMod.Gizmo
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.utilityLayerRendererMod.UtilityLayerRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Gizmos/boundingBoxGizmo", JSImport.Namespace)
@js.native
object boundingBoxGizmoMod extends js.Object {
  @js.native
  /**
    * Creates an BoundingBoxGizmo
    * @param gizmoLayer The utility layer the gizmo will be added to
    * @param color The color of the gizmo
    */
  class BoundingBoxGizmo () extends Gizmo {
    def this(color: Color3) = this()
    def this(color: Color3, gizmoLayer: UtilityLayerRenderer) = this()
    /**
      * Mesh used as a pivot to rotate the attached mesh
      */
    var _anchorMesh: js.Any = js.native
    var _boundingDimensions: js.Any = js.native
    var _dragMesh: js.Any = js.native
    var _existingMeshScale: js.Any = js.native
    var _lineBoundingBox: js.Any = js.native
    var _pointerObserver: js.Any = js.native
    var _renderObserver: js.Any = js.native
    var _rotateSpheresParent: js.Any = js.native
    var _scaleBoxesParent: js.Any = js.native
    var _scaleDragSpeed: js.Any = js.native
    var _selectNode: js.Any = js.native
    var _tmpQuaternion: js.Any = js.native
    var _tmpRotationMatrix: js.Any = js.native
    var _tmpVector: js.Any = js.native
    var _updateDummy: js.Any = js.native
    var _updateRotationSpheres: js.Any = js.native
    var _updateScaleBoxes: js.Any = js.native
    var coloredMaterial: js.Any = js.native
    /**
      * If set, the rotation spheres and scale boxes will increase in size based on the distance away from the camera to have a consistent screen size (Default: false)
      */
    var fixedDragMeshScreenSize: Boolean = js.native
    /**
      * The distance away from the object which the draggable meshes should appear world sized when fixedDragMeshScreenSize is set to true (default: 10)
      */
    var fixedDragMeshScreenSizeDistanceFactor: Double = js.native
    var hoverColoredMaterial: js.Any = js.native
    /**
      * If child meshes should be ignored when calculating the boudning box. This should be set to true to avoid perf hits with heavily nested meshes (Default: false)
      */
    var ignoreChildren: Boolean = js.native
    /**
      * Returns true if a descendant should be included when computing the bounding box. When null, all descendants are included. If ignoreChildren is set this will be ignored. (Default: null)
      */
    var includeChildPredicate: Nullable[js.Function1[/* abstractMesh */ AbstractMesh, Boolean]] = js.native
    /**
      * Fired when a rotation sphere or scale box is dragged
      */
    var onDragStartObservable: Observable[js.Object] = js.native
    /**
      * Fired when a rotation sphere drag is ended
      */
    var onRotationSphereDragEndObservable: Observable[js.Object] = js.native
    /**
      * Fired when a rotation sphere is dragged
      */
    var onRotationSphereDragObservable: Observable[js.Object] = js.native
    /**
      * Fired when a scale box drag is ended
      */
    var onScaleBoxDragEndObservable: Observable[js.Object] = js.native
    /**
      * Fired when a scale box is dragged
      */
    var onScaleBoxDragObservable: Observable[js.Object] = js.native
    var pointerDragBehavior: js.Any = js.native
    /**
      * The size of the rotation spheres attached to the bounding box (Default: 0.1)
      */
    var rotationSphereSize: Double = js.native
    /**
      * The size of the scale boxes attached to the bounding box (Default: 0.1)
      */
    var scaleBoxSize: Double = js.native
    /**
      * Relative bounding box pivot used when scaling the attached mesh. When null object with scale from the opposite corner. 0.5,0.5,0.5 for center and 0.5,0,0.5 for bottom (Default: null)
      */
    var scalePivot: Nullable[Vector3] = js.native
    /**
      * Enables a pointer drag behavior on the bounding box of the gizmo
      */
    def enableDragBehavior(): Unit = js.native
    /**
      * Sets the color of the bounding box gizmo
      * @param color the color to set
      */
    def setColor(color: Color3): Unit = js.native
    /**
      * Enables rotation on the specified axis and disables rotation on the others
      * @param axis The list of axis that should be enabled (eg. "xy" or "xyz")
      */
    def setEnabledRotationAxis(axis: String): Unit = js.native
    /**
      * Enables/disables scaling
      * @param enable if scaling should be enabled
      */
    def setEnabledScaling(enable: Boolean): Unit = js.native
    /**
      * Updates the bounding box information for the Gizmo
      */
    def updateBoundingBox(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object BoundingBoxGizmo extends js.Object {
    /**
      * Makes a mesh not pickable and wraps the mesh inside of a bounding box mesh that is pickable. (This is useful to avoid picking within complex geometry)
      * @param mesh the mesh to wrap in the bounding box mesh and make not pickable
      * @returns the bounding box mesh with the passed in mesh as a child
      */
    def MakeNotPickableAndWrapInBoundingBox(mesh: Mesh): Mesh = js.native
  }
  
}

