package typings.jsrsasign.global.jsrsasign.KJUR.asn1.x509

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DistributionPointName ASN.1 structure class
  * @description
  * ```
  * DistributionPoint ::= SEQUENCE {
  *      distributionPoint       [0]     DistributionPointName OPTIONAL,
  *      reasons                 [1]     ReasonFlags OPTIONAL,
  *      cRLIssuer               [2]     GeneralNames OPTIONAL }
  *
  * DistributionPointName ::= CHOICE {
  *      fullName                [0]     GeneralNames,
  *      nameRelativeToCRLIssuer [1]     RelativeDistinguishedName }
  *
  * ReasonFlags ::= BIT STRING {
  *      unused                  (0),
  *      keyCompromise           (1),
  *      cACompromise            (2),
  *      affiliationChanged      (3),
  *      superseded              (4),
  *      cessationOfOperation    (5),
  *      certificateHold         (6),
  *      privilegeWithdrawn      (7),
  *      aACompromise            (8) }
  * ```
  */
@JSGlobal("jsrsasign.KJUR.asn1.x509.DistributionPointName")
@js.native
class DistributionPointName protected ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.DistributionPointName {
  def this(gnOrRdn: typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNames) = this()
  /* CompleteClass */
  override def getEncodedHex(): String = js.native
}

