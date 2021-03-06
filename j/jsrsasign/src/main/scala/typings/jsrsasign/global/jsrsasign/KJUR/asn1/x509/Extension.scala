package typings.jsrsasign.global.jsrsasign.KJUR.asn1.x509

import typings.jsrsasign.anon.CriticalBoolean
import typings.jsrsasign.jsrsasignStrings.authorityinfoaccess
import typings.jsrsasign.jsrsasignStrings.authoritykeyidentifier
import typings.jsrsasign.jsrsasignStrings.basicconstraints
import typings.jsrsasign.jsrsasignStrings.crldistributionpoints
import typings.jsrsasign.jsrsasignStrings.extkeyusage
import typings.jsrsasign.jsrsasignStrings.issueraltname
import typings.jsrsasign.jsrsasignStrings.keyusage
import typings.jsrsasign.jsrsasignStrings.subjectaltname
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * base Extension ASN.1 structure class
  * @param params associative array of parameters (ex. {'critical': true})
  * @example
  * ```
  * // Extension  ::=  SEQUENCE  {
  * //     extnID      OBJECT IDENTIFIER,
  * //     critical    BOOLEAN DEFAULT FALSE,
  * //     extnValue   OCTET STRING  }
  * ```
  */
@JSGlobal("jsrsasign.KJUR.asn1.x509.Extension")
@js.native
class Extension ()
  extends typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension {
  def this(params: CriticalBoolean) = this()
  /** hexadecimal string of ASN.1 TLV length(L) */
  /* CompleteClass */
  override var hL: String = js.native
  /** hexadecimal string of ASN.1 TLV tag(T) */
  /* CompleteClass */
  override var hT: String = js.native
  /** hexadecimal string of ASN.1 TLV */
  /* CompleteClass */
  override var hTLV: String = js.native
  /** hexadecimal string of ASN.1 TLV value(V) */
  /* CompleteClass */
  override var hV: String = js.native
  /** flag whether internal data was changed */
  /* CompleteClass */
  override var isModified: String = js.native
  /**
    * get hexadecimal string of ASN.1 TLV bytes
    * @return hexadecimal string of ASN.1 TLV
    */
  /* CompleteClass */
  override def getEncodedHex(): String = js.native
  /* CompleteClass */
  override def getFreshValueHex(): String = js.native
  /**
    * get hexadecimal ASN.1 TLV length(L) bytes from TLV value(V)
    * @return hexadecimal string of ASN.1 TLV length(L)
    */
  /* CompleteClass */
  override def getLengthHexFromValue(): String = js.native
  /**
    * get hexadecimal string of ASN.1 TLV value(V) bytes
    * @return hexadecimal string of ASN.1 TLV value(V) bytes
    */
  /* CompleteClass */
  override def getValueHex(): String = js.native
}

/* static members */
@JSGlobal("jsrsasign.KJUR.asn1.x509.Extension")
@js.native
object Extension extends js.Object {
  @JSName("appendByNameToArray")
  def appendByNameToArray_authorityinfoaccess(
    name: authorityinfoaccess,
    extParams: typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension,
    a: js.Array[_]
  ): Unit = js.native
  @JSName("appendByNameToArray")
  def appendByNameToArray_authoritykeyidentifier(
    name: authoritykeyidentifier,
    extParams: typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension,
    a: js.Array[_]
  ): Unit = js.native
  /**
    * append X.509v3 extension to any specified array
    * @param name X.509v3 extension name
    * @param extParams associative array of extension parameters
    * @param a array to add specified extension
    * @see KJUR.asn1.x509.Extension
    * @description
    * This static function add a X.509v3 extension specified by name and extParams to
    * array 'a' so that 'a' will be an array of X.509v3 extension objects.
    * @example
    * var a = new Array();
    * KJUR.asn1.x509.Extension.appendByNameToArray("BasicConstraints", {'cA':true, 'critical': true}, a);
    * KJUR.asn1.x509.Extension.appendByNameToArray("KeyUsage", {'bin':'11'}, a);
    */
  @JSName("appendByNameToArray")
  def appendByNameToArray_basicconstraints(
    name: basicconstraints,
    extParams: typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension,
    a: js.Array[_]
  ): Unit = js.native
  @JSName("appendByNameToArray")
  def appendByNameToArray_crldistributionpoints(
    name: crldistributionpoints,
    extParams: typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension,
    a: js.Array[_]
  ): Unit = js.native
  @JSName("appendByNameToArray")
  def appendByNameToArray_extkeyusage(name: extkeyusage, extParams: typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension, a: js.Array[_]): Unit = js.native
  @JSName("appendByNameToArray")
  def appendByNameToArray_issueraltname(
    name: issueraltname,
    extParams: typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension,
    a: js.Array[_]
  ): Unit = js.native
  @JSName("appendByNameToArray")
  def appendByNameToArray_keyusage(name: keyusage, extParams: typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension, a: js.Array[_]): Unit = js.native
  @JSName("appendByNameToArray")
  def appendByNameToArray_subjectaltname(
    name: subjectaltname,
    extParams: typings.jsrsasign.jsrsasign.KJUR.asn1.x509.Extension,
    a: js.Array[_]
  ): Unit = js.native
}

