package typings.jupyterlabServices.restapiMod

import org.scalablytyped.runtime.StringDictionary
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpecModel extends PartialJSONObject {
  /**
    * A list of command line arguments used to start the kernel.
    */
  val argv: js.Array[String]
  /**
    * The kernel’s name as it should be displayed in the UI.
    */
  val display_name: String
  /**
    * A dictionary of environment variables to set for the kernel.
    */
  val env: js.UndefOr[PartialJSONObject] = js.undefined
  /**
    * The name of the language of the kernel.
    */
  val language: String
  /**
    * A dictionary of additional attributes about this kernel; used by clients to aid in kernel selection.
    */
  val metadata: js.UndefOr[PartialJSONObject] = js.undefined
  /**
    * The name of the kernel spec.
    */
  val name: String
  /**
    * A mapping of resource file name to download path.
    */
  val resources: StringDictionary[String]
}

object ISpecModel {
  @scala.inline
  def apply(
    argv: js.Array[String],
    display_name: String,
    language: String,
    name: String,
    resources: StringDictionary[String],
    env: PartialJSONObject = null,
    metadata: PartialJSONObject = null
  ): ISpecModel = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpecModel]
  }
}

