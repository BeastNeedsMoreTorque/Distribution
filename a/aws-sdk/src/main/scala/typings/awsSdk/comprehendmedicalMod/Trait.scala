package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Trait extends js.Object {
  /**
    *  Provides a name or contextual description about the trait. 
    */
  var Name: js.UndefOr[AttributeName] = js.native
  /**
    *  The level of confidence that Amazon Comprehend Medical has in the accuracy of this trait.
    */
  var Score: js.UndefOr[Float] = js.native
}

object Trait {
  @scala.inline
  def apply(Name: AttributeName = null, Score: js.UndefOr[Float] = js.undefined): Trait = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (!js.isUndefined(Score)) __obj.updateDynamic("Score")(Score.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trait]
  }
}

