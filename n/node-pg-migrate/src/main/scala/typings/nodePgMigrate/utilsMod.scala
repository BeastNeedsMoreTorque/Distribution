package typings.nodePgMigrate

import org.scalablytyped.runtime.StringDictionary
import typings.nodePgMigrate.distTypesMod.Literal
import typings.nodePgMigrate.distTypesMod.MigrationOptions
import typings.nodePgMigrate.distTypesMod.RunnerOption
import typings.nodePgMigrate.functionsTypesMod.FunctionParam
import typings.nodePgMigrate.functionsTypesMod.FunctionParamType
import typings.nodePgMigrate.generalTypesMod.Name
import typings.nodePgMigrate.generalTypesMod.Type
import typings.nodePgMigrate.generalTypesMod.Value
import typings.nodePgMigrate.tablesTypesMod.ColumnDefinition
import typings.nodePgMigrate.tablesTypesMod.ColumnDefinitions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-pg-migrate/dist/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def applyType(`type`: Type): ColumnDefinition with FunctionParamType = js.native
  def applyType(`type`: Type, extendingTypeShorthands: ColumnDefinitions): ColumnDefinition with FunctionParamType = js.native
  def applyTypeAdapters(`type`: String): String = js.native
  def createSchemalize(shouldDecamelize: Boolean, shouldQuote: Boolean): js.Function1[/* v */ Name, String] = js.native
  def createTransformer(literal: Literal): js.Function2[/* s */ String, /* d */ js.UndefOr[StringDictionary[Name]], String] = js.native
  def escapeValue(`val`: Value): String | Double = js.native
  def formatLines(lines: js.Array[String]): String = js.native
  def formatLines(lines: js.Array[String], replace: String): String = js.native
  def formatLines(lines: js.Array[String], replace: String, separator: String): String = js.native
  def formatParams(params: js.UndefOr[js.Array[FunctionParam]], mOptions: MigrationOptions): String = js.native
  def getMigrationTableSchema(options: RunnerOption): String = js.native
  def getSchemas(): js.Array[String] = js.native
  def getSchemas(schema: String): js.Array[String] = js.native
  def getSchemas(schema: js.Array[String]): js.Array[String] = js.native
  def makeComment(`object`: String, name: String): String = js.native
  def makeComment(`object`: String, name: String, text: String): String = js.native
}

