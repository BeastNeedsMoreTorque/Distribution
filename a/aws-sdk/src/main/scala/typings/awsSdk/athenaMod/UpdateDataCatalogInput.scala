package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDataCatalogInput extends js.Object {
  /**
    * New or modified text that describes the data catalog.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * The name of the data catalog to update. The catalog name must be unique for the AWS account and can use a maximum of 128 alphanumeric, underscore, at sign, or hyphen characters.
    */
  var Name: CatalogNameString = js.native
  /**
    * Specifies the Lambda function or functions to use for updating the data catalog. This is a mapping whose values depend on the catalog type.    For the HIVE data catalog type, use the following syntax. The metadata-function parameter is required. The sdk-version parameter is optional and defaults to the currently supported version.  metadata-function=lambda_arn, sdk-version=version_number     For the LAMBDA data catalog type, use one of the following sets of required parameters, but not both.   If you have one Lambda function that processes metadata and another for reading the actual data, use the following syntax. Both parameters are required.  metadata-function=lambda_arn, record-function=lambda_arn      If you have a composite Lambda function that processes both metadata and data, use the following syntax to specify your Lambda function.  function=lambda_arn       The GLUE type has no parameters.  
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
  /**
    * Specifies the type of data catalog to update. Specify LAMBDA for a federated catalog, GLUE for AWS Glue Catalog, or HIVE for an external hive metastore.
    */
  var Type: DataCatalogType = js.native
}

object UpdateDataCatalogInput {
  @scala.inline
  def apply(
    Name: CatalogNameString,
    Type: DataCatalogType,
    Description: DescriptionString = null,
    Parameters: ParametersMap = null
  ): UpdateDataCatalogInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataCatalogInput]
  }
}

