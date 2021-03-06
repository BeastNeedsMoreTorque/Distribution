package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.AccountUserRoleOnly
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRolesResource extends js.Object {
  /** Deletes an existing user role. */
  def delete(request: Fields): Request[Unit]
  /** Gets one user role by ID. */
  def get(request: Fields): Request[UserRole]
  /** Inserts a new user role. */
  def insert(request: Key): Request[UserRole]
  /** Retrieves a list of user roles, possibly filtered. This method supports paging. */
  def list(request: AccountUserRoleOnly): Request[UserRolesListResponse]
  /** Updates an existing user role. This method supports patch semantics. */
  def patch(request: Fields): Request[UserRole]
  /** Updates an existing user role. */
  def update(request: Key): Request[UserRole]
}

object UserRolesResource {
  @scala.inline
  def apply(
    delete: Fields => Request[Unit],
    get: Fields => Request[UserRole],
    insert: Key => Request[UserRole],
    list: AccountUserRoleOnly => Request[UserRolesListResponse],
    patch: Fields => Request[UserRole],
    update: Key => Request[UserRole]
  ): UserRolesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[UserRolesResource]
  }
}

