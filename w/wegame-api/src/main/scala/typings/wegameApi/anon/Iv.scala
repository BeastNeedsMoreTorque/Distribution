package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iv extends js.Object {
  /**
    * 包括敏感数据在内的完整用户信息的加密数据，详细见加密数据解密算法
    */
  var encryptedData: String
  /**
    * 加密算法的初始向量
    */
  var iv: String
}

object Iv {
  @scala.inline
  def apply(encryptedData: String, iv: String): Iv = {
    val __obj = js.Dynamic.literal(encryptedData = encryptedData.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iv]
  }
}

