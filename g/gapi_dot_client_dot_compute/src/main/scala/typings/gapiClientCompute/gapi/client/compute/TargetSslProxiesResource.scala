package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.AltFields
import typings.gapiClientCompute.anon.QuotaUserTargetSslProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetSslProxiesResource extends js.Object {
  /** Deletes the specified TargetSslProxy resource. */
  def delete(request: typings.gapiClientCompute.anon.TargetSslProxy): Request[Operation]
  /** Returns the specified TargetSslProxy resource. Get a list of available target SSL proxies by making a list() request. */
  def get(request: QuotaUserTargetSslProxy): Request[TargetSslProxy]
  /** Creates a TargetSslProxy resource in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation]
  /** Retrieves the list of TargetSslProxy resources available to the specified project. */
  def list(request: Alt): Request[TargetSslProxyList]
  /** Changes the BackendService for TargetSslProxy. */
  def setBackendService(request: typings.gapiClientCompute.anon.TargetSslProxy): Request[Operation]
  /** Changes the ProxyHeaderType for TargetSslProxy. */
  def setProxyHeader(request: typings.gapiClientCompute.anon.TargetSslProxy): Request[Operation]
  /** Changes SslCertificates for TargetSslProxy. */
  def setSslCertificates(request: typings.gapiClientCompute.anon.TargetSslProxy): Request[Operation]
}

object TargetSslProxiesResource {
  @scala.inline
  def apply(
    delete: typings.gapiClientCompute.anon.TargetSslProxy => Request[Operation],
    get: QuotaUserTargetSslProxy => Request[TargetSslProxy],
    insert: AltFields => Request[Operation],
    list: Alt => Request[TargetSslProxyList],
    setBackendService: typings.gapiClientCompute.anon.TargetSslProxy => Request[Operation],
    setProxyHeader: typings.gapiClientCompute.anon.TargetSslProxy => Request[Operation],
    setSslCertificates: typings.gapiClientCompute.anon.TargetSslProxy => Request[Operation]
  ): TargetSslProxiesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setBackendService = js.Any.fromFunction1(setBackendService), setProxyHeader = js.Any.fromFunction1(setProxyHeader), setSslCertificates = js.Any.fromFunction1(setSslCertificates))
    __obj.asInstanceOf[TargetSslProxiesResource]
  }
}

