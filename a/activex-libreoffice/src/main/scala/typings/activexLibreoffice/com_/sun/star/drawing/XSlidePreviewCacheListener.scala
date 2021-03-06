package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Listener for asynchronous preview creations. Called when a slide preview has been created that was previously requested via a call to {@link
  * XSlidePreviewCache.getSlidePreview()} . The implementor may then call getSlidePreview() a second time to get the up-to-date version of the preview.
  */
trait XSlidePreviewCacheListener extends js.Object {
  /**
    * Called by a {@link XSlidePreviewCache} object when a preview has been created for the slide with the given index.
    * @param nSlideIndex The index of the slide for which a new preview has been created.
    */
  def notifyPreviewCreation(nSlideIndex: Double): Unit
}

object XSlidePreviewCacheListener {
  @scala.inline
  def apply(notifyPreviewCreation: Double => Unit): XSlidePreviewCacheListener = {
    val __obj = js.Dynamic.literal(notifyPreviewCreation = js.Any.fromFunction1(notifyPreviewCreation))
    __obj.asInstanceOf[XSlidePreviewCacheListener]
  }
}

