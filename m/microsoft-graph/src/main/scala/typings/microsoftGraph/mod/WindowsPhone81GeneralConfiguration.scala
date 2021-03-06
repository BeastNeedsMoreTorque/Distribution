package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowsPhone81GeneralConfiguration extends DeviceConfiguration {
  // Value indicating whether this policy only applies to Windows Phone 8.1. This property is read-only.
  var applyOnlyToWindowsPhone81: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block copy paste.
  var appsBlockCopyPaste: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block bluetooth.
  var bluetoothBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block camera.
  var cameraBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block Wi-Fi tethering. Has no impact if Wi-Fi is blocked.
  var cellularBlockWifiTethering: js.UndefOr[Boolean] = js.undefined
  // List that is in the AppComplianceList. Possible values are: none, appsInListCompliant, appsNotInListCompliant.
  var compliantAppListType: js.UndefOr[AppListType] = js.undefined
  /**
    * List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection
    * can contain a maximum of 10000 elements.
    */
  var compliantAppsList: js.UndefOr[js.Array[AppListItem]] = js.undefined
  // Indicates whether or not to block diagnostic data submission.
  var diagnosticDataBlockSubmission: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block custom email accounts.
  var emailBlockAddingAccounts: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block location services.
  var locationServicesBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block using a Microsoft Account.
  var microsoftAccountBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block Near-Field Communication.
  var nfcBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block syncing the calendar.
  var passwordBlockSimple: js.UndefOr[Boolean] = js.undefined
  // Number of days before the password expires.
  var passwordExpirationDays: js.UndefOr[Double] = js.undefined
  // Number of character sets a password must contain.
  var passwordMinimumCharacterSetCount: js.UndefOr[Double] = js.undefined
  // Minimum length of passwords.
  var passwordMinimumLength: js.UndefOr[Double] = js.undefined
  // Minutes of inactivity before screen timeout.
  var passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.undefined
  // Number of previous passwords to block. Valid values 0 to 24
  var passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.undefined
  // Indicates whether or not to require a password.
  var passwordRequired: js.UndefOr[Boolean] = js.undefined
  // Password type that is required. Possible values are: deviceDefault, alphanumeric, numeric.
  var passwordRequiredType: js.UndefOr[RequiredPasswordType] = js.undefined
  // Number of sign in failures allowed before factory reset.
  var passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[Double] = js.undefined
  // Indicates whether or not to block screenshots.
  var screenCaptureBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block removable storage.
  var storageBlockRemovableStorage: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to require encryption.
  var storageRequireEncryption: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the web browser.
  var webBrowserBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block automatically connecting to Wi-Fi hotspots. Has no impact if Wi-Fi is blocked.
  var wifiBlockAutomaticConnectHotspots: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block Wi-Fi hotspot reporting. Has no impact if Wi-Fi is blocked.
  var wifiBlockHotspotReporting: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block Wi-Fi.
  var wifiBlocked: js.UndefOr[Boolean] = js.undefined
  // Indicates whether or not to block the Windows Store.
  var windowsStoreBlocked: js.UndefOr[Boolean] = js.undefined
}

object WindowsPhone81GeneralConfiguration {
  @scala.inline
  def apply(
    applyOnlyToWindowsPhone81: js.UndefOr[Boolean] = js.undefined,
    appsBlockCopyPaste: js.UndefOr[Boolean] = js.undefined,
    assignments: js.Array[DeviceConfigurationAssignment] = null,
    bluetoothBlocked: js.UndefOr[Boolean] = js.undefined,
    cameraBlocked: js.UndefOr[Boolean] = js.undefined,
    cellularBlockWifiTethering: js.UndefOr[Boolean] = js.undefined,
    compliantAppListType: AppListType = null,
    compliantAppsList: js.Array[AppListItem] = null,
    createdDateTime: String = null,
    description: String = null,
    deviceSettingStateSummaries: js.Array[SettingStateDeviceSummary] = null,
    deviceStatusOverview: DeviceConfigurationDeviceOverview = null,
    deviceStatuses: js.Array[DeviceConfigurationDeviceStatus] = null,
    diagnosticDataBlockSubmission: js.UndefOr[Boolean] = js.undefined,
    displayName: String = null,
    emailBlockAddingAccounts: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    lastModifiedDateTime: String = null,
    locationServicesBlocked: js.UndefOr[Boolean] = js.undefined,
    microsoftAccountBlocked: js.UndefOr[Boolean] = js.undefined,
    nfcBlocked: js.UndefOr[Boolean] = js.undefined,
    passwordBlockSimple: js.UndefOr[Boolean] = js.undefined,
    passwordExpirationDays: js.UndefOr[Double] = js.undefined,
    passwordMinimumCharacterSetCount: js.UndefOr[Double] = js.undefined,
    passwordMinimumLength: js.UndefOr[Double] = js.undefined,
    passwordMinutesOfInactivityBeforeScreenTimeout: js.UndefOr[Double] = js.undefined,
    passwordPreviousPasswordBlockCount: js.UndefOr[Double] = js.undefined,
    passwordRequired: js.UndefOr[Boolean] = js.undefined,
    passwordRequiredType: RequiredPasswordType = null,
    passwordSignInFailureCountBeforeFactoryReset: js.UndefOr[Double] = js.undefined,
    screenCaptureBlocked: js.UndefOr[Boolean] = js.undefined,
    storageBlockRemovableStorage: js.UndefOr[Boolean] = js.undefined,
    storageRequireEncryption: js.UndefOr[Boolean] = js.undefined,
    userStatusOverview: DeviceConfigurationUserOverview = null,
    userStatuses: js.Array[DeviceConfigurationUserStatus] = null,
    version: js.UndefOr[Double] = js.undefined,
    webBrowserBlocked: js.UndefOr[Boolean] = js.undefined,
    wifiBlockAutomaticConnectHotspots: js.UndefOr[Boolean] = js.undefined,
    wifiBlockHotspotReporting: js.UndefOr[Boolean] = js.undefined,
    wifiBlocked: js.UndefOr[Boolean] = js.undefined,
    windowsStoreBlocked: js.UndefOr[Boolean] = js.undefined
  ): WindowsPhone81GeneralConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applyOnlyToWindowsPhone81)) __obj.updateDynamic("applyOnlyToWindowsPhone81")(applyOnlyToWindowsPhone81.get.asInstanceOf[js.Any])
    if (!js.isUndefined(appsBlockCopyPaste)) __obj.updateDynamic("appsBlockCopyPaste")(appsBlockCopyPaste.get.asInstanceOf[js.Any])
    if (assignments != null) __obj.updateDynamic("assignments")(assignments.asInstanceOf[js.Any])
    if (!js.isUndefined(bluetoothBlocked)) __obj.updateDynamic("bluetoothBlocked")(bluetoothBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cameraBlocked)) __obj.updateDynamic("cameraBlocked")(cameraBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellularBlockWifiTethering)) __obj.updateDynamic("cellularBlockWifiTethering")(cellularBlockWifiTethering.get.asInstanceOf[js.Any])
    if (compliantAppListType != null) __obj.updateDynamic("compliantAppListType")(compliantAppListType.asInstanceOf[js.Any])
    if (compliantAppsList != null) __obj.updateDynamic("compliantAppsList")(compliantAppsList.asInstanceOf[js.Any])
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (deviceSettingStateSummaries != null) __obj.updateDynamic("deviceSettingStateSummaries")(deviceSettingStateSummaries.asInstanceOf[js.Any])
    if (deviceStatusOverview != null) __obj.updateDynamic("deviceStatusOverview")(deviceStatusOverview.asInstanceOf[js.Any])
    if (deviceStatuses != null) __obj.updateDynamic("deviceStatuses")(deviceStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(diagnosticDataBlockSubmission)) __obj.updateDynamic("diagnosticDataBlockSubmission")(diagnosticDataBlockSubmission.get.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (!js.isUndefined(emailBlockAddingAccounts)) __obj.updateDynamic("emailBlockAddingAccounts")(emailBlockAddingAccounts.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(locationServicesBlocked)) __obj.updateDynamic("locationServicesBlocked")(locationServicesBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(microsoftAccountBlocked)) __obj.updateDynamic("microsoftAccountBlocked")(microsoftAccountBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nfcBlocked)) __obj.updateDynamic("nfcBlocked")(nfcBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordBlockSimple)) __obj.updateDynamic("passwordBlockSimple")(passwordBlockSimple.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordExpirationDays)) __obj.updateDynamic("passwordExpirationDays")(passwordExpirationDays.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordMinimumCharacterSetCount)) __obj.updateDynamic("passwordMinimumCharacterSetCount")(passwordMinimumCharacterSetCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordMinimumLength)) __obj.updateDynamic("passwordMinimumLength")(passwordMinimumLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordMinutesOfInactivityBeforeScreenTimeout)) __obj.updateDynamic("passwordMinutesOfInactivityBeforeScreenTimeout")(passwordMinutesOfInactivityBeforeScreenTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordPreviousPasswordBlockCount)) __obj.updateDynamic("passwordPreviousPasswordBlockCount")(passwordPreviousPasswordBlockCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordRequired)) __obj.updateDynamic("passwordRequired")(passwordRequired.get.asInstanceOf[js.Any])
    if (passwordRequiredType != null) __obj.updateDynamic("passwordRequiredType")(passwordRequiredType.asInstanceOf[js.Any])
    if (!js.isUndefined(passwordSignInFailureCountBeforeFactoryReset)) __obj.updateDynamic("passwordSignInFailureCountBeforeFactoryReset")(passwordSignInFailureCountBeforeFactoryReset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(screenCaptureBlocked)) __obj.updateDynamic("screenCaptureBlocked")(screenCaptureBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(storageBlockRemovableStorage)) __obj.updateDynamic("storageBlockRemovableStorage")(storageBlockRemovableStorage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(storageRequireEncryption)) __obj.updateDynamic("storageRequireEncryption")(storageRequireEncryption.get.asInstanceOf[js.Any])
    if (userStatusOverview != null) __obj.updateDynamic("userStatusOverview")(userStatusOverview.asInstanceOf[js.Any])
    if (userStatuses != null) __obj.updateDynamic("userStatuses")(userStatuses.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    if (!js.isUndefined(webBrowserBlocked)) __obj.updateDynamic("webBrowserBlocked")(webBrowserBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wifiBlockAutomaticConnectHotspots)) __obj.updateDynamic("wifiBlockAutomaticConnectHotspots")(wifiBlockAutomaticConnectHotspots.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wifiBlockHotspotReporting)) __obj.updateDynamic("wifiBlockHotspotReporting")(wifiBlockHotspotReporting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wifiBlocked)) __obj.updateDynamic("wifiBlocked")(wifiBlocked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsStoreBlocked)) __obj.updateDynamic("windowsStoreBlocked")(windowsStoreBlocked.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsPhone81GeneralConfiguration]
  }
}

