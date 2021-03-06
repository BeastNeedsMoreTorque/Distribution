package typings.winrtUwp.global.Windows.UI

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import typings.winrtUwp.Windows.Security.Credentials.WebAccount
import typings.winrtUwp.Windows.Security.Credentials.WebAccountProvider
import typings.winrtUwp.Windows.UI.ApplicationSettings.CredentialCommandCredentialDeletedHandler
import typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsEdgeLocation
import typings.winrtUwp.Windows.UI.ApplicationSettings.SupportedWebAccountActions
import typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountAction
import typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountCommandInvokedHandler
import typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountProviderCommandInvokedHandler
import typings.winrtUwp.Windows.UI.Popups.UICommandInvokedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides classes that allow developers to define the app settings that appear in the settings pane of the Windows shell. The settings pane provides a consistent place for users to access app settings. */
@JSGlobal("Windows.UI.ApplicationSettings")
@js.native
object ApplicationSettings extends js.Object {
  /** Provides methods to show the accounts pane and also to enable the app to register callbacks when the accounts flyout is about to be displayed. */
  @js.native
  abstract class AccountsSettingsPane ()
    extends typings.winrtUwp.Windows.UI.ApplicationSettings.AccountsSettingsPane
  
  /** Provides data for the AccountCommandsRequested event. */
  @js.native
  abstract class AccountsSettingsPaneCommandsRequestedEventArgs ()
    extends typings.winrtUwp.Windows.UI.ApplicationSettings.AccountsSettingsPaneCommandsRequestedEventArgs {
    /** Gets the SettingsCommand collection for the account settings pane. */
    /* CompleteClass */
    override var commands: IVector[typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsCommand] = js.native
    /** Gets the CredentialCommand collection for the account settings pane. */
    /* CompleteClass */
    override var credentialCommands: IVector[typings.winrtUwp.Windows.UI.ApplicationSettings.CredentialCommand] = js.native
    /** Gets or sets the header text for the account settings pane. */
    /* CompleteClass */
    override var headerText: String = js.native
    /** Gets the WebAccountCommand collection for the account settings pane. */
    /* CompleteClass */
    override var webAccountCommands: IVector[typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountCommand] = js.native
    /** Gets the WebAccountProviderCommand collection for the account settings pane. */
    /* CompleteClass */
    override var webAccountProviderCommands: IVector[typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountProviderCommand] = js.native
    /**
      * Gets the deferral object for the AccountCommandsRequested event.
      * @return The deferral object.
      */
    /* CompleteClass */
    override def getDeferral(): typings.winrtUwp.Windows.UI.ApplicationSettings.AccountsSettingsPaneEventDeferral = js.native
  }
  
  /** Enables the app to signal when it has finished populating command collections while handling the AccountCommandsRequested event. */
  @js.native
  abstract class AccountsSettingsPaneEventDeferral ()
    extends typings.winrtUwp.Windows.UI.ApplicationSettings.AccountsSettingsPaneEventDeferral {
    /** Signals that the app has finished populating command collections while handling the AccountCommandsRequested event. */
    /* CompleteClass */
    override def complete(): Unit = js.native
  }
  
  /** Deprecated. Represents a command for changing web account credentials in the account settings pane. */
  @js.native
  class CredentialCommand protected ()
    extends typings.winrtUwp.Windows.UI.ApplicationSettings.CredentialCommand {
    /**
      * Initializes a new instance of the CredentialCommand class with a PasswordCredential object.
      * @param passwordCredential The password credential.
      */
    def this(passwordCredential: PasswordCredential) = this()
    /**
      * Initializes a new instance of the CredentialCommand class with a PasswordCredential object and a CredentialCommandCredentialDeletedHandler delegate.
      * @param passwordCredential The password credential.
      * @param deleted The delegate that handles credential deletion.
      */
    def this(passwordCredential: PasswordCredential, deleted: CredentialCommandCredentialDeletedHandler) = this()
  }
  
  /** Creates a settings command object that represents a settings entry. This settings command can be appended to the ApplicationCommands vector. */
  @js.native
  class SettingsCommand protected ()
    extends typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsCommand {
    /**
      * Creates a new settings command.
      * @param settingsCommandId The ID of the command.
      * @param label The label for the command, which is displayed in the settings pane.
      * @param handler The event handler that is called when the user selects this command in the settings pane.
      */
    def this(settingsCommandId: js.Any, label: String, handler: UICommandInvokedHandler) = this()
  }
  
  /** A static class that enables the app to control the Settings Charm pane. The app can add or remove commands, receive a notification when the user opens the pane, or open the pane programmatically. */
  @js.native
  abstract class SettingsPane ()
    extends typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsPane
  
  /** Contains properties that are only available during the CommandsRequested event. */
  @js.native
  abstract class SettingsPaneCommandsRequest ()
    extends typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsPaneCommandsRequest {
    /** A vector that is available during the CommandsRequested event. Append SettingsCommand objects to it to make them available to the SettingsPane UI. */
    /* CompleteClass */
    override var applicationCommands: IVector[typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsCommand] = js.native
  }
  
  /** Contains arguments that are available from the event object during the CommandsRequested event. */
  @js.native
  abstract class SettingsPaneCommandsRequestedEventArgs ()
    extends typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsPaneCommandsRequestedEventArgs {
    /** An instance of SettingsPaneCommandsRequest that is made available during the CommandsRequested event. */
    /* CompleteClass */
    override var request: typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsPaneCommandsRequest = js.native
  }
  
  /** Associates a command with a WebAccount in the account settings pane.. */
  @js.native
  class WebAccountCommand protected ()
    extends typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountCommand {
    /**
      * Initializes a new instance of the WebAccountCommand class.
      * @param webAccount The web account to associate with the current command.
      * @param invoked The delegate that handles the command.
      * @param actions A bitmask of web account actions.
      */
    def this(
      webAccount: WebAccount,
      invoked: WebAccountCommandInvokedHandler,
      actions: SupportedWebAccountActions
    ) = this()
  }
  
  /** Provides data for the WebAccountCommandInvokedHandler delegate. */
  @js.native
  abstract class WebAccountInvokedArgs ()
    extends typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountInvokedArgs {
    /** Gets the action for the web account in the accounts pane. */
    /* CompleteClass */
    override var action: WebAccountAction = js.native
  }
  
  /** Associates a provider command with a WebAccountProvider in the account settings pane. */
  @js.native
  class WebAccountProviderCommand protected ()
    extends typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountProviderCommand {
    /**
      * Initializes a new instance of the WebAccountProviderCommand class.
      * @param webAccountProvider The web account provider.
      * @param invoked The delegate that handles the provider command.
      */
    def this(webAccountProvider: WebAccountProvider, invoked: WebAccountProviderCommandInvokedHandler) = this()
  }
  
  /* static members */
  @js.native
  object AccountsSettingsPane extends js.Object {
    /**
      * Gets an AccountsSettingsPane object that is associated with the current app view (that is, with CoreWindow ).
      * @return The account settings pane.
      */
    def getForCurrentView(): typings.winrtUwp.Windows.UI.ApplicationSettings.AccountsSettingsPane = js.native
    /** Displays the account settings pane. */
    def show(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object SettingsCommand extends js.Object {
    /** Gets the command for a web account in the account settings pane. */
    var accountsCommand: typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsCommand = js.native
  }
  
  /** Specifies the edge of the screen where the Settings charms appear. */
  @js.native
  object SettingsEdgeLocation extends js.Object {
    /* 1 */ val left: typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsEdgeLocation.left with Double = js.native
    /* 0 */ val right: typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsEdgeLocation.right with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsEdgeLocation with Double] = js.native
  }
  
  /* static members */
  @js.native
  object SettingsPane extends js.Object {
    /** Gets a value indicating whether the Settings charm appears on the left or right edge of the screen. */
    var edge: SettingsEdgeLocation = js.native
    /**
      * Gets a SettingsPane object that is associated with the current app view (that is, with CoreWindow ).
      * @return The settings pane.
      */
    def getForCurrentView(): typings.winrtUwp.Windows.UI.ApplicationSettings.SettingsPane = js.native
    /** Displays the Settings Charm pane to the user. */
    def show(): Unit = js.native
  }
  
  /** Specifies actions that your app enables on an web account instance in the account settings pane. */
  @js.native
  object SupportedWebAccountActions extends js.Object {
    /* 4 */ val manage: typings.winrtUwp.Windows.UI.ApplicationSettings.SupportedWebAccountActions.manage with Double = js.native
    /* 5 */ val more: typings.winrtUwp.Windows.UI.ApplicationSettings.SupportedWebAccountActions.more with Double = js.native
    /* 0 */ val none: typings.winrtUwp.Windows.UI.ApplicationSettings.SupportedWebAccountActions.none with Double = js.native
    /* 1 */ val reconnect: typings.winrtUwp.Windows.UI.ApplicationSettings.SupportedWebAccountActions.reconnect with Double = js.native
    /* 2 */ val remove: typings.winrtUwp.Windows.UI.ApplicationSettings.SupportedWebAccountActions.remove with Double = js.native
    /* 3 */ val viewDetails: typings.winrtUwp.Windows.UI.ApplicationSettings.SupportedWebAccountActions.viewDetails with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.UI.ApplicationSettings.SupportedWebAccountActions with Double
      ] = js.native
  }
  
  /** Specifies actions that your app does on an web account. */
  @js.native
  object WebAccountAction extends js.Object {
    /* 3 */ val manage: typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountAction.manage with Double = js.native
    /* 4 */ val more: typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountAction.more with Double = js.native
    /* 0 */ val reconnect: typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountAction.reconnect with Double = js.native
    /* 1 */ val remove: typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountAction.remove with Double = js.native
    /* 2 */ val viewDetails: typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountAction.viewDetails with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.ApplicationSettings.WebAccountAction with Double] = js.native
  }
  
}

