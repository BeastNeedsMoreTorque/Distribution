package typings.mockAwsS3.mod

import typings.awsSdk.chainableTemporaryCredentialsMod.ChainableTemporaryCredentials.ChainableTemporaryCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "ChainableTemporaryCredentials")
@js.native
/**
  * Creates a new temporary credentials object.
  */
class ChainableTemporaryCredentials ()
  extends typings.awsSdk.mod.ChainableTemporaryCredentials {
  def this(options: ChainableTemporaryCredentialsOptions) = this()
}

// Needed to expose interfaces on the class
@JSImport("mock-aws-s3", "ChainableTemporaryCredentials")
@js.native
object ChainableTemporaryCredentials extends js.Object

