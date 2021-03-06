package typings.amapJsSdk.global.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 地物对象的像素尺寸
  */
@JSGlobal("AMap.Size")
@js.native
class Size protected ()
  extends typings.amapJsSdk.AMap.Size {
  /**
    * 构造尺寸对象
    * @param width 宽度，单位：像素
    * @param height 高度，单位：像素
    */
  def this(width: Double, height: Double) = this()
  /**
    * 获得高度
    */
  /* CompleteClass */
  override def getHeight(): Double = js.native
  /**
    * 获得宽度
    */
  /* CompleteClass */
  override def getWidth(): Double = js.native
}

