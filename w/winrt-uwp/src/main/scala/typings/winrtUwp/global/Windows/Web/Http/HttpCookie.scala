package typings.winrtUwp.global.Windows.Web.Http

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a set of properties and methods to manage an HTTP cookie. */
@JSGlobal("Windows.Web.Http.HttpCookie")
@js.native
class HttpCookie protected ()
  extends typings.winrtUwp.Windows.Web.Http.HttpCookie {
  /**
    * Initializes a new instance of the HttpCookie class with a specified name, domain, and path.
    * @param name The name for the HttpCookie
    * @param domain The domain for which the HttpCookie is valid.
    * @param path The URIs to which the HttpCookie applies.
    */
  def this(name: String, domain: String, path: String) = this()
  /** Get the domain for which the HttpCookie is valid. */
  /* CompleteClass */
  override var domain: String = js.native
  /** Get or set the expiration date and time for the HttpCookie . */
  /* CompleteClass */
  override var expires: Date = js.native
  /** Get or set a value that controls whether a script or other active content can access this HttpCookie . */
  /* CompleteClass */
  override var httpOnly: Boolean = js.native
  /** Get the token that represents the HttpCookie name. */
  /* CompleteClass */
  override var name: String = js.native
  /** Get the URI path component to which the HttpCookie applies. */
  /* CompleteClass */
  override var path: String = js.native
  /** Get or set the security level for the HttpCookie . */
  /* CompleteClass */
  override var secure: Boolean = js.native
  /** Get or set the value for the HttpCookie . */
  /* CompleteClass */
  override var value: String = js.native
}

