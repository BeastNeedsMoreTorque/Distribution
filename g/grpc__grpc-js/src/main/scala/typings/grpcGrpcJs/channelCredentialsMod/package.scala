package typings.grpcGrpcJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object channelCredentialsMod {
  type CheckServerIdentityCallback = js.Function2[
    /* hostname */ java.lang.String, 
    /* cert */ typings.grpcGrpcJs.channelCredentialsMod.Certificate, 
    js.UndefOr[typings.std.Error]
  ]
}
