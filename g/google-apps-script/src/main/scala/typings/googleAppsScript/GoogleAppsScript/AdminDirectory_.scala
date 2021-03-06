package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.AspsCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.ChannelsCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.ChromeosdevicesCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.CustomersCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.DomainAliasesCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.DomainsCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.GroupsCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.MembersCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.MobiledevicesCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.NotificationsCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.OrgunitsCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.PrivilegesCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.ResolvedAppAccessSettingsCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.ResourcesCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.RoleAssignmentsCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.RolesCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.SchemasCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.TokensCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.UsersCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection.VerificationCodesCollection
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Alias
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Building
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.BuildingAddress
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.BuildingCoordinates
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.CalendarResource
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Channel
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDevice
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceAction
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceActiveTimeRanges
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceCpuStatusReports
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceDeviceFiles
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceDiskVolumeReports
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceDiskVolumeReportsVolumeInfo
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceRecentUsers
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceSystemRamFreeReports
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsDeviceTpmVersionInfo
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.ChromeOsMoveDevicesToOu
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Customer
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.CustomerPostalAddress
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.DomainAlias
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Domains
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Feature
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.FeatureRename
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Group
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Member
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.MobileDeviceAction
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Notification
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.OrgUnit
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Role
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.RoleAssignment
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.RoleRolePrivileges
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Schema
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.SchemaFieldSpec
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.SchemaFieldSpecNumericIndexingSpec
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.User
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.UserMakeAdmin
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.UserName
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.UserPhoto
import typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.UserUndelete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminDirectory_ extends js.Object {
  var Asps: js.UndefOr[AspsCollection] = js.undefined
  var Channels: js.UndefOr[ChannelsCollection] = js.undefined
  var Chromeosdevices: js.UndefOr[ChromeosdevicesCollection] = js.undefined
  var Customers: js.UndefOr[CustomersCollection] = js.undefined
  var DomainAliases: js.UndefOr[DomainAliasesCollection] = js.undefined
  var Domains: js.UndefOr[DomainsCollection] = js.undefined
  var Groups: js.UndefOr[GroupsCollection] = js.undefined
  var Members: js.UndefOr[MembersCollection] = js.undefined
  var Mobiledevices: js.UndefOr[MobiledevicesCollection] = js.undefined
  var Notifications: js.UndefOr[NotificationsCollection] = js.undefined
  var Orgunits: js.UndefOr[OrgunitsCollection] = js.undefined
  var Privileges: js.UndefOr[PrivilegesCollection] = js.undefined
  var ResolvedAppAccessSettings: js.UndefOr[ResolvedAppAccessSettingsCollection] = js.undefined
  var Resources: js.UndefOr[ResourcesCollection] = js.undefined
  var RoleAssignments: js.UndefOr[RoleAssignmentsCollection] = js.undefined
  var Roles: js.UndefOr[RolesCollection] = js.undefined
  var Schemas: js.UndefOr[SchemasCollection] = js.undefined
  var Tokens: js.UndefOr[TokensCollection] = js.undefined
  var Users: js.UndefOr[UsersCollection] = js.undefined
  var VerificationCodes: js.UndefOr[VerificationCodesCollection] = js.undefined
  // Create a new instance of Alias
  def newAlias(): Alias
  // Create a new instance of Building
  def newBuilding(): Building
  // Create a new instance of BuildingAddress
  def newBuildingAddress(): BuildingAddress
  // Create a new instance of BuildingCoordinates
  def newBuildingCoordinates(): BuildingCoordinates
  // Create a new instance of CalendarResource
  def newCalendarResource(): CalendarResource
  // Create a new instance of Channel
  def newChannel(): Channel
  // Create a new instance of ChromeOsDevice
  def newChromeOsDevice(): ChromeOsDevice
  // Create a new instance of ChromeOsDeviceAction
  def newChromeOsDeviceAction(): ChromeOsDeviceAction
  // Create a new instance of ChromeOsDeviceActiveTimeRanges
  def newChromeOsDeviceActiveTimeRanges(): ChromeOsDeviceActiveTimeRanges
  // Create a new instance of ChromeOsDeviceCpuStatusReports
  def newChromeOsDeviceCpuStatusReports(): ChromeOsDeviceCpuStatusReports
  // Create a new instance of ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo
  def newChromeOsDeviceCpuStatusReportsCpuTemperatureInfo(): ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo
  // Create a new instance of ChromeOsDeviceDeviceFiles
  def newChromeOsDeviceDeviceFiles(): ChromeOsDeviceDeviceFiles
  // Create a new instance of ChromeOsDeviceDiskVolumeReports
  def newChromeOsDeviceDiskVolumeReports(): ChromeOsDeviceDiskVolumeReports
  // Create a new instance of ChromeOsDeviceDiskVolumeReportsVolumeInfo
  def newChromeOsDeviceDiskVolumeReportsVolumeInfo(): ChromeOsDeviceDiskVolumeReportsVolumeInfo
  // Create a new instance of ChromeOsDeviceRecentUsers
  def newChromeOsDeviceRecentUsers(): ChromeOsDeviceRecentUsers
  // Create a new instance of ChromeOsDeviceSystemRamFreeReports
  def newChromeOsDeviceSystemRamFreeReports(): ChromeOsDeviceSystemRamFreeReports
  // Create a new instance of ChromeOsDeviceTpmVersionInfo
  def newChromeOsDeviceTpmVersionInfo(): ChromeOsDeviceTpmVersionInfo
  // Create a new instance of ChromeOsMoveDevicesToOu
  def newChromeOsMoveDevicesToOu(): ChromeOsMoveDevicesToOu
  // Create a new instance of Customer
  def newCustomer(): Customer
  // Create a new instance of CustomerPostalAddress
  def newCustomerPostalAddress(): CustomerPostalAddress
  // Create a new instance of DomainAlias
  def newDomainAlias(): DomainAlias
  // Create a new instance of Domains
  def newDomains(): Domains
  // Create a new instance of Feature
  def newFeature(): Feature
  // Create a new instance of FeatureRename
  def newFeatureRename(): FeatureRename
  // Create a new instance of Group
  def newGroup(): Group
  // Create a new instance of Member
  def newMember(): Member
  // Create a new instance of MobileDeviceAction
  def newMobileDeviceAction(): MobileDeviceAction
  // Create a new instance of Notification
  def newNotification(): Notification
  // Create a new instance of OrgUnit
  def newOrgUnit(): OrgUnit
  // Create a new instance of Role
  def newRole(): Role
  // Create a new instance of RoleAssignment
  def newRoleAssignment(): RoleAssignment
  // Create a new instance of RoleRolePrivileges
  def newRoleRolePrivileges(): RoleRolePrivileges
  // Create a new instance of Schema
  def newSchema(): Schema
  // Create a new instance of SchemaFieldSpec
  def newSchemaFieldSpec(): SchemaFieldSpec
  // Create a new instance of SchemaFieldSpecNumericIndexingSpec
  def newSchemaFieldSpecNumericIndexingSpec(): SchemaFieldSpecNumericIndexingSpec
  // Create a new instance of User
  def newUser(): User
  // Create a new instance of UserMakeAdmin
  def newUserMakeAdmin(): UserMakeAdmin
  // Create a new instance of UserName
  def newUserName(): UserName
  // Create a new instance of UserPhoto
  def newUserPhoto(): UserPhoto
  // Create a new instance of UserUndelete
  def newUserUndelete(): UserUndelete
}

object AdminDirectory_ {
  @scala.inline
  def apply(
    newAlias: () => Alias,
    newBuilding: () => Building,
    newBuildingAddress: () => BuildingAddress,
    newBuildingCoordinates: () => BuildingCoordinates,
    newCalendarResource: () => CalendarResource,
    newChannel: () => Channel,
    newChromeOsDevice: () => ChromeOsDevice,
    newChromeOsDeviceAction: () => ChromeOsDeviceAction,
    newChromeOsDeviceActiveTimeRanges: () => ChromeOsDeviceActiveTimeRanges,
    newChromeOsDeviceCpuStatusReports: () => ChromeOsDeviceCpuStatusReports,
    newChromeOsDeviceCpuStatusReportsCpuTemperatureInfo: () => ChromeOsDeviceCpuStatusReportsCpuTemperatureInfo,
    newChromeOsDeviceDeviceFiles: () => ChromeOsDeviceDeviceFiles,
    newChromeOsDeviceDiskVolumeReports: () => ChromeOsDeviceDiskVolumeReports,
    newChromeOsDeviceDiskVolumeReportsVolumeInfo: () => ChromeOsDeviceDiskVolumeReportsVolumeInfo,
    newChromeOsDeviceRecentUsers: () => ChromeOsDeviceRecentUsers,
    newChromeOsDeviceSystemRamFreeReports: () => ChromeOsDeviceSystemRamFreeReports,
    newChromeOsDeviceTpmVersionInfo: () => ChromeOsDeviceTpmVersionInfo,
    newChromeOsMoveDevicesToOu: () => ChromeOsMoveDevicesToOu,
    newCustomer: () => Customer,
    newCustomerPostalAddress: () => CustomerPostalAddress,
    newDomainAlias: () => DomainAlias,
    newDomains: () => Domains,
    newFeature: () => Feature,
    newFeatureRename: () => FeatureRename,
    newGroup: () => Group,
    newMember: () => Member,
    newMobileDeviceAction: () => MobileDeviceAction,
    newNotification: () => Notification,
    newOrgUnit: () => OrgUnit,
    newRole: () => Role,
    newRoleAssignment: () => RoleAssignment,
    newRoleRolePrivileges: () => RoleRolePrivileges,
    newSchema: () => Schema,
    newSchemaFieldSpec: () => SchemaFieldSpec,
    newSchemaFieldSpecNumericIndexingSpec: () => SchemaFieldSpecNumericIndexingSpec,
    newUser: () => User,
    newUserMakeAdmin: () => UserMakeAdmin,
    newUserName: () => UserName,
    newUserPhoto: () => UserPhoto,
    newUserUndelete: () => UserUndelete,
    Asps: AspsCollection = null,
    Channels: ChannelsCollection = null,
    Chromeosdevices: ChromeosdevicesCollection = null,
    Customers: CustomersCollection = null,
    DomainAliases: DomainAliasesCollection = null,
    Domains: DomainsCollection = null,
    Groups: GroupsCollection = null,
    Members: MembersCollection = null,
    Mobiledevices: MobiledevicesCollection = null,
    Notifications: NotificationsCollection = null,
    Orgunits: OrgunitsCollection = null,
    Privileges: PrivilegesCollection = null,
    ResolvedAppAccessSettings: ResolvedAppAccessSettingsCollection = null,
    Resources: ResourcesCollection = null,
    RoleAssignments: RoleAssignmentsCollection = null,
    Roles: RolesCollection = null,
    Schemas: SchemasCollection = null,
    Tokens: TokensCollection = null,
    Users: UsersCollection = null,
    VerificationCodes: VerificationCodesCollection = null
  ): AdminDirectory_ = {
    val __obj = js.Dynamic.literal(newAlias = js.Any.fromFunction0(newAlias), newBuilding = js.Any.fromFunction0(newBuilding), newBuildingAddress = js.Any.fromFunction0(newBuildingAddress), newBuildingCoordinates = js.Any.fromFunction0(newBuildingCoordinates), newCalendarResource = js.Any.fromFunction0(newCalendarResource), newChannel = js.Any.fromFunction0(newChannel), newChromeOsDevice = js.Any.fromFunction0(newChromeOsDevice), newChromeOsDeviceAction = js.Any.fromFunction0(newChromeOsDeviceAction), newChromeOsDeviceActiveTimeRanges = js.Any.fromFunction0(newChromeOsDeviceActiveTimeRanges), newChromeOsDeviceCpuStatusReports = js.Any.fromFunction0(newChromeOsDeviceCpuStatusReports), newChromeOsDeviceCpuStatusReportsCpuTemperatureInfo = js.Any.fromFunction0(newChromeOsDeviceCpuStatusReportsCpuTemperatureInfo), newChromeOsDeviceDeviceFiles = js.Any.fromFunction0(newChromeOsDeviceDeviceFiles), newChromeOsDeviceDiskVolumeReports = js.Any.fromFunction0(newChromeOsDeviceDiskVolumeReports), newChromeOsDeviceDiskVolumeReportsVolumeInfo = js.Any.fromFunction0(newChromeOsDeviceDiskVolumeReportsVolumeInfo), newChromeOsDeviceRecentUsers = js.Any.fromFunction0(newChromeOsDeviceRecentUsers), newChromeOsDeviceSystemRamFreeReports = js.Any.fromFunction0(newChromeOsDeviceSystemRamFreeReports), newChromeOsDeviceTpmVersionInfo = js.Any.fromFunction0(newChromeOsDeviceTpmVersionInfo), newChromeOsMoveDevicesToOu = js.Any.fromFunction0(newChromeOsMoveDevicesToOu), newCustomer = js.Any.fromFunction0(newCustomer), newCustomerPostalAddress = js.Any.fromFunction0(newCustomerPostalAddress), newDomainAlias = js.Any.fromFunction0(newDomainAlias), newDomains = js.Any.fromFunction0(newDomains), newFeature = js.Any.fromFunction0(newFeature), newFeatureRename = js.Any.fromFunction0(newFeatureRename), newGroup = js.Any.fromFunction0(newGroup), newMember = js.Any.fromFunction0(newMember), newMobileDeviceAction = js.Any.fromFunction0(newMobileDeviceAction), newNotification = js.Any.fromFunction0(newNotification), newOrgUnit = js.Any.fromFunction0(newOrgUnit), newRole = js.Any.fromFunction0(newRole), newRoleAssignment = js.Any.fromFunction0(newRoleAssignment), newRoleRolePrivileges = js.Any.fromFunction0(newRoleRolePrivileges), newSchema = js.Any.fromFunction0(newSchema), newSchemaFieldSpec = js.Any.fromFunction0(newSchemaFieldSpec), newSchemaFieldSpecNumericIndexingSpec = js.Any.fromFunction0(newSchemaFieldSpecNumericIndexingSpec), newUser = js.Any.fromFunction0(newUser), newUserMakeAdmin = js.Any.fromFunction0(newUserMakeAdmin), newUserName = js.Any.fromFunction0(newUserName), newUserPhoto = js.Any.fromFunction0(newUserPhoto), newUserUndelete = js.Any.fromFunction0(newUserUndelete))
    if (Asps != null) __obj.updateDynamic("Asps")(Asps.asInstanceOf[js.Any])
    if (Channels != null) __obj.updateDynamic("Channels")(Channels.asInstanceOf[js.Any])
    if (Chromeosdevices != null) __obj.updateDynamic("Chromeosdevices")(Chromeosdevices.asInstanceOf[js.Any])
    if (Customers != null) __obj.updateDynamic("Customers")(Customers.asInstanceOf[js.Any])
    if (DomainAliases != null) __obj.updateDynamic("DomainAliases")(DomainAliases.asInstanceOf[js.Any])
    if (Domains != null) __obj.updateDynamic("Domains")(Domains.asInstanceOf[js.Any])
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (Members != null) __obj.updateDynamic("Members")(Members.asInstanceOf[js.Any])
    if (Mobiledevices != null) __obj.updateDynamic("Mobiledevices")(Mobiledevices.asInstanceOf[js.Any])
    if (Notifications != null) __obj.updateDynamic("Notifications")(Notifications.asInstanceOf[js.Any])
    if (Orgunits != null) __obj.updateDynamic("Orgunits")(Orgunits.asInstanceOf[js.Any])
    if (Privileges != null) __obj.updateDynamic("Privileges")(Privileges.asInstanceOf[js.Any])
    if (ResolvedAppAccessSettings != null) __obj.updateDynamic("ResolvedAppAccessSettings")(ResolvedAppAccessSettings.asInstanceOf[js.Any])
    if (Resources != null) __obj.updateDynamic("Resources")(Resources.asInstanceOf[js.Any])
    if (RoleAssignments != null) __obj.updateDynamic("RoleAssignments")(RoleAssignments.asInstanceOf[js.Any])
    if (Roles != null) __obj.updateDynamic("Roles")(Roles.asInstanceOf[js.Any])
    if (Schemas != null) __obj.updateDynamic("Schemas")(Schemas.asInstanceOf[js.Any])
    if (Tokens != null) __obj.updateDynamic("Tokens")(Tokens.asInstanceOf[js.Any])
    if (Users != null) __obj.updateDynamic("Users")(Users.asInstanceOf[js.Any])
    if (VerificationCodes != null) __obj.updateDynamic("VerificationCodes")(VerificationCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminDirectory_]
  }
}

