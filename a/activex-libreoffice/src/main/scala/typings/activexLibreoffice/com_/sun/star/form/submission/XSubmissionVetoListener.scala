package typings.activexLibreoffice.com_.sun.star.form.submission

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is implement by components which want to observe (and probably veto) the submission of data.
  * @see XSubmission
  */
trait XSubmissionVetoListener extends XEventListener {
  /**
    * is invoked when a component, at which the listener has been registered, is about to submit its data.
    * @param event The submission event. The {@link com.sun.star.lang.EventObject.Source} member of the structure describes the component which is about to su
    * @throws com::sun::star::util::VetoException when the submission is vetoed. {@link com.sun.star.uno.Exception.Message} should contain a justification for
    */
  def submitting(event: EventObject): Unit
}

object XSubmissionVetoListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    submitting: EventObject => Unit
  ): XSubmissionVetoListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), submitting = js.Any.fromFunction1(submitting))
    __obj.asInstanceOf[XSubmissionVetoListener]
  }
}

