package typings.amapJsApi.global.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Pixel")
@js.native
class Pixel protected ()
  extends typings.amapJsApi.AMap.Pixel {
  /**
    * 像素坐标，确定地图上的一个像素点
    * @param x 横轴坐标
    * @param y 纵轴坐标
    * @param round 是否四舍五入
    */
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, round: Boolean) = this()
}

