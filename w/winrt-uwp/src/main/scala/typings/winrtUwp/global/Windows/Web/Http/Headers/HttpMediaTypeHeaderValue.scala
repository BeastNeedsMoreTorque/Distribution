package typings.winrtUwp.global.Windows.Web.Http.Headers

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.anon.MediaTypeHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the value of the Content-Type HTTP header on the HTTP content in a request or a response. */
@JSGlobal("Windows.Web.Http.Headers.HttpMediaTypeHeaderValue")
@js.native
class HttpMediaTypeHeaderValue protected ()
  extends typings.winrtUwp.Windows.Web.Http.Headers.HttpMediaTypeHeaderValue {
  /**
    * Initializes a new instance of the HttpMediaTypeHeaderValue class.
    * @param mediaType The media-type of the entity-body used in the Content-Type HTTP header.
    */
  def this(mediaType: String) = this()
  /** Gets or sets the character set of the entity-body used in the Content-Type HTTP header. */
  /* CompleteClass */
  override var charSet: String = js.native
  /** Gets or sets the media-type of the entity-body used in the Content-Type HTTP header. */
  /* CompleteClass */
  override var mediaType: String = js.native
  /** Gets a set of parameters included in the Content-Type HTTP header. */
  /* CompleteClass */
  override var parameters: IVector[typings.winrtUwp.Windows.Web.Http.Headers.HttpNameValueHeaderValue] = js.native
}

/* static members */
@JSGlobal("Windows.Web.Http.Headers.HttpMediaTypeHeaderValue")
@js.native
object HttpMediaTypeHeaderValue extends js.Object {
  /**
    * Converts a string to an HttpMediaTypeHeaderValue instance.
    * @param input A string that represents the media-type and character set information used in the Content-Type HTTP header.
    * @return An HttpMediaTypeHeaderValue instance.
    */
  def parse(input: String): typings.winrtUwp.Windows.Web.Http.Headers.HttpMediaTypeHeaderValue = js.native
  /**
    * Determines whether a string is valid HttpMediaTypeHeaderValue information.
    * @param input The string to validate.
    */
  def tryParse(input: String): MediaTypeHeaderValue = js.native
}

