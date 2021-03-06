package typings.typedoc.optionsDeclarationMod

import typings.typedoc.optionsDeclarationMod.ParameterType.Array
import typings.typedoc.optionsDeclarationMod.ParameterType.Boolean
import typings.typedoc.optionsDeclarationMod.ParameterType.Mixed
import typings.typedoc.optionsDeclarationMod.ParameterType.Number
import typings.typedoc.typedocStrings.categorizeByGroup
import typings.typedoc.typedocStrings.categoryOrder
import typings.typedoc.typedocStrings.defaultCategory
import typings.typedoc.typedocStrings.disableOutputCheck
import typings.typedoc.typedocStrings.entryPoint
import typings.typedoc.typedocStrings.exclude
import typings.typedoc.typedocStrings.excludeExternals
import typings.typedoc.typedocStrings.excludeNotExported
import typings.typedoc.typedocStrings.excludePrivate
import typings.typedoc.typedocStrings.excludeProtected
import typings.typedoc.typedocStrings.excludeTags
import typings.typedoc.typedocStrings.externalPattern
import typings.typedoc.typedocStrings.gaID
import typings.typedoc.typedocStrings.gaSite
import typings.typedoc.typedocStrings.gitRevision
import typings.typedoc.typedocStrings.help
import typings.typedoc.typedocStrings.hideGenerator
import typings.typedoc.typedocStrings.ignoreCompilerErrors
import typings.typedoc.typedocStrings.includeDeclarations
import typings.typedoc.typedocStrings.includeVersion
import typings.typedoc.typedocStrings.includes
import typings.typedoc.typedocStrings.inputFiles
import typings.typedoc.typedocStrings.json
import typings.typedoc.typedocStrings.listInvalidSymbolLinks
import typings.typedoc.typedocStrings.logger
import typings.typedoc.typedocStrings.media
import typings.typedoc.typedocStrings.mode
import typings.typedoc.typedocStrings.name
import typings.typedoc.typedocStrings.options
import typings.typedoc.typedocStrings.out
import typings.typedoc.typedocStrings.plugin
import typings.typedoc.typedocStrings.readme
import typings.typedoc.typedocStrings.theme
import typings.typedoc.typedocStrings.toc
import typings.typedoc.typedocStrings.tsconfig
import typings.typedoc.typedocStrings.version
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _KeyToDeclaration[K /* <: options | tsconfig | inputFiles | mode | includeDeclarations | entryPoint | exclude | externalPattern | excludeExternals | excludeNotExported | excludePrivate | excludeProtected | ignoreCompilerErrors | includes | media | out | json | theme | name | includeVersion | excludeTags | readme | defaultCategory | categoryOrder | categorizeByGroup | gitRevision | gaID | gaSite | hideGenerator | toc | disableOutputCheck | help | version | plugin | logger | listInvalidSymbolLinks */] extends js.Object

object _KeyToDeclaration {
  @scala.inline
  def MixedDeclarationOption[/* <: typings.typedoc.typedocStrings.options | typings.typedoc.typedocStrings.tsconfig | typings.typedoc.typedocStrings.inputFiles | typings.typedoc.typedocStrings.mode | typings.typedoc.typedocStrings.includeDeclarations | typings.typedoc.typedocStrings.entryPoint | typings.typedoc.typedocStrings.exclude | typings.typedoc.typedocStrings.externalPattern | typings.typedoc.typedocStrings.excludeExternals | typings.typedoc.typedocStrings.excludeNotExported | typings.typedoc.typedocStrings.excludePrivate | typings.typedoc.typedocStrings.excludeProtected | typings.typedoc.typedocStrings.ignoreCompilerErrors | typings.typedoc.typedocStrings.includes | typings.typedoc.typedocStrings.media | typings.typedoc.typedocStrings.out | typings.typedoc.typedocStrings.json | typings.typedoc.typedocStrings.theme | typings.typedoc.typedocStrings.name | typings.typedoc.typedocStrings.includeVersion | typings.typedoc.typedocStrings.excludeTags | typings.typedoc.typedocStrings.readme | typings.typedoc.typedocStrings.defaultCategory | typings.typedoc.typedocStrings.categoryOrder | typings.typedoc.typedocStrings.categorizeByGroup | typings.typedoc.typedocStrings.gitRevision | typings.typedoc.typedocStrings.gaID | typings.typedoc.typedocStrings.gaSite | typings.typedoc.typedocStrings.hideGenerator | typings.typedoc.typedocStrings.toc | typings.typedoc.typedocStrings.disableOutputCheck | typings.typedoc.typedocStrings.help | typings.typedoc.typedocStrings.version | typings.typedoc.typedocStrings.plugin | typings.typedoc.typedocStrings.logger | typings.typedoc.typedocStrings.listInvalidSymbolLinks */ K](
    help: String,
    name: String,
    `type`: Mixed,
    defaultValue: js.Any = null,
    scope: ParameterScope = null,
    short: String = null
  ): _KeyToDeclaration[K] = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    __obj.asInstanceOf[_KeyToDeclaration[K]]
  }
  @scala.inline
  def ArrayDeclarationOption[/* <: typings.typedoc.typedocStrings.options | typings.typedoc.typedocStrings.tsconfig | typings.typedoc.typedocStrings.inputFiles | typings.typedoc.typedocStrings.mode | typings.typedoc.typedocStrings.includeDeclarations | typings.typedoc.typedocStrings.entryPoint | typings.typedoc.typedocStrings.exclude | typings.typedoc.typedocStrings.externalPattern | typings.typedoc.typedocStrings.excludeExternals | typings.typedoc.typedocStrings.excludeNotExported | typings.typedoc.typedocStrings.excludePrivate | typings.typedoc.typedocStrings.excludeProtected | typings.typedoc.typedocStrings.ignoreCompilerErrors | typings.typedoc.typedocStrings.includes | typings.typedoc.typedocStrings.media | typings.typedoc.typedocStrings.out | typings.typedoc.typedocStrings.json | typings.typedoc.typedocStrings.theme | typings.typedoc.typedocStrings.name | typings.typedoc.typedocStrings.includeVersion | typings.typedoc.typedocStrings.excludeTags | typings.typedoc.typedocStrings.readme | typings.typedoc.typedocStrings.defaultCategory | typings.typedoc.typedocStrings.categoryOrder | typings.typedoc.typedocStrings.categorizeByGroup | typings.typedoc.typedocStrings.gitRevision | typings.typedoc.typedocStrings.gaID | typings.typedoc.typedocStrings.gaSite | typings.typedoc.typedocStrings.hideGenerator | typings.typedoc.typedocStrings.toc | typings.typedoc.typedocStrings.disableOutputCheck | typings.typedoc.typedocStrings.help | typings.typedoc.typedocStrings.version | typings.typedoc.typedocStrings.plugin | typings.typedoc.typedocStrings.logger | typings.typedoc.typedocStrings.listInvalidSymbolLinks */ K](
    help: String,
    name: String,
    `type`: Array,
    defaultValue: js.Array[String] = null,
    scope: ParameterScope = null,
    short: String = null
  ): _KeyToDeclaration[K] = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    __obj.asInstanceOf[_KeyToDeclaration[K]]
  }
  @scala.inline
  def BooleanDeclarationOption[/* <: typings.typedoc.typedocStrings.options | typings.typedoc.typedocStrings.tsconfig | typings.typedoc.typedocStrings.inputFiles | typings.typedoc.typedocStrings.mode | typings.typedoc.typedocStrings.includeDeclarations | typings.typedoc.typedocStrings.entryPoint | typings.typedoc.typedocStrings.exclude | typings.typedoc.typedocStrings.externalPattern | typings.typedoc.typedocStrings.excludeExternals | typings.typedoc.typedocStrings.excludeNotExported | typings.typedoc.typedocStrings.excludePrivate | typings.typedoc.typedocStrings.excludeProtected | typings.typedoc.typedocStrings.ignoreCompilerErrors | typings.typedoc.typedocStrings.includes | typings.typedoc.typedocStrings.media | typings.typedoc.typedocStrings.out | typings.typedoc.typedocStrings.json | typings.typedoc.typedocStrings.theme | typings.typedoc.typedocStrings.name | typings.typedoc.typedocStrings.includeVersion | typings.typedoc.typedocStrings.excludeTags | typings.typedoc.typedocStrings.readme | typings.typedoc.typedocStrings.defaultCategory | typings.typedoc.typedocStrings.categoryOrder | typings.typedoc.typedocStrings.categorizeByGroup | typings.typedoc.typedocStrings.gitRevision | typings.typedoc.typedocStrings.gaID | typings.typedoc.typedocStrings.gaSite | typings.typedoc.typedocStrings.hideGenerator | typings.typedoc.typedocStrings.toc | typings.typedoc.typedocStrings.disableOutputCheck | typings.typedoc.typedocStrings.help | typings.typedoc.typedocStrings.version | typings.typedoc.typedocStrings.plugin | typings.typedoc.typedocStrings.logger | typings.typedoc.typedocStrings.listInvalidSymbolLinks */ K](
    help: String,
    name: String,
    `type`: Boolean,
    defaultValue: js.UndefOr[scala.Boolean] = js.undefined,
    scope: ParameterScope = null,
    short: String = null
  ): _KeyToDeclaration[K] = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.get.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    __obj.asInstanceOf[_KeyToDeclaration[K]]
  }
  @scala.inline
  def NumberDeclarationOption[/* <: typings.typedoc.typedocStrings.options | typings.typedoc.typedocStrings.tsconfig | typings.typedoc.typedocStrings.inputFiles | typings.typedoc.typedocStrings.mode | typings.typedoc.typedocStrings.includeDeclarations | typings.typedoc.typedocStrings.entryPoint | typings.typedoc.typedocStrings.exclude | typings.typedoc.typedocStrings.externalPattern | typings.typedoc.typedocStrings.excludeExternals | typings.typedoc.typedocStrings.excludeNotExported | typings.typedoc.typedocStrings.excludePrivate | typings.typedoc.typedocStrings.excludeProtected | typings.typedoc.typedocStrings.ignoreCompilerErrors | typings.typedoc.typedocStrings.includes | typings.typedoc.typedocStrings.media | typings.typedoc.typedocStrings.out | typings.typedoc.typedocStrings.json | typings.typedoc.typedocStrings.theme | typings.typedoc.typedocStrings.name | typings.typedoc.typedocStrings.includeVersion | typings.typedoc.typedocStrings.excludeTags | typings.typedoc.typedocStrings.readme | typings.typedoc.typedocStrings.defaultCategory | typings.typedoc.typedocStrings.categoryOrder | typings.typedoc.typedocStrings.categorizeByGroup | typings.typedoc.typedocStrings.gitRevision | typings.typedoc.typedocStrings.gaID | typings.typedoc.typedocStrings.gaSite | typings.typedoc.typedocStrings.hideGenerator | typings.typedoc.typedocStrings.toc | typings.typedoc.typedocStrings.disableOutputCheck | typings.typedoc.typedocStrings.help | typings.typedoc.typedocStrings.version | typings.typedoc.typedocStrings.plugin | typings.typedoc.typedocStrings.logger | typings.typedoc.typedocStrings.listInvalidSymbolLinks */ K](
    help: String,
    name: String,
    `type`: Number,
    defaultValue: js.UndefOr[Double] = js.undefined,
    scope: ParameterScope = null,
    short: String = null
  ): _KeyToDeclaration[K] = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.get.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    __obj.asInstanceOf[_KeyToDeclaration[K]]
  }
  @scala.inline
  def StringDeclarationOption[/* <: typings.typedoc.typedocStrings.options | typings.typedoc.typedocStrings.tsconfig | typings.typedoc.typedocStrings.inputFiles | typings.typedoc.typedocStrings.mode | typings.typedoc.typedocStrings.includeDeclarations | typings.typedoc.typedocStrings.entryPoint | typings.typedoc.typedocStrings.exclude | typings.typedoc.typedocStrings.externalPattern | typings.typedoc.typedocStrings.excludeExternals | typings.typedoc.typedocStrings.excludeNotExported | typings.typedoc.typedocStrings.excludePrivate | typings.typedoc.typedocStrings.excludeProtected | typings.typedoc.typedocStrings.ignoreCompilerErrors | typings.typedoc.typedocStrings.includes | typings.typedoc.typedocStrings.media | typings.typedoc.typedocStrings.out | typings.typedoc.typedocStrings.json | typings.typedoc.typedocStrings.theme | typings.typedoc.typedocStrings.name | typings.typedoc.typedocStrings.includeVersion | typings.typedoc.typedocStrings.excludeTags | typings.typedoc.typedocStrings.readme | typings.typedoc.typedocStrings.defaultCategory | typings.typedoc.typedocStrings.categoryOrder | typings.typedoc.typedocStrings.categorizeByGroup | typings.typedoc.typedocStrings.gitRevision | typings.typedoc.typedocStrings.gaID | typings.typedoc.typedocStrings.gaSite | typings.typedoc.typedocStrings.hideGenerator | typings.typedoc.typedocStrings.toc | typings.typedoc.typedocStrings.disableOutputCheck | typings.typedoc.typedocStrings.help | typings.typedoc.typedocStrings.version | typings.typedoc.typedocStrings.plugin | typings.typedoc.typedocStrings.logger | typings.typedoc.typedocStrings.listInvalidSymbolLinks */ K](
    help: String,
    name: String,
    defaultValue: String = null,
    hint: ParameterHint = null,
    scope: ParameterScope = null,
    short: String = null,
    `type`: typings.typedoc.optionsDeclarationMod.ParameterType.String = null
  ): _KeyToDeclaration[K] = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_KeyToDeclaration[K]]
  }
}

