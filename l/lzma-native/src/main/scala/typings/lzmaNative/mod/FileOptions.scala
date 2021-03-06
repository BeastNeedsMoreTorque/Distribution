package typings.lzmaNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileOptions extends js.Object {
  var fileSize: Double
  var memlimit: js.UndefOr[Double] = js.undefined
  def read(count: Double, offset: Double, cb: js.Function2[/* err */ js.Any, /* buffer */ Buffer, Unit]): Unit
}

object FileOptions {
  @scala.inline
  def apply(
    fileSize: Double,
    read: (Double, Double, js.Function2[/* err */ js.Any, /* buffer */ Buffer, Unit]) => Unit,
    memlimit: js.UndefOr[Double] = js.undefined
  ): FileOptions = {
    val __obj = js.Dynamic.literal(fileSize = fileSize.asInstanceOf[js.Any], read = js.Any.fromFunction3(read))
    if (!js.isUndefined(memlimit)) __obj.updateDynamic("memlimit")(memlimit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileOptions]
  }
}

