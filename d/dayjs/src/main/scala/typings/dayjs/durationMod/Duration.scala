package typings.dayjs.durationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration extends js.Object {
  def add(input: DurationAddType): Duration = js.native
  def add(input: DurationAddType, unit: String): Duration = js.native
  def as(unit: String): Double = js.native
  def asDays(): Double = js.native
  def asHours(): Double = js.native
  def asMilliseconds(): Double = js.native
  def asMinutes(): Double = js.native
  def asMonths(): Double = js.native
  def asSeconds(): Double = js.native
  def asWeeks(): Double = js.native
  def asYears(): Double = js.native
  def days(): Double = js.native
  def get(unit: String): Double = js.native
  def hours(): Double = js.native
  def humanize(withSuffix: Boolean): String = js.native
  def locale(locale: String): Duration = js.native
  def milliseconds(): Double = js.native
  def minutes(): Double = js.native
  def months(): Double = js.native
  def seconds(): Double = js.native
  def subtract(input: DurationAddType): Duration = js.native
  def subtract(input: DurationAddType, unit: String): Duration = js.native
  def toISOString(): String = js.native
  def toJSON(): String = js.native
  def weeks(): Double = js.native
  def years(): Double = js.native
}

