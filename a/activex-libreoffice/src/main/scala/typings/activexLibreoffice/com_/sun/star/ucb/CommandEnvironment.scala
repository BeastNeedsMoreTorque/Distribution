package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandEnvironment extends XCommandEnvironment {
  /**
    * Constructor.
    * @param InteractionHandler the interaction handler instance that will be returned by this service's implementation of XCommandEnvironemt::getInteractionH
    * @param ProgressHandler the progress handler instance that will be returned by this service's implementation of XCommandEnvironemt::getProgressHandler()
    */
  def create(InteractionHandler: XInteractionHandler, ProgressHandler: XProgressHandler): Unit
}

object CommandEnvironment {
  @scala.inline
  def apply(
    InteractionHandler: XInteractionHandler,
    ProgressHandler: XProgressHandler,
    acquire: () => Unit,
    create: (XInteractionHandler, XProgressHandler) => Unit,
    getInteractionHandler: () => XInteractionHandler,
    getProgressHandler: () => XProgressHandler,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): CommandEnvironment = {
    val __obj = js.Dynamic.literal(InteractionHandler = InteractionHandler.asInstanceOf[js.Any], ProgressHandler = ProgressHandler.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), create = js.Any.fromFunction2(create), getInteractionHandler = js.Any.fromFunction0(getInteractionHandler), getProgressHandler = js.Any.fromFunction0(getProgressHandler), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[CommandEnvironment]
  }
}

