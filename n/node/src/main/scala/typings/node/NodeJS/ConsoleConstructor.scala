package typings.node.NodeJS

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.node.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsoleConstructor
  extends Instantiable1[(/* options */ ConsoleConstructorOptions) | (/* stdout */ WritableStream), Console]
     with Instantiable2[/* stdout */ WritableStream, /* stderr */ WritableStream, Console]
     with Instantiable3[
      /* stdout */ WritableStream, 
      /* stderr */ WritableStream, 
      /* ignoreErrors */ Boolean, 
      Console
    ]

