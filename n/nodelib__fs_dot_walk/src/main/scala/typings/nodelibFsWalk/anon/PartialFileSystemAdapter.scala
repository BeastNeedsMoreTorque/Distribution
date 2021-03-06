package typings.nodelibFsWalk.anon

import typings.node.anon.BaseEncodingOptionswithFiEncoding
import typings.node.fsMod.Dirent
import typings.node.fsMod.PathLike
import typings.node.fsMod.Stats
import typings.nodelibFsScandir.anon.Typeoflstat
import typings.nodelibFsScandir.anon.Typeofreaddir
import typings.nodelibFsScandir.anon.Typeofstat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@nodelib/fs.scandir.@nodelib/fs.scandir.FileSystemAdapter> */
trait PartialFileSystemAdapter extends js.Object {
  var lstat: js.UndefOr[Typeoflstat] = js.undefined
  var lstatSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.undefined
  var readdir: js.UndefOr[Typeofreaddir] = js.undefined
  var readdirSync: js.UndefOr[
    js.Function2[
      /* path */ PathLike, 
      /* options */ BaseEncodingOptionswithFiEncoding, 
      js.Array[Dirent]
    ]
  ] = js.undefined
  var stat: js.UndefOr[Typeofstat] = js.undefined
  var statSync: js.UndefOr[js.Function1[/* path */ PathLike, Stats]] = js.undefined
}

object PartialFileSystemAdapter {
  @scala.inline
  def apply(
    lstat: Typeoflstat = null,
    lstatSync: /* path */ PathLike => Stats = null,
    readdir: Typeofreaddir = null,
    readdirSync: (/* path */ PathLike, /* options */ BaseEncodingOptionswithFiEncoding) => js.Array[Dirent] = null,
    stat: Typeofstat = null,
    statSync: /* path */ PathLike => Stats = null
  ): PartialFileSystemAdapter = {
    val __obj = js.Dynamic.literal()
    if (lstat != null) __obj.updateDynamic("lstat")(lstat.asInstanceOf[js.Any])
    if (lstatSync != null) __obj.updateDynamic("lstatSync")(js.Any.fromFunction1(lstatSync))
    if (readdir != null) __obj.updateDynamic("readdir")(readdir.asInstanceOf[js.Any])
    if (readdirSync != null) __obj.updateDynamic("readdirSync")(js.Any.fromFunction2(readdirSync))
    if (stat != null) __obj.updateDynamic("stat")(stat.asInstanceOf[js.Any])
    if (statSync != null) __obj.updateDynamic("statSync")(js.Any.fromFunction1(statSync))
    __obj.asInstanceOf[PartialFileSystemAdapter]
  }
}

