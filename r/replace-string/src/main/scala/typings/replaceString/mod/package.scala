package typings.replaceString

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ReplacementFunction = js.Function4[
    /* matchedSubstring */ java.lang.String, 
    /* matchCount */ scala.Double, 
    /* input */ java.lang.String, 
    /* matchIndex */ scala.Double, 
    java.lang.String
  ]
}
