package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`9`
import typings.octokitTypes.octokitTypesStrings.Plussign1
import typings.octokitTypes.octokitTypesStrings.`-1`
import typings.octokitTypes.octokitTypesStrings.confused
import typings.octokitTypes.octokitTypesStrings.eyes
import typings.octokitTypes.octokitTypesStrings.heart
import typings.octokitTypes.octokitTypesStrings.hooray
import typings.octokitTypes.octokitTypesStrings.laugh
import typings.octokitTypes.octokitTypesStrings.rocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  org  :string,   team_slug  :string,   discussion_number  :number,   content  :'+1' | '-1' | 'laugh' | 'confused' | 'heart' | 'hooray' | 'rocket' | 'eyes'} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'squirrel-girl'> */
trait ReactionsCreateForTeamDiscussionInOrgEndpoint extends js.Object {
  /**
    * The [reaction type](https://developer.github.com/v3/reactions/#reaction-types) to add to the team discussion.
    */
  var content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes
  var discussion_number: Double
  var mediaType: `9`
  @JSName("org")
  var org_ : String
  var team_slug: String
}

object ReactionsCreateForTeamDiscussionInOrgEndpoint {
  @scala.inline
  def apply(
    content: Plussign1 | `-1` | laugh | confused | heart | hooray | rocket | eyes,
    discussion_number: Double,
    mediaType: `9`,
    org_ : String,
    team_slug: String
  ): ReactionsCreateForTeamDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], discussion_number = discussion_number.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionsCreateForTeamDiscussionInOrgEndpoint]
  }
}

