package typings.gapiClientDrive.gapi.client.drive

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDrive.anon.AltCommentId
import typings.gapiClientDrive.anon.CommentId
import typings.gapiClientDrive.anon.CommentIdFields
import typings.gapiClientDrive.anon.FileIdIncludeDeleted
import typings.gapiClientDrive.anon.FileIdKey
import typings.gapiClientDrive.anon.ReplyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepliesResource extends js.Object {
  /** Creates a new reply to a comment. */
  def create(request: AltCommentId): Request[Reply] = js.native
  def create(request: CommentId, body: Reply): Request[Reply] = js.native
  /** Deletes a reply. */
  def delete(): Request[Unit] = js.native
  def delete(request: ReplyId): Request[Unit] = js.native
  /** Gets a reply by ID. */
  def get(): Request[Reply] = js.native
  def get(request: CommentIdFields): Request[Reply] = js.native
  /** Lists a comment's replies. */
  def list(): Request[ReplyList] = js.native
  def list(request: FileIdIncludeDeleted): Request[ReplyList] = js.native
  /** Updates a reply with patch semantics. */
  def update(request: FileIdKey): Request[Reply] = js.native
  def update(request: ReplyId, body: Reply): Request[Reply] = js.native
}

