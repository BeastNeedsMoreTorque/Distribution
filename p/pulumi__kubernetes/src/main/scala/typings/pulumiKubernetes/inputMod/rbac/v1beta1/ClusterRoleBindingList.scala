package typings.pulumiKubernetes.inputMod.rbac.v1beta1

import typings.pulumiKubernetes.inputMod.meta.v1.ListMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ClusterRoleBindingList is a collection of ClusterRoleBindings. Deprecated in v1.17 in favor
  * of rbac.authorization.k8s.io/v1 ClusterRoleBindingList, and will no longer be served in
  * v1.20.
  */
trait ClusterRoleBindingList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[rbacDotauthorizationDotk8sDotioSlashv1beta1]] = js.undefined
  /**
    * Items is a list of ClusterRoleBindings
    */
  var items: Input[js.Array[Input[ClusterRoleBinding]]]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleBindingList]] = js.undefined
  /**
    * Standard object's metadata.
    */
  var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
}

object ClusterRoleBindingList {
  @scala.inline
  def apply(
    items: Input[js.Array[Input[ClusterRoleBinding]]],
    apiVersion: Input[rbacDotauthorizationDotk8sDotioSlashv1beta1] = null,
    kind: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.ClusterRoleBindingList] = null,
    metadata: Input[ListMeta] = null
  ): ClusterRoleBindingList = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (apiVersion != null) __obj.updateDynamic("apiVersion")(apiVersion.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterRoleBindingList]
  }
}

