package typings.pulumiKubernetes.outputMod.rbac.v1alpha1

import typings.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.rbacDotauthorizationDotk8sDotioSlashv1alpha1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RoleBindingList is a collection of RoleBindings Deprecated in v1.17 in favor of
  * rbac.authorization.k8s.io/v1 RoleBindingList, and will no longer be served in v1.20.
  */
trait RoleBindingList extends js.Object {
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: rbacDotauthorizationDotk8sDotioSlashv1alpha1
  /**
    * Items is a list of RoleBindings
    */
  val items: js.Array[RoleBinding]
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typings.pulumiKubernetes.pulumiKubernetesStrings.RoleBindingList
  /**
    * Standard object's metadata.
    */
  val metadata: ListMeta
}

object RoleBindingList {
  @scala.inline
  def apply(
    apiVersion: rbacDotauthorizationDotk8sDotioSlashv1alpha1,
    items: js.Array[RoleBinding],
    kind: typings.pulumiKubernetes.pulumiKubernetesStrings.RoleBindingList,
    metadata: ListMeta
  ): RoleBindingList = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleBindingList]
  }
}

