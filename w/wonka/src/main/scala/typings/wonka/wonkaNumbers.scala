package typings.wonka

import typings.wonka.jsShimMod.talkbackT
import typings.wonka.wonkaCallbagGenMod.callbagSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object wonkaNumbers {
  @js.native
  sealed trait `0`
    extends callbagSignal
       with talkbackT
  
  @js.native
  sealed trait `1`
    extends callbagSignal
       with talkbackT
  
  @js.native
  sealed trait `2` extends callbagSignal
  
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
  @scala.inline
  def `2`: `2` = 2.asInstanceOf[`2`]
}

