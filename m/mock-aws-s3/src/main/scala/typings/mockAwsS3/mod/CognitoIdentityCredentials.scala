package typings.mockAwsS3.mod

import typings.awsSdk.cognitoIdentityCredentialsMod.CognitoIdentityCredentials.CognitoIdentityOptions
import typings.awsSdk.configMod.ConfigurationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "CognitoIdentityCredentials")
@js.native
/**
  * Creates a new credentials object.
  */
class CognitoIdentityCredentials ()
  extends typings.awsSdk.mod.CognitoIdentityCredentials {
  /**
    * Creates a new credentials object with optional configuration.
    */
  def this(options: CognitoIdentityOptions) = this()
  def this(options: CognitoIdentityOptions, clientConfig: ConfigurationOptions) = this()
}

// Needed to expose interfaces on the class
@JSImport("mock-aws-s3", "CognitoIdentityCredentials")
@js.native
object CognitoIdentityCredentials extends js.Object

