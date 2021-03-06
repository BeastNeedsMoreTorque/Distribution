package typings.activexLibreoffice.com_.sun.star.linguistic2

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * one of the possible meanings for a word.
  *
  * Represents one of the possible meanings that may be returned from a {@link com.sun.star.linguistic2.XThesaurus.queryMeanings()} call and allows for
  * retrieval of its synonyms.
  * @see com.sun.star.linguistic2.XThesaurus
  */
trait XMeaning extends XInterface {
  /** @returns the meaning represented by this object. */
  val Meaning: String
  /** @returns the meaning represented by this object. */
  def getMeaning(): String
  /** @returns a sequence of strings where each entry is a synonym of the current objects meaning. */
  def querySynonyms(): SafeArray[String]
}

object XMeaning {
  @scala.inline
  def apply(
    Meaning: String,
    acquire: () => Unit,
    getMeaning: () => String,
    queryInterface: `type` => js.Any,
    querySynonyms: () => SafeArray[String],
    release: () => Unit
  ): XMeaning = {
    val __obj = js.Dynamic.literal(Meaning = Meaning.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getMeaning = js.Any.fromFunction0(getMeaning), queryInterface = js.Any.fromFunction1(queryInterface), querySynonyms = js.Any.fromFunction0(querySynonyms), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMeaning]
  }
}

