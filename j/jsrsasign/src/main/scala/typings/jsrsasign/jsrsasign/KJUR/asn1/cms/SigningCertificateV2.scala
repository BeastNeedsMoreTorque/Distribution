package typings.jsrsasign.jsrsasign.KJUR.asn1.cms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * class for CMS SigningCertificateV2 attribute
  * @param params associative array of parameters
  * @description
  * ```
  * oid-signingCertificateV2 = 1.2.840.113549.1.9.16.2.47
  * Attribute ::= SEQUENCE {
  *    type               OBJECT IDENTIFIER,
  *    values             AttributeSetValue }
  * AttributeSetValue ::= SET OF ANY
  * SigningCertificateV2 ::=  SEQUENCE {
  *    certs        SEQUENCE OF ESSCertIDv2,
  *    policies     SEQUENCE OF PolicyInformation OPTIONAL }
  * ESSCertIDv2 ::=  SEQUENCE {
  *    hashAlgorithm           AlgorithmIdentifier
  *                            DEFAULT {algorithm id-sha256},
  *    certHash                Hash,
  *    issuerSerial            IssuerSerial OPTIONAL }
  * Hash ::= OCTET STRING
  * IssuerSerial ::= SEQUENCE {
  *    issuer                  GeneralNames,
  *    serialNumber            CertificateSerialNumber }
  * ```
  * @example
  * // hash algorithm is sha256 by default:
  * o = new KJUR.asn1.cms.SigningCertificateV2({array: [certPEM]});
  * o = new KJUR.asn1.cms.SigningCertificateV2({array: [certPEM],
  *                                             hashAlg: 'sha512'});
  */
trait SigningCertificateV2 extends Attribute {
  def setCerts(listPEM: js.Array[String], hashAlg: String): Unit
}

object SigningCertificateV2 {
  @scala.inline
  def apply(
    getEncodedHex: () => String,
    getFreshValueHex: () => String,
    getLengthHexFromValue: () => String,
    getValueHex: () => String,
    hL: String,
    hT: String,
    hTLV: String,
    hV: String,
    isModified: String,
    setCerts: (js.Array[String], String) => Unit
  ): SigningCertificateV2 = {
    val __obj = js.Dynamic.literal(getEncodedHex = js.Any.fromFunction0(getEncodedHex), getFreshValueHex = js.Any.fromFunction0(getFreshValueHex), getLengthHexFromValue = js.Any.fromFunction0(getLengthHexFromValue), getValueHex = js.Any.fromFunction0(getValueHex), hL = hL.asInstanceOf[js.Any], hT = hT.asInstanceOf[js.Any], hTLV = hTLV.asInstanceOf[js.Any], hV = hV.asInstanceOf[js.Any], isModified = isModified.asInstanceOf[js.Any], setCerts = js.Any.fromFunction2(setCerts))
    __obj.asInstanceOf[SigningCertificateV2]
  }
}

