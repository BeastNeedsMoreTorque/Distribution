package typings.jestDiff.printDiffsMod

import typings.jestDiff.typesMod.DiffOptionsNormalized
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-diff/build/printDiffs", "printAnnotation")
@js.native
object printAnnotation extends js.Object {
  def apply(
    hasAAnnotationAColorAIndicatorBAnnotationBColorBIndicatorIncludeChangeCountsOmitAnnotationLines: DiffOptionsNormalized,
    changeCounts: ChangeCounts
  ): String = js.native
}

