package typings.parseTorrentFile.mod

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TorrentInfo extends js.Object {
  var files: js.UndefOr[js.Array[File]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  @JSName("name.utf-8")
  var `nameDotutf-8`: js.UndefOr[String] = js.undefined
  var `piece length`: js.UndefOr[Double] = js.undefined
  var pieces: js.UndefOr[Double] = js.undefined
  var `private`: js.UndefOr[Boolean] = js.undefined
}

object TorrentInfo {
  @scala.inline
  def apply(
    files: js.Array[File] = null,
    name: String = null,
    `nameDotutf-8`: String = null,
    `piece length`: js.UndefOr[Double] = js.undefined,
    pieces: js.UndefOr[Double] = js.undefined,
    `private`: js.UndefOr[Boolean] = js.undefined
  ): TorrentInfo = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`nameDotutf-8` != null) __obj.updateDynamic("name.utf-8")(`nameDotutf-8`.asInstanceOf[js.Any])
    if (!js.isUndefined(`piece length`)) __obj.updateDynamic("piece length")(((`piece length`).get).asInstanceOf[js.Any])
    if (!js.isUndefined(pieces)) __obj.updateDynamic("pieces")(pieces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TorrentInfo]
  }
}

