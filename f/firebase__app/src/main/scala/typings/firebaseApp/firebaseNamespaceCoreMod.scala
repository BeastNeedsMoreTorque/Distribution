package typings.firebaseApp

import org.scalablytyped.runtime.Instantiable3
import typings.firebaseApp.firebaseAppLiteMod.FirebaseAppLiteImpl
import typings.firebaseApp.firebaseAppMod.FirebaseAppImpl
import typings.firebaseAppTypes.mod.FirebaseAppConfig
import typings.firebaseAppTypes.mod.FirebaseOptions
import typings.firebaseAppTypes.privateMod.FirebaseNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/app/dist/packages/app/src/firebaseNamespaceCore", JSImport.Namespace)
@js.native
object firebaseNamespaceCoreMod extends js.Object {
  def createFirebaseNamespaceCore(
    firebaseAppImpl: Instantiable3[
      /* options */ FirebaseOptions, 
      /* config */ FirebaseAppConfig, 
      /* firebase_ */ FirebaseNamespace, 
      FirebaseAppImpl | FirebaseAppLiteImpl
    ]
  ): typings.firebaseAppTypes.mod.FirebaseNamespace = js.native
}

