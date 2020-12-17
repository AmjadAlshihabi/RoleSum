# CoreService
## This Service Provider is responsible for:
### Providing services to other objects. List of services and corresponding consumer objects: 
* registerWakeLock(TracingWakeLock wakeLock)
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
* acquireWakeLock(Context context, String tag, long timeout)
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
* isAutoShutdown()
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
* setAutoShutdown(boolean autoShutdown)
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
	* [PollService](../ServiceProviders/PollService.md) has a role type of Service Provider
	* [PushService](../ServiceProviders/PushService.md) has a role type of Service Provider
* onBind(Intent intent)
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
	* [DatabaseUpgradeService](../ServiceProviders/DatabaseUpgradeService.md) has a role type of Service Provider
	* [PollService](../ServiceProviders/PollService.md) has a role type of Service Provider
	* [PushService](../ServiceProviders/PushService.md) has a role type of Service Provider
	* [MailService](../Controllers/MailService.md) has a role type of Controller
### Offering configuration features to other object. List of configuratios features and corresponding consumer objects: 
* addWakeLockId(Context context, Intent intent, Integer wakeLockId,
            boolean createIfNotExists)
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
	* [MailService](../Controllers/MailService.md) has a role type of Controller
	* [RemoteControlService](../Controllers/RemoteControlService.md) has a role type of Controller
* addWakeLock(Context context, Intent intent)
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
	* [PollService](../ServiceProviders/PollService.md) has a role type of Service Provider
	* [PushService](../ServiceProviders/PushService.md) has a role type of Service Provider
* onCreate()
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [MessageListRemoteViewFactory](../Interfacers/MessageListRemoteViewFactory.md) has a role type of Interfacer
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
	* [DatabaseUpgradeService](../ServiceProviders/DatabaseUpgradeService.md) has a role type of Service Provider
	* [PollService](../ServiceProviders/PollService.md) has a role type of Service Provider
	* [PushService](../ServiceProviders/PushService.md) has a role type of Service Provider
	* [MailService](../Controllers/MailService.md) has a role type of Controller
	* [AttachmentProvider](../ServiceProviders/AttachmentProvider.md) has a role type of Service Provider
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [MessageProvider](../Coordinators/MessageProvider.md) has a role type of Coordinator
	* [RetainFragment](../InformationHolders/RetainFragment.md) has a role type of Information Holder
	* [MessageListFragment](../Interfacers/MessageListFragment.md) has a role type of Interfacer
	* [AccountList](../Interfacers/AccountList.md) has a role type of Interfacer
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [ChooseFolder](../Interfacers/ChooseFolder.md) has a role type of Interfacer
	* [ChooseIdentity](../Interfacers/ChooseIdentity.md) has a role type of Interfacer
	* [EditIdentity](../Interfacers/EditIdentity.md) has a role type of Interfacer
	* [EmailAddressList](../Interfacers/EmailAddressList.md) has a role type of Interfacer
	* [FolderList](../Interfacers/FolderList.md) has a role type of Interfacer
	* [K9Activity](../Interfacers/K9Activity.md) has a role type of Interfacer
	* [K9ListActivity](../Interfacers/K9ListActivity.md) has a role type of Interfacer
	* [K9PreferenceActivity](../Coordinators/K9PreferenceActivity.md) has a role type of Coordinator
	* [LauncherShortcuts](../Interfacers/LauncherShortcuts.md) has a role type of Interfacer
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [MessageList](../Interfacers/MessageList.md) has a role type of Interfacer
	* [NotificationDeleteConfirmation](../Interfacers/NotificationDeleteConfirmation.md) has a role type of Interfacer
	* [UnreadWidgetConfiguration](../Interfacers/UnreadWidgetConfiguration.md) has a role type of Interfacer
	* [UpgradeDatabases](../Coordinators/UpgradeDatabases.md) has a role type of Coordinator
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
	* [AccountSetupAccountType](../Interfacers/AccountSetupAccountType.md) has a role type of Interfacer
	* [AccountSetupBasics](../Interfacers/AccountSetupBasics.md) has a role type of Interfacer
	* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) has a role type of Interfacer
	* [AccountSetupComposition](../Interfacers/AccountSetupComposition.md) has a role type of Interfacer
	* [AccountSetupIncoming](../Interfacers/AccountSetupIncoming.md) has a role type of Interfacer
	* [AccountSetupNames](../Interfacers/AccountSetupNames.md) has a role type of Interfacer
	* [AccountSetupOptions](../Interfacers/AccountSetupOptions.md) has a role type of Interfacer
	* [AccountSetupOutgoing](../Interfacers/AccountSetupOutgoing.md) has a role type of Interfacer
	* [FolderSettings](../Interfacers/FolderSettings.md) has a role type of Interfacer
	* [FontSizeSettings](../Coordinators/FontSizeSettings.md) has a role type of Coordinator
	* [OpenPgpAppSelectFragment](../Structurers/OpenPgpAppSelectFragment.md) has a role type of Structurer
	* [OpenPgpAppSelectDialog](../Interfacers/OpenPgpAppSelectDialog.md) has a role type of Interfacer
	* [Prefs](../Interfacers/Prefs.md) has a role type of Interfacer
	* [WelcomeMessage](../Interfacers/WelcomeMessage.md) has a role type of Interfacer
* onStartCommand(Intent intent, int flags, int startId)
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
	* [DatabaseUpgradeService](../ServiceProviders/DatabaseUpgradeService.md) has a role type of Service Provider
* onStartCommand(Intent intent, int flags, int startId)
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
	* [DatabaseUpgradeService](../ServiceProviders/DatabaseUpgradeService.md) has a role type of Service Provider
* execute(Context context, final Runnable runner, int wakeLockTime,
            final Integer startId)
	* [WebDavHttpClient](../ServiceProviders/WebDavHttpClient.md) has a role type of Service Provider
	* [K9](../Controllers/K9.md) has a role type of Controller
	* [MessageContainerView](../Interfacers/MessageContainerView.md) has a role type of Interfacer
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
	* [MailService](../Controllers/MailService.md) has a role type of Controller
	* [RemoteControlService](../Controllers/RemoteControlService.md) has a role type of Controller
	* [AttachmentTempFileProvider](../ServiceProviders/AttachmentTempFileProvider.md) has a role type of Service Provider
	* [DecryptedFileProvider](../ServiceProviders/DecryptedFileProvider.md) has a role type of Service Provider
	* [EmailProvider](../ServiceProviders/EmailProvider.md) has a role type of Service Provider
	* [Storage](../Structurers/Storage.md) has a role type of Structurer
	* [MessageBuilder](../ServiceProviders/MessageBuilder.md) has a role type of Service Provider
	* [LocalMessage](../InformationHolders/LocalMessage.md) has a role type of Information Holder
	* [LockableDatabase](../ServiceProviders/LockableDatabase.md) has a role type of Service Provider
	* [LocalStore](../ServiceProviders/LocalStore.md) has a role type of Service Provider
	* [LocalFolder](../InformationHolders/LocalFolder.md) has a role type of Information Holder
	* [PendingAppend](../Coordinators/PendingAppend.md) has a role type of Coordinator
	* [PendingCommand](../Coordinators/PendingCommand.md) has a role type of Coordinator
	* [PendingEmptyTrash](../Coordinators/PendingEmptyTrash.md) has a role type of Coordinator
	* [PendingExpunge](../Coordinators/PendingExpunge.md) has a role type of Coordinator
	* [PendingMarkAllAsRead](../Coordinators/PendingMarkAllAsRead.md) has a role type of Coordinator
	* [PendingMoveOrCopy](../Coordinators/PendingMoveOrCopy.md) has a role type of Coordinator
	* [PendingSetFlag](../Coordinators/PendingSetFlag.md) has a role type of Coordinator
	* [AccountList](../Interfacers/AccountList.md) has a role type of Interfacer
	* [ImportSelectionDialog](../Interfacers/ImportSelectionDialog.md) has a role type of Interfacer
	* [MessagingController](../Controllers/MessagingController.md) has a role type of Controller
	* [PasswordPromptDialog](../Interfacers/PasswordPromptDialog.md) has a role type of Interfacer
	* [Accounts](../Coordinators/Accounts.md) has a role type of Coordinator
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [AccountSettings](../Interfacers/AccountSettings.md) has a role type of Interfacer
	* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) has a role type of Interfacer
	* [RecipientPresenter](../Coordinators/RecipientPresenter.md) has a role type of Coordinator
* onLowMemory()
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
* onDestroy()
	* [MessageListRemoteViewFactory](../Interfacers/MessageListRemoteViewFactory.md) has a role type of Interfacer
	* [MessageViewFragment](../Interfacers/MessageViewFragment.md) has a role type of Interfacer
	* [CoreService](../ServiceProviders/CoreService.md) has a role type of Service Provider
	* [MailService](../Controllers/MailService.md) has a role type of Controller
	* [MessageCompose](../Controllers/MessageCompose.md) has a role type of Controller
	* [MessageLoaderHelper](../ServiceProviders/MessageLoaderHelper.md) has a role type of Service Provider
	* [AccountSetupCheckSettings](../Interfacers/AccountSetupCheckSettings.md) has a role type of Interfacer
