package typings.imap.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImapMessageAttributes extends js.Object {
  /** The internal server date for the message. */
  var date: Date
  /** A list of flags currently set on this message. */
  var flags: js.Array[String]
  /** The RFC822 message size (only set if requested with fetch()). */
  var size: js.UndefOr[Double] = js.undefined
  /** The message's body structure (only set if requested with fetch()). */
  var struct: js.UndefOr[js.Array[_]] = js.undefined
  /** A 32-bit ID that uniquely identifies this message within its mailbox. */
  var uid: Double
}

object ImapMessageAttributes {
  @scala.inline
  def apply(
    date: Date,
    flags: js.Array[String],
    uid: Double,
    size: js.UndefOr[Double] = js.undefined,
    struct: js.Array[_] = null
  ): ImapMessageAttributes = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (struct != null) __obj.updateDynamic("struct")(struct.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImapMessageAttributes]
  }
}

