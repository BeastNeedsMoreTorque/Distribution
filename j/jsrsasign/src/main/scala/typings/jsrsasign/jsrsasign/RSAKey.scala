package typings.jsrsasign.jsrsasign

import typings.jsrsasign.jsrsasignNumbers.`0`
import typings.jsrsasign.jsrsasignNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Tom Wu's RSA Key class and extension */
trait RSAKey extends js.Object {
  /**
    * read an ASN.1 hexadecimal string of X.509 RSA public key certificate
    * @param h hexadecimal string of X.509 RSA public key certificate
    * @param nthPKI nth index of publicKeyInfo. (DEFAULT: 6 for X509v3)
    */
  def readCertPubKeyHex(h: String, nthPKI: Double): Unit
  /**
    * read an ASN.1 hexadecimal string of PKCS#1/5 plain RSA private key
    * @param h hexadecimal string of PKCS#1/5 plain RSA private key
    */
  def readPKCS5PrvKeyHex(h: String): Unit
  /**
    * read an ASN.1 hexadecimal string of PKCS#5 RSA public key
    * @param h hexadecimal string of PKCS#5 public key
    */
  def readPKCS5PubKeyHex(h: String): Unit
  /**
    * read an ASN.1 hexadecimal string of PKCS#8 plain RSA private key
    * @param h hexadecimal string of PKCS#8 plain RSA private key
    */
  def readPKCS8PrvKeyHex(h: String): Unit
  /**
    * read an ASN.1 hexadecimal string of PKCS#8 RSA public key
    * @param h hexadecimal string of PKCS#8 public key
    */
  def readPKCS8PubKeyHex(h: String): Unit
  /**
    * read PKCS#1 private key from a string
    * @param keyPEM string of PKCS#1 private key.
    */
  def readPrivateKeyFromPEMString(keyPEM: String): Unit
  /**
    * verifies a sigature for a message string with RSA public key.
    * @param sMsg message string to be verified.
    * @param hSig hexadecimal string of signature.
    *             non-hexadecimal characters including new lines will be ignored.
    * @return returns 1 if valid, otherwise 0
    */
  def verify(sMsg: String, hSig: String): `0` | `1`
}

object RSAKey {
  @scala.inline
  def apply(
    readCertPubKeyHex: (String, Double) => Unit,
    readPKCS5PrvKeyHex: String => Unit,
    readPKCS5PubKeyHex: String => Unit,
    readPKCS8PrvKeyHex: String => Unit,
    readPKCS8PubKeyHex: String => Unit,
    readPrivateKeyFromPEMString: String => Unit,
    verify: (String, String) => `0` | `1`
  ): RSAKey = {
    val __obj = js.Dynamic.literal(readCertPubKeyHex = js.Any.fromFunction2(readCertPubKeyHex), readPKCS5PrvKeyHex = js.Any.fromFunction1(readPKCS5PrvKeyHex), readPKCS5PubKeyHex = js.Any.fromFunction1(readPKCS5PubKeyHex), readPKCS8PrvKeyHex = js.Any.fromFunction1(readPKCS8PrvKeyHex), readPKCS8PubKeyHex = js.Any.fromFunction1(readPKCS8PubKeyHex), readPrivateKeyFromPEMString = js.Any.fromFunction1(readPrivateKeyFromPEMString), verify = js.Any.fromFunction2(verify))
    __obj.asInstanceOf[RSAKey]
  }
}

