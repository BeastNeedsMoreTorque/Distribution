package typings.envCi.mod

import typings.envCi.envCiBooleans.`true`
import typings.envCi.envCiStrings.Appveyor
import typings.envCi.envCiStrings.Bamboo
import typings.envCi.envCiStrings.Bitrise
import typings.envCi.envCiStrings.Buddy
import typings.envCi.envCiStrings.Buildkite
import typings.envCi.envCiStrings.CircleCI
import typings.envCi.envCiStrings.Codefresh
import typings.envCi.envCiStrings.Codeship
import typings.envCi.envCiStrings.Drone
import typings.envCi.envCiStrings.Jenkins
import typings.envCi.envCiStrings.Semaphore
import typings.envCi.envCiStrings.Shippable
import typings.envCi.envCiStrings.TeamCity
import typings.envCi.envCiStrings.Wercker
import typings.envCi.envCiStrings.`AWS CodeBuild`
import typings.envCi.envCiStrings.`Bitbucket Pipelines`
import typings.envCi.envCiStrings.`Cirrus CI`
import typings.envCi.envCiStrings.`GitLab CISlashCD`
import typings.envCi.envCiStrings.`Sail CI`
import typings.envCi.envCiStrings.`Travis CI`
import typings.envCi.envCiStrings.`Visual Studio Team Services`
import typings.envCi.envCiStrings.appveyor_
import typings.envCi.envCiStrings.bamboo_
import typings.envCi.envCiStrings.bitbucket
import typings.envCi.envCiStrings.bitrise_
import typings.envCi.envCiStrings.buddy_
import typings.envCi.envCiStrings.buildkite_
import typings.envCi.envCiStrings.circleci_
import typings.envCi.envCiStrings.cirrus
import typings.envCi.envCiStrings.codebuild
import typings.envCi.envCiStrings.codefresh_
import typings.envCi.envCiStrings.codeship_
import typings.envCi.envCiStrings.drone_
import typings.envCi.envCiStrings.gitlab
import typings.envCi.envCiStrings.jenkins_
import typings.envCi.envCiStrings.sail
import typings.envCi.envCiStrings.semaphore_
import typings.envCi.envCiStrings.shippable_
import typings.envCi.envCiStrings.teamcity_
import typings.envCi.envCiStrings.travis
import typings.envCi.envCiStrings.vsts
import typings.envCi.envCiStrings.wercker_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.envCi.mod.AppveyorEnv
  - typings.envCi.mod.BambooEnv
  - typings.envCi.mod.BitbucketEnv
  - typings.envCi.mod.BitriseEnv
  - typings.envCi.mod.BuddyEnv
  - typings.envCi.mod.BuildkiteEnv
  - typings.envCi.mod.CircleCiEnv
  - typings.envCi.mod.CirrusEnv
  - typings.envCi.mod.CodeBuildEnv
  - typings.envCi.mod.CodefreshEnv
  - typings.envCi.mod.CodeshipEnv
  - typings.envCi.mod.DroneEnv
  - typings.envCi.mod.GitLabEnv
  - typings.envCi.mod.JenkinsEnv
  - typings.envCi.mod.SailEnv
  - typings.envCi.mod.SemaphoreEnv
  - typings.envCi.mod.ShippableEnv
  - typings.envCi.mod.TeamCityEnv
  - typings.envCi.mod.TravisEnv
  - typings.envCi.mod.VstsEnv
  - typings.envCi.mod.WerckerEnv
*/
trait KnownCiEnv extends CiEnv

object KnownCiEnv {
  @scala.inline
  def CodeshipEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    name: Codeship,
    service: codeship_,
    slug: String
  ): KnownCiEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownCiEnv]
  }
  @scala.inline
  def WerckerEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    name: Wercker,
    root: String,
    service: wercker_,
    slug: String
  ): KnownCiEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownCiEnv]
  }
  @scala.inline
  def JenkinsEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: Jenkins,
    root: String,
    service: jenkins_,
    pr: String = null,
    prBranch: String = null
  ): KnownCiEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownCiEnv]
  }
  @scala.inline
  def BambooEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    job: String,
    name: Bamboo,
    root: String,
    service: bamboo_
  ): KnownCiEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownCiEnv]
  }
  @scala.inline
  def DroneEnv(
    branch: String,
    build: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    job: String,
    name: Drone,
    service: drone_,
    slug: String,
    pr: String = null,
    prBranch: String = null,
    tag: String = null
  ): KnownCiEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownCiEnv]
  }
  @scala.inline
  def TravisEnv(
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    job: String,
    jobUrl: String,
    name: `Travis CI`,
    prBranch: String,
    root: String,
    service: travis,
    slug: String,
    branch: String = null,
    pr: String = null,
    tag: String = null
  ): KnownCiEnv = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], jobUrl = jobUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prBranch = prBranch.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownCiEnv]
  }
  @scala.inline
  def BuildkiteEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: Buildkite,
    root: String,
    service: buildkite_,
    slug: String,
    pr: String = null,
    prBranch: String = null,
    tag: String = null
  ): KnownCiEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownCiEnv]
  }
  @scala.inline
  def GitLabEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    job: String,
    jobUrl: String,
    name: `GitLab CISlashCD`,
    root: String,
    service: gitlab,
    slug: String,
    tag: String = null
  ): KnownCiEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], jobUrl = jobUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownCiEnv]
  }
  @scala.inline
  def AppveyorEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    job: String,
    jobUrl: String,
    name: Appveyor,
    root: String,
    service: appveyor_,
    slug: String,
    pr: String = null,
    prBranch: String = null,
    tag: String = null
  ): KnownCiEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], jobUrl = jobUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownCiEnv]
  }
  @scala.inline
  def SemaphoreEnv(
    build: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: Semaphore,
    root: String,
    service: semaphore_,
    slug: String,
    branch: String = null,
    pr: String = null,
    prBranch: String = null
  ): KnownCiEnv = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownCiEnv]
  }
  @scala.inline
  def SailEnv(
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: `Sail CI`,
    root: String,
    service: sail,
    slug: String,
    branch: String = null,
    pr: String = null
  ): KnownCiEnv = {
    val __obj = js.Dynamic.literal(commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownCiEnv]
  }
  @scala.inline
  def BitbucketEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    name: `Bitbucket Pipelines`,
    root: String,
    service: bitbucket,
    slug: String,
    tag: String = null
  ): KnownCiEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownCiEnv]
  }
  @scala.inline
  def BitriseEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: Bitrise,
    service: bitrise_,
    slug: String,
    pr: String = null,
    prBranch: String = null,
    tag: String = null
  ): KnownCiEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownCiEnv]
  }
  @scala.inline
  def TeamCityEnv(
    build: String,
    commit: String,
    isCi: `true`,
    name: TeamCity,
    service: teamcity_,
    slug: String,
    branch: String = null,
    root: String = null
  ): KnownCiEnv = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownCiEnv]
  }
  @scala.inline
  def VstsEnv(
    branch: String,
    build: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: `Visual Studio Team Services`,
    root: String,
    service: vsts,
    pr: String = null,
    prBranch: String = null
  ): KnownCiEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownCiEnv]
  }
  @scala.inline
  def CodeBuildEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    name: `AWS CodeBuild`,
    root: String,
    service: codebuild
  ): KnownCiEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownCiEnv]
  }
  @scala.inline
  def CodefreshEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: Codefresh,
    root: String,
    service: codefresh_,
    slug: String,
    pr: String = null,
    prBranch: String = null
  ): KnownCiEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownCiEnv]
  }
  @scala.inline
  def BuddyEnv(
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    name: Buddy,
    service: buddy_,
    slug: String,
    branch: String = null,
    pr: String = null,
    tag: String = null
  ): KnownCiEnv = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownCiEnv]
  }
  @scala.inline
  def CircleCiEnv(
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    job: String,
    name: CircleCI,
    service: circleci_,
    slug: String,
    branch: String = null,
    pr: String = null,
    prBranch: String = null,
    tag: String = null
  ): KnownCiEnv = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownCiEnv]
  }
  @scala.inline
  def ShippableEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    job: String,
    name: Shippable,
    root: String,
    service: shippable_,
    slug: String,
    pr: String = null,
    prBranch: String = null,
    tag: String = null
  ): KnownCiEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (prBranch != null) __obj.updateDynamic("prBranch")(prBranch.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownCiEnv]
  }
  @scala.inline
  def CirrusEnv(
    branch: String,
    build: String,
    buildUrl: String,
    commit: String,
    isCi: `true`,
    isPr: Boolean,
    job: String,
    jobUrl: String,
    name: `Cirrus CI`,
    root: String,
    service: cirrus,
    slug: String,
    pr: String = null,
    tag: String = null
  ): KnownCiEnv = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], buildUrl = buildUrl.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isCi = isCi.asInstanceOf[js.Any], isPr = isPr.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], jobUrl = jobUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
    if (pr != null) __obj.updateDynamic("pr")(pr.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnownCiEnv]
  }
}

