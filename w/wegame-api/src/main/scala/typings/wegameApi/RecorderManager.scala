package typings.wegameApi

import typings.wegameApi.anon.AudioSource
import typings.wegameApi.anon.ErrMsg
import typings.wegameApi.anon.FrameBuffer
import typings.wegameApi.anon.TempFilePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecorderManager extends js.Object {
  /**
    * 监听录音错误事件
    */
  def onError(callback: js.Function1[/* res */ ErrMsg, Unit]): Unit
  /**
    * 监听已录制完指定帧大小的文件事件。如果设置了 frameSize，则会回调此事件。
    * @param callback.res.frameBuffer 录音分片数据
    * @param callback.res.isLastFrame 当前帧是否正常录音结束前的最后一帧
    */
  def onFrameRecorded(callback: js.Function1[/* res */ FrameBuffer, Unit]): Unit
  /**
    * 监听录音暂停事件
    */
  def onPause(callback: js.Function0[Unit]): Unit
  /**
    * 监听录音继续事件
    */
  def onResume(callback: js.Function0[Unit]): Unit
  /**
    * 监听录音开始事件
    */
  def onStart(callback: js.Function0[Unit]): Unit
  /**
    * 监听录音结束事件
    * @param callback.res.tempFilePath 录音文件的临时路径
    */
  def onStop(callback: js.Function1[/* res */ TempFilePath, Unit]): Unit
  /**
    * 暂停录音
    */
  def pause(): Unit
  /**
    * 继续录音
    */
  def resume(): Unit
  /**
    * 开始录音
    */
  def start(param: AudioSource): Unit
  /**
    * 停止录音
    */
  def stop(): Unit
}

object RecorderManager {
  @scala.inline
  def apply(
    onError: js.Function1[/* res */ ErrMsg, Unit] => Unit,
    onFrameRecorded: js.Function1[/* res */ FrameBuffer, Unit] => Unit,
    onPause: js.Function0[Unit] => Unit,
    onResume: js.Function0[Unit] => Unit,
    onStart: js.Function0[Unit] => Unit,
    onStop: js.Function1[/* res */ TempFilePath, Unit] => Unit,
    pause: () => Unit,
    resume: () => Unit,
    start: AudioSource => Unit,
    stop: () => Unit
  ): RecorderManager = {
    val __obj = js.Dynamic.literal(onError = js.Any.fromFunction1(onError), onFrameRecorded = js.Any.fromFunction1(onFrameRecorded), onPause = js.Any.fromFunction1(onPause), onResume = js.Any.fromFunction1(onResume), onStart = js.Any.fromFunction1(onStart), onStop = js.Any.fromFunction1(onStop), pause = js.Any.fromFunction0(pause), resume = js.Any.fromFunction0(resume), start = js.Any.fromFunction1(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[RecorderManager]
  }
}

