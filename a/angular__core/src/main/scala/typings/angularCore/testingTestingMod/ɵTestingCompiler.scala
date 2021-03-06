package typings.angularCore.testingTestingMod

import typings.angularCore.mod.Compiler
import typings.angularCore.mod.Component
import typings.angularCore.mod.ComponentFactory
import typings.angularCore.mod.Directive
import typings.angularCore.mod.Injector
import typings.angularCore.mod.NgModule
import typings.angularCore.mod.Pipe
import typings.angularCore.mod.Type
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/testing/testing", "\u0275TestingCompiler")
@js.native
class ɵTestingCompiler () extends Compiler {
  /**
    * Gets the component factory for the given component.
    * This assumes that the component has been compiled before calling this call using
    * `compileModuleAndAllComponents*`.
    */
  def getComponentFactory[T](component: Type[T]): ComponentFactory[T] = js.native
  /**
    * Returns the component type that is stored in the given error.
    * This can be used for errors created by compileModule...
    */
  def getComponentFromError(error: Error): Type[_] | Null = js.native
  def injector: Injector = js.native
  /**
    * Allows to pass the compile summary from AOT compilation to the JIT compiler,
    * so that it can use the code generated by AOT.
    */
  def loadAotSummaries(summaries: js.Function0[js.Array[_]]): Unit = js.native
  def overrideComponent(component: Type[_], overrides: MetadataOverride[Component]): Unit = js.native
  def overrideDirective(directive: Type[_], overrides: MetadataOverride[Directive]): Unit = js.native
  def overrideModule(module: Type[_], overrides: MetadataOverride[NgModule]): Unit = js.native
  def overridePipe(directive: Type[_], overrides: MetadataOverride[Pipe]): Unit = js.native
}

