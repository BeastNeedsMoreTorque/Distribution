package typings.mockAwsS3.mod

import typings.awsSdk.budgetsMod.Budget
import typings.awsSdk.budgetsMod.ClientConfiguration
import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mock-aws-s3", "Budgets")
@js.native
/**
  * Constructs a service object. This object has one method for each API operation.
  */
class Budgets () extends Array[Budget] {
  def this(options: ClientConfiguration) = this()
}

