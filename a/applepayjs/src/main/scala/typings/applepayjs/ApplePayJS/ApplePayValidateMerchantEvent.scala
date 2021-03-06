package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The attributes contained by the onvalidatemerchant callback function.
  */
@js.native
trait ApplePayValidateMerchantEvent extends Event {
  /**
    * The URL your server must use to validate itself and obtain a merchant session object.
    */
  val validationURL: String = js.native
}

