package typings.typedoc.mod.TypeScript

import typings.typescript.mod.BuilderProgram
import typings.typescript.mod.CreateProgram_
import typings.typescript.mod.DiagnosticReporter
import typings.typescript.mod.SolutionBuilderWithWatchHost
import typings.typescript.mod.System
import typings.typescript.mod.WatchStatusReporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.createSolutionBuilderWithWatchHost")
@js.native
object createSolutionBuilderWithWatchHost extends js.Object {
  def apply[T /* <: BuilderProgram */](): SolutionBuilderWithWatchHost[T] = js.native
  def apply[T /* <: BuilderProgram */](system: System): SolutionBuilderWithWatchHost[T] = js.native
  def apply[T /* <: BuilderProgram */](system: System, createProgram: CreateProgram_[T]): SolutionBuilderWithWatchHost[T] = js.native
  def apply[T /* <: BuilderProgram */](system: System, createProgram: CreateProgram_[T], reportDiagnostic: DiagnosticReporter): SolutionBuilderWithWatchHost[T] = js.native
  def apply[T /* <: BuilderProgram */](
    system: System,
    createProgram: CreateProgram_[T],
    reportDiagnostic: DiagnosticReporter,
    reportSolutionBuilderStatus: DiagnosticReporter
  ): SolutionBuilderWithWatchHost[T] = js.native
  def apply[T /* <: BuilderProgram */](
    system: System,
    createProgram: CreateProgram_[T],
    reportDiagnostic: DiagnosticReporter,
    reportSolutionBuilderStatus: DiagnosticReporter,
    reportWatchStatus: WatchStatusReporter
  ): SolutionBuilderWithWatchHost[T] = js.native
}

