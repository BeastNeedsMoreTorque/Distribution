package typings.jupyterlabLogconsole.loggerMod.LoggerOutputAreaModel

import typings.jupyterlabNbformat.mod.IOutput
import typings.jupyterlabOutputarea.modelMod.IOutputAreaModel.IContentFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions
  extends typings.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions {
  /**
    * The maximum number of messages stored.
    */
  var maxLength: Double
}

object IOptions {
  @scala.inline
  def apply(
    maxLength: Double,
    contentFactory: IContentFactory = null,
    trusted: js.UndefOr[Boolean] = js.undefined,
    values: js.Array[IOutput] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any])
    if (contentFactory != null) __obj.updateDynamic("contentFactory")(contentFactory.asInstanceOf[js.Any])
    if (!js.isUndefined(trusted)) __obj.updateDynamic("trusted")(trusted.get.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

