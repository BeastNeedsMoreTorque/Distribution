package typings.torrentStream.TorrentStream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TorrentEngineOptions extends js.Object {
  var connections: js.UndefOr[Double] = js.undefined
   // Verify previously stored data before starting.
  var dht: js.UndefOr[Boolean] = js.undefined
   // Root folder for the files storage. Default folder under /tmp/torrent-stream/{infoHash}.
  var path: js.UndefOr[String] = js.undefined
   // Allows to declare additional custom trackers to use.
  var storage: js.UndefOr[js.Any] = js.undefined
   // Number of upload slots.
  var tmp: js.UndefOr[String] = js.undefined
   // Whether or not to use DHT to initialize the swarm.
  var tracker: js.UndefOr[Boolean] = js.undefined
   // Whether or not to use trackers from torrent file or magnet link.
  var trackers: js.UndefOr[js.Array[String]] = js.undefined
   // Max amount of peers to be connected to.
  var uploads: js.UndefOr[Double] = js.undefined
   // Path where to save the files. Overrides 'tmp'.
  var verify: js.UndefOr[Boolean] = js.undefined
}

object TorrentEngineOptions {
  @scala.inline
  def apply(
    connections: js.UndefOr[Double] = js.undefined,
    dht: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    storage: js.Any = null,
    tmp: String = null,
    tracker: js.UndefOr[Boolean] = js.undefined,
    trackers: js.Array[String] = null,
    uploads: js.UndefOr[Double] = js.undefined,
    verify: js.UndefOr[Boolean] = js.undefined
  ): TorrentEngineOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(connections)) __obj.updateDynamic("connections")(connections.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dht)) __obj.updateDynamic("dht")(dht.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    if (tmp != null) __obj.updateDynamic("tmp")(tmp.asInstanceOf[js.Any])
    if (!js.isUndefined(tracker)) __obj.updateDynamic("tracker")(tracker.get.asInstanceOf[js.Any])
    if (trackers != null) __obj.updateDynamic("trackers")(trackers.asInstanceOf[js.Any])
    if (!js.isUndefined(uploads)) __obj.updateDynamic("uploads")(uploads.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verify)) __obj.updateDynamic("verify")(verify.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TorrentEngineOptions]
  }
}

