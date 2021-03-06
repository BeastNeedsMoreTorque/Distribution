package typings.jsonld.mod.Options

import typings.jsonld.jsonldSpecMod.Context
import typings.jsonld.jsonldSpecMod.RemoteDocument
import typings.jsonld.jsonldSpecMod.Url
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compact
  extends Common
     with ExpMap {
  var appropriate: js.UndefOr[Boolean] = js.undefined
  var compactArrays: js.UndefOr[Boolean] = js.undefined
  var compactToRelative: js.UndefOr[Boolean] = js.undefined
  // TODO: Figure out type of info
  var compactionMap: js.UndefOr[js.Function1[/* info */ js.Any, Unit]] = js.undefined
  var expansion: js.UndefOr[Boolean] = js.undefined
  var framing: js.UndefOr[Boolean] = js.undefined
  var graph: js.UndefOr[Boolean] = js.undefined
  var skipExpansion: js.UndefOr[Boolean] = js.undefined
}

object Compact {
  @scala.inline
  def apply(
    appropriate: js.UndefOr[Boolean] = js.undefined,
    base: String = null,
    compactArrays: js.UndefOr[Boolean] = js.undefined,
    compactToRelative: js.UndefOr[Boolean] = js.undefined,
    compactionMap: /* info */ js.Any => Unit = null,
    documentLoader: (/* url */ Url, /* callback */ js.Function2[/* err */ Error, /* remoteDoc */ RemoteDocument, Unit]) => js.Promise[RemoteDocument] = null,
    expandContext: Context = null,
    expansion: js.UndefOr[Boolean] = js.undefined,
    expansionMap: /* info */ js.Any => _ = null,
    framing: js.UndefOr[Boolean] = js.undefined,
    graph: js.UndefOr[Boolean] = js.undefined,
    skipExpansion: js.UndefOr[Boolean] = js.undefined
  ): Compact = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appropriate)) __obj.updateDynamic("appropriate")(appropriate.get.asInstanceOf[js.Any])
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (!js.isUndefined(compactArrays)) __obj.updateDynamic("compactArrays")(compactArrays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(compactToRelative)) __obj.updateDynamic("compactToRelative")(compactToRelative.get.asInstanceOf[js.Any])
    if (compactionMap != null) __obj.updateDynamic("compactionMap")(js.Any.fromFunction1(compactionMap))
    if (documentLoader != null) __obj.updateDynamic("documentLoader")(js.Any.fromFunction2(documentLoader))
    if (expandContext != null) __obj.updateDynamic("expandContext")(expandContext.asInstanceOf[js.Any])
    if (!js.isUndefined(expansion)) __obj.updateDynamic("expansion")(expansion.get.asInstanceOf[js.Any])
    if (expansionMap != null) __obj.updateDynamic("expansionMap")(js.Any.fromFunction1(expansionMap))
    if (!js.isUndefined(framing)) __obj.updateDynamic("framing")(framing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(graph)) __obj.updateDynamic("graph")(graph.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipExpansion)) __obj.updateDynamic("skipExpansion")(skipExpansion.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compact]
  }
}

