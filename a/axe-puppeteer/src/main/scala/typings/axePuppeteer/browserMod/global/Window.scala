package typings.axePuppeteer.browserMod.global

import typings.axePuppeteer.anon.TypeofAxe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var axe: TypeofAxe
}

object Window {
  @scala.inline
  def apply(axe: TypeofAxe): Window = {
    val __obj = js.Dynamic.literal(axe = axe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

