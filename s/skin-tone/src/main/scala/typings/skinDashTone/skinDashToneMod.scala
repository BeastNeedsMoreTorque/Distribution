package typings.skinDashTone

import typings.skinDashTone.skinDashToneMod.Tone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("skin-tone", JSImport.Namespace)
@js.native
object skinDashToneMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.skinDashTone.skinDashToneStrings.none
    - typings.skinDashTone.skinDashToneStrings.white
    - typings.skinDashTone.skinDashToneStrings.creamWhite
    - typings.skinDashTone.skinDashToneStrings.lightBrown
    - typings.skinDashTone.skinDashToneStrings.brown
    - typings.skinDashTone.skinDashToneStrings.darkBrown
  */
  trait Tone extends js.Object
  
  /**
  Change the skin tone of an emoji 👌👌🏻👌🏼👌🏽👌🏾👌🏿.
  @param emoji - Emoji to modify.
  @param tone - Skin tone to use for `emoji`.
  - `'none'`       :      *(Removes skin tone)*
  - `'white'`      : 🏻   *(Fitzpatrick Type-1–2)*
  - `'creamWhite'` : 🏼   *(Fitzpatrick Type-3)*
  - `'lightBrown'` : 🏽   *(Fitzpatrick Type-4)*
  - `'brown'`      : 🏾   *(Fitzpatrick Type-5)*
  - `'darkBrown'`  : 🏿   *(Fitzpatrick Type-6)*
  @example
  ```
  import skinTone = require('skin-tone');
  skinTone('👍', 'brown');
  //=> '👍🏾'
  skinTone('👍', 'white');
  //=> '👍🏻'
  // can also remove skin tone
  skinTone('👍🏾', 'none');
  //=> '👍'
  // just passes it through when not supported
  skinTone('🦄', 'darkBrown');
  //=> '🦄'
  ```
  */
  def apply(emoji: String, tone: Tone): String = js.native
}

