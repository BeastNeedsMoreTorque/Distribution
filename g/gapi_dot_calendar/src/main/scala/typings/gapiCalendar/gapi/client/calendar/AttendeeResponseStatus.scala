package typings.gapiCalendar.gapi.client.calendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The attendee's response status. Possible values are:
/* Rewritten from type alias, can be one of: 
  - typings.gapiCalendar.gapiCalendarStrings.needsAction
  - typings.gapiCalendar.gapiCalendarStrings.declined
  - typings.gapiCalendar.gapiCalendarStrings.tentative
  - typings.gapiCalendar.gapiCalendarStrings.accepted
*/
trait AttendeeResponseStatus extends js.Object

object AttendeeResponseStatus {
  @scala.inline
  def accepted: typings.gapiCalendar.gapiCalendarStrings.accepted = "accepted".asInstanceOf[typings.gapiCalendar.gapiCalendarStrings.accepted]
  @scala.inline
  def declined: typings.gapiCalendar.gapiCalendarStrings.declined = "declined".asInstanceOf[typings.gapiCalendar.gapiCalendarStrings.declined]
  @scala.inline
  def needsAction: typings.gapiCalendar.gapiCalendarStrings.needsAction = "needsAction".asInstanceOf[typings.gapiCalendar.gapiCalendarStrings.needsAction]
  @scala.inline
  def tentative: typings.gapiCalendar.gapiCalendarStrings.tentative = "tentative".asInstanceOf[typings.gapiCalendar.gapiCalendarStrings.tentative]
}

