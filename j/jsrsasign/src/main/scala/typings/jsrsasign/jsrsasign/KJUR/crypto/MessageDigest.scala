package typings.jsrsasign.jsrsasign.KJUR.crypto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MessageDigest class which is very similar to java.security.MessageDigest class
  * @description
  * Currently this supports following algorithm and providers combination:
  * - md5 - cryptojs
  * - sha1 - cryptojs
  * - sha224 - cryptojs
  * - sha256 - cryptojs
  * - sha384 - cryptojs
  * - sha512 - cryptojs
  * - ripemd160 - cryptojs
  * - sha256 - sjcl (NEW from crypto.js 1.0.4)
  *
  * @example
  * // CryptoJS provider sample
  * var md = new KJUR.crypto.MessageDigest({alg: "sha1", prov: "cryptojs"});
  * md.updateString('aaa')
  * var mdHex = md.digest()
  *
  * // SJCL(Stanford JavaScript Crypto Library) provider sample
  * var md = new KJUR.crypto.MessageDigest({alg: "sha256", prov: "sjcl"}); // sjcl supports sha256 only
  * md.updateString('aaa')
  * var mdHex = md.digest()
  *
  * // HASHLENGTH property
  * KJUR.crypto.MessageDigest.HASHLENGTH['sha1'] → 20
  * KJUR.crypto.MessageDigest.HASHLENGTH['sha512'] → 64
  */
trait MessageDigest extends js.Object {
  /**
    * completes hash calculation and returns hash result
    * @description
    * @example
    * md.digest()
    */
  def digest(): Unit
  /**
    * performs final update on the digest using hexadecimal string, then completes the digest computation
    * @param hex hexadecimal string to final update
    * @description
    * @example
    * md.digestHex('0f2abd')
    */
  def digestHex(hex: String): Unit
  /**
    * performs final update on the digest using string, then completes the digest computation
    * @param str string to final update
    * @description
    * @example
    * md.digestString('aaa')
    */
  def digestString(str: String): Unit
  /**
    * set hash algorithm and provider
    * @param alg hash algorithm name
    * @param prov provider name
    * @description
    * This methods set an algorithm and a cryptographic provider.
    * Here is acceptable algorithm names ignoring cases and hyphens:
    * - MD5
    * - SHA1
    * - SHA224
    * - SHA256
    * - SHA384
    * - SHA512
    * - RIPEMD160
    * NOTE: Since jsrsasign 6.2.0 crypto 1.1.10, this method ignores
    * upper or lower cases. Also any hyphens (i.e. "-") will be ignored
    * so that "SHA1" or "SHA-1" will be acceptable.
    * @example
    * // for SHA1
    * md.setAlgAndProvider('sha1', 'cryptojs');
    * md.setAlgAndProvider('SHA1');
    * // for RIPEMD160
    * md.setAlgAndProvider('ripemd160', 'cryptojs');
    */
  def setAlgAndProvider(alg: String, prov: String): Unit
  /**
    * update digest by specified hexadecimal string
    * @param hex hexadecimal string to update
    * @description
    * @example
    * md.updateHex('0afe36');
    */
  def updateHex(hex: String): Unit
  /**
    * update digest by specified string
    * @param str string to update
    * @description
    * @example
    * md.updateString('New York');
    */
  def updateString(str: String): Unit
}

object MessageDigest {
  @scala.inline
  def apply(
    digest: () => Unit,
    digestHex: String => Unit,
    digestString: String => Unit,
    setAlgAndProvider: (String, String) => Unit,
    updateHex: String => Unit,
    updateString: String => Unit
  ): MessageDigest = {
    val __obj = js.Dynamic.literal(digest = js.Any.fromFunction0(digest), digestHex = js.Any.fromFunction1(digestHex), digestString = js.Any.fromFunction1(digestString), setAlgAndProvider = js.Any.fromFunction2(setAlgAndProvider), updateHex = js.Any.fromFunction1(updateHex), updateString = js.Any.fromFunction1(updateString))
    __obj.asInstanceOf[MessageDigest]
  }
}

