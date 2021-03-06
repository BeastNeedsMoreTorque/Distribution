package typings.graphqlToolsUtils.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.anon.GraphQLScalarTypeConfigan
import typings.graphql.astMod.ScalarTypeDefinitionNode
import typings.graphql.astMod.ScalarTypeExtensionNode
import typings.graphql.astMod.ValueNode
import typings.graphql.definitionMod.GraphQLScalarLiteralParser
import typings.graphql.definitionMod.GraphQLScalarSerializer
import typings.graphql.definitionMod.GraphQLScalarTypeConfig
import typings.graphql.definitionMod.GraphQLScalarValueParser
import typings.graphql.maybeMod.Maybe
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.GraphQLScalarType & {  __name ? :string,   __description ? :string,   __serialize ? :graphql.graphql.GraphQLScalarSerializer<any>,   __parseValue ? :graphql.graphql.GraphQLScalarValueParser<any>,   __parseLiteral ? :graphql.graphql.GraphQLScalarLiteralParser<any>,   __extensions ? :std.Record<string, any>,   __astNode ? :graphql.graphql.ScalarTypeDefinitionNode,   __extensionASTNodes ? :std.Array<graphql.graphql.ScalarTypeExtensionNode>} */
@js.native
trait IScalarTypeResolver extends js.Object {
  var __astNode: js.UndefOr[ScalarTypeDefinitionNode] = js.native
  var __description: js.UndefOr[String] = js.native
  var __extensionASTNodes: js.UndefOr[js.Array[ScalarTypeExtensionNode]] = js.native
  var __extensions: js.UndefOr[Record[String, _]] = js.native
  var __name: js.UndefOr[String] = js.native
  var __parseLiteral: js.UndefOr[GraphQLScalarLiteralParser[_]] = js.native
  var __parseValue: js.UndefOr[GraphQLScalarValueParser[_]] = js.native
  var __serialize: js.UndefOr[GraphQLScalarSerializer[_]] = js.native
  var astNode: Maybe[ScalarTypeDefinitionNode] = js.native
  var description: Maybe[String] = js.native
  var extensionASTNodes: Maybe[js.Array[ScalarTypeExtensionNode]] = js.native
  var extensions: Maybe[Record[String, _]] = js.native
  var name: String = js.native
  @JSName("parseLiteral")
  var parseLiteral_Original: GraphQLScalarLiteralParser[_] = js.native
  @JSName("parseValue")
  var parseValue_Original: GraphQLScalarValueParser[_] = js.native
  @JSName("serialize")
  var serialize_Original: GraphQLScalarSerializer[_] = js.native
  def inspect(): String = js.native
  def parseLiteral(valueNode: ValueNode, variables: Maybe[StringDictionary[_]]): Maybe[_] = js.native
  def parseValue(value: js.Any): Maybe[_] = js.native
  def serialize(value: js.Any): Maybe[_] = js.native
  def toConfig(): GraphQLScalarTypeConfigan = js.native
  def toJSON(): String = js.native
}

