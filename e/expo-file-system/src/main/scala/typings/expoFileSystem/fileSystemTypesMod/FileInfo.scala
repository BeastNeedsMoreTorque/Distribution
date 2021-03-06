package typings.expoFileSystem.fileSystemTypesMod

import typings.expoFileSystem.expoFileSystemBooleans.`false`
import typings.expoFileSystem.expoFileSystemBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.expoFileSystem.anon.Exists
  - typings.expoFileSystem.anon.IsDirectory
*/
trait FileInfo extends js.Object

object FileInfo {
  @scala.inline
  def Exists(
    exists: `true`,
    isDirectory: Boolean,
    modificationTime: Double,
    size: Double,
    uri: String,
    md5: String = null
  ): FileInfo = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    if (md5 != null) __obj.updateDynamic("md5")(md5.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInfo]
  }
  @scala.inline
  def IsDirectory(exists: `false`, isDirectory: `false`, uri: String): FileInfo = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInfo]
  }
}

