package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivePath extends js.Object {
  var ActivePath: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var Svg: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var TrackPath: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
}

object ActivePath {
  @scala.inline
  def apply(
    ActivePath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    Svg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    TrackPath: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null
  ): ActivePath = {
    val __obj = js.Dynamic.literal()
    if (ActivePath != null) __obj.updateDynamic("ActivePath")(ActivePath.asInstanceOf[js.Any])
    if (Svg != null) __obj.updateDynamic("Svg")(Svg.asInstanceOf[js.Any])
    if (TrackPath != null) __obj.updateDynamic("TrackPath")(TrackPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivePath]
  }
}

