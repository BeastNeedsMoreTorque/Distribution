package typings.googleapis.alphaMod.computeAlpha

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/compute/alpha", "compute_alpha.Resource$Regioninstancegroups")
@js.native
class ResourceRegioninstancegroups protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * compute.regionInstanceGroups.get
    * @desc Returns the specified instance group resource.
    * @alias compute.regionInstanceGroups.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroup Name of the instance group resource to return.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaInstanceGroup] = js.native
  def get(callback: BodyResponseCallback[SchemaInstanceGroup]): Unit = js.native
  def get(params: ParamsResourceRegioninstancegroupsGet): GaxiosPromise[SchemaInstanceGroup] = js.native
  def get(params: ParamsResourceRegioninstancegroupsGet, callback: BodyResponseCallback[SchemaInstanceGroup]): Unit = js.native
  def get(
    params: ParamsResourceRegioninstancegroupsGet,
    options: BodyResponseCallback[SchemaInstanceGroup],
    callback: BodyResponseCallback[SchemaInstanceGroup]
  ): Unit = js.native
  def get(params: ParamsResourceRegioninstancegroupsGet, options: MethodOptions): GaxiosPromise[SchemaInstanceGroup] = js.native
  def get(
    params: ParamsResourceRegioninstancegroupsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaInstanceGroup]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroups.list
    * @desc Retrieves the list of instance group resources contained within the
    * specified region.
    * @alias compute.regionInstanceGroups.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaRegionInstanceGroupList] = js.native
  def list(callback: BodyResponseCallback[SchemaRegionInstanceGroupList]): Unit = js.native
  def list(params: ParamsResourceRegioninstancegroupsList): GaxiosPromise[SchemaRegionInstanceGroupList] = js.native
  def list(
    params: ParamsResourceRegioninstancegroupsList,
    callback: BodyResponseCallback[SchemaRegionInstanceGroupList]
  ): Unit = js.native
  def list(
    params: ParamsResourceRegioninstancegroupsList,
    options: BodyResponseCallback[SchemaRegionInstanceGroupList],
    callback: BodyResponseCallback[SchemaRegionInstanceGroupList]
  ): Unit = js.native
  def list(params: ParamsResourceRegioninstancegroupsList, options: MethodOptions): GaxiosPromise[SchemaRegionInstanceGroupList] = js.native
  def list(
    params: ParamsResourceRegioninstancegroupsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRegionInstanceGroupList]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroups.listInstances
    * @desc Lists the instances in the specified instance group and displays
    * information about the named ports. Depending on the specified options,
    * this method can list all instances or only the instances that are
    * running.
    * @alias compute.regionInstanceGroups.listInstances
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter A filter expression that filters resources listed in the response. The expression must specify the field name, a comparison operator, and the value that you want to use for filtering. The value must be a string, a number, or a boolean. The comparison operator must be either =, !=, >, or <.  For example, if you are filtering Compute Engine instances, you can exclude instances named example-instance by specifying name != example-instance.  You can also filter nested fields. For example, you could specify scheduling.automaticRestart = false to include instances only if they are not scheduled for automatic restarts. You can use filtering on nested fields to filter based on resource labels.  To filter on multiple expressions, provide each separate expression within parentheses. For example, (scheduling.automaticRestart = true) (cpuPlatform = "Intel Skylake"). By default, each expression is an AND expression. However, you can include AND and OR expressions explicitly. For example, (cpuPlatform = "Intel Skylake") OR (cpuPlatform = "Intel Broadwell") AND (scheduling.automaticRestart = true).
    * @param {string} params.instanceGroup Name of the regional instance group for which we want to list the instances.
    * @param {integer=} params.maxResults The maximum number of results per page that should be returned. If the number of available results is larger than maxResults, Compute Engine returns a nextPageToken that can be used to get the next page of results in subsequent list requests. Acceptable values are 0 to 500, inclusive. (Default: 500)
    * @param {string=} params.orderBy Sorts list results by a certain order. By default, results are returned in alphanumerical order based on the resource name.  You can also sort results in descending order based on the creation timestamp using orderBy="creationTimestamp desc". This sorts results based on the creationTimestamp field in reverse chronological order (newest result first). Use this to sort resources like operations so that the newest operation is returned first.  Currently, only sorting by name or creationTimestamp desc is supported.
    * @param {string=} params.pageToken Specifies a page token to use. Set pageToken to the nextPageToken returned by a previous list request to get the next page of results.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {().RegionInstanceGroupsListInstancesRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listInstances(): GaxiosPromise[SchemaRegionInstanceGroupsListInstances] = js.native
  def listInstances(callback: BodyResponseCallback[SchemaRegionInstanceGroupsListInstances]): Unit = js.native
  def listInstances(params: ParamsResourceRegioninstancegroupsListinstances): GaxiosPromise[SchemaRegionInstanceGroupsListInstances] = js.native
  def listInstances(
    params: ParamsResourceRegioninstancegroupsListinstances,
    callback: BodyResponseCallback[SchemaRegionInstanceGroupsListInstances]
  ): Unit = js.native
  def listInstances(
    params: ParamsResourceRegioninstancegroupsListinstances,
    options: BodyResponseCallback[SchemaRegionInstanceGroupsListInstances],
    callback: BodyResponseCallback[SchemaRegionInstanceGroupsListInstances]
  ): Unit = js.native
  def listInstances(params: ParamsResourceRegioninstancegroupsListinstances, options: MethodOptions): GaxiosPromise[SchemaRegionInstanceGroupsListInstances] = js.native
  def listInstances(
    params: ParamsResourceRegioninstancegroupsListinstances,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaRegionInstanceGroupsListInstances]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroups.setNamedPorts
    * @desc Sets the named ports for the specified regional instance group.
    * @alias compute.regionInstanceGroups.setNamedPorts
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.instanceGroup The name of the regional instance group where the named ports are updated.
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region Name of the region scoping this request.
    * @param {string=} params.requestId An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed.  For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments.  The request ID must be a valid UUID with the exception that zero UUID is not supported (00000000-0000-0000-0000-000000000000).
    * @param {().RegionInstanceGroupsSetNamedPortsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setNamedPorts(): GaxiosPromise[SchemaOperation] = js.native
  def setNamedPorts(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def setNamedPorts(params: ParamsResourceRegioninstancegroupsSetnamedports): GaxiosPromise[SchemaOperation] = js.native
  def setNamedPorts(
    params: ParamsResourceRegioninstancegroupsSetnamedports,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setNamedPorts(
    params: ParamsResourceRegioninstancegroupsSetnamedports,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def setNamedPorts(params: ParamsResourceRegioninstancegroupsSetnamedports, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def setNamedPorts(
    params: ParamsResourceRegioninstancegroupsSetnamedports,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * compute.regionInstanceGroups.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource.
    * @alias compute.regionInstanceGroups.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.project Project ID for this request.
    * @param {string} params.region The name of the region for this request.
    * @param {string} params.resource_ Name or id of the resource for this request.
    * @param {().TestPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[SchemaTestPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsResourceRegioninstancegroupsTestiampermissions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceRegioninstancegroupsTestiampermissions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsResourceRegioninstancegroupsTestiampermissions,
    options: BodyResponseCallback[SchemaTestPermissionsResponse],
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsResourceRegioninstancegroupsTestiampermissions, options: MethodOptions): GaxiosPromise[SchemaTestPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsResourceRegioninstancegroupsTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTestPermissionsResponse]
  ): Unit = js.native
}

