package typings.activexLibreoffice.com_.sun.star.packages.zip

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * used to represent a ZIP file entry
  *
  * This interface is an IDL version of the Java interface **java.util.zip.ZipFile** with some minor adaptations.
  */
trait ZipEntry extends js.Object {
  /** optional extra field data for entry */
  var extra: SafeArray[Double]
  /** uncompressed size of entry data */
  var nCompressedSize: Double
  /** CRC-32 of entry data */
  var nCrc: Double
  /** The number of the disk this entry is saved on */
  var nDiskNumber: Double
  /** bit flags */
  var nFlag: Double
  /** compression method */
  var nMethod: Double
  /** offset of LOC header */
  var nOffset: Double
  /** uncompressed size of entry data */
  var nSize: Double
  /** modification time */
  var nTime: Double
  /** version needed to extract */
  var nVersion: Double
  /** optional comment */
  var sComment: String
  /** the entry name */
  var sName: String
}

object ZipEntry {
  @scala.inline
  def apply(
    extra: SafeArray[Double],
    nCompressedSize: Double,
    nCrc: Double,
    nDiskNumber: Double,
    nFlag: Double,
    nMethod: Double,
    nOffset: Double,
    nSize: Double,
    nTime: Double,
    nVersion: Double,
    sComment: String,
    sName: String
  ): ZipEntry = {
    val __obj = js.Dynamic.literal(extra = extra.asInstanceOf[js.Any], nCompressedSize = nCompressedSize.asInstanceOf[js.Any], nCrc = nCrc.asInstanceOf[js.Any], nDiskNumber = nDiskNumber.asInstanceOf[js.Any], nFlag = nFlag.asInstanceOf[js.Any], nMethod = nMethod.asInstanceOf[js.Any], nOffset = nOffset.asInstanceOf[js.Any], nSize = nSize.asInstanceOf[js.Any], nTime = nTime.asInstanceOf[js.Any], nVersion = nVersion.asInstanceOf[js.Any], sComment = sComment.asInstanceOf[js.Any], sName = sName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZipEntry]
  }
}

