package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GmailMultiProductAdBuilder[GmailMultiProductAd]
  extends AdWordsBuilder[GmailMultiProductAdBuilder[GmailImageAd]]
     with hasFinalUrlBuilder[GmailMultiProductAdBuilder[GmailImageAd]]
     with hasTrackingTemplateBuilder[GmailMultiProductAdBuilder[GmailImageAd]] {
  def withAdvertiser(advertiser: String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withContent(content: String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withDescription(description: String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withHeader(header: Media): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withHeadline(headline: String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withHeadlineColor(headlineColor: String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemButtonCallsToAction(itemCallsToAction: js.Array[String]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemButtonFinalMobileUrls(itemButtonFinalMobileUrls: js.Array[String]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemButtonFinalUrls(itemButtonFinalUrls: js.Array[String]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemButtonTrackingTemplates(itemButtonTrackingTemplates: js.Array[String]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemImages(itemImages: js.Array[Media]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withItemTitle(itemTitles: js.Array[String]): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withLogo(logo: Media): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withName(name: String): GmailMultiProductAdBuilder[GmailMultiProductAd]
  def withSubject(subject: String): GmailMultiProductAdBuilder[GmailMultiProductAd]
}

object GmailMultiProductAdBuilder {
  @scala.inline
  def apply[GmailMultiProductAd](
    build: () => AdWordsOperation[GmailMultiProductAdBuilder[GmailImageAd]],
    withAdvertiser: String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withContent: String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withCustomParameters: js.Object => GmailMultiProductAdBuilder[GmailImageAd],
    withDescription: String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withFinalUrl: String => GmailMultiProductAdBuilder[GmailImageAd],
    withHeader: Media => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withHeadline: String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withHeadlineColor: String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemButtonCallsToAction: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemButtonFinalMobileUrls: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemButtonFinalUrls: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemButtonTrackingTemplates: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemImages: js.Array[Media] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withItemTitle: js.Array[String] => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withLogo: Media => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withMobileFinalUrl: String => GmailMultiProductAdBuilder[GmailImageAd],
    withName: String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withSubject: String => GmailMultiProductAdBuilder[GmailMultiProductAd],
    withTrackingTemplate: String => GmailMultiProductAdBuilder[GmailImageAd]
  ): GmailMultiProductAdBuilder[GmailMultiProductAd] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), withAdvertiser = js.Any.fromFunction1(withAdvertiser), withContent = js.Any.fromFunction1(withContent), withCustomParameters = js.Any.fromFunction1(withCustomParameters), withDescription = js.Any.fromFunction1(withDescription), withFinalUrl = js.Any.fromFunction1(withFinalUrl), withHeader = js.Any.fromFunction1(withHeader), withHeadline = js.Any.fromFunction1(withHeadline), withHeadlineColor = js.Any.fromFunction1(withHeadlineColor), withItemButtonCallsToAction = js.Any.fromFunction1(withItemButtonCallsToAction), withItemButtonFinalMobileUrls = js.Any.fromFunction1(withItemButtonFinalMobileUrls), withItemButtonFinalUrls = js.Any.fromFunction1(withItemButtonFinalUrls), withItemButtonTrackingTemplates = js.Any.fromFunction1(withItemButtonTrackingTemplates), withItemImages = js.Any.fromFunction1(withItemImages), withItemTitle = js.Any.fromFunction1(withItemTitle), withLogo = js.Any.fromFunction1(withLogo), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl), withName = js.Any.fromFunction1(withName), withSubject = js.Any.fromFunction1(withSubject), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[GmailMultiProductAdBuilder[GmailMultiProductAd]]
  }
}

